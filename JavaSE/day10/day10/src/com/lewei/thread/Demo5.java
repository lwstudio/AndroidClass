package com.lewei.thread;

/*
  	����һ�Է��޵����п�����2���Ǯ��ÿ��ÿ�ο���ȡ1000��Ǯ������������̰߳�ȫ����
  	
  	
  	��ʽ����ͬ��������ͬ����������synchronized����һ����������
  		ʹ��ͬ������ʱ��Ҫע���ϸ�ڣ�
  			1��һ���Ǿ�̬��ͬ��������������this��������Ǿ�̬������ͬ����������������ǵ�ǰ����������
  				����ֽ����ļ������䣩
  			2��ͬ���������������ǹ̶��ģ����������ָ��
  			
  	�Ƽ�ͬ�����룺
  		1��ͬ����������������������������ָ����������ơ�ͬ���������������ǹ̶��ģ�������������ָ��
  		2��ͬ���������Ժܷ���Ŀ��Ʊ�ͬ������ķ�Χ��ͬ�������е�ȫ�����붼��ͬ���ˡ�
  		
*/

class BankThread extends Thread{
	static int money = 20000;
	
	public BankThread(String name) {
		super(name);
	}
	
	@Override
	public void run() {
		getMoney();
	}
	
	public static synchronized void getMoney() {
		while (true) {
			if ((money - 100) > 0) {
				System.out.println(Thread.currentThread().getName() + "ȡ����1000��Ǯ����ʣ��" + (money - 100) + "Ԫ");
				money -= 100;
				
				try {
					Thread.sleep(20);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else {
				System.out.println("����");
				break;
			}
		}
		
		
		
		
	}
}

public class Demo5 {
	public static void main(String[] args) {
		BankThread thread1 = new BankThread("�Ϲ�");
		BankThread thread2 = new BankThread("����");
		
		thread1.start();
		thread2.start();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
