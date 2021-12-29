package constructor;

public class Main03P204 {

	public static void main(String[] args) {
		
		Webtoon w1 = new Webtoon("호랑이","김승곤");
		
		w1.getInfo();
		
		w1.uploadWebtoon();
		w1.uploadWebtoon();
		w1.uploadWebtoon();
		w1.uploadWebtoon();
		
		w1.getInfo();
		
		w1.completeWebtoon();
		
		w1.getInfo();

	}

}
