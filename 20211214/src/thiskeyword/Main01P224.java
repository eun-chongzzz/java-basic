package thiskeyword;

public class Main01P224 {

	public static void main(String[] args) {
		// Person을 두 명 생성해 보시되
		// 생성시 지역간 데이터 교환을 염두해두고 확인해가면서 생성해보세요.
		// 생성된 Person은 getInfo()를 실행합니다.
		
		Person p1 = new Person("김승곤", 28, 5000, "경찰행정");
		Person p2 = new Person("김덕진", 28, 50000, "컴퓨터공학");
		
		p1.getInfo();
		p2.getInfo();
	}

}
