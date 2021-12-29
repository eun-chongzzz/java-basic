package game.interaction;

public class Archer {
	private int hp; 
	private int mp;
	private int rDam;
	private int def;
	private int exp;
	
	public Archer () {
		this.hp = 20;
		this.mp = 10;
		this.rDam = 8;
		this.def = 3;
		this.exp = 0;
	}
	
	public void huntOrc(Orc orc) {
		orc.doBattle(this.rDam);
		if(orc.getHp() > 0) {
			this.hp = this.hp + this.def - orc.getAtk();
		} else {
			System.out.println("트롤이 이미 죽어서 교전이 끝났습니다.");
		}System.out.println("교전 결과 궁수의 체력 : " + this.hp);
	}
	
	public void huntDaehyunMon(DaehyunMon daehyun) {
		
		daehyun.doBattle(this.rDam);
		if(daehyun.getHp() > 0) {
			hp = hp + def - daehyun.getAtk();
		} else {
			System.out.println("대현몬이 이미 죽었습니다.");
		}System.out.println("대현몬과 교전결과 전사 체력 : "+ this.hp);
	}
	
	
	public void huntTroll(Troll troll) {
		
		troll.doBattle(this.rDam);
		if(troll.getHp() > 0) {
			this.hp = this.hp + this.def - troll.getAtk();
			} else {
			 System.out.println("트롤이 이미 죽어서 교전이 끝났습니다."); 
		}System.out.println("트롤과 교전 결과 궁수의 체력 : " + this.hp); 
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getMp() {
		return mp;
	}

	public void setMp(int mp) {
		this.mp = mp;
	}

	public int getAtk() {
		return rDam;
	}

	public void setAtk(int atk) {
		this.rDam = atk;
	}

	public int getDef() {
		return def;
	}

	public void setDef(int def) {
		this.def = def;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

}
