package com.lewei.string_buffer;

/*
  	StringBuffer类的使用
  	
  	如果需要频繁的修改字符串的内容，建议使用字符串缓冲类（StringBuffer）
  	
  	StringBuffer其实就是一个存储字符的容器
  	
  	笔试题目：使用StringBuffer无参的构造函数创建一个对象时，默认的初始容量是多少？
  		如果长度不够使用了，自动增长多少（自动增长多少倍）？
  		StringBuffer底层是依赖于字符数组才能存储字符数据的，该字符数组默认的初始容量
  		为16，如果字符数组的长度不够使用时，自动增长一倍（+ 2）
  	
  	StringBuffer的底层实现是依赖于字符数组的，count存储的是当前该容器中存储的字符的个数
  	
  	
  	
  	容器具备的行为：
  	增加
		append(boolean b)    可以添加任意类型 的数据到容器中
		insert(int offset, boolean b)  指定插入的索引值，插入对应 的内容。 

	删除
		delete(int start, int end)  根据指定的开始与结束的索引值删除对应的内容。
		deleteCharAt(int index)   根据指定 的索引值删除一个字符。
	
	
	修改
	
		replace(int start, int end, String str) 根据指定 的开始与结束索引值替代成指定的内容。
		reverse()   翻转字符串缓冲类的内容.
		
        setCharAt(int index, char ch)  把指定索引值的字符替换指定的字符。 
        substring(int start, int end)  根据指定的索引值截取子串。
		
	查看
		indexOf(String str, int fromIndex) 查找指定的字符串第一次出现的索引值,并且指定开始查找的位置。
		lastIndexOf(String str) 
		
		capacity() 查看当前字符数组的长度。 
		length() 
		
		charAt(int index) 
		toString()   把字符串缓冲类的内容转成字符串返回。
  			
  	
  	StringBuffer与StringBuilder的相同处与不同处：
  		相同点：
  			两个类都是字符串缓冲类
  			两个类的方法都是完全一致的
  		不同点：
  			StringBuffer是线程安全的，操作效率低，StringBuilder是线程非安全的，操作效率高
  			StringBuffer是从JDK1.0出现的，StringBuilder则是JDK1.5出现的。
  			
  		推荐使用StringBuilder，因为操作效率高
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
		
		
		/*StringBuffer buffer = new StringBuffer();  //  初始的容量为16
		
		buffer.append("java");
		buffer.append("java");
		buffer.append("java");
		buffer.append("java");
		buffer.append("java");
		
		System.out.println(buffer.toString()); */

	}

}
