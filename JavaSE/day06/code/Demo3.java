import java.util.Scanner;
/*
	main函数详解
	
	public：公共的，权限是最大的，在任何情况下都可以访问。
		原因：为了保证jvm能够在任何情况下都可以访问到main函数。
		
	static：静态的。静态可以让jvm调用main函数时更加方便，不需要通过对象进行调用
	
	void：没有返回值。因为返回的数据是jvm，而jvm使用这个数据是没有意义的
	
	main：函数名，main并不是关键字，只不过是能够使jvm能够识别的特殊函数名而已
	
	arguments：担心有些参数的执行时需要参数的
*/

public class Demo3{
	public static void main(String[] args){
		
		int length = args.length;
		for (int i = 0; i < length; i++) {
			System.out.println(args[i]);
		}
		
		Scanner scanner = new Scanner(System.in);
		
		/*
		
		//  模拟QQ登录
		if ("Koko".equals(args[0]) && "123456".equals(args[1])) {
			System.out.println("登录成功");
		} else {
			System.out.println("您输入的用户名或者是密码有误");
		}
		*/
	}
}