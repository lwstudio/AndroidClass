/*
	局部内部类：在一个类的方法中定义了另外一个类，那么另外的一个类就称作为局部内部类
	
	要注意的细节：
		1）如果一个局部内部类访问一个局部变量，那么该局部变量就必须使用final关键字进行修饰
*/

class Outer{
	String name = "外部类";
	
	
	public void test() {
		// 局部变量
		final int i = 10;  //  局部变量的作用域  
		//  局部变量i什么从内存中消失？   方法执行完毕之后变量i就会消失
		
		//  局部内部类
		class Inner{
			int x = 20;
			
			public void print() {
				//System.out.println("局部内部类的print方法");
				System.out.println("i:" + i);
			}
			/*
			 当test方法执行完毕，那么变量i马上从内存中消失，而inner对象在方法执行完毕时还没有从
			 内存中消失，而inner对象还在访问着变量i，这时候变量i已经消失了
			
			解决方案：如果一个局部内部类访问一个局部变量的时候，那么就让该局部内部类访问该变量的
			复制品（要求：赋值品和被访问的局部变量保持完全一致，那么使用final修饰局部变量之后
			该局部变量就不会发生变化）
			*/
		}
		
		Inner inner = new Inner();
		inner.print();   //  方法执行完毕之后，等待javaGC（垃圾回收）
		
	}
}



public class Demo2{
	public static void main(String[] args) {
		Outer outer = new Outer();
		outer.test();
	}
	
	
	
	
	
	
	
	
	
	
	
}