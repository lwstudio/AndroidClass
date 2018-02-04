import java.util.Scanner;
/*
	如何定义一个函数：
		1）返回值的类型
		2）判断形式参数（有没有需要调用者确定的参数）
		
	//  在控制台中输入两个数字，实现两个数的比较，把最大值返回给调用者
*/


public class Demo6{
	public static void main(String[] args){
		
		//  从控制台输入数字
		//  第一步：
		//  第二步：创建出scanner的对象
		Scanner scanner = new Scanner(System.in);
		//  第三步：调用scanner的方法
		String num1 = scanner.nextLine();  //  字符串
		
		//  第四部：将字符串形式的数字转换真正的数字
		int a = Integer.parseInt(num1);
		System.out.println("a:" + a);
		String num2 = scanner.nextLine();
		int b = Integer.parseInt(num2);
		System.out.println("b:" + b);
		
		
		int max = getMax(a, b);
		System.out.println("max:" + max);
		
	}
	
	
	public static int getMax(int a, int b){
		return a > b ? a : b;
	}

	
}