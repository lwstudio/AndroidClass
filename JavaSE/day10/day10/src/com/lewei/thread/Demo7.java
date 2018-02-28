package com.lewei.thread;

/*
  	�Զ����߳�--��ʽ����ʵ��Runnable�ӿ�
  		���裺
  			1���Զ���һ����ʵ��Runnable�ӿ�
  			2��ʵ��Runnable�ӿڵ�run���������Զ����̵߳��������д��run������
  			3������Runnable�ӿڵ�ʵ�������
  			4������Thread��Ķ����Ұ�Runableʵ���������Ϊ��Ϊʵ�ν��д���
  			5������Thread�����start����������һ���߳�
  			
  	����1��Runableʵ����������̶߳�����
  		Runableʵ������󲢲���һ���̶߳���ֻ������ʵ����Runable�ӿڵĶ�����ѡ�
  		ֻ����Thread������Thread�����������̶߳���
  		
  	����2��ΪʲôҪ��Runable�ӿ�ʵ���������Ϊʵ�δ��ݸ�Thread����������ʲô��
  		���þ��ǰ�Runnableʵ��������run���������̵߳��������ȥִ��
  		
  	�Ƽ����ڶ��֣�ʵ��Runnable�ӿ�
  		ԭ���ǣ���Ϊjava�ǵ��̳ж�ʵ�ֵ�
  			
  	
*/

public class Demo7 implements Runnable{  //�Զ���һ����ʵ��Runnable�ӿ�
	
	
	
	//  ʵ��Runnable�ӿڵ�run���������Զ����̵߳��������д��run������
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + "---" + i);
		}
		
	}

	public static void main(String[] args) {
		//  ����Runnable�ӿڵ�ʵ�������
		Demo7 d = new Demo7();
		
		//  ����Thread��Ķ����Ұ�Runableʵ���������Ϊ��Ϊʵ�ν��д���
		Thread t = new Thread(d, "����");
		t.start();
		
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName() + "---" + i);
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
	
	
	
	
	
	

}
