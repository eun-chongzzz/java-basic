package polymorphism;

public class Player extends Person {
	
	public String play;
	
	public Player(String name, int age, String play) {
		super(name,age);
		this.play = play;
	}
	public void showPerson() {
		super.showPerson(); // 부모측 조회 메서드 호출
		System.out.println("운동종목은 : " + play);
	}

}
