package com.lewei.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/*
  	��λ�ȡϵͳ�ĵ�ǰʱ��
  
  	��ʽһ��System.currrentTimeMillions();
  	
  	Date������
  	
  	Calendar��
*/

public class Demo1 {
	public static void main(String[] args) {
		//System.out.println("��ǰ��ϵͳʱ���ǣ�" + System.currentTimeMillis());
		
		//Date date = new Date();
		
		//System.out.println("�����ǣ�" + date.getYear());
		
		/*
		Calendar cal = Calendar.getInstance();
		System.out.println("�����ǣ�" + cal.get(Calendar.YEAR));
		System.out.println("������ǣ�" + (cal.get(Calendar.MONTH) + 1));
		System.out.println("�����ǣ�" + cal.get(Calendar.DAY_OF_MONTH));

		
		System.out.println("�����ǣ�" + cal.get(Calendar.HOUR_OF_DAY) + "ʱ");
		System.out.println("�����ǣ�" + cal.get(Calendar.MINUTE) + "��");
		System.out.println("�����ǣ�" + cal.get(Calendar.SECOND) + "��");
		*/
		
		//  ��ʾ��ǰ��ʱ�䣺2018��2��26��  XXʱXX��XX��
		/*
		  	���ڸ�ʽ���ࣺSimpleDateFormat
		  		����1����������ת����ָ����ʽ���ַ��� format()
		  		����2�����԰�һ���ַ���ת��������     parse()
		 */
		/*
		SimpleDateFormat sdf = new SimpleDateFormat();
		String date = sdf.format(new Date());
		
		System.out.println(date);
		*/
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy��MM��dd��  HHʱmm��ss��");
		//String date = sdf.format(new Date());
		//System.out.println(date);
		try {
			Date date = sdf.parse("2018��02��26��  17ʱ50��56��");
			System.out.println(date.getYear());
		} catch (ParseException e) {
	
			e.printStackTrace();
		}
	}
	
	
	
	
	
}
