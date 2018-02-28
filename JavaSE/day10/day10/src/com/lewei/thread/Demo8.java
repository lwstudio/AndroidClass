package com.lewei.thread;

/*
 	线程通讯：一个线程完成了自己的任务时，要通知另外一个线程去完成另外一个任务
 	
 	生产者与消费者模型
 	
 	
 	问题一：出现了线程安全问题---价格错乱了
 	
 	线程同步机制---同步代码块解决问题
 	
 	
 	
 	wait()：等待，如果一个线程执行了wait方法，那么该线程就会进入等待状态，等待状态下的线程必须要由其他线程
 		调用notify方法才能唤醒
 	notify()：唤醒，唤醒线程池等待线程中的一个
 	notifyAll()；唤醒线程池中全部的等待线程
 	
 	wait与notify方法要注意的细节：
 		1）wait方法与notify方法是属于Object对象的
 		2）wait方法与notify方法必须要在同步代码块和同步函数中才能使用
 		3）wait方法与notify方法必须要由锁对象进行调用
 	
 	
*/

//  产品类

class Product {
	String name; // 名字

	double price; // 价格
	
	boolean flag = false; //  产品是否生产完毕的标示，默认情况下是没有完成生产的
}

class Producer extends Thread {

	Product p;// 产品

	public Producer(Product p) {
		this.p = p;
	}

	@Override
	public void run() {
		int i = 0; // 就是为了生产不同的产品

		while (true) {
			synchronized (p) {
				if (p.flag == false) {
					if (i % 2 == 0) {
						p.name = "苹果";
						p.price = 6.5;
					} else {
						p.name = "香蕉";
						p.price = 2.0;
					}
					System.out.println("生产者生产了" + p.name + "  价格是：" + p.price);
					p.flag = true;  //  生产者生产完毕，等待消费者去消费
					p.notify();
					i++;
				} else {
					//  就需要等待消费者去消费产品
					try {
						p.wait();  //  生产者等待
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}
	}

}

// 消费者
class Consumer extends Thread {

	Product p;

	public Consumer(Product p) {
		this.p = p;
	}

	@Override
	public void run() {
		while (true) {
			synchronized (p) {
				if (p.flag == true) {
					System.out.println("消费者消费了" + p.name + "  价格是：" + p.price);
					p.flag = false;  // 产品已经消费
					p.notify();
				} else {
					try {
						p.wait(); //   等待生产者去生产
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}  
				}
			}
		}
	}
}

public class Demo8 {
	public static void main(String[] args) {
		Product p = new Product();
		Producer pro = new Producer(p);
		Consumer con = new Consumer(p);

		pro.start();
		con.start();
	}

}
