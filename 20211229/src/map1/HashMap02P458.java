package map1;

import java.util.HashMap;
import java.util.Map;

public class HashMap02P458 {

	public static void main(String[] args) {
		// 식당 메뉴판을 만들어보세요.
		// key는 음식이름, value는 가격(정수)로 저장해주세요.
		// 메뉴는 5개 이상 집어넣어주세요.
		// 메뉴를 3개 조회해서 화면에 출력해주세요.
		Map<String, Integer> food = new HashMap<>();
		
		food.put("김치볶음밥", 5000);
		food.put("라면", 2000);
		food.put("김밥", 1500);
		food.put("부대찌개", 6000);
		food.put("냉면", 4500);
		System.out.println("메뉴판" + food);
		
		
		System.out.println(food.get("김치볶음밥") + "원");
		System.out.println(food.get("김밥") + "원");
		System.out.println(food.get("냉면") + "원");
		
	}

}
