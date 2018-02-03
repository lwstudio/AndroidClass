/*
	变量和八种基本数据类型
	
	变量：变量就是在程序的运行中其值可以发生变化的量

	变量的本质：就是用来存储数据的容器
	
	容器的特点;
		1）容量（大小）
		2）存储一定格式的数据
		3）名字
		
	变量的定义格式：
		容量 变量名字 = 数据
		
	变量名的命令规范：首单词小写，其他单词首字母要大写
	
	java中表示一个变量的容量是多大，使用数据类型来进行描述
	
	java数据类型
		基本数据类型：
			整数类型：
				byte：   8bit、1Byte  2^8=256    -128-127
				short：  16bit、2Byte 2^16=65535 
				int:     32bit、4Byte 2^32
				long:    64bit、8Byte 
				
				注意：如果我们不加任何标识的时候，我们所写的整数默认是int类型
			浮点数类型：
				单精度浮点数:float:   4Byte，7个小数位
				双精度浮点数:double: 8Byte， 15个小数位
			布尔类型：
				boolean 1Byte、4Byte
					如果我们使用boolean定义一个变量，在内存中所占空间大小是4Byte
					如果我们使用boolean定义一个数组，那么数组中每个元素的大小所占空间的大小是1Byte
				
				Java 规范2.0
			字符类型：
				char 2Byte
			
			
		
		引用数据类型：
*/

class Demo2{
	public static void main(String[] args){
		//  需求1：定义一个变量来表示正常人的年龄
			byte age = 120;  //  声明了一个byte类型的变量，该变量的名字叫做age，把120存储到了age变量中
		//  需求2：定义一个变量来表示老师口袋里的钱：
			short myMoney = 10000;
		//  需求3：定义一个变量来表示一个煤老板的钱;
			int bossMoney = 123344545;
		//  需求4：定义一个变量来表示周小川；
			long allMoney = 123343545656565L;
							
		//  定义个变量来表示圆周率
			float pi1 = 3.14F;
			double pi2 = 3.1415926;
			
		//  定义个字符变量
			char ch = 'a';
			
			
		//  布尔类型：true、false
			boolean isTrue = false;
			
			
			
			
			
			
			
			System.out.println(isTrue);
		
	}
}







