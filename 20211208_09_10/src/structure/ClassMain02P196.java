package structure;

public class ClassMain02P196 {

	public static void main(String[] args) {
		
		// 차 2대 생성
		Car c = new Car();
		
		c.model = "아반떼";
		c.owner = "김승곤";
		c.price = 2000;
		
		Car d = new Car();
		
		d.model = "티코";
		d.owner = "김덕진";
		d.price = 1000;
		//콘솔에 정보 찍기
		c.getInfo();
		d.getInfo();

	}

}
