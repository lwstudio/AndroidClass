/*
	continue关键字
		continue关键字的应用范围：
			应用在循环中：while、do-while、for
		
		continue关键字的作用：continue的作用是跳过本次循环的循环体内容，继续下一次循环
		
		使用continue关键字要注意的细节：
			1）在一种情况下，continue的后面是不能跟其他语句，因为永远都无法执行
		
	
*/
public class Demo12{
	public static void main(String[] args){
		/*
		for (int i = 0; i < 3; i++) {
			continue;
			System.out.println("count:" + i);
		}
		*/
		
		//  打印出从1-100之间的奇数
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0){
				continue;
			}
			System.out.println("i:" + i);
		}
	}
}