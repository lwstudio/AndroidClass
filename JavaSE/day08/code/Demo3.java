/*
	匿名内部类：没有类名的类就称作匿名内部类（但是具有成员变量以及成员方法）
	
	匿名内部类的好处：简化书写
	
	匿名内部类使用的前提：必须存在继承或者是实现关系才能够使用
	
	匿名内部类一般用于实参
	
	需求：在方法的内部定义一个类继承Animal类，然后调用run方法与sleep方法
*/

abstract class Animal{
	public abstract Animal run();
	
	public abstract Animal sleep();
}

class Outer{
	public void print() {
		//  使用局部内部类来解决需求
		/*
		class Dog extends Animal{
			public void run() {
				System.out.println("狗在跑...");
			}
			
			public void sleep(){
				System.out.println("狗趴着睡觉...");
			}
		}
		
		Dog dog =new Dog();
		dog.run();
		dog.sleep();
		*/
		//  匿名内部类只是没有类名，其他的全部成员都是具备的
		//  匿名内部类与Animal类是继承的关系。目前创建的是Animal子类的对象
		/*
		Animal a = new Animal(){
			public Animal run() {
				System.out.println("狗在跑...");
				return this;
			}
			
			public Animal sleep(){
				System.out.println("狗趴着睡觉...");
				return this;
			} 
			
			public void bite() {
				System.out.println("狗咬人...");
			}
		};  //  .run().sleep();   //  void.sleep();  链式调用
		
		a.run();
		a.sleep();
		*/
		
		new Animal(){
			public Animal run() {
				System.out.println("狗在跑...");
				return this;
			}
			
			public Animal sleep(){
				System.out.println("狗趴着睡觉...");
				return this;
			} 
			
			public void bite() {
				System.out.println("狗咬人...");
			}
			
			public void play() {
				System.out.println("狗玩耍...");
			}
		}.bite();
	}
}



public class Demo3{
	public static void main(String[] args) {
		Outer outer = new Outer();
		outer.print();
	}
	
	
	
	
	
	
	
	
	
	
}