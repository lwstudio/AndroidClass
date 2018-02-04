/*
	break关键字
	
		break关键字应用的范围：
			switch、循环语句中
		
		break关键字的作用：
			1）应用在switch语句中，终止所在的switch语句
			2）应用在循环语句中，终止所在的循环
*/

public class Demo11{
	public static void main(String[] args) {
		
		/*for (int i = 0; i < 3; i++){
			for (int j = 0; j < 2; j++){
				System.out.println("HelloWorld");
				break;
			}
		}*/
		
		
		//  从1开始打印，如果遇到11就终止打印
		int count = 1;
		while (true) {
			System.out.println("Count:" + count);
			if (count == 11){
				break;
			}
			count++;
		}
	}
}