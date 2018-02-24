/*
	自定义类
	
	自定义类的步骤：
		1）自定义类
			格式：
				class 类名{
					事物的公共属性使用成员变量进行描述
					
					事物的公共行为使用函数描述
				}
		2）通过自定义类创建对象
			格式：
				类名 变量名 = new 类名()
		3）访问（设置）对象的属性或者是调用对象的功能
			1. 访问对象属性的格式：
				对象.属性名
			2. 设置对象属性的格式
				对象.属性名 = 数据
			3. 调用对象的功能的格式
				对象.函数名()
				
	
		
		
		什么时候使用main函数？
			main函数是一个程序的入口
			如果一个类需要单独的执行，那么这个时候我们才添加main函数
		
	//  需求：编写一个汽车类，用来描述汽车，拥有名字、颜色、轮子属性，拥有可以行动的行为
	
	
	
	//  扩展：在一个Java文件中是不是可以出现多个自定义类的？
		是可以，在一个java文件中是可以出现多个类的，但是只有与文件名同名的类才能够被public修饰
			也只有这个类才能才能被public修饰
	
*/

class Car {
	//  事物的公共属性使用成员变量进行描述
	String name;
	
	String color;
	
	int wheel;
	
	
	//  事物的公共行为使用函数描述
	public void move() {
		System.out.println("我会动");
	}
}








public class Demo2{
	public static void main(String[] args){
		//  使用Car类创建出的对象是什么数据类型
		//  使用Car类声明了一个c变量，c变量指向了一个车对象
		Car c = new Car();   //  这种形式并不是很好
		//  c是一个引用类型的变量，对象中的成员变量是有默认值（初始值）
		//  String也是一个类，如果只是完成的变量的定义但没有赋值的话，这个变量为空
		
		//  设置对象的属性
		c.name = "BMW";
		c.color = "White";
		c.wheel = 4;
		
		//  访问对象的属性
		System.out.println("name：" + c.name);
		System.out.println("color：" + c.color);
		System.out.println("wheel：" + c.wheel);
		
		
		//  调用对象的功能
		c.move();
		
	}
	
	
	
	
	
	
	
	
	
	
}