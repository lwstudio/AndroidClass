package com.lewei.thread;

/*
  	����ģ����������ͬʱ����50��Ʊ
  	
  	����һ��Ϊʲô50��Ʊ������150��
  		��Ϊnum�ǷǾ�̬�ģ��Ǿ�̬�ĳ�Ա����������ÿ�������ж���ά��һ�ݣ���������ͻ��������
  		
  	�����������numƱ����������������̶߳���ʹ�ã�ʹ��static��������
  	
  	����2���������̰߳�ȫ���⣿
  	
  		�����̰߳�ȫ�����ԭ��
  			1�����ڶ���߳�
  			2������ͬһ��Դ
  		
  	���������sun�ṩ���߳�ͬ�����������ǽ����������
  		��ʽһ��ͬ�������
  			��ʽ��
  				synchronized (������) {
  					��Ҫ��ͬ���Ĵ���
  				}
  				
  			ʹ��ͬ���������Ҫע���ϸ�ڣ�
  				1�������һ�����󶼿�����Ϊ������
  				2����ͬ��������е���sleep���������ͷ�������
  				3��ֻ�����������̰߳�ȫ�����ʱ���ʹ��ͬ������飬����Ļ��ή��Ч��
  				4�����̲߳���������������� Ψһ���� �ģ�����Ļ���Ч
  		
  		��ʽ����ͬ������
  		
  	
*/

class SaleTicket extends Thread{
	
	//  ������ά����һ��״̬
	//  int status = 0;
	
	static Object obj = new Object();
	
	static int num = 50;   //  ��ʾƱ
	
	public SaleTicket(String name) {
		super(name);
	}
	
	@Override
	public void run() {  //  ��run������ģ����Ʊ�Ĺ���
		while (true) {
			
			synchronized (SaleTicket.class) {
				if (num > 0) {
					
					try {
						Thread.sleep(20);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					System.out.println(Thread.currentThread().getName() + "�۳��˵�" + num + "��Ʊ");
					num--;  // Ʊ��Ҫ��Ӧ�ļ���
				} else {
					System.out.println("Ʊ������");
					break;
				}
			}
			
		}
		
	}
}

public class Demo4 {
	public static void main(String[] args) {
		SaleTicket s1 = new SaleTicket("1�Ŵ���");
		SaleTicket s2 = new SaleTicket("2�Ŵ���");
		SaleTicket s3 = new SaleTicket("3�Ŵ���");
		
		s1.start();
		s2.start();
		s3.start();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
