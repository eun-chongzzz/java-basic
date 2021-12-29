package game.accessmodifier;

public class Warrior extends Commoner {

	public Warrior(String name) { // 생성자
		super(name);
		}
	public void hunt () {
		System.out.println("전사가 사냥을 시작합니다.");
		setHp(getHp()-2);
		setExp(getExp()+10);
	}
	public void doubleAttack( ) {
			System.out.println("더블어택으로 사냥을 합니다.");
			// 체력값 조정(기존체력값-4);
			setHp(getHp()-4);
			// 경험치값 조정(기존경험치값+25);
			setExp(getExp()+25);
	}
	public void getInfo() {
		// 심지어 private요소는 수정이 아닌 조회도 불가능합니다.
		System.out.println("현재 체력 : " + getHp());
		// 체력뿐만 아니라 나머지 요소들도 조회할 수 있도록 코드를 추가해주세요.
		System.out.println("현재 마나 : " + getMp());
		System.out.println("현재 레벨 : " + getLv());
		System.out.println("현재 경험치 : " + getExp());
		System.out.println("닉네임 : " + getName());
		System.out.println("================");
	}
}
