package com.lewei.string;

/*
 	String��Ļ�ȡ�෽��
 	int length()����ȡ�ַ����ĳ���
 	char charAt()����ȡ�ض�λ�õ��ַ�
 	int indexOf(String str)�������Ӵ���һ�γ��ֵ�����ֵ
 	int lastIndexOf(String str)�������Ӵ����һ�γ��ֵ�����ֵ������Ӵ�û�г������ַ����У���ô����-1
 	
 * */

public class Demo3 {
	public static void main(String[] args) {
		String str1 = "Android����ȫջ���̴���ʦѵ��Ӫ����";
		int length = str1.length();
		System.out.println(length);
		
		char ch1 = str1.charAt(9);
		System.out.println(ch1);
		
		int position = str1.indexOf("����");
		System.out.println(position);
		
		int position2 = str1.lastIndexOf("����");
		System.out.println(position2);
		
		
		
		
	}

}
