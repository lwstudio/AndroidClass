/*
	使用java类描述一个动物、狗和鱼类，并且使狗、鱼类继承动物类
	
	目前存在的问题：
		1）动物类的move方法描述的不正确
		2）没有强制要求子类一定重写move方法
		
	抽象类
	
	抽象类的应用的场景：
		我们在描述一类事物的时候，发现这种事物确实存在某种行为，但是这种行为在目前来说是不具体的；
		那么我们这个时候就可以抽取这种行为的声明，但是不去实现这种行为，这种行为就称为抽象的行为，
		我们就需要使用抽象类
		
		
	抽象类使用时需要注意的细节：
		1）如果一个方法没有方法体，那么该方法就需要使用abstract关键字进行修饰，把该方法修饰为
			抽象的方法
		2）如果一个类中出现了抽象的方法，那么该类也必须要使用abstract进行修饰
		3）如果一个非抽象类继承了抽象类，那么必须要把抽象类中的抽象方法全部实现
		4）抽象类中可以存在抽象的方法，也可以存在非抽象的方法
		5）抽象类中是可以不出现抽象方法的
		6）抽象类是不能创建对象的
			疑问：为什么抽象类不能创建对象？
			因为抽象类中是存在抽象方法的，如果能让抽象类创建对象的话，那么使用抽象类创建的对象
			调用抽象方法是没有任何意义的
		7）抽象类有构造方法吗？
			其构造方法是提供给子类创建对象的时候用以完成初始化父类属性的
			
	习题：
		创建出图形、圆形、矩形类，每个类中都具有计算面积和周长的方法，是不过是计算方式不同
		（矩形、圆形需要继承图形类）
*/
abstract class Animal{
	String name;
	
	String color;
	
	public Animal(String name, String color) {
		this.name = name;
		this.color = color;
	}
	
	public void eat() {
		System.out.println("吃东西");
	}
	
	public abstract void move();
}

class Dog extends Animal{
	public Dog(String name, String color) {
		super(name, color);
	}
	
	public void move() {
		System.out.println(name + "四条腿跑的很快");
	}
}

class Fish extends Animal{
	public Fish(String name, String color) {
		super(name, color);
	}
	
	public void move(){
		System.out.println(name + "游得很快");
	}
}



public class Demo2{
	public static void main(String[] args) {
		Dog dog = new Dog("牧羊犬", "白色");
		dog.move();
		
		Fish fish = new Fish("锦鲤", "金色");
		fish.move();
		
		//Animal a = new Animal("牧羊犬", "黑色");
	}
	
	
	
	
	
	
	
	
	
	
	
	
}