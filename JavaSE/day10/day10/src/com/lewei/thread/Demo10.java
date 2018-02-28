package com.lewei.thread;

/*
 	join方法。 加入
*/

class Mom extends Thread {
	@Override
	public void run() {
		System.out.println("妈妈洗菜");
		System.out.println("妈妈切菜");
		System.out.println("妈妈准备炒菜，发现没酱油了");
		//  叫儿子去打酱油
		Son s = new Son();
		s.start();  
		try {
			s.join();  //  一个线程如果指定了join方法，那么就有新的线程加入，执行该语句的线程就必须要做出让步给
			//新的线程执行直到完成任务，然后才能基础执行
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("妈妈炒菜");
		System.out.println("全家人一起吃饭");
	}
}

class Son extends Thread{
	@Override
	public void run() {
		System.out.println("儿子下楼");
		System.out.println("儿子去超市");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("儿子买好酱油了");
		System.out.println("儿子上楼");
	}
}


public class Demo10 {
	public static void main(String[] args) {
		Mom m = new Mom();
		m.start();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}	
