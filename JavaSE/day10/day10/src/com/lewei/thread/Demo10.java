package com.lewei.thread;

/*
 	join������ ����
*/

class Mom extends Thread {
	@Override
	public void run() {
		System.out.println("����ϴ��");
		System.out.println("�����в�");
		System.out.println("����׼�����ˣ�����û������");
		//  �ж���ȥ����
		Son s = new Son();
		s.start();  
		try {
			s.join();  //  һ���߳����ָ����join��������ô�����µ��̼߳��룬ִ�и������߳̾ͱ���Ҫ�����ò���
			//�µ��߳�ִ��ֱ���������Ȼ����ܻ���ִ��
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("���賴��");
		System.out.println("ȫ����һ��Է�");
	}
}

class Son extends Thread{
	@Override
	public void run() {
		System.out.println("������¥");
		System.out.println("����ȥ����");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("������ý�����");
		System.out.println("������¥");
	}
}


public class Demo10 {
	public static void main(String[] args) {
		Mom m = new Mom();
		m.start();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}	
