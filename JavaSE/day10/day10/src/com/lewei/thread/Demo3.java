package com.lewei.thread;


/*
 	�߳��еĳ��÷���
 		Thread(String name)     ��ʼ���̵߳�����
	 	setName(String name)    �����̶߳�����
	 	getName()               �����̵߳�����
	 
	 	sleep()                 �߳�˯��ָ���ĺ������� 
	 		��̬�ķ����� �Ǹ��߳�ִ����sleep����������ô�����Ǹ��߳�˯�ߡ�
	 
	 	currentThread()         ���ص�ǰ���̶߳���
	 		�÷�����һ����̬�ķ����� 
	 		ע�⣺ �Ǹ��߳�ִ����currentThread()����ͷ����Ǹ��߳� �Ķ���
	 
	 	getPriority()            ���ص�ǰ�̶߳�������ȼ�   
	 		Ĭ���̵߳����ȼ���5
	 	setPriority(int newPriority) �����̵߳����ȼ�    
	 	��Ȼ�������̵߳����ȼ������Ǿ����ʵ��ȡ���ڵײ�Ĳ���ϵͳ��ʵ��
	 	���������ȼ���10 ����С��1 �� Ĭ����5����
	 	
*/
public class Demo3 extends Thread{
	
	public Demo3(String name) {
		super(name);
	}
	
	public Demo3() {
		
	}
	
	@Override
	public void run(){
		/*System.out.println("this:" + this);  //  ����ĺ����ĵ����߶���
		System.out.println("currentThread:" + Thread.currentThread());
		System.out.println("�Զ����̵߳����ȼ��ǣ�" + Thread.currentThread().getPriority());*/
		
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	public static void main(String[] args) {
		Demo3 d = new Demo3("����");
		d.start();
		
		System.out.println("���̵߳����ȼ��ǣ�" + Thread.currentThread().getPriority());
		
		
		
		
		
		/*d.setName("Thread-0");
		System.out.println("�Զ����߳�1�����֣�" + d.getName());
		
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Demo3 d2 = new Demo3("����");
		d2.setName("Thread-1");
		System.out.println("�Զ����߳�2�����֣�" + d2.getName());*/
	}
	
	
	
	
	
	
	
	
	
	
	
}
