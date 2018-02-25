/*
	编译时异常、运行时异常
	
	----| 异常体系
	--------| Error（错误）
	--------| Exception（异常）
	
	------------| 运行时异常：如果一个方法内部抛出了一个运行时异常，那么方法上可以声明也可以不声明
		，调用者可以处理也可以不处理
	------------| 编译时异常（非运行时异常、受检异常）：如果一个方法的内部抛出了一个编译时异常，那么方法上就必须要声明，
		而调用者也必须要处理
		
		RuntimeException以及RuntimeException的子类都是运行时异常
		除了运行时异常，剩下的都是编译时异常
		
	疑问：为什么java会如此严格要求编译时异常，而对运行时异常如此宽松？
		运行时都是可以通过程序员良好的编程习惯去避免的，所以java编译器
		就没有严格要求处理运行时异常
*/

public class Demo9{
	public static void main(String[] args) {
		int[] arr = new int[]{1, 2};
		div(4, 2 arr);
	}
	
	
	//  不使用任何关系的代码，避免该方法产生异常
	public static void div(int a, int b, int[] arr) {
		if (b == 0) {
			return;  //  终止方法的执行
		}
		
		if (arr != null) {
			System.out.println("length：" + arr.length);
			
			int i = 3;
			if (i >=0 && i < arr.length) {
				System.out.println("");
			}
		}
		
		
		
		int c = a/b;
		System.out.println("除法的结果为：" + c);
	}
}