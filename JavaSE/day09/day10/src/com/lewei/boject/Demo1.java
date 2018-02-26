package com.lewei.boject;

/*
 	Object类：
 	
 	java是面向对象的语言，核心思想：找合适的对象做合适的事情
 	
 	方式一：自定义类，然后通过自定义的类创建对象
 	方式二：借助sun提供的类，我们只需要认识这些类，就可以通过这些类去创建对象
 	
 	Object类是所有类的终极父类，任何一个类都继承了Object类
 	
 	Object类：
 		toString()：返回该对象的字符串。返回一个字符串用于描述该对象的
 			疑问：toString方法有什么用？
 				重写toString方法之后，我们直接输出一个对象的时候，就会输出我们所需求的格式的数据
 			需求：定义一个人类，姓名，身份证编号，要求打印出：姓名：Koko  身份证编号：001
 		equals()：用于比较两个对象的内存地址，判断两个对象是否是同一个对象
 		hashCode()：返回该对象的哈希码值（把它理解成内存地址）
 		
 		
 	java是开源的---源代码是公开的
 	借助eclipse查看源代码的方式：
 		1）按住Ctrl键，单击需要查看的源代码
 		2）把光标移动到需要查看源代码的地方，按下F3
 		
 	为什么需要查看源代码？（查看源代码的好处有哪些）
 		1）查看源代码可以了解别人是如何写出这个技术的，让我们了解的更加深入
 		2）借鉴与吸收大牛的思想
 		
 	看源代码最忌讳的一点：不要试图弄懂每一行代码的意思，能看出一个大概就可以了
*/

class Person{
	int num;
	
	String name;

	public Person(int num, String name) {
		super();
		this.num = num;
		this.name = name;
	}
	
	public Person() {
		
	}
	
	@Override
	public String toString() {
		return "姓名：" + this.name + "  身份证编号：" + this.num;
	}
	
	@Override
	public boolean equals(Object obj) {  //  new Person() 
		Person p = (Person)obj;
		
		return this.num == p.num;
	}
}

public class Demo1 {

	public static void main(String[] args) {
		/*Object obj = new Object();
		System.out.println(obj.toString());  //  java.lang.Object@70dea4e 返回的字符串表示：完整类名+@+对象的哈希值（对象的内存地址）
		
		System.out.println(obj);*/
		
		
		Person p1 = new Person(110, "Koko");
		//System.out.println(p1.toString());
		
		Person p2 = new Person(110, "张三");
		System.out.println("是同一个人吗？" + p1.equals(p2));
		
	}
	
	
	
	
	
	
	
	

}
