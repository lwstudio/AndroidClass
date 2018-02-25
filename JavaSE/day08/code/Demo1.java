/*
	内部类：一个类定义在另外一个类中，那么该类就称为内部类
	
	内部类的文件名：外部类$内部类.class 好处：便于区分是属于哪个外部类的
	
	内部类的类别：
		1）成员内部类
			成员内部类的访问方式：
				1）方式一：在外部类中提供一个方法，创建内部类的对象进行访问
				2）方式二：在其他类中直接创建内部类的对象。格式：外部类.内部类 变量名 = new 外部类().new 内部类()
				
		2）局部内部类
		3）静态内部类
			静态内部类的访问方式：
				如果是一个静态内部类，那么在其他类中创建对象的方式：
					外部类.内部类 变量名 = new 外部类.内部类();
		
	内部类要注意的细节：
		1）如果外部类与内部类存在同名的成员变量时，在内部类中默认访问的是内部类的成员变量；
			但是可以通过“外部类.this.成员变量名”方式指定访问外部类的成员
		2）私有的成员内部类只能在外部类中提供一个方法创建内部类的对象进行访问。不能在其他类中直接
			创建对象了
		3）成员内部类一旦出现了静态成员，那么该类也需要使用static进行修饰
	
	内部类的好处：内部类可以直接访问外部类中的所有成员
	
	内部类的应用场景：
		我们在描述A事物的时候，发现描述的A事物内部还存在另外一个比较负载事物B，而且这个事物B还需要
		A事物的属性等数据，那么我们就可以使用内部类描述事物B
		比如：
			人 心脏
			
			class 人{
				血
				
				氧气
				
				...
				
				class 心脏 {
					
				}
			}
*/

class Outer{
	
	//  成员变量
	int i = 10;     //  静态成员是不依赖于对象存在
	
	static class Inner{  // 内部类
	
		//int i = 20;
		static int a = 33;   // Outer.Inner.a
	
		public void print(){
			System.out.println("a:" + a);
			//System.out.println("成员内部类的print方法");
		}
	}
	
	
	//  成员函数
	public void print() {
		//  局部变量
		int x = 100;
		
		
		Inner i = new Inner();
		i.print();
		
		
		//  局部内部类
		/*
		class Test{
			
		}*/
	}
}

public class Demo1{
	public static void main(String[] args) {
		/*
		Outer outer = new Outer();
		outer.print();
		*/
		//Outer.Inner i = new Outer().new Inner();
		//i.print();
		Outer.Inner i = new Outer.Inner();
		i.print();
	}
	
	
	
	
	
	
	
}