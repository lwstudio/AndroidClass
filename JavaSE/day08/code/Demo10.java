/*
	finally块
	
	finally块使用的前提：
		必须要存在try块才能使用
		
	finally块的代码在任何情况下都会执行，除了jvm推出的情况下
	
	finally非常适合做释放资源的工作，这样子可以保证资源文件在任何情况下都可以被释放
	
	
	try块的三种组合方式
		1）第一种：比较适合有异常要处理，但是没有资源要释放
			try {
				可能发生异常的代码
			} catch (捕获的异常类型 变量名) {
				处理异常的代码
			}
			
		2）第二种：比较适合有异常要处理，并且有资源要被释放
			try {
				可能发生异常的代码
			} catch (捕获的异常类型 变量名) {
				处理异常的代码
			} finally {
				释放资源的代码
			}
			
		3）第三种：比较适合于内部抛出的是运行时异常，并且有资源要被释放
			try {
				可能发生异常的代码
			}finally {
				释放资源的代码
			}
	
*/
public class Demo10{
	public static void main(String[] args) {
		div(4, 0);
	}
	
	public static void div(int a, int b) {
		int c = 0;
		
		try {
			//if (b == 0) {
				//System.exit(0);  //  如何退出jvm
			//}
			c = a / b;
			System.out.println("除法的结果为：" + c);
		} catch (Exception e) {
			System.out.println("出现了除数为0的异常");
			throw e;
		} finally {
			System.out.println("finally块中的代码执行了");
		}
		
		
	}
}