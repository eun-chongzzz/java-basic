package game.polymorphism;

public class Main01P302 {

	public static void main(String[] args) {
		// Commoner생성
		Commoner c1 = new Commoner("대현짱");
		// Orc 생성
		Monster o1 = new Orc();
		
		c1.hunt(o1);
		c1.hunt(o1);


	}

}
