/*
	static关键字的使用
	
	需求：使用java类描述学生
		属性：名字  国籍
		行为：学习
		要求：在创建学生对象的时候，成员变量就要完成初始化
		
	static（静态/修饰符）
		1）static修饰成员变量：如果有数据需要被共享的给所有对象使用时，那么这个时候就可以使用static修饰
			访问方式：
				1）可以使用对象去访问
					格式：对象.变量名
					
				2）可以使用类名访问：
					格式：类名.变量名
			要注意的细节：
				1）非静态只能使用对象进行访问，不能使用类名访问
				2）千万不要为了方便访问而使用static关键字修饰成员变量，只有成员变量的数据是真正被共享的时候
					才使用static关键字修饰
					
			static修饰成员变量时的应用场景：
				如果一个数据需要被共享的时候，这个时候就可以使用static关键字修饰
			
		
		2）static修饰成员函数
	
*/
class Student{
	public Student(String name, String country) {
		this.name = name;
		this.country = country;
	}
	
	public String name;
	
	public static String country;
	
	public void study() {
		System.out.println("好好学习");
	}
}

public class Demo6{
	public static void main(String[] args){
		Student s1 = new Student("张三", "中国");
		
		Student s2 = new Student("李四", "中国");
		s1.country = "法国";
		System.out.println("country:" + Student.country);
		
		/*
			System.out.println("name:" + s1.name + " country:" + s1.country);
		System.out.println("name:" + s2.name + " country:" + s2.country);
		*/
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
