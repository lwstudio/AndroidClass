/*
	成员变量与局部变量的区别
		定义位置上的区别：
			1）成员变量是定义在方法之外，类之内的
			2）局部变量是定义在方法之内的
			
		作用上的区别：
			1）成员变量是用来描述一类事物的公共属性的
			2）局部变量的作用是提供一个变量给方法的内部使用
			
		生命周期上的区别;
			1）随着对象的创建的对象而存在，随着对象的消失而消失
			2）局部变量在调用了对应方法时，执行到了创建该变量的语句时才存在，
				局部变量一旦出了自己的作用域，那么马上就从内存中消失
				
		初始值上的区别：
			1）成员变量是有默认值的
				数据类型                      默认值
				byte short int long             0
				float                           0.0F
				double                          0.0
				char                            ''
				boolean                         false
				String等引用类型                null
			2）局部变量是没有默认值的，我们必须先初始化后使用
	
*/

//  需求：编写一个类，用来描述人， 规定具有名字，年龄属性；具有跑的行为
class Person{
	String name;  //  成员变量
	
	int age;
	
	
	public void run() {
		int meter = 1000;   //  局部变量
		System.out.println("跑了"  + meter + "米");
	}
}

public class Demo5{
	public static void main(String[] args) {
		/*
		System.out.println("程序开始执行");
		for (int i = 0; i < 5; i++) {
			System.out.println("i=" + i);
		}
		
		System.out.println("程序执行完毕");
		//  System.out.println("i=" + i);
		*/
		
		
		int a;   // = 1;
		
		//System.out.println("a:" + a);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}