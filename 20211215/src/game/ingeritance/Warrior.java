package game.ingeritance;

// 1. 뼈대가 되는 정보를 가진 Commoner 상속
public class Warrior extends Commoner {
	
	private int pDam;
	
	public Warrior(String name) {
		super(name); // 생성자 내부에서 다른 코드에 앞서서 무조건 1순위로 들어와야함
		
		this.pDam = 2; // 물리데미지 생성하기.
	}
	
	public void getInfo () {
		System.out.print("닉네임 : " + name);
		System.out.print(", 레벨 : " + lv);
		System.out.print(", 현재체력 : " + hp);
		System.out.print(", 현재마나 : " + mp);
		System.out.print(", 물리데미지 : " + pDam);
		System.out.println();
	}
	
}
	


