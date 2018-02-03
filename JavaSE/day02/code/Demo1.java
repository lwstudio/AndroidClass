/*
	注释的使用：
		注释：就是使用文字对程序进行说明，注释是写给程序员看的，编译器会忽略掉注释的内容
		
		注释的种类：
			1）单行注释：//
			2）多行注释：/* */
/*
			3）文档注释：
				文档注释也是多行
				软件：数据 + 指令 + 文档（使用文档--给用户 + 开发文档--给程序员）
				格式：/** */
/*
				
			4）生成开发文档要注意的小细节：
				要生成开发文档的类必须被public所修饰
*/

/**
	这个代码使用来模拟QQ登录的
	@author AdolphChen
*/
public class Demo1{
	/*
		这是一个QQ程序
		QQ程序是需要输入用户名和密码的
		然后去校验用户名和密码
	*/
	/**
		main是程序的入口，在这里模拟了QQ登录的流程
	*/
	public static void main(String[] args){
		System.out.println("输入账号");   // 这是QQ登录的过程
		System.out.println("输入密码");
		System.out.println("登录成功"); 
	}
}