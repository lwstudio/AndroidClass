/*
	接口的基本概述
	
	接口：扩展功能。   USB接口
	
	接口的定义格式：
		interface 接口名{
			
		}
		
	使用接口时需要注意的细节：
		1）接口是一个特殊的类
		2）接口的成员变量默认的修饰符为：public static final。那么也就是说接口中的成员变量都是常量
		3）接口中的方法都是抽象方法，默认的修饰符为：public abstract
		4）接口不能创建对象
		5）接口是没有构造方法的
		6）接口是给类去实现的，非抽象类实现一个接口时，必须要把接口中的方法全部实现
		
	实现接口的格式：
		class 类名 implements 接口名{
			
		}
		
	
*/
interface A{
	public static final int I = 10;
	
	void print();
}

class B implements A{
	public void print() {
		System.out.println("实现了接口中的方法");
	}
}

public class Demo6{
	public static void main(String[] args) {
		B b = new B();
		
		b.print();
	}
	
	
	
	
	
	
}