package exam2;

public class BunsikRun {
	public static void main(String[] args) {
		Bonsa WangjaBunsik = new WangjaBunsik();
		Bonsa SeoulBunsik = new SeoulBunsik();
		Bonsa WoojuBunsik = new WoojuBunsik();
		
		printMenu(WangjaBunsik);
		printMenu(SeoulBunsik);
		printMenu(WoojuBunsik);
	}

	public static void printMenu (Bonsa bonsa) {
		bonsa.printMenu();
		System.out.println();
	}
}
