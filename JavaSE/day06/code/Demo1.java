/*
	static关键字修饰成员函数
		调用方式：
			1）使用对象的方式进行调用
			2）使用类名.方法名()
		
	使用static关键字时需要注意的细节：
		1）静态函数时可以通过类名或者是对象进行调用的，而非静态函数只能通过对象进行调用
		2）非静态的函数可以访问静态的和非静态的成员变量
			原因：非静态的函数只能通过对象进行调用，当对象存在的时候，静态的数据已经存在了
				，而非静态的数据也随着对象的创建而存在
		3）静态的函数可以直接访问静态的成员，但是不能直接访问非静态的成员
			原因：静态的函数是可以使用类名调用的，这个时候还没有对象存在
				而非静态的数据则是随着对象的创建而存在
		4）静态函数中是不能出现this以及super关键字的
			原因：因为静态函数是可以通过类名去调用的，一旦使用类名调用这时候不存在对对象，
				而this关键字则代表了函数调用者对象，这时候就产生了冲突
		
	原理：静态的数据的生命周期，静态的成员变量数据是优先于对象存在的
	
	代码块：
		构造代码块
		局部代码块
		静态代码块：静态代码块实在class文件加载到内存中的时候执行的
		
	什么使用static关键字修饰成员函数？
		如果成员函数没有直接访问非静态的成员变量，那么这时候即可使用static关键字修饰成员函数；
		一般用于工具类中的方法
		
	静态成员函数一定不能访问非静态成员变量吗？
		
*/

class Student{
	
	static {
		System.out.println("静态代码块执行了");
	}
	
	public Student(String name) {
		this.name = name;
		System.out.println("构造函数执行了");
	}
	
	public String name;
	
	
	//  静态的成员变量
	public static String country = "中国";
	
	public void study() {
		System.out.println(name + "好好学习");
		System.out.println("country:" + country);
	}
	

	public static void sleep() {
		
		Student s = new Student("Koko");
		System.out.println(s.name + "好好休息");
		/*
		System.out.println("好好休息");
		System.out.println("country:" + country);
		*/
	}
}

class Demo1{
	public static void main(String[] args){
		
		/*
		//  使用对象调用静态函数
		Student s = new Student("Koko");
		s.sleep();
		
		//  使用类名调用静态函数
		Student.sleep();
		*/
		Student.sleep();
		//Student s = new Student();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}