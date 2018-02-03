/*
	java中的运算符：
		算术运算符：
		赋值运算符：
		比较运算符:
		逻辑运算符：
		位运算符：
		移位运算符：
		三元运算符：
		
		
	算术运算符：
		+：
			1）表示正数
			2）加法的运算
			3）字符串的拼接
				如果+用于字符串的时候，+表示字符串的拼接，这时它的作用是连接符，而不再是加法的意思
				注意：在+做连接符时，任何类型的数据与字符串使用连接符连接时，那么最后的结果都是字符串
				
		-：
		*：
		/：
		%：
		++：
			1）前自增
				格式：++操作数：先自增完毕，在运算整个表达式，语句分号之前都是运算表达式
			2）后自增：
				格式：操作数++：先运算完真个表达式，再进行自增
		--：
	
*/



public class Demo4{
	public static void main(String[] args){
		//  +的第一种用法：
		//int i1 = 10;
		//int i2 = 10;
		
		// +做连接符时的使用
		/*
		System.out.println("Hello" + "World");
		System.out.println("Hello" + "World" + 2018);
		System.out.println(1 + 2 + 3 + "Hello" + "World");
		*/
		
		//  字符串的定义
		/*String str = "hello";
		System.out.println(str);
		*/
		
		//  除法的使用
		/*
		double i1 = 10.0;
		int i2 = 3;
		System.out.println(i1/i2);
		*/
		
		//  %取模运算：取余数
		/*
		int i1 = 10;
		int i2 = 3;
		System.out.println(i1%i2);
		*/
		
		//  ++的使用
		/*
		int i1 = 10;
		i1++;
		System.out.println(i1);
		*/
		
		//  区分前自增和后自增
		/*int i1 = 10;
		int newNum = 10 * i1++;
		System.out.println(newNum);
		System.out.println(i1);
		*/
		
		int i1 = 10;
		int newNum = 10 * ++i1;
		System.out.println(newNum);
		System.out.println(i1);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}