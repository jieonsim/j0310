package exam;

public class BunsikRun2 {
	public static void main(String[] args) {
		Bonsa WangjaBunsik = new WangjaBunsik();
		Bonsa SeoulBunsik = new SeoulBunsik();
		Bonsa WoojuBunsik = new WoojuBunsik();
		
		String[] branchs = {"왕자", "서울", "우주"};
		for (String branch : branchs) {
			System.out.println("▶ "+ branch + "분식 메뉴판");
		}
		
		printMenu(WangjaBunsik);
		printMenu(SeoulBunsik);
		printMenu(WoojuBunsik);
		
	}

	public static void printMenu (Bonsa bonsa) {
		bonsa.printMenu();
		System.out.println();
	}
}
