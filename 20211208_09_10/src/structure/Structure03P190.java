package structure;

public class Structure03P190 {

	public static void getCatInfo1(Cat c) {
		System.out.println("고양이 " + c.name + "의 정보입니다.");
		System.out.println("이름 : " + c.name + ", 나이 : " +
		c.age + ", 모습 : " + c.form + ", 습성 : " + c.habit + "입니다");
	}
	
	public static void main(String[] args) {
		Cat a = new Cat();
		a.name = "대현";
		a.age = 2;
		a.form = "줄무늬";
		a.habit = "숨기";
		
		Cat b = new Cat();
		b.name = "냥이";
		b.age = 1;
		b.form = "땡땡이";
		b.habit = "할퀴기";
		
		getCatInfo1(a);
		getCatInfo1(b);

	}

}
