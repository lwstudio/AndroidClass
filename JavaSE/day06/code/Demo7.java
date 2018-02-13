/*
	在子类构造函数中调用父类构造函数的意义？
		用于完成由父类继承下来的成员变量的初始化
*/

class Father{
	int x = 10;
	
	String name;
	
	public Father() {
		System.out.println("父类无参的构造方法执行了");
	}
	
	public Father(String name) {
		this.name = name;
		System.out.println("父类有参的构造方法执行了");
	}
}

class Son extends Father{
	int x = 20;
	
	public void print() {
		System.out.println("x1:" + x);
		System.out.println("x2:" + super.x);
	}
	
	public Son() {
		System.out.println("子类无参的构造方法执行了");
	}
	
	public Son(String name) {
		super(name);   //  指定调用父类有参的构造方法
	}
}

public class Demo7{
	public static void main(String[] args) {
		Son son = new Son("Koko");
		son.print();
		System.out.println("name:" + son.name);
	}
	
	
	
	
	
}