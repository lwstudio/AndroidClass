package com.lewei.string_buffer;


/*
  	�ַ������ص㣺�ַ����ǳ��������ǵ�ֵ�ڴ���֮��Ͳ����Է����ı�
  	
  	�ַ���������һ�������仯����ô���Ͼͻᴴ����һ���µ��ַ�������
  	
  	ע�⣺�ַ��������ʺ���Ƶ�����޸ģ�������ʹ���ַ��������ࣨStringBuffer��
  	
  	StringBuffer��ʵ����һ���洢�ַ�������
  	
  	
*/
public class Demo1 {
	public static void main(String[] args) {
		String str1 = "hello";
		
		String str2 = str1 + "world";  //  helloworld
		
		System.out.println("str1==str2" + (str1 == str2));
	}
}
