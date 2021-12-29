package constructor;

public class Main01P204 {

	public static void main(String[] args) {
		// 자동차 한 대를 만들어주세요.
		// 연료량은 100
		// 속도는 0
		// 주인은 본인이름으로 만들어주세요.
		
		Car a = new Car(100, 0, "김승곤");
		//생성자로 gas, speed, owner를 처리
		//a.gas = 100;
		//a.speed= 0;
		//a.owner = "김승곤";
		
		// 차를 뽑자마자 먼저 상태 확인
		a.getInfo();
		// 엑셀을 두 번 밟아주세요.
		a.accelSpeed();
		a.accelSpeed();
		// 다시 상태를 확인해주세요.
		a.getInfo();
		// 브레이크를 밟아주세요
		a.breakSpeed();
		// 상태 다시 확인
		a.getInfo();
		// 가솔린 충전
		a.putGas();
		// 상태확인
		a.getInfo();
	}
}
