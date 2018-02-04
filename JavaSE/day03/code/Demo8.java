/*
	do-while语句
	
	格式：
		do {
			循环体
		} while(判断的条件);
		
	while循环和do-while循环的区别：
		while语句是先判断后执行循环体中的代码，但是do-while语句是
		先执行后判断。不管条件是否满足至少都会执行一次。
	
	规律：do-while语句和while的要执性相同的效果时，判断条件都是相同的
*/

public class Demo8{
	public static void main(String[] args){
		/*
		int count = 0;
		
		do {
			System.out.println("HelloWorld");
			count++;
		} while (count < 5);
		
		
		//  java编译器不允许我们写废话的
		boolean flag = false;
		while (flag) {
			System.out.println("HelloWorld");
		}
		*/
		
		boolean flag = false;
		do {
			System.out.println("HelloWorld");
		} while (flag);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}