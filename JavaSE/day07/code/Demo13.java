/*
	强制类型转换
	
	
	需求1：定义一个函数可以接收任意类型的图形对象，并且打印图形面积与周长
	
	需求2：定义一个函数可以返回任意类型的图形对象
*/
//  图形类
abstract class Shape{
	public abstract void getArea();
	
	public abstract void getLength();
}

class Circle extends Shape{
	public static final double PI = 3.14;
	
	double r;
	
	public Circle(double r) {
		this.r = r;
	}
	
	public void getArea(){
		System.out.println("圆形的面积是：" + (PI * r * r));
	}
	
	public void getLength() {
		System.out.println("圆形的周长是：" + (PI * r * 2));
	}
	
	public void printInCircle() {
		System.out.println("我是圆形");
	}
	
}

class React extends Shape{
	double width;
	
	double height;
	
	public React(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	public void getArea(){
		System.out.println("矩形的面积是：" + (width * height));
	}
	
	public void getLength() {
		System.out.println("矩形的周长是：" + ((width + height) * 2));
	}
	
	public void printInReact() {
		System.out.println("我是矩形");
	}
	
}


public class Demo13{
	public static void main(String[] args) {
		Circle c = (Circle)getShape(0);
		print2(c);
		
		React r = (React)getShape(1);
		print2(r);
	}
	
	
	//需求1：定义一个函数可以接收任意类型的图形对象，并且打印图形面积与周长
	
	public static void print(Shape s){
		s.getArea();
		s.getLength();
	}
	
	//  需求3：定义一个函数，这个函数可以接收任意类型的图形对象，在函数内部可以调用每个图形对象所特有的方法
	public static void print2(Shape s) {
		if (s instanceof Circle) {
			Circle c = (Circle)s;
			c.printInCircle();
		} else if (s instanceof React) {
			React r = (React)s;
			r.printInReact();
		} else {
			System.out.println("我既不是圆形也不是矩形");
		}
	}
	
	//需求2：定义一个函数可以返回任意类型的图形对象
	public static Shape getShape(int c) {
		if (c == 0) {
			return new Circle(3);
		} else {
			return new React(2, 3);
		}
	}
	
	
	
	
	
	
	
}