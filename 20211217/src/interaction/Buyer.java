package interaction;

public class Buyer {
	
	private int money;
	private int apple;
	private int banana;
	
	public Buyer(int money) {
		this.money = money;
		this.apple = 0;
		this.banana = 0;
	}
	public void buyApple(Seller seller, int apple) {
		if((apple*2000) > this.money) {
			System.out.println("돈이 모자랍니다. 소지금 : " + this.money);
			return;
		}
		if(seller.getApple() < apple) {
			System.out.println("사과재고가 부족합니다. 사과 재고 :" + seller.getApple());
		return;
		}
	}
	public void buyBanana(Seller seller, int banana) {
		if((banana * 1000)>this.money) {
			System.out.println("돈이 모자랍니다. 소지금 : " + this.money);
			return;
		}
		if(seller.getBanana() < banana) {
			System.out.println("바나나재고가 부족합니다. 바나나 재고 : "+ seller.getBanana());
			return;
		}
		this.money -= banana * 1000;
		this.banana += banana;
		
	}
	public void showBuyer() {
		System.out.println("------구매자정보-------");
		System.out.println("소지중인 사과개수 : " + this.apple);
		System.out.println("소지중인 바나나개수 : " + this.banana);
		System.out.println("잔여금액 : " + this.money);
	}

}
