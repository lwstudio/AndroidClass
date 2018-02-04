/*
	if判断语句
		格式1：
			适用于只有一种情况的
			if (判断的条件) {
				符合条件时执行的代码
			}
		格式2：
			适用在两种情况下
			if (判断的条件) {
				符合条件时执行的代码
			} else {
				不符合条件时需要执行的代码
			}
			
			格式二和三目运算符的对比：
				三目运算符：
					优点：结构比较简洁
					缺点：符合条件必须要返回一个结果，不能执行
			
		格式3：
			适用于多种情况
			if (判断的条件1){
				符合条件1时执行的代码
			} else if (判断的条件2) {
				符合条件2时执行的代码
			} else if (判断的条件3) {
				符合条件3时执行的代码
			} ..... {
				符合其他情况时执行的代码
			} else {
				都不符合以上情况时执行的代码
			}
			
	使用if判断语句时要注意的细节：
		1）如果符合条件后只有一个语句需要执行，那么省略大括号。不建议大家这么做，因为代码结果不清晰
			
			
	
*/


public class Demo2{
	public static void main(String[] args){
		//  需求1：要求我们的工作经验在两年或者两年以上
		/*
		int workAge = 1;
		if (workAge >= 2) {
			System.out.println("我们已经决定正式聘用你");
			System.out.println("哈哈哈，我已经拿到offer了");
		}
		*/
		
		//  需求2：不管是否通过面试，都需要给出反馈
		/*
		int workAge = 3;
		if (workAge >= 2){
			System.out.println("我们已经决定正式聘用你");
			System.out.println("哈哈哈，我已经拿到offer了");
		} else {
			System.out.println("很遗憾，您不太适合我们公司");
		}
		*/
		
		int workAge = 3;
		String result = workAge >= 2? "我们已经决定正式聘用你" : "很遗憾，您不太适合我们公司";
		System.out.println(result);
		
		
		//  需求3：根据一个数字中存储的值来显示星期几
		/*
		int num = 8;
		if (num == 0){
			System.out.println("星期天");
		} else if (num == 1){
			System.out.println("星期一");
		} else if (num == 2){
			System.out.println("星期二");
		} else if (num == 3){
			System.out.println("星期三");
		} else if (num == 4){
			System.out.println("星期四");
		} else if (num == 5){
			System.out.println("星期五");
		} else if (num == 6){
			System.out.println("星期六");
		} else {
			System.out.println("没有对应的星期");
		}
		*/
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}