package com.lewei.thread;



/*
 	需求：模拟QQ视频与聊天同时在执行
*/

class TalkThread extends Thread{
	@Override
	public void run() {
		while (true) {
			System.out.println("Hi！你好！视频不");
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class VideoThread extends Thread{
	@Override
	public void run() {
		while (true) {
			System.out.println("视频视频");
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}


public class Demo2 {
	 
	public static void main(String[] args) {
		TalkThread t = new TalkThread();
		t.start();
		
		VideoThread v = new VideoThread();
		v.start();
		
	}
	
	
	
	

}
