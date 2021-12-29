package constructor;

public class Webtoon {
	
	
	public String name; // 제목
	public int series; // 회차
	public String painter; // 작가
	public boolean complete; // 완결 여부
	
	// 생성자
	public Webtoon(String n, String p) {
		name = n;
		series = 1; // 모든 웹툰은 첫 회차가 1회차이므로
		painter = p;
		complete = false; // 연재작은 처음에는 미완결 상태임
	}
	
	// 클래스 내부에서 메서드 만드는 방법
	// public 리턴자료형(int, void등) 메서드명(요구할자료들..) {
	// }
	
	public void getInfo() {
		System.out.println("웹툰제목 : " + name);
		System.out.println("현재 회차 : " + series);
		System.out.println("현재 작가 : " + painter);
		System.out.println("완결여부 : " + complete);
		System.out.println("-----------------");
}
	public void uploadWebtoon() {
		// 회차가 진행될 때 마다 series를 1씩 올려줍니다.
		series += 1;
	}
	public void completeWebtoon() {
	 complete = true;
	}
}
