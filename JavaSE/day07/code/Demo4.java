/*
	值交换（值传递）：调用一个方法的时候，传递给方法的参数，实际传递的是变量中所存储的值
*/

public class Demo4{
	public static void main(String[] args) {
		/*
		int a = 3;
		int b = 5;
		changeValue(a, b);
		*/
		//System.out.println("a:" + a + ", b:" + b);   //  a = 5, b = 3？
		
		int[] arr = {23, 10, 9};
		changeArr(arr, 1, 2);
		System.out.println("arr[1]:" + arr[1] + ", arr[2]:" + arr[2]);
		
	}

	
	//  需求1：定义一个函数交换两个基本数据类型变量的值
	public static void changeValue(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
		System.out.println("a:" + a + ", b:" + b);   //  a = 5, b = 3？
	}
	
	//  需求2：定义一个函数交换数组中的两个元素的位置
	public static void changeArr(int[] arr, int index1, int index2) {
		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}