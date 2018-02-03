/*
	数据类型转换：
		小数据类型----->大数据类型   自动类型转换
		大数据类型----->小数据类型   强制类型转换
			格式：小数据类型  变量名 = (小数据类型)大数据类型
			
		数据类型转换的小细节：
			1）凡是byte、short、char类型的数据在运算的时候都会自动的转换成int类型的数据再运算
			2）两个不同的数据类型的数据在运算的时候，结果取决于打的数据类型
*/

public class Demo3{
	public static void main(String[] args){
		
		/*
		byte b = 11;
		short s = b;   //  把b中存储的值赋值给s
		int i = s;
		long l = i;
		*/
		
		/*
		int i = 11;
		byte b = (byte)i;
		*/
		
		/*
		int i = 128;
		byte b = (byte)i;
		*/
		
		//  借助Java提供的工具，打印出数字在计算机中存储的二进制形式
		//System.out.println(Integer.toBinaryString(-7));
		
		/*
		byte b1 = 1;
		byte b2 = 3;
		byte b3 = (byte)(b1 + b2);
		System.out.println(b3);
		*/
		
		/**/
		//System.out.println('a' + 1);
		
		
		int i = 1;
		long l = 3;
		int result = (int)(i + l);
		System.out.println(result);
	}
	
	
	
	
	
	
	
	
	
	
	
	
}