/*
	使用java类描述学生与人之间的关系
	学生与人   继承关系   is-a关系
	
	
	现存的问题：
		1）两个类之间并没有产生任何的联系
		2）存在重复的代码
		
	面向对象的三大特征：
		1）封装
		2）继承
		3）多态
		
	继承
		格式：
			class 类名1 extends 类名2{  
				
			}
			
	使用继承时需要注意的细节：
		1）不要随意使用继承，只有在两个类真正存在继承关系时才需要使用继承
		2）父类中的私有成员不能被继承
		3）父类的构造方法不能被继承
		4）在创建子类对象的时候默认调用父类无参的构造方法
*/

class Person{
	String name;
	
	private int age;
	
	public Person(String name) {
		this.name = name;
	}
	
	public Person() {
		System.out.println("父类无参的构造方法被执行了");
	}
	
	
	public void eat() {
		System.out.println(name + "在吃饭");
	}
}


class Student extends Person{  //  把Student成为Person的子类，把Person类成为Student类的父类(超类、基类)
	//String name;
	
	public Student(String name) {
		this.name = name;
	}
	
	public void study() {
		System.out.println(name + "好好学习");
	}
}

public class Demo6{
	public static void main(String[] args) {
		Student s = new Student("Koko");
		//System.out.println("age:" + s.age);
		s.eat();
		s.study();
	}
	
	
	
	
	
}