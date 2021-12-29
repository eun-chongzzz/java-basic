package exception2;

import java.util.Scanner;

public class TryCatch02P353 {

	public static void main(String[] args) {
		// 아까 exception1 패키지 내부의 여러 예외 유형 중
		// 하나를 골라서 예외가 발생할 수 있는 코드를 작성해주세요.
		// 발생할 예외에 대한 처리는 try~catch블록을 활용합니다.
		// by zero(0으로 나누기)에 대한 처리는 허용하지 않습니다.
		Scanner scan = new Scanner(System.in);
		int [] arr = new int[10];
		System.out.println("입력 : ");
		int a = scan.nextInt();
		
		try {
			System.out.println(arr[a]);
		} catch (Exception e) {
			System.out.println("인덱스가 초과!");
		}
	}
}