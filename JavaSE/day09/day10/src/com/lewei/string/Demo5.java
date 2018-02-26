package com.lewei.string;

/*
 	String�������������
 		String replace(String oldChar, String newChar)���滻
 		String[] spilt(String regex)���и�
 		
 		String substring(int beginIndex):ָ����ʼ������ֵ��ȡ�Ӵ�
 		String substring(int beginIndex, int endIndex)��ָ����ʼ�����������ֵ��ȡ�Ӵ�
 		
 		String toUpperCase()��ת��д
 		String toLowerCase()��תСд
 		String trim()��ȥ����β�Ŀո�
*/

public class Demo5 {
	public static void main(String[] args) {
		String str1 = "��-��-��-��-��";
		String str2 = str1.replace("��", "����");
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
