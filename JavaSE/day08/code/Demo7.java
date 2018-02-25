/*
	java异常处理方式二----抛出处理
	
	抛出异常（throw throws）
	
	抛出异常时要注意的细节：
		1）如果一个方法的内部抛出一个编译时异常对象那么必须要在方法上进行声明
		2）如果调用了一个声明抛出编译时异常的方法，那么调用者必须要处理异常
		3）如果一个方法的内部抛出一个异常对象，那么throw语句之后的代码都不会再执行了
			（一个方法遇到throw关键字，该方法就会马上停止执行）
		4）在一种情况下，只能抛出一种类型异常对象
		
	throw关键字与throws关键字的区别
		1）throw关键字是用于方法内部的，throws关键字是用于方法声明上的
		2）throw关键字是用于在方法内部抛出一个异常对象的，throws关键字是用于在方法声明上声明
			抛出异常类型的
		3）throw关键字之后只能有一个异常对象，而throws关键字一次可以声明抛出多种类型的异常
		
	疑问：何时使用抛出处理？何时使用捕获处理？原则是什么？
		如果你需要通知到调用者你的代码出现了问题，那么这时就需要使用抛出处理
		如果如果代码是直接与用户打交道的，遇到异常的时候千万不能再抛出，在抛出的话就给了用户，
		这时候就应该使用捕获处理
		
	
*/

public class Demo7{
	public static void main(String[] args){
		//  第一种处理方式
		int[] arr = null;
		try {
			div(4, 2, arr);
		} catch (Exception e) {
			System.out.println("出现了一个异常");
		}
		
		
		
				
	}
	
	public static void div(int a, int b, int[] arr) throws Exception {	
		if (b == 0) {
			throw new Exception();
		} else if (arr == null) {
			throw new NullPointerException（）；
		}
		
		System.out.println("length" + arr.length);
		int c = a/b;
		
		System.out.println("除法的结果为：" + c);
	}
}