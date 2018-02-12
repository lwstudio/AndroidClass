/*
	使用一个类描述一下员工，具有的属性id name age
	具有的行为  工作
	
	要求：一旦创建一个员工对象，那么该员工对象就要有相应的属性值
*/

class Employee{
	
	public Employee(String i, String n, int a) {
		id = i;
		name = n;
		age = a;
	}
	
	String id;
	
	String name;
	
	int age;
	
	public void work() {
		System.out.println("好好工作");
	}
}


public class Demo2{
	public static void main(String[] args){
		Employee e = new Employee("123", "Koko", 23);
		System.out.println("name：" + e.name + " id:" + e.id + " age:" + e.age);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}