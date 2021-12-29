package game.interaction;

public class Main03 {

	public static void main(String[] args) {
		Magician m1 = new Magician();
		Archer a1 = new Archer();
		
		Troll t1 = new Troll();
		Orc o1 = new Orc();
		
		a1.huntOrc(o1);
		a1.huntOrc(o1);
		a1.huntTroll(t1);
		
		m1.huntOrc(o1);
		m1.huntOrc(o1);
		m1.huntTroll(t1);
	

	}

}
