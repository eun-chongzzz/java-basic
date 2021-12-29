package interface1;

// Vehicle을 구현하기 위해 implements 를 활용합니다.
public class Train implements Vehicle {
	
	// 속도, 연료량, 기관사명을 선언합니다.
	private String name;
	private int speed;
	private int gas;
	
	
	public Train(String name) {
		this.name = name;
		this.speed = MIN_SPD;
		this.gas = MAX_GAS;
	}
	
	// 오버라이드해서 사용해야하는 구현메서드
	@Override
	public void accel() {
		if(speed + T_INCREASE_SPD > T_MAX_SPD) {
			speed = T_MAX_SPD;
		} else {
			speed += T_INCREASE_SPD;
		}
		// 가속 후 연료 차감
		// -7씩 차감
		gas -= T_DECREASE_GAS;
	}
	@Override
	public void breakSpeed() {
		// 감속도 50씩
		if (speed - T_DECREASE_SPD < MIN_SPD) {
			speed = MIN_SPD;
		} else {
			speed -= T_DECREASE_SPD;
		}
	}
	@Override
	public void reFuel() {
		// 연료량은 70씩 채웁니다.
		if(gas + T_INCREASE_GAS > MAX_GAS) {
			gas = MAX_GAS;
		} else {
			gas += T_INCREASE_GAS;
		}	
	}
	@Override
	public void showStatus() {
		System.out.println("기관사명 : " + name + ", 현재속도 : " + speed
				+ ", 현재 연료량 : " + gas);
		System.out.println("--------------------");
	}
}
