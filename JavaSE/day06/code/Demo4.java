/*
	设计模式
		模式：解决一类问题的固定步骤
		
	模式最早起源于建筑行业
	
	建房子的步骤都是相同的：
		打地基----->浇柱子----->盖楼面----->砌墙----->封顶----->装修----->入住
		
	软件行业中的23种：
		单例设计模式：保证一个类在内存中只有一个对象。
		
	饥饿式单例设计模式的步骤：
		1）私有化构造函数
		2）声明本类的引用类型的变量，并且使用该变量指向本类对象
		3）提供一个公共静态的方法获取本类的对象
		
	懒汉式单例设计模式：
		缺点：存在线程安全问题，没有办法保证创建出的对象是唯一的

	单例设计模式在多线程下的应用：
	
*/

class Single{
	//  私有化构造函数
	private Single (){
		
	}
	
	//  声明本类的引用类型的变量，并且使用该变量指向本类对象
	private static Single s = new Single();
	
	public static Single getInstance() {
		return s;
	}
}

public class Demo4{
	public static void main(String[] args) {
		Single s1 = Single.getInstance();
		Single s2 = Single.getInstance();
		System.out.println("是不是同一个对象呢？" + (s1 == s2));
	}
	
	
	
	
	
	
	
	
	
	
	
}