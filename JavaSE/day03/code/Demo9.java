/*
	把1——100中偶数进行相加，将相加的结果打印出来
*/

public class Demo9{
	public static void main(String[] args){
		int sum = 0;  // 用于保存每次相加的结果
		
		int count = 1;
		
		do {
			if (count % 2 == 0){
				sum += count;
			}
			count ++;
		} while (count <= 100);
		
		System.out.println("Sum：" + sum);
	}
}