/*
	多态的应用
		1）多态用于形式参数时，可以接收更多的数据类型
		2）多态用于返回值类型时，可以返回更多类型的数据
		
	多态的好处：
		提高了我们代码的扩展性
		
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
	
}


public class Demo11{
	public static void main(String[] args) {
		Circle c = new Circle(3);
		print(c);
		
		React r = new React(2, 3);
		print(r);
	}
	
	
	//需求1：定义一个函数可以接收任意类型的图形对象，并且打印图形面积与周长
	
	public static void print(Shape s){
		s.getArea();
		s.getLength();
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