package com.lewei.thread;

/*
 	��������
 	
 	����������ֵĸ���ԭ��
 		1�����������������������ϵ��߳�
 		2�����������������������ϵĹ�����Դ
 		
 	���������û�з�����java���Լ��ϵ�һ��ȱ�ݣ�ֻ�ܾ���������������ķ���
*/

class DeadLock extends Thread{
	public DeadLock(String name) {
		super(name);
	}
	
	
	@Override
	public void run() {
		if ("����".equals(Thread.currentThread().getName())) {
			synchronized ("ң����") {
				System.out.println("�����õ���ң������׼��ȥ�õ��");
				try {
					Thread.sleep(50);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				synchronized ("���") {
					System.out.println("�����õ���ң���������ˣ����ſյ�ˬ����Ĵ���");
				}
			}
		} else if ("����".equals(Thread.currentThread().getName())) {
			synchronized ("���") {
				System.out.println("�����õ��˵�أ�׼��ȥ��ң����");
				try {
					Thread.sleep(50);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				synchronized ("ң����") {
					System.out.println("�����õ���ң���������ˣ����ſյ�ˬ����Ĵ���");
				}
			}
		}
	}
}

public class Demo6 {
	public static void main(String[] args) {
		DeadLock zs = new DeadLock("����");
		DeadLock ls = new DeadLock("����");
		
		zs.start();
		ls.start();
		
	}
	
	
	
	
	
	
	
	
	
}
