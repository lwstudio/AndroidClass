/*
	习题：
		创建出图形、圆形、矩形类，每个类中都具有计算面积和周长的方法，是不过是计算方式不同
		（矩形、圆形需要继承图形类）
		
	abstract关键字不能与以下关键字共同修饰一个方法
		1）abstract不能与private共同修饰一个方法
		2）abstract不能与static共同修饰一个方法
		3）abstract不能与final共同修饰一个方法
*/

abstract class Shape{
	
	String name;
	
	public Shape(String name) {
		this.name = name;
	}
	
	public abstract void getArea();  //  Shape.getArea();
	
	public abstract void getLength();
}

class Circle extends Shape{
	double r;
	
	public static final double PI = 3.14;
	
	public Circle(String name, double r) {
		super(name);
		this.r = r;
	}
	
	public void getArea(){
		System.out.println(name + "的面积是" + (PI * r *r));
	}
	
	public void getLength(){
		System.out.println(name + "的周长是" + (PI * r * 2));
	}
}

class React extends Shape{
	double width;
	
	double height;
	
	public React(String name, double width, double height) {
		super(name);
		this.width = width;
		this.height = height;
	}
	
	public void getArea(){
		System.out.println(name + "的面积是" + (width * height));
	}
	
	public void getLength(){
		System.out.println(name + "的周长是" + ((width + height) * 2));
	}
}

public class Demo3{
	public static void main(String[] args) {
		Circle c = new Circle("圆形", 2);
		c.getArea();
		c.getLength();
		
		React r = new React("矩形", 2, 3);
		r.getArea();
		r.getLength();
	}
	
	
	
	
	
}