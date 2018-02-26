package com.lewei.string_buffer;

/*
  	StringBuffer���ʹ��
  	
  	�����ҪƵ�����޸��ַ��������ݣ�����ʹ���ַ��������ࣨStringBuffer��
  	
  	StringBuffer��ʵ����һ���洢�ַ�������
  	
  	������Ŀ��ʹ��StringBuffer�޲εĹ��캯������һ������ʱ��Ĭ�ϵĳ�ʼ�����Ƕ��٣�
  		������Ȳ���ʹ���ˣ��Զ��������٣��Զ��������ٱ�����
  		StringBuffer�ײ����������ַ�������ܴ洢�ַ����ݵģ����ַ�����Ĭ�ϵĳ�ʼ����
  		Ϊ16������ַ�����ĳ��Ȳ���ʹ��ʱ���Զ�����һ����+ 2��
  	
  	StringBuffer�ĵײ�ʵ�����������ַ�����ģ�count�洢���ǵ�ǰ�������д洢���ַ��ĸ���
  	
  	
  	
  	�����߱�����Ϊ��
  	����
		append(boolean b)    ��������������� �����ݵ�������
		insert(int offset, boolean b)  ָ�����������ֵ�������Ӧ �����ݡ� 

	ɾ��
		delete(int start, int end)  ����ָ���Ŀ�ʼ�����������ֵɾ����Ӧ�����ݡ�
		deleteCharAt(int index)   ����ָ�� ������ֵɾ��һ���ַ���
	
	
	�޸�
	
		replace(int start, int end, String str) ����ָ�� �Ŀ�ʼ���������ֵ�����ָ�������ݡ�
		reverse()   ��ת�ַ��������������.
		
        setCharAt(int index, char ch)  ��ָ������ֵ���ַ��滻ָ�����ַ��� 
        substring(int start, int end)  ����ָ��������ֵ��ȡ�Ӵ���
		
	�鿴
		indexOf(String str, int fromIndex) ����ָ�����ַ�����һ�γ��ֵ�����ֵ,����ָ����ʼ���ҵ�λ�á�
		lastIndexOf(String str) 
		
		capacity() �鿴��ǰ�ַ�����ĳ��ȡ� 
		length() 
		
		charAt(int index) 
		toString()   ���ַ��������������ת���ַ������ء�
  			
  	
  	StringBuffer��StringBuilder����ͬ���벻ͬ����
  		��ͬ�㣺
  			�����඼���ַ���������
  			������ķ���������ȫһ�µ�
  		��ͬ�㣺
  			StringBuffer���̰߳�ȫ�ģ�����Ч�ʵͣ�StringBuilder���̷߳ǰ�ȫ�ģ�����Ч�ʸ�
  			StringBuffer�Ǵ�JDK1.0���ֵģ�StringBuilder����JDK1.5���ֵġ�
  			
  		�Ƽ�ʹ��StringBuilder����Ϊ����Ч�ʸ�
*/

public class Demo2 {

	public static void main(String[] args) {
		StringBuffer buffer = new StringBuffer();
		buffer.append(false);
		buffer.append(23.44);
		//  false23.44
		buffer.insert(5, "abc");
		
		buffer.delete(5, 8);
		
		int index = buffer.indexOf(".");
		buffer.deleteCharAt(index);
		
		buffer.replace(5, 7, "65");
		
		buffer.reverse();
		
		buffer.setCharAt(0, '3');
		
		System.out.println(buffer.toString());
		
		
		/*StringBuffer buffer = new StringBuffer();  //  ��ʼ������Ϊ16
		
		buffer.append("java");
		buffer.append("java");
		buffer.append("java");
		buffer.append("java");
		buffer.append("java");
		
		System.out.println(buffer.toString()); */

	}

}
