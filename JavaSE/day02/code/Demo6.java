/*
	比较运算符：
		==：
			1）用于比较两个基本数据类型的变量时，比较的是两个变量中存储是否一致
			2）用于比较两个引用数据类型的变量时，比较的是两个引用类型变量所记录的内存地址是否一致
		!=：
		>：
		<：
		>=：
		<=：
		
	注意：
		
*/

public class Demo6{
	public static void main(String[] args){
		/*
		int i1 = 12;
		int i2 = 23;
		boolean result = (i1 != i2);
		System.out.println(result);
		*/
		
		byte b = 12;
		int i = 23;
		String str = "123";
		//boolean result = (b != str);
		// 两种不同的数据类型是否可以比较？可以的，但是两种数据类型的变量必须是相互兼容的
		
		char a = 'a';
		boolean result = (b != a);
		System.out.println(result);
	}
}