
package structure;

public class Structure01P190 { // 실행부

	public static void main(String[] args) {
		// 이제부터는 실행코드와 정의 코드를 분리합니다.
		// main이 있는 클래스는 실행만 하고
		// 실제 로직은 다른 .java파일에 저장합니다.
		
		// 커스텀 디자인 자료형은
		// 아래와 같이 new 자료형(); 문법으로 생성합니다.
		Person p1 = new Person();
		// p1 내부에 정의한 변수를
		// p1.변수명 = 대입 할 값; 형태로 저장합니다.
		p1.name = "김승곤";
		System.out.println(p1.name);
		p1.age = 28;
		System.out.println(p1.age);
		p1.pNum = "010-9272-6751";
		System.out.println(p1.pNum);
		p1.uNum = 1010;
		System.out.println(p1.uNum);
		
		// 또 다른 사람을 하나 만들어봅시다.
		Person p2 =new Person();
		// p2에도 name, age, pNum, uNum을 부여해서
		// 콘솔에 찍어주세요.
		p2.name = "김덕진";
		System.out.println(p2.name);
		p2.age = 28;
		System.out.println(p2.age);
		p2.pNum = "010-2787-2678";
		System.out.println(p2.pNum);
		p2.uNum = 922;
		System.out.println(p2.uNum);
		
		Person p3 = new Person();
		
		p3.name = "구마적";
		p3.age = 53;
		p3.pNum = "010-1234-1234";
		p3.uNum = 111;
		
		System.out.println(p3.name);
		System.out.println(p3.age);
		System.out.println(p3.pNum);
		System.out.println(p3.uNum);				

	}

}
