package inheritance;

public class Main02P254 {
	
	public static void main(String[] args) {
		// 여기에 학생 하나와 샐러리맨 하나를 임의로 만들어보세요.
		// 샐러리맨에는 본인 이름과 희망 연봉을 적어주세요.
		// 학생은 그냥 알아서 작성해주세요.
		// 생성한 객체의 정보를 콘솔에도 같이 찍어주세요.
		
		Student s2 = new Student();
		
		s2.name = "김덕진";
		s2.age = 28;
		s2.stuNum = 31;
		
		s2.getInfo();
		s2.getStudentInfo();
		
		Salaryman sm1 = new Salaryman();
		
		sm1.name = "김승곤";
		sm1.age = 28;
		sm1.salary = 5000;
		
		sm1.getInfo();
		sm1.getSalaryInfo();
	}

}
