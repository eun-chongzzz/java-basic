package interaction;

public class Seller {
	
	private int money;
	private int apple;
	private int banana;
	
	public Seller(int apple, int banana) {
		this.money = 0;
		this.apple = apple;
		this.banana = banana;
	}
	
	public void sellApple (int apple) {
		if(this.apple < apple) {
			System.out.println("사과가 모자랍니다." + " 현재재고 : "+ this.apple);
			return;
		}
		this.apple -= apple;
		this.money += apple * 2000;
	}
	public void sellBanana (int banana) {
		if(this.banana < banana) {
			System.out.println("바나나가 모자랍니다." + " 현재재고 : "+ this.banana);
			return;
		}
		this.banana -= banana;
		this.money += banana * 1000;
	}
	public void showSeller() {
		System.out.println("------상인정보-------");
		System.out.println("현재소지금 : " + this.money);
		System.out.println("현재 사과 재고 : "+ this.apple);
		System.out.println("현재 바나나 재고 : "+this.banana);
	}
	public int getApple() {
		return this.apple;
	}
	public int getBanana() {
		return this.banana;
	}
}
