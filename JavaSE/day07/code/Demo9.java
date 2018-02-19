/*
	类与接口、接口与接口的关系
	
	类与接口的关系-----实现关系
	需要注意的细节：
		1）非抽象类实现接口时，必须要把接口中的全部方法实现
		2）抽象类实现接口时，可以实现也可以不实现接口中的方法
		3）一个类可以实现多个接口
			疑问：java中为什么不支持多继承，而支持多实现呢？
			class  A{
				public void print() {
					System.out.println("dfdfdf");
				}
			}
			
			class B{
				public void print() {
					System.out.println("dfdfdf");
				}
			}
			
			class C extends A, B{
				
			}
			
	接口与接口之间的关系-----继承关系
	需要注意的细节：
		1）一个接口是可以继承多个接口的
				
*/

interface A{
	void print();
}

interface B{
	
}

interface C extends A, B{
	
}

public class Demo9{
	public static void main(String[] args) {

	}
}

