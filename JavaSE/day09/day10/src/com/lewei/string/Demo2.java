package com.lewei.string;

/*
  String��Ĺ��캯��
  	String()������һ�������ݵ��ַ���
  	String(byte[] bytes)��ʹ��һ���ֽ����鹹��һ���ַ�������
  	String(byte[] bytes, int offset, int length)
  		bytes��Ҫ���������
  		offset��ָ������������һ������ֵ��ʼ����
  		length��Ҫ������Ԫ��
  	String(char[] value)��ʹ��һ���ַ����鹹��һ���ַ���
  	String(char[] value, int offset, int length)
  	String(int[] codePoints, int offset, int length)
  	String(String original)
  
*/

public class Demo2 {
	public static void main(String[] args) {
//		String str1 = new String(); 
		
		byte[] bytes = {97, 98, 99};
		String str2 = new String(bytes);
		System.out.println(str2);  //  ȥ����ASCII���
		
		
		String str3 = new String(bytes, 1, 2);
		System.out.println(str3);
		
		char[] chars = {'��', '��', '��', 'Ԫ', '��', '��'};
		String str4 = new String(chars);
		System.out.println(str4);
		
		String str5 = new String(chars, 3, 3);
		System.out.println(str5);
	}
}
