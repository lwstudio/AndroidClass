package com.lewei.string_buffer;


/*
  	字符串的特点：字符串是常量，它们的值在创建之后就不可以发生改变
  	
  	字符串的内容一旦发生变化，那么马上就会创建出一个新的字符串对象
  	
  	注意：字符串并不适合做频繁的修改，建议大家使用字符串缓冲类（StringBuffer）
  	
  	StringBuffer其实就是一个存储字符的容器
  	
  	
*/
public class Demo1 {
	public static void main(String[] args) {
		String str1 = "hello";
		
		String str2 = str1 + "world";  //  helloworld
		
		System.out.println("str1==str2" + (str1 == str2));
	}
}
