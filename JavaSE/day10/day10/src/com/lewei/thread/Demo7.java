package com.lewei.thread;

/*
  	自定义线程--方式二：实现Runnable接口
  		步骤：
  			1）自定义一个类实现Runnable接口
  			2）实现Runnable接口的run方法，把自定义线程的任务代码写在run方法中
  			3）创建Runnable接口的实现类对象
  			4）创建Thread类的对象并且把Runable实现类对象作为作为实参进行传递
  			5）调用Thread对象的start方法，开启一个线程
  			
  	问题1：Runable实现类对象是线程对象吗？
  		Runable实现类对象并不是一个线程对象，只不过是实现了Runable接口的对象而已。
  		只有是Thread或者是Thread类的子类才是线程对象
  		
  	问题2：为什么要把Runable接口实现类对象作为实参传递给Thread对象？作用是什么？
  		作用就是把Runnable实现类对象的run方法作用线程的任务代码去执行
  		
  	推荐：第二种，实现Runnable接口
  		原因是：因为java是单继承多实现的
  			
  	
*/

public class Demo7 implements Runnable{  //自定义一个类实现Runnable接口
	
	
	
	//  实现Runnable接口的run方法，把自定义线程的任务代码写在run方法中
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + "---" + i);
		}
		
	}

	public static void main(String[] args) {
		//  创建Runnable接口的实现类对象
		Demo7 d = new Demo7();
		
		//  创建Thread类的对象并且把Runable实现类对象作为作为实参进行传递
		Thread t = new Thread(d, "张三");
		t.start();
		
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName() + "---" + i);
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
	
	
	
	
	
	

}
