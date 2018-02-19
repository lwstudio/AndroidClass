/*
	强制类型转换
	
	如果需要访问子类所特有的成员，那么需要进行强制转换
	
	基本数据类型的转换
		小数据类型--------->大数据类型   自动类型转换
		大数据类型--------->小数据类型   强制类型转换    格式：  小数据类型  变量名  = (小数据类型)大数据类型
		
	引用数据类型的转换
		小数据类型--------->大数据类型   自动类型转换
		大数据类型--------->小数据类型   强制类型转换
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

public class Demo12{
	public static void main(String[] args) {
		Animal a = new Mouse("老鼠");
		Mouse m = (Mouse)a;
		m.dig();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}