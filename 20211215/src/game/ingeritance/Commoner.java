package game.ingeritance;

public class Commoner {
	
	//아이디, 레벨, 체력, 마나
	protected String name;
	protected int lv;
	protected int hp;
	protected int mp;
	
	// 생성자 (아이디만 입력받아 처리)
	public Commoner (String name) {
		//생성자 내부에서 멤버변수를 초기화할때는 this.를 붙이는경우가 많습니다.
		this.name = name;
		this.lv = 1;
		this.hp = 20;
		this.mp = 10;

	}
	
	public void getInfo () {
		System.out.print("닉네임 : " + name);
		System.out.print(", 레벨 : " + lv);
		System.out.print(", 현재체력 : " + hp);
		System.out.print(", 현재마나 : " + mp);
		System.out.println();
		
	}
}

