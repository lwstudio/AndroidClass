package com.lewei.thread;



/*
 	����ģ��QQ��Ƶ������ͬʱ��ִ��
*/

class TalkThread extends Thread{
	@Override
	public void run() {
		while (true) {
			System.out.println("Hi����ã���Ƶ��");
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
			System.out.println("��Ƶ��Ƶ");
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
