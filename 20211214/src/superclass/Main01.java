package superclass;

public class Main01 {

	public static void main(String[] args) {
		// 비행기를 생성해서 초기속도는 300으로 세팅해주시고
		// 가속 2번으로 900으로 속도를 만들어주신다음
		// 0까지 내려주세요.
		
		Airplane a1 = new Airplane(300);
		
		a1.fly();
		a1.fly();
		
		a1.breakspeed();
		a1.breakspeed();
		a1.breakspeed();
		a1.breakspeed();
		a1.breakspeed();
		a1.breakspeed();
		a1.breakspeed();
		a1.breakspeed();
		a1.breakspeed();

	}

}
