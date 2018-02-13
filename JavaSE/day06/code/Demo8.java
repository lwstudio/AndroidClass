/*
	super关键字的使用：
		super是什么？
			super关键字代表了父类空间的引用（错误说法：super关键字代表的是父类对象）
			
		super关键字的作用？
			1）子父类中存在同名的成员，在子类中默认访问的是子类中的成员，可以通过super关键字指定访问父类中的成员
			2）创建子类对象时，默认会先调用父类无参的构造方法，可以通过super关键字指定调用父类的构造方法
		
		super关键字使用时要注意的细节：
			1）如果在子类的构造方法上没有指定父类的构造方法，那么java编译器就会在子类构造方法
				上面加上super()语句。
			2）super关键字调用父类构造函数时，该语句必须是子类构造函数的第一个语句
			3）super关键字与this关键字不能同时出现在同一个构造函数中调用其他的构造函数；
				因为两个语句都必须是第一个语句。
				
	super关键字与this关键字的区别：
		1）代表的事物不一致
			1. super关键字代表的是父类空间的引用
			2. this关键字代表的是所属函数的调用者对象
		2）使用的前提不一致
			1. super关键字必须要有继承关系才能使用
			2. this关键字不需要继承关系也可以使用
		3）调用构造函数的区别：
			1. super关键字是调用父类的构造函数
			2. this关键字调用的是本类的构造函数
*/

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
	
	public void play() {
		System.out.println(name + "打篮球");
	}
}

class Son extends Father{
	int age;
	
	String name;
	
	public Son() {
		//super();  //  调用的是父类无参的构造方法
		
		System.out.println("子类无参的构造方法");
	}
	
	public Son(int age){
		this.age = age;
	}
	
	
	
	public Son(String name, int age) {
		//this(age);
		super(name);  //  指定调用的是父类有参的构造方法
		
		this.age = age;
		System.out.println("子类有参的构造方法");
		
	}
	
	public void play() {
		System.out.println(name + "打游戏");
	}
	
	
	public void print() {
		System.out.println("age：" + age);
		System.out.println("age：" + super.age);
	}
	
	
}


public class Demo8{
	public static void main(String[] args) {
		Son son = new Son("大头儿子", 12);
		son.print();
		
	}
	
	
	
	
	
	
	
	
	
}