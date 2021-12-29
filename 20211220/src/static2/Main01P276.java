package static2;

public class Main01P276 {

	public static void main(String[] args) {
		Asean a1 = new Asean(15,20,20);
		//Asean a2 = new Asean(20,30,30);
		//Asean a3 = new Asean(10,10,10);
		//Asean a4 = new Asean(20,0,18);
		
		// Asean 조원 생성 없이도 팀 점수는 public으로 처리된 경우 바로 조회 가능
		// System.out.println(Asean.presentationScore);
		Asean.showPre();
		a1.showPre();
		
		//a1.showAseanInfo();
		//a2.showAseanInfo();
		//a3.showAseanInfo();
		//a4.showAseanInfo();
	}
}
