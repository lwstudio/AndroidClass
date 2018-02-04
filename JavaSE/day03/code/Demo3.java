/*
	switch语句
		格式：
			switch (值) {
				case 值1:
					符合值1时要执性的代码
					break;
				case 值2:
					符合值2时要执性的代码
					break;
				case 值3:
					符合值3时要执性的代码
					break;
				...
				default:
					不符合以上任何值要执行的代码
					break;
			}
	使用switch时需要注意的细节：
		1）switch语句使用变量只能是byte、char、short、int、String数据类型，String类型是从JDK
			1.7的时候开始支持的
		2）case后面跟的必须是一个常量
		3）switch的停止的条件：
			switch语句一旦匹配上其中的一个case，那么就会执行对应case中的代码，执行完毕之后
			如果没有遇到break关键字或者是结束switch的大括号，那么switch语句就不会再继续进行判断
			而是按照代码的顺序依次往下执行，直到遇到break或者是结束switch语句的大括号
		4）在switch语句中，不管代码的顺序如何，永远都是先判断case语句，然后没有符合的情况下才会执行
			default中的语句
			
	if---else if ----- else if ----- else 与 switch语句区别
		switch优点：switch语句的结构非常的清晰
		switch缺点：如果我们判断的条件是一个区间范围，使用switch语句的时候就非常的麻烦
*/

public class Demo3{
	public static void main(String[] args){
		//  需求：根据一个数字中存储的值来显示星期几
		int num = 8;
		int v = 0;
		switch (num) {
			default:
				System.out.println("没有对应的星期");
				//break;
			
			case 0:
				System.out.println("星期天");
				//break;
			case 1:
				System.out.println("星期一");
				//break;
			case 2:
				System.out.println("星期二");
				//break;
			case 3:
				System.out.println("星期三");
				//break;
			case 4:
				System.out.println("星期四");
				//break;
			case 5:
				System.out.println("星期五");
				//break;
			case 6:
				System.out.println("星期六");
				//break;
			
		}
		
		
		/*String str = "Hello";
		switch(str){
			case "Hello":
				System.out.println("Hello");
				break;
			case "World":
				System.out.println("World");
				break;
		}*/
		
		
		//  需求：要求给出一个数字表示月份，根据月份打印这个月有多少天
		//  case穿透
		/*
		int month = 4;
		switch(month){
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				System.out.println("这个月份有31天");
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				System.out.println("这个月份有30天");
				break;
			case 2:
				System.out.println("这个月份可能有28天，也可能有29天");
				break;
			default:
				System.out.println("没有对应的月份");
				break;
		}
		*/
	}
	
	
	
	
	
	
	
	
	
	
}