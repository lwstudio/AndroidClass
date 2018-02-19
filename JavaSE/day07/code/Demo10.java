/*
	多态
	
	面向对象的三大特征：
		1）封装
		2）继承
		3）多态
		
	多态：一个对象拥有多个形态（父类的应用类型变量指向子类的对象）
		接口的应用类型变量指向了接口实现类的对象
		
	多态的前提：
		必须要具有继承或者是实现关系
		
	使用多态时要注意的细节：
		1）多态情况下，子父类存在同名的成员变量时，访问的是父类的成员变量
		2）多态情况下，子父类存在同名的非静态的成员函数时，访问的子类的成员函数
		3）多态情况下，子父类存在同名的静态函数时，访问的是父类的成员函数
		
	总结：多态情况下，子父类存在同名的成员时，访问的都是父类的成员，除了在同名的静态函数时才是访问的是子类的
		4）多态情况下，不能访问子类特有的成员
		
	编译看左边，运行时不一定看右边
	
	编译时看左边：java编译器在编译时，会检查引用类型的变量所属的类是否具有指定的成员，
		如果不具备，就马上报错
	
*/

abstract class Animal{
	String name;
	
	static String color = "动物色";
	
	public Animal(String name) {
		this.name = name;
	}
	
	public abstract void move();
	
	
	public static void eat() {
		System.out.println("动物在吃");
	}
}

class Mouse extends Animal{
	static String color = "黑色";
	
	public Mouse(String name) {
		super(name);
	}
	
	public void move() {
		System.out.println("靠着墙根偷偷的跑");
	}
	
	public static void eat() {
		System.out.println("偷东西吃");
	}
	
	//  老鼠特有的行为----打洞
	public void dig() {
		System.out.println("老鼠会打洞");
	}
}

public class Demo10{
	public static void main(String[] args) {
		/*
		Mouse m = new Mouse("老鼠");
		m.move();
		m.eat();
		m.dig();
		*/
		Animal a = new Mouse("老鼠");
		//System.out.println("color:" + a.color);
		//a.dig();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}