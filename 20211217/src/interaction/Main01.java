package interaction;

public class Main01 {

	public static void main(String[] args) {
		Seller s1 = new Seller(30,30);
		Buyer b1 = new Buyer(50000);
		
		s1.showSeller();
		b1.showBuyer();
		
		b1.buyApple(s1, 2);
		
	}

}
