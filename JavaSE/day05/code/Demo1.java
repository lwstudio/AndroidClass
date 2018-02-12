/*
	需求：使用java类描述一个婴儿
	
	在我们现实生活中有两种婴儿，一种是刚出生就有名字的（白户），还有一种是在出生之后才有的名字（黑户）

	构造函数：给对应的对象进行初始化
	
	构造函数的定义的格式：
		修饰符 函数名(形式参数) {
			函数体
		}
		
	使用构造函数时要注意的问题：
		1）构造函数是没有返回值的；
		2）构造函数的函数名必须要与类名一致；
		3）构造函数并不是由我们手动调用的，而是在创建对象的时候，jvm就会主动的调用对应的构造函数
		4）如果一个类没有显式写上构造函数时，那么java编译器就会为该类添加一个无参的构造函数
		5）如果一个类已经显示写上构造函数，那么java编译器就不会为该类添加无参的构造函数
		6）构造函数可以在一个类中以函数重载的形式存在多个的。
		7）java编译器添加的无无参的构造函数的权限修饰符是与类的权限修饰符是相同

		
	疑问：创建对象的时候，jvm会调用对应的构造方法，那么我们之前没有学过构造方法，那么以前创建对
		象的时候，jvm是否也会调用构造函数？如果有的话，构造函数从何而来？
		在编译时java编译器自动帮助我们添加上的
		
		
		从java------>class文件：编译
		从class文件中获取内容：反编译过程（javap.exe）
		javap -c -l -private 目标class文件
		
		
	构造函数与普通函数的区别：
		1）返回值类型上的区别：
			1.构造函数是没有返回值类型的
			2.普通函数是有返回值类型的，即使函数没有返回值，返回值类型也要写上void
		2）函数名上的区别：
			1.构造函数必须要与类名一致
			2.普通函数的函数名只需要符合标识符的规范即可
		3）调动方式上的区别：
			1.构造函数是在创建对象的时候由jvm自动调用的
			2.普通是由我们使用对象调用的，一个对象可以多次调用普通函数
		4）作用上的区别：
			1.构造函数的作用是用于一个对象的初始化
			2.普通函数是用于描述一类事物的公共行为的
		
*/

class Baby{
	
	public Baby(String n, String i){
		name = n;
		id = i;
		System.out.println("有参构造函数执行了");
	}
	
	public Baby(){
		System.out.println("无参构造函数执行了");
	}
	
	//  属性  名字  身份证号
	String name;
	
	String id;
	
	//  行为  哭
	
	public void cry() {
		System.out.println("哇哇的哭");
	}
	
	
}



public class Demo1{
	public static void main(String[] args) {
		Baby b1 = new Baby("Koko", "123456");   
		
		System.out.println("name:" + b1.name + " id:" + b1.id);
		
		Baby b2 = new Baby();
		b2.name = "Nono";
		b2.id = "123444";
		System.out.println("name:" + b2.name + " id:" + b2.id);
		
		/*
		Baby b2 = new Baby();   
		
		System.out.println("name:" + b2.name + " id:" + b2.id);
		*/
		/*
		b.name = "Koko";
		b.id = "123456";
		*/
	}
	
	
	
	
	
	
	
	
	
	
	
}