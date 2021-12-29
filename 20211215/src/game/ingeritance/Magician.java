package game.ingeritance;

public class Magician extends Commoner {
	
	private int mDam;
	
	public Magician (String name) {
		super(name);
		
		this.mDam = 15;
	}
	public void getInfo() {
		System.out.print("닉네임 : " + name);
		System.out.print(", 레벨 : " + lv);
		System.out.print(", 현재체력 : " + hp);
		System.out.print(", 현재마나 : " + mp);
		System.out.print(", 마법데미지 : " + mDam);
		System.out.println();
	}
}
