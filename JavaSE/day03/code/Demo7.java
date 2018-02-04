/*
	while循环语句
		while循环语句的格式：
			while(循环的条件) {
				循环语句；   
			}
			循环体：大括号之间的内容
			
		使用while循环时需要注意的问题：
			1）while循环语句一般是通过一个变量来控制循环的次数
			2）while循环语句的循环体代码只有一句的话，那么可以省略大括号，但是不推荐大家省略
			
	//  死循环，永远不满足终止循环的条件
	
	尽可能的减少重复的代码，提高程序的复用性
*/

public class Demo7{
	public static void main(String[] args){
		//  需求：在控制台上打印出5句HelloWorld
		
		/*
		System.out.println("HelloWorld");
		System.out.println("HelloWorld");
		System.out.println("HelloWorld");
		System.out.println("HelloWorld");
		System.out.println("HelloWorld");
		*/
		
		/*
		int temp = 0;
		while (temp < 5) {
			System.out.println("HelloWorld");  
			temp++;
		}*/
		
		//  计算从1~100的和
		int num = 1;
		int temp = 0;   //  保存每次相加的结果
		while (num <= 100) {
			temp += num;
			num++;
		}
		
		System.out.println("Temp:" + temp);
		
		
		
	}
}