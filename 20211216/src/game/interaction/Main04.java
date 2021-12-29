package game.interaction;

public class Main04 {

	public static void main(String[] args) {
		Warrior w2 = new Warrior();
		Archer a2 = new Archer();
		Magician m2 = new Magician();
		
		DaehyunMon d1 = new DaehyunMon();
		
		w2.huntDaehyunMon(d1);
		a2.huntDaehyunMon(d1);
		m2.huntDaehyunMon(d1);
		m2.huntDaehyunMon(d1);
		m2.huntDaehyunMon(d1);

	}

}
