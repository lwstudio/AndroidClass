/*
	数组
		数组的定义：数组是一系列相同数据类型（数据类型时任意的）元素的集合
		
	定义数组的三种方式：
		1）声明一个变量
			数据类型[] 变量名
			
		2）声明一个变量，同时完成初始化，但是不给元素赋值
			数据类型[] 变量名 = new 数据类型[容量/长度]
			
		3）声明一个变量，同时完成初始化，给元素进行赋值
			数组的长度即使数据个数
			数据类型[] 变量名 = new 数据类型[]{数据1, 数据2, 数据3, ....}
			
	如何访问/设置数组中的元素？
		访问：变量名[索引/下标]  索引的范围：0 --- 长度-1
			
		设置：变量名[索引/下标] = 对应数据类型的数据
			
	数组需要注意的细节：
		1）数组是一个对象，数据中的元素相当于对象中的成员变量
		2）如果索引超出他的范围，那么就会抛出数组越界异常
		
	数组最为常用的方法：
		对象.length
*/

public class Demo2{
	
	
	public static void main(String[] args) {
		
		/*int[] a = new int[3];  //  声明了int类型的数组，变量名是a，数组的长度是3
		
		a[0] = 10;
		a[1] = 11;
		a[2] = 12;
		*/
		int[] a = new int[]{1, 2, 3};
		
		int len = a.length;
		
		for (int i = 0; i < len; i++) {
			System.out.println("a[" + i + "]:" + a[i]);
		}
		
		/*System.out.println("a[0]:" + a[0]);
		System.out.println("a[1]:" + a[1]);
		System.out.println("a[2]:" + a[2]);
		//  System.out.println("a[3]:" + a[3]);
		*/
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}