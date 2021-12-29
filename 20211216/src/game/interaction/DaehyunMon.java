package game.interaction;

public class DaehyunMon {
	
	private int hp;
	private int atk;
	private int def;
	
	public DaehyunMon() {
		this.hp = 15;
		this.atk = 3;
		this.def = 1;
	}
	
	public void doBattle (int Uatk) {
		hp = (this.hp + this.def)-Uatk;
		if(this.hp <= 0) {
			hp = 0;
			System.out.println("대현몬이 죽어서 반응하지 않습니다.");
			return;
		} System.out.println("대현몬의 남은 체력 : " + this.hp);
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getAtk() {
		return atk;
	}

	public void setAtk(int atk) {
		this.atk = atk;
	}

	public int getDef() {
		return def;
	}

	public void setDef(int def) {
		this.def = def;
	}

}
