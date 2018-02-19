/*
	实现关系下的多态
*/
interface A{
	void print();
}

class B implements A{
	public void print(){
		System.out.println("我是类B");
	}

}

class C implements A{
	public void print(){
		System.out.println("我是类C");
	}
}

public class Demo14{
	public static void main(String[] args) {
		A a1 = new C();
		a1.print();
		
		A a2 = new B();
		a2.print();
	}

	
}