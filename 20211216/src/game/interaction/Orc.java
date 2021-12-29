package game.interaction;

public class Orc {
	
	private int hp;
	private int atk;
	private int def;
	
	public Orc() {
		this.hp = 20;
		this.atk = 3;
		this.def = 0;
	}
	
	// doBattle은 유저의 공격력을 받아 오크의 체력을 차감합니다.
	public void doBattle(int Uatk) {
		hp = (this.hp + this.def)-Uatk;
		if(hp <= 0 ) { // 전사의 공격 결과 오크가 죽었다면(체력이 0이하라면)
			hp =0; // 필수는 아님, 죽은 몬스터 체력은 0으로 보정
			System.out.println("오크가 죽어서 반응하지 않습니다.");
			return; // 메서드를 여기서 종료합니다.
		}
		System.out.println("오크가 남은 체력 : " + this.hp); //오크가 죽지않아야 실행됨.	
	}
	
	//getter/setter를 Warrior, Orc에 만들어주세요.
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
