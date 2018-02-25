/*
	java异常体系：
	我们的java程序也是会存在某些不正常情况的，那么这些不正常的情况，我们就统称为异常
	
	异常体系
	----| Throwable
	--------| Error
	--------| Exception
	
	Throwable:
		toString()：返回的是当前异常对象的完整类名（包名+类名）+ 病态信息
		getMessage()：返回的是创建Throwable对象时传入的字符串信息（病态信息）
		printStackTrace()：打印异常的堆栈信息
*/

public class Demo4{
	public static void main(String[] args){
		Throwable t = new Throwable("头晕，感冒");  //  人为的制造出异常
		
		String s = t.toString();
		
		String message = t.getMessage();
		
		//System.out.println(s);
		test();
	}
	
	
	public static void test() {
		Throwable t = new Throwable();
		t.printStackTrace();
	}
}