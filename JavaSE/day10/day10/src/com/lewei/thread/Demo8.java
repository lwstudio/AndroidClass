package com.lewei.thread;

/*
 	�߳�ͨѶ��һ���߳�������Լ�������ʱ��Ҫ֪ͨ����һ���߳�ȥ�������һ������
 	
 	��������������ģ��
 	
 	
 	����һ���������̰߳�ȫ����---�۸������
 	
 	�߳�ͬ������---ͬ�������������
 	
 	
 	
 	wait()���ȴ������һ���߳�ִ����wait��������ô���߳̾ͻ����ȴ�״̬���ȴ�״̬�µ��̱߳���Ҫ�������߳�
 		����notify�������ܻ���
 	notify()�����ѣ������̳߳صȴ��߳��е�һ��
 	notifyAll()�������̳߳���ȫ���ĵȴ��߳�
 	
 	wait��notify����Ҫע���ϸ�ڣ�
 		1��wait������notify����������Object�����
 		2��wait������notify��������Ҫ��ͬ��������ͬ�������в���ʹ��
 		3��wait������notify��������Ҫ����������е���
 	
 	
*/

//  ��Ʒ��

class Product {
	String name; // ����

	double price; // �۸�
	
	boolean flag = false; //  ��Ʒ�Ƿ�������ϵı�ʾ��Ĭ���������û�����������
}

class Producer extends Thread {

	Product p;// ��Ʒ

	public Producer(Product p) {
		this.p = p;
	}

	@Override
	public void run() {
		int i = 0; // ����Ϊ��������ͬ�Ĳ�Ʒ

		while (true) {
			synchronized (p) {
				if (p.flag == false) {
					if (i % 2 == 0) {
						p.name = "ƻ��";
						p.price = 6.5;
					} else {
						p.name = "�㽶";
						p.price = 2.0;
					}
					System.out.println("������������" + p.name + "  �۸��ǣ�" + p.price);
					p.flag = true;  //  ������������ϣ��ȴ�������ȥ����
					p.notify();
					i++;
				} else {
					//  ����Ҫ�ȴ�������ȥ���Ѳ�Ʒ
					try {
						p.wait();  //  �����ߵȴ�
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}
	}

}

// ������
class Consumer extends Thread {

	Product p;

	public Consumer(Product p) {
		this.p = p;
	}

	@Override
	public void run() {
		while (true) {
			synchronized (p) {
				if (p.flag == true) {
					System.out.println("������������" + p.name + "  �۸��ǣ�" + p.price);
					p.flag = false;  // ��Ʒ�Ѿ�����
					p.notify();
				} else {
					try {
						p.wait(); //   �ȴ�������ȥ����
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}  
				}
			}
		}
	}
}

public class Demo8 {
	public static void main(String[] args) {
		Product p = new Product();
		Producer pro = new Producer(p);
		Consumer con = new Consumer(p);

		pro.start();
		con.start();
	}

}
