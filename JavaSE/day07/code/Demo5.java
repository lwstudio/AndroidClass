/*
	Java单继承 多重继承
*/

class Ye{
	String name;
	
	public Ye(String name) {
		this.name = name;
	}
}

class Fu extends Ye{
	public Fu(String name) {
		super(name);
	}
}

class Zi extends Fu{
	public Zi(String name) {
		super(name);
	}
}

public class Demo5{
	public static void main(String[] args) {
		Zi z = new Zi("Koko");
		System.out.println(z.name);
		
	}
}