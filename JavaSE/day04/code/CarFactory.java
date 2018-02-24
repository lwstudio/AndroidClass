/*
	修车厂：
			公共属性：名字、地址、电话
			公共的行为：修车
			
			
	
*/

public class CarFactory{
	//  使用成员变量来描述属性
	String name;
	
	String address;
	
	String phoneNum;
	
	
	//  使用函数来描述行为
	public void fixCar(Car c) {
		if (c.wheel >= 4) {
			System.out.println("花了很大的功夫修好了，给钱吧");
		} else {
			c.wheel = 4;
			System.out.println("修好了，给钱");
		}
	}
	
	
}