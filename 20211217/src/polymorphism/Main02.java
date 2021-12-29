package polymorphism;

public class Main02 {

	public static void main(String[] args) {
	
		Person p2 = new Player("대현", 27, "농구");
		Person g1 = new Gammer("덕진", 25, "배틀그라운드");
		
		p2.showPerson();
		g1.showPerson();
}
}
