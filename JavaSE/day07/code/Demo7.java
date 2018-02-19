/*
	
*/

class Pencil{
	String name;
	
	public Pencil(String name){
		this.name = name;
	}
	
	public void write() {
		System.out.println(name + "沙沙的写字");
	}
}

interface Eraser{
	public abstract void modify();
}

class PencilWithEraser extends Pencil implements Eraser{
	
	public PencilWithEraser(String name) {
		super(name);
	}
	
	public void modify() {
		System.out.println("修改，修改...");
	}
}

public class Demo7{
	public static void main(String[] args) {
		PencilWithEraser p = new PencilWithEraser("铅笔");
		p.write();
		p.modify();
	}
	
	
	
	
}