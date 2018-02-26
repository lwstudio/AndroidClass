package com.lewei.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/*
  	如何获取系统的当前时间
  
  	方式一：System.currrentTimeMillions();
  	
  	Date日期类
  	
  	Calendar类
*/

public class Demo1 {
	public static void main(String[] args) {
		//System.out.println("当前的系统时间是：" + System.currentTimeMillis());
		
		//Date date = new Date();
		
		//System.out.println("今年是：" + date.getYear());
		
		/*
		Calendar cal = Calendar.getInstance();
		System.out.println("今年是：" + cal.get(Calendar.YEAR));
		System.out.println("这个月是：" + (cal.get(Calendar.MONTH) + 1));
		System.out.println("今天是：" + cal.get(Calendar.DAY_OF_MONTH));

		
		System.out.println("现在是：" + cal.get(Calendar.HOUR_OF_DAY) + "时");
		System.out.println("现在是：" + cal.get(Calendar.MINUTE) + "分");
		System.out.println("今天是：" + cal.get(Calendar.SECOND) + "秒");
		*/
		
		//  显示当前的时间：2018年2月26日  XX时XX分XX秒
		/*
		  	日期格式化类：SimpleDateFormat
		  		作用1：可以日期转换成指定格式的字符串 format()
		  		作用2：可以把一个字符串转换成日期     parse()
		 */
		/*
		SimpleDateFormat sdf = new SimpleDateFormat();
		String date = sdf.format(new Date());
		
		System.out.println(date);
		*/
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日  HH时mm分ss秒");
		//String date = sdf.format(new Date());
		//System.out.println(date);
		try {
			Date date = sdf.parse("2018年02月26日  17时50分56秒");
			System.out.println(date.getYear());
		} catch (ParseException e) {
	
			e.printStackTrace();
		}
	}
	
	
	
	
	
}
