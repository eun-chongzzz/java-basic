package interface1;

public class Airplane implements Vehicle {
	private String name;
	private int speed;
	private int gas;
	
	public Airplane(String name) {
		this.name = name;
		this.speed = MIN_SPD;
		this.gas = AIR_MAX_GAS;
	}
	
	@Override
	public void accel() {
		if(speed + AIR_INCREASE_SPD > AIR_MAX_SPD) {
			speed = AIR_MAX_SPD;
		} else {
			speed += AIR_INCREASE_SPD;
		}
		gas -= AIR_DECREASE_GAS;
	}
	@Override
	public void breakSpeed() {
		if (speed - AIR_DECREASE_SPD < MIN_SPD) {
			speed = MIN_SPD;
		} else {
			speed -= AIR_DECREASE_SPD;
		}
	}
	@Override
	public void reFuel() {
		if(gas + AIR_INCREASE_GAS > AIR_MAX_GAS) {
			gas = AIR_MAX_GAS;
		} else {
			gas += AIR_INCREASE_GAS;
		}	
	}
	@Override
	public void showStatus() {
		System.out.println("비행기명 : " + name + ", 현재속도 : " + speed + "km/h"
				+ ", 현재 연료량 : " + gas + "L");
		System.out.println("--------------------");
	}
}
