/*
	instanceof关键字的使用
	
	作用：判断一个对象是否属于指定的类别
	
	instanceof关键字使用的前提：判断的对象与指定类别之间必须存在继承或者是实现的关系
	
	使用的格式
		对象 instanceof 类别
		
	instanceof关键字的作用：
		目前没用。在学习完多态变得非常有用。一般我们做强制类型转换之前都会使用该关键字判断一下，
			然后在进行类型转换
*/

class Animal{
	String name;
	
	String color;
	
	public Animal(String name, String color) {
		this.name = name;
		this.color = color;
	}
}

class Dog extends Animal{
	public Dog(String name, String color) {
		super(name, color);
	}
	
	//  行为
	public void bite() {
		System.out.println(name + "咬人");
	}
}


class Mouse extends Animal{
	public Mouse(String name, String color) {
		super(name, color);
	}
	
	public void dig() {
		System.out.println(name + "打洞");
	}
}


public class Demo10{
	public static void main(String[] args) {
		Dog dog = new Dog("哈士奇", "白色");
		System.out.println("狗是狗类吗？" + (dog instanceof Dog));
		System.out.println("狗是动物类吗？" + (dog instanceof Animal));
		// System.out.println("狗是老鼠类吗？" + (dog instanceof Mouse));
		
		
		Animal a = new Animal("张三", "黄色");
		System.out.println("动物都是狗吗？" + (a instanceof Dog));
	}
	
	
	
	
}