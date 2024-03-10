package exam;

public abstract class Bonsa {
	public abstract String kimchiStew();
	public abstract String budaejjigae();
	public abstract String bibimbap();
	public abstract String sundaeSoup();
	public abstract String rice();
	
	public void printMenu() {
		System.out.println("김치찌개 : " + kimchiStew());
		System.out.println("부대찌개 : " + budaejjigae());
		System.out.println("비빔밥 : " + bibimbap());
		System.out.println("순대국 : " + sundaeSoup());
		System.out.println("공기밥 : " + rice());
	}
}
