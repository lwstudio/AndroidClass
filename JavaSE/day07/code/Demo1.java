/*
	final关键字：
		修饰符（最终）
		
	final关键字的作用：
		1）final关键字修饰基本数据类型的变量时，该变量不能重新进行赋值，第一次的值即为最终的值
		2）final关键字修饰引用类型的变量时，该变量不能重新指向新的对象
		3）fianl关键字修饰一个函数的时候，该函数不能被重写
		4）final关键字修饰一个类时，该类不能被继承
*/

class Circle{
	double r;  //  半径
	
	//  将pi私有化
	//private double pi = 3.14;
	
	public static final double PI = 3.14;
	//  public方便所有人访问
	//  static保证内存中只有一个变量
	//  final保证该值不会被修改
	
	public Circle(double r) {
		this.r = r;
	}
	
	final public void getArea() {
		System.out.println("这个圆的面积是：" + (PI * r * r));
	}
}

public class Demo1 extends Circle{
	public static void main(String[] args) {
		final Circle c = new Circle(3);
		//c = new Circle(4);
		// c.pi = 0;  //需要限制用户对pi的修改
		test(c);
		c.getArea();
	}
	
	public Demo1 (double r) {
		super(r);
	}
	
	/*
	public void getArea() {
		System.out.println("哈哈，你写的代码被我修改了");
	}
	*/
	
	public static void test(Circle c) {
		c = new Circle(5);
	}
	
	
	
	
	
	
	
	
	
	
	
	
}