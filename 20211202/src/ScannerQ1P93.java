import java.util.Scanner;

public class ScannerQ1P93 {

	public static void main(String[] args) {
		// 환율 계산기를 만들어보겠습니다.
		// 네이버에 검색해서 원하는 국가 화폐의 환율을 rate 변수에 저장해주세요.
		// 스캐너를 이용해서 won 변수에 원화 금액을 입력해주세요.
		// 원화와 환율을 이용해서
		// 원화 XXXXX원을 환전시 XXXX(화폐) 입니다. 로 결과물을 출력해주세요.
		Scanner scan = new Scanner(System.in);
			
		double rate = 1177.20;
						System.out.println("미국 달러의 환율은" + rate + "입니다");
		System.out.println("원화를 입력해주세요.");
		int won = scan.nextInt();
			
		System.out.println("원화" + won + "원을 미국 달러로 환전시");			// won/rate를 Math.round()로 감싼다음, 10^n승을 곱하고 10.0^n승으로 나눠주면
		// n승에 해당하는 자리수만큼 소수점 자리까지만 나옵니다.
		System.out.println(Math.round(won / rate * 10000) / 10000.0 + "달러입니다.");
			
		// 소수점 제한 없는 코드
		// System.out.println(Math.round(won / rate) + "달러입니다.");
			
		// 다 사용한 scan변수는 .close()로 닫아줘야 메모리가 회수됩니다.
			scan.close();

	}

}
