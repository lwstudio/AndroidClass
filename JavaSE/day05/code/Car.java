/*
	描述车类
	使用java描述车，车具有的属性：轮子，名字，颜色，还具有跑的功能
		跑之前需要检测是否少于四个轮子，如果少于四个轮子就需要把车送到修车厂进行修理，
		修理厂修理之后补回四个轮子，然后车就可以行动起来
		
		
	初学者常见的经典的错误：
		1）变量只能在同一作用域{}中是可以直接访问的
		2）如果一个类想要访问另外一个类中的变量时，那么这时候就只能通过创建对象进行访问
	
	*/ 
class Car{
	/*
	public Car(String n, String c, int w) {
		name = n;
		color = c;
		wheel = w;
	}
	*/
	
	//  使用成员变量来描述属性
	String name;
	
	String color;
	
	int wheel;
	
	
	//  使用函数来描述行为
	public void run() {
		if (wheel >= 4) {
			System.out.println("具有条件，可以上路");
		} else {
			System.out.println("缺少轮子，需要送到修理厂进行修理");
		}
	}
}