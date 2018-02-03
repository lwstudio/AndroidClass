/*
	赋值运算符：
		=：
		+=：
		-=：
		*=：
		/=：
		%=：
		
*/

public class Demo5{
	public static void main(String[] args){
		//  +=的使用
		/*
		int i = 100;
		i += 20;
		System.out.println(i);
		*/
		
		/*
		byte b1 = 12;
		byte b2 = 10;
		byte b3 = b1 + b2;
		*/
		byte b1 = 12;
		byte b2 = 10;
		b2 += b1;  //  在使用这种方式赋值的时候，java编译器会自动帮助我们进行类型转换
	}
}