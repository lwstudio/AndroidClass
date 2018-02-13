/*
	用java类描述球员与球队之间的关系
	球队包括球员  整体与部分的关系  has-a关系
	
	
	学生与人   继承关系   is-a关系
*/
class Player{
	String name;
	
	int num;
	
	public Player(String name, int num) {
		this.name = name;
		this.num = num;
	}
	
	public void play() {
		System.out.println(this.name + "在踢球");
	}
}

class Team{
	String name;
	
	Player p1;
	
	Player p2;
	
	Player p3;
	
	public Team(String name, Player p1, Player p2, Player p3) {
		this.name = name;
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
	}
	
	public void startGame() {
		System.out.println(this.name + "开赛啦");
	}
}



public class Demo5{
	public static void main(String[] args) {
		
		//  MSN组合
		Player p1 = new Player("苏亚雷斯", 9);
		Player p2 = new Player("梅西", 10);
		Player p3 = new Player("内马尔", 11);
		
		
		Team team = new Team("巴塞罗那", p1, p2, p3);
		
		team.startGame();
		
		System.out.println("name：" + team.p2.name);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}