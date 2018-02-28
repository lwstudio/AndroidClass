package com.lewei.thread;

/*
	 守护线程（后台线程）：在一个进程中如果只剩下了守护线程，那么守护线程也会死亡
	 
	 需求：模拟QQ下载更变包
	 
	 一个线程默认都是非守护线程
	 
	 守护天使
	 
*/


public class Demo9 extends Thread {
	
	@Override
	public void run() {
		for (int i = 1; i <= 100; i++) {
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("更新包目前下载" + i + "%");
			if (i == 100) {
				System.out.println("更新包下载完成");
			}
		}
	}
	
	
	public static void main(String[] args) {
		Demo9 d = new Demo9();
		d.setDaemon(true);  //  设置线程是否是守护线程，true为守护线程，false不是守护线程
		d.start();  //  设置守护线程的代码要位于开启线程代码之前
		System.out.println("是守护线程吗：" + d.isDaemon());  //  判断是否是守护线程
		
		for (int i = 1; i <= 100; i++) {
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + "--" + i);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
