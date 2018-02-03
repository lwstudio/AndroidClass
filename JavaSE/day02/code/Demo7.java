/*
	逻辑运算符
		&  与：只有在表达式1和表达式2都为true时，那么它的结果才是正确的
		|  或：只要表达式1或者是表达式2其中一个为true时，那么结果就是正确的
		!  非：
		^  异或：只有表达式1和表达式2结果不相同时，那么结果才是正确的
		&& 短路与（双与）：
			相同点：判断的结果都是相同的
			不同点：
				1）&：会判断表达式1和表达式2的结果
				2）&&：如果表达式1的结果是false的话
					在表达式1结果为false的时候，使用&&时程序会更高效
		||  短路或：
				1）|：会判断表达式1和表达式2的结果
				2）||：如果表达式1的结果是true的话，那么||不会再去判断表达式2的结果
		
		
	格式： 逻辑表达式1  逻辑运算符 逻辑表达式2 
*/

public class Demo7{
	public static void main(String[] args){
		//   &的使用
		/*
		boolean judge1 = 3 > 2; //  true
		boolean judge2 = 5 > 6; //  false
		boolean result = judge1 & judge2;
		*/
		
		//  |的使用
		/*
		boolean judge1 = 3 > 2; //  true
		boolean judge2 = 5 > 6; //  false
		boolean result = judge1 | judge2;
		*/
		
		//  ^以及!的使用
		/*
		boolean judge1 = 3 > 2; //  true
		boolean judge2 = 5 < 6; //  true
		boolean result = judge1 ^ judge2;
		*/
		System.out.println(!result);
	}
}