/*
	异常处理：
		
		需求：定义一个函数实现两个数的除法
		
		
		疑问：下面的信息是通过printStackTrace方法打印而来，那么异常对象从何而来？
		Exception in thread "main" java.lang.ArithmeticException: / by zero
        at Demo6.div(Demo6.java:13)
        at Demo6.main(Demo6.java:9)
		
		jvm运行到a/b这个语句时，发现b为0，除0在我们现实生活中是不正常的情况，jvm一旦发现这种不正常
		情况的时候，那么jvm就会创建出一个对应的异常对象出来，并且会调用这个异常对象的printStackTrace
		方法来处理
		
	异常的处理：
		1）捕获处理
			格式：
				try {
					可能会发生异常的代码
				} catch (捕获的异常类型1 变量名) {
					处理异常1的代码
				} catch (捕获的异常类型2 变量名) {
					处理异常2的代码
				}
			
				捕获异常时需要注意的细节:
					1）如果try块中的代码出现的异常经过处理之后，那么try-catch语句块之外的代码
						是可以正常执行的
					2）如果try块中出现了异常，那么出现异常的代码之后的代码时不会执行的
					3）一个try块后面是可以有多个catch块的，也就是一个try块可以捕获多种异常的类型
					4）一个try块是可以捕获多种异常类型的，但是捕获的异常类型必须从小到大，否则就会编译报错
					
			
			疑问一：异常的处理感觉是没有什么作用，因为只是输出一句话而已？
				异常的处理非常有用，只不过是由于我们目前接触的只是点太过局限而已
				
			疑问二：以后捕获处理的时候是否捕获Exception即可？
				错的，因为我们在显示开发中遇到不同的异常类型的时候，我们往往会有不同的处理方式
				所以要分开不同的异常类型处理
		
		2）抛出处理
*/

public class Demo6{
	public static void main(String[] args) {
		int[] arr = null;
		div(4, 2, arr);
	}
	
	public static void div(int a, int b, int[] arr) {
		int c = 0; 
		
		try {
			c = a/b;   //  jvm自动创建出异常对象
			//System.out.println("哈哈");
			System.out.println("数组的长度：" + arr.length);
		}  catch (ArithmeticException e1) {
			System.out.println("toString" + e1.toString());
		} catch (NullPointerException e2) {
			System.out.println(e2.toString());
			System.out.println("出现了空指针异常");
			
		} catch (Exception e) {  //  Exception e = new ArithmeticException();
			System.out.println("我是急诊室，包治百病");
		}
		
		System.out.println("除法的结果为：" + c);
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
