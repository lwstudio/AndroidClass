package com.lewei.thread;

/*
	 �ػ��̣߳���̨�̣߳�����һ�����������ֻʣ�����ػ��̣߳���ô�ػ��߳�Ҳ������
	 
	 ����ģ��QQ���ظ����
	 
	 һ���߳�Ĭ�϶��Ƿ��ػ��߳�
	 
	 �ػ���ʹ
	 
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
			
			System.out.println("���°�Ŀǰ����" + i + "%");
			if (i == 100) {
				System.out.println("���°��������");
			}
		}
	}
	
	
	public static void main(String[] args) {
		Demo9 d = new Demo9();
		d.setDaemon(true);  //  �����߳��Ƿ����ػ��̣߳�trueΪ�ػ��̣߳�false�����ػ��߳�
		d.start();  //  �����ػ��̵߳Ĵ���Ҫλ�ڿ����̴߳���֮ǰ
		System.out.println("���ػ��߳���" + d.isDaemon());  //  �ж��Ƿ����ػ��߳�
		
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
