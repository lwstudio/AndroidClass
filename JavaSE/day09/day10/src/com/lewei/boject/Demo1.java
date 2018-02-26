package com.lewei.boject;

/*
 	Object�ࣺ
 	
 	java�������������ԣ�����˼�룺�Һ��ʵĶ��������ʵ�����
 	
 	��ʽһ���Զ����࣬Ȼ��ͨ���Զ�����ഴ������
 	��ʽ��������sun�ṩ���࣬����ֻ��Ҫ��ʶ��Щ�࣬�Ϳ���ͨ����Щ��ȥ��������
 	
 	Object������������ռ����࣬�κ�һ���඼�̳���Object��
 	
 	Object�ࣺ
 		toString()�����ظö�����ַ���������һ���ַ������������ö����
 			���ʣ�toString������ʲô�ã�
 				��дtoString����֮������ֱ�����һ�������ʱ�򣬾ͻ��������������ĸ�ʽ������
 			���󣺶���һ�����࣬���������֤��ţ�Ҫ���ӡ����������Koko  ���֤��ţ�001
 		equals()�����ڱȽ�����������ڴ��ַ���ж����������Ƿ���ͬһ������
 		hashCode()�����ظö���Ĺ�ϣ��ֵ�����������ڴ��ַ��
 		
 		
 	java�ǿ�Դ��---Դ�����ǹ�����
 	����eclipse�鿴Դ����ķ�ʽ��
 		1����סCtrl����������Ҫ�鿴��Դ����
 		2���ѹ���ƶ�����Ҫ�鿴Դ����ĵط�������F3
 		
 	Ϊʲô��Ҫ�鿴Դ���룿���鿴Դ����ĺô�����Щ��
 		1���鿴Դ��������˽���������д����������ģ��������˽�ĸ�������
 		2����������մ�ţ��˼��
 		
 	��Դ������ɻ��һ�㣺��Ҫ��ͼŪ��ÿһ�д������˼���ܿ���һ����žͿ�����
*/

class Person{
	int num;
	
	String name;

	public Person(int num, String name) {
		super();
		this.num = num;
		this.name = name;
	}
	
	public Person() {
		
	}
	
	@Override
	public String toString() {
		return "������" + this.name + "  ���֤��ţ�" + this.num;
	}
	
	@Override
	public boolean equals(Object obj) {  //  new Person() 
		Person p = (Person)obj;
		
		return this.num == p.num;
	}
}

public class Demo1 {

	public static void main(String[] args) {
		/*Object obj = new Object();
		System.out.println(obj.toString());  //  java.lang.Object@70dea4e ���ص��ַ�����ʾ����������+@+����Ĺ�ϣֵ��������ڴ��ַ��
		
		System.out.println(obj);*/
		
		
		Person p1 = new Person(110, "Koko");
		//System.out.println(p1.toString());
		
		Person p2 = new Person(110, "����");
		System.out.println("��ͬһ������" + p1.equals(p2));
		
	}
	
	
	
	
	
	
	
	

}
