/*
	方法的重写和重载：
		目前的问题：父类的功能无法满足子类的需求
		
	方法重写的前提：必须存在继承关系	
		
	方法的重写：
		子父类出现了同名的函数，这个我们就称作为方法的重写
	
	什么使用方法的重写？
		父类的功能无法满足子类的需求
		
	方法重写的要求：
		1）方法重写时，方法名与形参列表必须一致
		2）方法重写时，子类的权限修饰符必须大于或者是等于父类的权限修饰符
		3）方法重写时，子类的返回值类型必须要小于或者是等于父类返回值类型
		4）方法重写时，子类抛出的异常类型要小于或者是等于父类抛出的异常类型
			Exception（最坏）
			RuntimeException（小坏）
			
	方法的重载：
		方法重载：在同一个类中存在两个或者是两个以上的同名函数
		
		方法要求：
			1）函数名要一致
			2）形式参数列表不一致（形式参数的个数、形式参数的类型）
			3）与返回值类型没有关系
*/

class Animal{
	String name;
}

class Dog extends Animal{
	
}

class Father{
	int age = 40;
	
	String name;
	
	public Father() {
		System.out.println("父类无参的构造方法");
	}
	
	public Father(String name) {
		this.name = name;
		System.out.println("父类有参的构造方法");
	}
	
	public Animal play()  throws RuntimeException{
		System.out.println(name + "打篮球");
		return new  Animal();
	}
}

class Son extends Father{
	int age = 10;
	
	public Son() {
		System.out.println("子类无参的构造方法");
	}
	
	public Son(String name) {
		this.name = name;
		System.out.println("子类有参的构造方法");
	}
	
	public Animal play() throws Exception {
		System.out.println(name + "打游戏");
		return new Animal();
	}
}


public class Demo9{
	public static void main(String[] args) throws Exception{
		Son son = new Son("Koko");
		son.play();
	}
	
	
	
	
	
	
	
	
	
}