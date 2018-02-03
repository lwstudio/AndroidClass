/*
	三元（目）运算符：
		格式：(条件表达式)?表达式1:表达式2
		如果条件为true，运算后的结果就是表达式1；
		如果条件为false，运算后的结果就是表达式2
	
		使用三目运算符要注意的细节：
			使用三目运算符时，它返回的结果要被使用，或者被一个变量所接收
*/

public class Demo8{
	public static void main(String[] args){
		//  挑选最大数
		/*
		int result = (6 > 5)? 6 : 5;
		System.out.println(result);
		*/
		
		//  判断是否为成年人
		/*
		int age = 19;
		String result = age >= 18 ? "是成年人" : "不是成年人";
		System.out.println(result);
		*/
		
		int a = 1;
		int b = 2;
		int c = 3;
		int result = a*b + c/2 + 2*(a+b)/c;
		System.out.println(result);
/*
	a*b + c/2 + 2*3/c
	2 + c/2 + 2*3/c
	2 + 1 + 2*3/c
	2 + 1 + 6/c
	2 + 1 + 2
	3 + 2
	5
*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}