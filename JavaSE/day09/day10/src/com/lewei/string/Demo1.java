package com.lewei.string;

/*
	String�����
	
	String��Ĵ�������ʽһ�������֣�
		String str  =  ""
		String str = new String();
		
	������Ŀ��new String("abc")�����˼�������
		�𰸣�2����һ��λ���ַ����������У�һ����λ�ڶ��ڴ���
*/

public class Demo1 {
	public static void main(String[] args) {
		String str1 = "hello";
		String str2 = "hello";
		String str3 = new String("hello");
		String str4 = new String("hello");
		
		
		System.out.println("str1==str2?" + (str1 == str2));  // true
		System.out.println("str2==str3?" + (str2 == str3));  // false
		System.out.println("str3==str4?" + (str3 == str4));  // false
		System.out.println("str3.equals(str4)?" + (str3.equals(str4)));  //  true
		//  ��String����д��Object��equals�������Ƚϵ��������ַ�������������Ƿ�һ��
		
		/*
		  	"=="�����ڱȽ������������ݵ�ʱ��Ƚϵ�������������ڴ��ַ��equals����
		  	Ĭ������±Ƚϵ�Ҳ������������ڴ��ַ
		 */
		
	}
	
	
	
	
}
