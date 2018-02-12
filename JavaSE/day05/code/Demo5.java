/*
	this关键字典型的用法：
		1）使用this关键字调用本类中其他的构造函数
	
	this关键在调用本类中其他构造函数时要注意的细节：
		1）this关键字调用其他的构造函数时，this关键字必须要位于构造函数中的第一个语句
		2）this关键字在构造函数中不能出现相互调用的情况，因为是一个死循环
*/

class Student{
	int id;   //  身份证
	
	String name;
	
	//  目前的情况：存在了同名的成员变量与局部变量，在方法内部默认的访问的是局部变量
	public Student(String name, int id) {   //  形式参数是局部变量
		//this.name = name; 
		this(name);   //  在两个参数的构造方法中调用了本类中一个参数的构造方法
		this.id  = id;
		System.out.println("两个参数的构造方法执行了");
		
	}
	
	public Student(String name) {
		this(name, 110);
		this.name = name;
		System.out.println("一个参数的构造方法执行了");
	}
	
	public void study() {
		System.out.println("好好学习");
	}
}

public class Demo5{
	public static void main(String[] args) {
		Student s = new Student("Koko", 123);
		
		System.out.println("name:" + s.name + " id:" + s.id);
		
		//Student s1 = new Student("金三胖");
		//System.out.println("name:" + s1.name + " id:" + s1.id);
	}
	
	
	
	/*
		使用java定义一个人类，人具有id、name、age三个属性，还具备一个比较年龄的方法
		
		要求：必须要写上构造函数，构造函数中也必须要使用上this关键字
	*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}