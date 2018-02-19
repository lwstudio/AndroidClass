/*
	需求：在现实生活中有部分同学在学校期间只会学习，但是有部分同学除了学习之外还会挣钱
	
	分析：
		普通的学生类
		接口（描述挣钱的功能）
		会挣钱的学生
		
		
	接口：
		1）扩展功能
		2）定义约束规范
		3）实现程序的解耦（最为重要的功能）
*/

// 普通的学生类
class Student{
	String name;
	
	public Student(String name){
		this.name = name;
	}
	
	public void study() {
		System.out.println(name + "好好学习");
	}
}


//  挣钱的接口
interface MakeMoney{
	void makeMoney();
}


//  会挣钱的学生
class MoneyStudent extends Student implements MakeMoney{
	public MoneyStudent(String name) {
		super(name);
	}
	
	public void makeMoney() {
		System.out.println("除了学习还会挣钱");
	}
}

public class Demo8{
	public static void main(String[] args) {
		Student s = new Student("Koko");
		s.study();
		
		MoneyStudent m = new MoneyStudent("Nono");
		m.study();
		m.makeMoney();
		
	}
}

