package com.lewei.string;


/*
  String����жϷ���
  	boolean endWith(String str)���ж��Ƿ����ַ�������
  	boolean isEmpty()���ж��Ƿ񳤶�Ϊ0
  	boolean contains(String str)���Ƿ����ָ������
  	boolean equals(Object obh)���ж��Ƿ����
  	boolean equalsIngoreCase(String another)�����Դ�Сд�Ƿ����
  	
  ת��������
  	char[] toCharArray()�����ַ���ת�����ַ�����
  	byte[] getBytes():
  	
  	�ֽ��������ַ����顢�ַ�������֮���ǿ����໥ת����
*/
public class Demo4 {
	public static void main(String[] args) {
		String str1 = "Android����ȫջ���̴���ʦѵ��Ӫ����";
		boolean isTrue1 = str1.endsWith("ѵ��Ӫ");
		System.out.println(isTrue1);
		
		boolean isTrue2 = str1.isEmpty();
		System.out.println(isTrue2);
		
		boolean isTrue3 = str1.contains("�й�");
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
