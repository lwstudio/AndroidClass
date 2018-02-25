/*
	自定义异常类
	
	sun提供了很多的异常类给我们用于描述程序中各种不正常的情况，但是sun公司给我们提供的异常类
	还不足以描述我们现实生活中所有不正常的情况，那么这时候我们就需要使用自定义异常类
	
	需求：模拟QQ上线时，如果没有插上网线，那么这时候就抛出一个没有插上网线的异常，如果插线网线上网了
	就正常的现实好友列表
	
	自定义异常类的步骤：
		自定义一个类继承Exception类即可
*/


class NoIpException extends Exception{
	public NoIpException (String message) {
		super(message);
	}
}

public class Demo8{
	public static void main(String[] args) {
		String ip = "192.168.10.101";
		ip = null;
		try {
			qq(ip);
		} catch (NoIpException e) {
			e.printStackTrace();
			System.out.println("赶紧插上网线上网");
		}
		
	}
	
	public static void qq(String ip) throws NoIpException {
		if (ip == null) {
			throw new NoIpException("没有插上网线啊，小白！");  //  伪代码
		}
		System.out.println("正常的现实好友列表");
	} 
	
	
	
	
	
	
	
	
	
	
	
	
	
}