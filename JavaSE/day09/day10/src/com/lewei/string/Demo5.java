package com.lewei.string;

/*
 	String类的其他方法：
 		String replace(String oldChar, String newChar)：替换
 		String[] spilt(String regex)：切割
 		
 		String substring(int beginIndex):指定开始的索引值截取子串
 		String substring(int beginIndex, int endIndex)：指定开始与结束的索引值截取子串
 		
 		String toUpperCase()：转大写
 		String toLowerCase()：转小写
 		String trim()：去除首尾的空格
*/

public class Demo5 {
	public static void main(String[] args) {
		String str1 = "明-天-会-放-假";
		String str2 = str1.replace("会", "不会");
		System.out.println(str2);
		
		String[] strs = str1.split("-");
		for (int i = 0; i < strs.length; i ++) {
			System.out.println(strs[i]);
		}
		
		String str3 = str1.substring(4);
		System.out.println(str3);
		
		String str4 = str1.substring(4,  5);
		System.out.println(str4);
		
		String str5 = "abcdefg";
		String str6 = str5.toUpperCase();
		System.out.println(str6);
		String str7 = str6.toLowerCase();
		System.out.println(str7);
		
		String str8 = "  abcdefg    ";
		String str9 = str8.trim();
		System.out.println(str9);
	}
}
