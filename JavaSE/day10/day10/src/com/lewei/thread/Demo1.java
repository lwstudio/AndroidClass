package com.lewei.thread;

/*
  	进程：正在执行的程序成为一个进行。进程负责了内存空间的划分。
  	
  	问题：Windows号称是多任务操作系统，那么Windows系统是同时运行多个程序吗？
  		从宏观的角度：Windows系统确实是在同时运行多个程序的
  		从微观的角度：CPU是做了一个快速切换执行的动作，由于速度太快，感觉不到在
  			切换而已
  			
  	线程：线程在进程中负责了代码的执行，就是进程中一个执行路径
  		线程是操作系统运行程序的基本单位
  	
  	多线程：在一个进程中有多个线程在同时执行不同的任务
  	
  	疑问：线程负责了代码的执行，我们之前没有学过线程，为什么代码可以执行呢？
  		运行任何一个java程序时，jvm在运行的时候都会创建一个main线程执行
  		main方法中的所有的代码
  		
  	一个java应用程序至少需要多少个线程？
  		一个主线程负责main方法的代码的执行，一个是垃圾回收线程，负责回收垃圾
  		
  	多线程的好处？
  		1）解决一个进程可以同时执行多个任务的问题
  		2）提高了资源的利用率
  		
  	多线程的坏处？
  		1）在单核CPU的时候，不仅没有提高效率，反而是降低了效率（在切换不同任务执行的
  			时候，需要保存当前任务的状态，往往会比执行任务消耗的时间更长）
  		2）降低了一个进程中线程的执行概率
  		3）引发了线程安全问题
  		4）出现了死锁现象
  		
  	
  	如何去创建线程：
  		方式一：
  			1）定义一个类继承Thread类。
  			2）重写Thread类中的run方法，把自定义线程的代码写在run方法中
  				疑问：重写run方法的目的是什么？
  					每个线程都有自己的任务代码，jvm创建的主线程的任务代码就是main方法中的
  					所有代码，自定义线程任务代码就写在run方法中，自定义线程就负责了run方法中的代码
  			3）创建Thread类的子类对象，并且调用start方法开启线程
  				注意：一个线程一旦开启，那么线程就会执行run方法中的代码，run方法千万不可以直接调用
  				，直接调用run方法就相当于调用了一个普通的方法而已，并没有开启新的线程
  			
  			
  	
*/

public class Demo1 extends Thread{
	
	

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("自定义线程：" + i);
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		
		Demo1 d = new Demo1();
		d.start();
		
		for (int i = 0; i < 100; i++) {
			System.out.println("主线程：" + i);
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
