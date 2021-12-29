package overriding;

public class Main01P265 {

	public static void main(String[] args) {
		// 말과 돼지를 생성해보겠습니다.
		Horse h1 = new Horse();
		h1.name = "번개";
		h1.age = 1;
		h1.food = "짚";
		h1.rank = 2;
		
		h1.getInfo();
		h1.howl();
		
		Pig p1 = new Pig();
		p1.name = "핑핑";
		p1.age = 3;
		p1.food = "사료";
		p1.weight = 100;
		
		p1.getInfo();
		p1.howl();

	}

}
