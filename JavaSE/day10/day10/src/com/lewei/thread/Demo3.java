package com.lewei.thread;


/*
 	线程中的常用方法
 		Thread(String name)     初始化线程的名字
	 	setName(String name)    设置线程对象名
	 	getName()               返回线程的名字
	 
	 	sleep()                 线程睡眠指定的毫秒数。 
	 		静态的方法， 那个线程执行了sleep方法代码那么就是那个线程睡眠。
	 
	 	currentThread()         返回当前的线程对象，
	 		该方法是一个静态的方法， 
	 		注意： 那个线程执行了currentThread()代码就返回那个线程 的对象。
	 
	 	getPriority()            返回当前线程对象的优先级   
	 		默认线程的优先级是5
	 	setPriority(int newPriority) 设置线程的优先级    
	 	虽然设置了线程的优先级，但是具体的实现取决于底层的操作系统的实现
	 	（最大的优先级是10 ，最小的1 ， 默认是5）。
	 	
*/
public class Demo3 extends Thread{
	
	public Demo3(String name) {
		super(name);
	}
	
	public Demo3() {
		
	}
	
	@Override
	public void run(){
		/*System.out.println("this:" + this);  //  代表的函数的调用者对象
		System.out.println("currentThread:" + Thread.currentThread());
		System.out.println("自定义线程的优先级是：" + Thread.currentThread().getPriority());*/
		
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	public static void main(String[] args) {
		Demo3 d = new Demo3("张三");
		d.start();
		
		System.out.println("主线程的优先级是：" + Thread.currentThread().getPriority());
		
		
		
		
		
		/*d.setName("Thread-0");
		System.out.println("自定义线程1的名字：" + d.getName());
		
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Demo3 d2 = new Demo3("李四");
		d2.setName("Thread-1");
		System.out.println("自定义线程2的名字：" + d2.getName());*/
	}
	
	
	
	
	
	
	
	
	
	
	
}
