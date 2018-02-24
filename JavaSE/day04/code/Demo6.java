/*
	需求：使用java类描述一个社交账号
	
	
	问题：性别出现了问题
	
	根本的原因：由于其他人可以直接操作sex属性，可以sex属性进行直接的赋值
	
	面向对象的三大特征：
		1）封装；
		2）继承；
		3）多态
	
	封装：
		1）使用private修饰需要被封装的属性
		2）提供一个公共的方法设置或者是获取该私有的成员变量
				命名规范：
					set属性名()
					get属性名()
	
	
	权限修饰符：权限修饰符就是控制变量或者是方法的可见范围
	public：公共的。public修饰的成员变量或者是方法任何人都可以直接访问的
	private：私有的。private修饰的成员变量或者是方法只能在本类中进行直接访问
	
*/

class Account{
	//  用户名  性别
	private String username;
	
	private String sex;
	
	public void setSex(String s) {
		if (s.equals("男") || s.equals("女")) {  //  注意：如果比较两个字符串中的内容是否相同，不要使用==
			//  而是使用equals方法
			sex = s;
			System.out.println("设置性别成功");
		} else {
			sex = "男";
			System.out.println("您的输入不符合规范");
		}
	}
	
	public void setUsername(String name) {
		username = name;
	}
	
	public String getUsername() {
		return username;
	}
	
	public String getSex() {
		return sex;
	}
	
	//  聊天
	public void talk() {
		System.out.println("聊得很开心");
	}
	
}

	

public class Demo6{
	public static void main(String[] args) {
		Account a = new Account();
		/*
			a.username = "Adolph";
		a.sex = "不男不女";
		
		System.out.println("username:" + a.username +" sex:" + a.sex);
		*/
		a.setUsername("Adolph");
		a.setSex("不男不女");
		
		String name = a.getUsername();
		String sex = a.getSex();
		System.out.println("name:" + name);
		System.out.println("sex:" + sex);
	}
	
	
	
	
	
	
	
	
	
	
}