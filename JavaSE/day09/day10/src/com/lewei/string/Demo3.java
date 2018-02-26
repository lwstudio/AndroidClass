package com.lewei.string;

/*
 	String类的获取类方法
 	int length()：获取字符串的长度
 	char charAt()：获取特定位置的字符
 	int indexOf(String str)：查找子串第一次出现的索引值
 	int lastIndexOf(String str)：查找子串最后一次出现的索引值，如果子串没有出现在字符串中，那么返回-1
 	
 * */

public class Demo3 {
	public static void main(String[] args) {
		String str1 = "Android大连全栈工程大连师训练营大连";
		int length = str1.length();
		System.out.println(length);
		
		char ch1 = str1.charAt(9);
		System.out.println(ch1);
		
		int position = str1.indexOf("大连");
		System.out.println(position);
		
		int position2 = str1.lastIndexOf("大连");
		System.out.println(position2);
		
		
		
		
	}

}
