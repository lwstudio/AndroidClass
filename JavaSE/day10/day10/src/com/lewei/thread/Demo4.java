package com.lewei.thread;

/*
  	需求：模拟三个窗口同时在售50张票
  	
  	问题一：为什么50张票卖出了150次
  		因为num是非静态的，非静态的成员变量数据在每个对象中都会维护一份，三个对象就会出现三份
  		
  	解决方案：把num票数共享出来给三个线程对象使用，使用static进行修饰
  	
  	问题2：出现了线程安全问题？
  	
  		出现线程安全问题的原因：
  			1）存在多个线程
  			2）操作同一资源
  		
  	解决方案：sun提供了线程同步机制让我们解决这类问题
  		方式一：同步代码块
  			格式：
  				synchronized (锁对象) {
  					需要被同步的代码
  				}
  				
  			使用同步代码块需要注意的细节：
  				1）任意的一个对象都可以作为锁对象
  				2）在同步代码块中调用sleep方法并不释放锁对象
  				3）只有真正存在线程安全问题的时候才使用同步代码块，否则的话会降低效率
  				4）多线程操作的锁对象必须是 唯一共享 的，否则的话无效
  		
  		方式二：同步函数
  		
  	
*/

class SaleTicket extends Thread{
	
	//  隐含的维护了一个状态
	//  int status = 0;
	
	static Object obj = new Object();
	
	static int num = 50;   //  表示票
	
	public SaleTicket(String name) {
		super(name);
	}
	
	@Override
	public void run() {  //  在run方法中模拟买票的过程
		while (true) {
			
			synchronized (SaleTicket.class) {
				if (num > 0) {
					
					try {
						Thread.sleep(20);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					System.out.println(Thread.currentThread().getName() + "售出了第" + num + "张票");
					num--;  // 票数要相应的减少
				} else {
					System.out.println("票卖完了");
					break;
				}
			}
			
		}
		
	}
}

public class Demo4 {
	public static void main(String[] args) {
		SaleTicket s1 = new SaleTicket("1号窗口");
		SaleTicket s2 = new SaleTicket("2号窗口");
		SaleTicket s3 = new SaleTicket("3号窗口");
		
		s1.start();
		s2.start();
		s3.start();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
