/*
	构造代码块
	
	构造代码块：给对象进行统一的初始化
	构造函数的作用：给对应的函数进行初始化
	
	构造代码块的格式：
		{
			构造代码块的内容
		}
		
	要注意的细节：
		构造代码的大括号必须要位于成员 位置上
		构造代码块的执行顺序位于构造函数之前
		
	构造代码块的种类：
		1）构造代码块
		2）局部代码块：位于方法之内，在实际开发中很少使用
		3）静态代码块：在学习完static关键字之后再进行学习
*/


class Baby{
	
	{
		cry();
	}
	
	public Baby(String n, String i){
		name = n;
		id = i;
		System.out.println("有参构造函数执行了");
		//cry();
	}
	
	public Baby(){
		System.out.println("无参构造函数执行了");
		//cry();
	}
	
	//  属性  名字  身份证号
	String name;
	
	String id;
	
	//  行为  哭
	
	public void cry() {
		System.out.println("哇哇的哭");
	}
	
	
}

public class Demo3{
	public static void main(String[] args){
		Baby b1 = new Baby("Koko", "123");
		
		Baby b2 = new Baby();
		
	}
	
	
	
	
}




