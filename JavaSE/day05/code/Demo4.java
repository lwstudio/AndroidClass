/*
	需求：使用Java类描述一个动物
	
	问题：存在同名的成员变量与局部变量，在方法的内部访问的是局部变量（java采取的是就近原则的
		机制去访问的）
		
	this关键字：
		
	this关键字代表所属函数的调用者对象
	
	this关键字的作用：
		1）如果存在同名的成员变量和局部变量，在方法的内部默认是访问局部变量的数据，可以通过this关键字
			指定访问成员变量的数据
			
			
	this关键字使用时要注意的细节：
		1）存在同名的成员变量与局部变量，在方法的内部访问的是局部变量（java采取的是就近原则的
		机制去访问的）
		2）如果在一个方法中访问了一个变量，该变量只存在成员变量的情况下，那么java编译器会自动的
			帮助我们在该变量前面加上this关键字
		
*/

class Animal{
	String name;  //  成员变量
	
	String color;
	
	public Animal(String n, String c) {
		name = n;
		color = c;
	}
	
	public void eat() {
		
		//this关键字代表所属函数的调用者对象(谁调用这个方法，this关键字指代的就是谁)
		//System.out.println("This:" + this);
		
		//String name = "老鼠";  //  局部变量
		
		
		System.out.println(name +  "在吃...");
	
	}
}


public class Demo4{
	public static void main(String[] args){
		Animal dog = new Animal("狗", "black");   //  存在了两个对象，存在了两份name数据
		
		Animal cat = new Animal("猫", "orange");
		
		
		cat.eat();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}