package com.lewei.thread;

/*
  	需求：一对夫妻的银行卡中有2万块钱，每人每次可以取1000块钱，不允许出现线程安全问题
  	
  	
  	方式二：同步函数：同步函数就是synchronized修饰一个函数即可
  		使用同步函数时需要注意的细节：
  			1）一个非静态的同步函数锁对象是this对象，如果是静态函数的同步函数的锁对象就是当前函数所属的
  				类的字节码文件（反射）
  			2）同步函数的锁对象是固定的，不能随意的指定
  			
  	推荐同步代码：
  		1）同步代码块的锁对象可以由我们随意的指定，方便控制。同步函数的锁对象是固定的，不能由我们来指定
  		2）同步代码块可以很方便的控制被同步代码的范围，同步函数中的全部代码都被同步了。
  		
*/

class BankThread extends Thread{
	static int money = 20000;
	
	public BankThread(String name) {
		super(name);
	}
	
	@Override
	public void run() {
		getMoney();
	}
	
	public static synchronized void getMoney() {
		while (true) {
			if ((money - 100) > 0) {
				System.out.println(Thread.currentThread().getName() + "取走了1000块钱，还剩下" + (money - 100) + "元");
				money -= 100;
				
				try {
					Thread.sleep(20);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else {
				System.out.println("余额不足");
				break;
			}
		}
		
		
		
		
	}
}

public class Demo5 {
	public static void main(String[] args) {
		BankThread thread1 = new BankThread("老公");
		BankThread thread2 = new BankThread("老婆");
		
		thread1.start();
		thread2.start();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
