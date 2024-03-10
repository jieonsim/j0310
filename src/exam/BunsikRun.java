package exam;

public class BunsikRun {
	public static void main(String[] args) {
		Bonsa WangjaBunsik = new WangjaBunsik();
		Bonsa SeoulBunsik = new SeoulBunsik();
		Bonsa WoojuBunsik = new WoojuBunsik();
		
		System.out.println("▶ 왕자분식 메뉴판");
		printMenu(WangjaBunsik);
		System.out.println("▶ 서울분식 메뉴판");
		printMenu(SeoulBunsik);
		System.out.println("▶ 우주분식 메뉴판");
		printMenu(WoojuBunsik);
		
	}

	public static void printMenu (Bonsa bonsa) {
		bonsa.printMenu();
		System.out.println();
	}
}
