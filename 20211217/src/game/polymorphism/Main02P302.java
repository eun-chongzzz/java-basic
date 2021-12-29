package game.polymorphism;

public class Main02P302 {

	public static void main(String[] args) {
		Commoner c1 = new Commoner("대현짱");
		Monster s1 = new Slime();
		Monster z1 = new Zombi();
		Monster g1 = new Goblin();
		
		c1.hunt(g1);
		c1.hunt(s1);
		c1.hunt(z1);
	}

}
