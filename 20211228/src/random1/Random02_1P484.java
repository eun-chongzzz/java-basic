package random1;

import java.util.Random;
import java.util.Scanner;

public class Random02_1P484 {

	public static void main(String[] args) {
		// Random 객체를 생성한 다음 nextBoolean()기능을 이용해서
		// 동전던지기 카운팅 프로그램을 만들어주세요.
		// n회 던졌을때 true가 나오면 앞면, false가 나오면 뒷면으로 간주해서
		// 프로그램이 다 끝났을때 앞면 몇회, 뒷면 몇회인지
		// 콘솔에 출력해주세요.
		// 실행 횟수 n회는 스캐너로 입력받습니다.
		Random random = new Random();
		Scanner scan = new Scanner(System.in);
		System.out.println("동전 던질 횟수를 알려주세요.");
		int coin = scan.nextInt();
		int a = 0;
		int b = 0;
		
		for(int i = 0; i < coin; i++) {
			boolean result = random.nextBoolean();
			if(result == true) {
				a += 1;
			} else {
				b += 1;
			}
		}System.out.println(coin + "바퀴 돌린 값 : ");
		System.out.println("앞면 : " + a);
		System.out.println("뒷면 : " + b);
	}
}