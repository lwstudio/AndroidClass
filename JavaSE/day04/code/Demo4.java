/*
	
*/

public class Demo4{
	public static void main(String[] args){
		
		//  创建车对象
		Car car = new Car();
		car.wheel = 3;
		car.name = "BMW";
		car.color = "Black";
		car.run();
		
		//  创建修理厂
		CarFactory factory = new CarFactory();
		factory.name = "建国修理厂";
		factory.address = "北海路一号";
		factory.phoneNum = "8722-4690";
		factory.fixCar(car);
		
		System.out.println("这个车现在有几个轮子：" + car.wheel);
		
	}
}