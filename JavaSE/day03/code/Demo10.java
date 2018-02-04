/*
	for循环语句
	
		for循环语句的格式:
			for(初始化语句; 判断语句; 循环后要执行的语句) {
				循环语句;
			}
	for循环语句执行的流程
	
	for循环语句要注意的事项：
		1）for(;;) 这种写法是一个死循环语句，相当于while(true)
		2）for循环语句的初始化语句只会执行一次，只是在第一次循环的时候执行而已
		3）for循环语句的循环体只有一句话的时候，可以省略大括号不谢，但是不建议省略
*/

public class Demo10{
	public static void main(String[] args){
		
		//
/*		
		int count = 0;
		while (count < 5) {
			System.out.println("HelloWorld");
			count++;
		}
		*/
		
		/*
		for (int count = 0; count < 5; count++) {
			System.out.println("HelloWorld");
		}*/
		
		/*for (;;) {
			System.out.println("HelloWorld");   //  形成了一个死循环
		}*/
		int count = 0;
		for (System.out.println("初始化语句A"); count < 5; System.out.println("循环完成后要执性的语句B")) {
			System.out.println("循环语句C");
			count++;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}