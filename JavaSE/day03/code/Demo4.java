/*
	需求：实现任意两个数的加法
	
	函数的作用：提高代码的复用性
	
	当前代码中存在的问题：
		以下的代码都是在做同样的功能，而这里的加法功能的代码是没有任何的复用性的。
		
	解决的方案：
		如果一个功能的代码要被复用起来，那么这时候可以把这里的功能代码封装起来，
		在java中把功能代码封装起来是通过函数的形式来实现的
*/

public class Demo4{
	public static void main(String[] args){
		
		
		int a = 1;
		int b = 2;
		int sum = a + b;
		System.out.println("Sum:" + sum);
		
		int c = 3;
		int d = 4;
		sum = c + d;
		System.out.println("Sum:" + sum);
	}
}