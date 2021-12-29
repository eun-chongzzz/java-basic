package game.ingeritance;

public class Archer extends Commoner {
	
	private int rDam;
	
	public Archer(String name) {
		super(name);
		
		this.rDam = 10;
	}
	
	public void getinfo () {
		System.out.print("닉네임 : " + name);
		System.out.print(", 레벨 : " + lv);
		System.out.print(", 현재체력 : " + hp);
		System.out.print(", 현재마나 : " + mp);
		System.out.print(", 원거리데미지 : " + rDam);
		System.out.println();
	}

}
