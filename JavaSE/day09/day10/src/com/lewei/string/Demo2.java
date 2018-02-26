package com.lewei.string;

/*
  String类的构造函数
  	String()：创建一个空内容的字符串
  	String(byte[] bytes)：使用一个字节数组构建一个字符串对象
  	String(byte[] bytes, int offset, int length)
  		bytes：要解码的数组
  		offset：指定从数组中哪一个索引值开始解码
  		length：要解码多个元素
  	String(char[] value)：使用一个字符数组构建一个字符串
  	String(char[] value, int offset, int length)
  	String(int[] codePoints, int offset, int length)
  	String(String original)
  
*/

public class Demo2 {
	public static void main(String[] args) {
//		String str1 = new String(); 
		
		byte[] bytes = {97, 98, 99};
		String str2 = new String(bytes);
		System.out.println(str2);  //  去查找ASCII码表
		
		
		String str3 = new String(bytes, 1, 2);
		System.out.println(str3);
		
		char[] chars = {'马', '上', '到', '元', '宵', '节'};
		String str4 = new String(chars);
		System.out.println(str4);
		
		String str5 = new String(chars, 3, 3);
		System.out.println(str5);
	}
}
