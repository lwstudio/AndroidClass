package com.lewei.thread;

/*
 	死锁现象
 	
 	死锁现象出现的根本原因：
 		1）存在两个或者是两个以上的线程
 		2）存在两个或者是两个以上的共享资源
 		
 	解决方案：没有方案，java语言级上的一个缺陷，只能尽量避免死锁现象的发生
*/

class DeadLock extends Thread{
	public DeadLock(String name) {
		super(name);
	}
	
	
	@Override
	public void run() {
		if ("张三".equals(Thread.currentThread().getName())) {
			synchronized ("遥控器") {
				System.out.println("张三拿到了遥控器，准备去拿电池");
				try {
					Thread.sleep(50);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				synchronized ("电池") {
					System.out.println("张三拿到了遥控器与电池了，开着空调爽歪歪的吹着");
				}
			}
		} else if ("李四".equals(Thread.currentThread().getName())) {
			synchronized ("电池") {
				System.out.println("李四拿到了电池，准备去拿遥控器");
				try {
					Thread.sleep(50);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				synchronized ("遥控器") {
					System.out.println("李四拿到了遥控器与电池了，开着空调爽歪歪的吹着");
				}
			}
		}
	}
}

public class Demo6 {
	public static void main(String[] args) {
		DeadLock zs = new DeadLock("张三");
		DeadLock ls = new DeadLock("李四");
		
		zs.start();
		ls.start();
		
	}
	
	
	
	
	
	
	
	
	
}
