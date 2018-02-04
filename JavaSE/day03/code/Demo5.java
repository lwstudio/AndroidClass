/*
	函数：
		函数定义的格式：
			修饰符 返回值类型 函数名(参数列表/形式参数){
				需要被封装的代码
				return 结果
			}
		修饰符：public static
		
		返回值类型：返回值类型就是在函数运行完毕后，返回的结果的数据类型
			某些函数是没有结果返回的，那么这个时候返回值类型就时void
		
		函数名：如果我们需要调用该函数就需要使用函数名；
			函数名命名的规范：函数只要符合标识符的命名规则即可
				首单词全部小写，其他单词的首字母大写，其余字母都是小写
				
		形式参数：如果一个函数在运行的时候，存在着数据是需要调用者确定的，那么这个时候
			就应该定义形式参数
		
		return：把一个结果返回给调用者
			
			
	函数需要注意的细节：
		1）在完成函数的定义之后，需要调用才能够执行。main函数是由jvm自动调用的，不需要手动的调用
		2）返回值类型可以是任意的
		3）形式参数是任意的，个数是任意的，可以是任何类型的参数的组合
		4）在函数中不能定义另外一个函数，但是可以调用其他函数
*/

public class Demo5{
	public static void main(String[] args){
		byte b = 3;
		add(1, b);
	}
	//  不需要返回值，是需要在函数打印出和
	public static void add(int a, byte b){
		int sum = a + b;
		System.out.println("Sum:" + sum);
	}
	
	/*public static int add(int a, int b){
		int sum = a + b;
		System.out.println("Sum:" + sum);
		return sum;
	}*/
	
	
	/*public static int add(){
		int a = 1;
		int b = 2;
		int sum = a + b;
		System.out.println("Sum:" + sum);
		return sum;
	}*/
	
}