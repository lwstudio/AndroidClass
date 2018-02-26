package com.lewei.string;


/*
  String类的判断方法
  	boolean endWith(String str)：判断是否以字符串结束
  	boolean isEmpty()：判断是否长度为0
  	boolean contains(String str)：是否包含指定序列
  	boolean equals(Object obh)：判断是否相等
  	boolean equalsIngoreCase(String another)：忽略大小写是否相等
  	
  转换方法：
  	char[] toCharArray()：将字符串转换成字符数组
  	byte[] getBytes():
  	
  	字节数组与字符数组、字符串三者之间是可以相互转换的
*/
public class Demo4 {
	public static void main(String[] args) {
		String str1 = "Android大连全栈工程大连师训练营大连";
		boolean isTrue1 = str1.endsWith("训练营");
		System.out.println(isTrue1);
		
		boolean isTrue2 = str1.isEmpty();
		System.out.println(isTrue2);
		
		boolean isTrue3 = str1.contains("中国");
		System.out.println(isTrue3);
		
		String str2 = "abc";
		String str3 = "ABc";
		boolean isTrue4 = str2.equalsIgnoreCase(str3);
		System.out.println(isTrue4);
		
		char[] ch1 = str1.toCharArray();
		for (int i = 0; i < ch1.length; i++) {
			System.out.print(ch1[i]);
		}
	}
}
