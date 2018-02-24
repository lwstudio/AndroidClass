/*
	使用Animal类描述动物，具有名字、腿属性；具有跑、嚎叫行为
*/

public class Animal{
	//  使用成员变量描述属性
	String name;
	
	int leg;
	
	
	// 使用函数来描述行为
	public void run() {
		System.out.println("跑");
	}
	
	public void crwal() {
		System.out.println("嚎叫");
	}
	
}