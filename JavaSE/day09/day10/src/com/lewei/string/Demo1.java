package com.lewei.string;

/*
	String类详解
	
	String类的创建对象方式一共有两种：
		String str  =  ""
		String str = new String();
		
	笔试题目：new String("abc")创建了几个对象？
		答案：2个，一个位于字符串常量池中，一个是位于堆内存中
*/

public class Demo1 {
	public static void main(String[] args) {
		String str1 = "hello";
		String str2 = "hello";
		String str3 = new String("hello");
		String str4 = new String("hello");
		
		
		System.out.println("str1==str2?" + (str1 == str2));  // true
		System.out.println("str2==str3?" + (str2 == str3));  // false
		System.out.println("str3==str4?" + (str3 == str4));  // false
		System.out.println("str3.equals(str4)?" + (str3.equals(str4)));  //  true
		//  是String类重写了Object的equals方法，比较的是两个字符串对象的内容是否一致
		
		/*
		  	"=="是用于比较引用类型数据的时候比较的是两个对象的内存地址，equals方法
		  	默认情况下比较的也是两个对象的内存地址
		 */
		
	}
	
	
	
	
}
