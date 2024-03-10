package exam;

public class BunsikRun3 {
    public static void main(String[] args) {
        // 매장 객체를 배열로 관리합니다.
        Bonsa[] bunsikBranches = {
            new WangjaBunsik(),
            new SeoulBunsik(),
            new WoojuBunsik()
        };

        // 매장 이름을 배열로 관리합니다.
        String[] branchNames = {"왕자", "서울", "우주"};

        // 매장 객체의 배열과 매장 이름의 배열을 동시에 순회합니다.
        for (int i = 0; i < bunsikBranches.length; i++) {
            System.out.println("▶ " + branchNames[i] + "분식 메뉴판");
            printMenu(bunsikBranches[i]);
            System.out.println(); // 각 매장 메뉴 출력 후에 줄바꿈을 추가합니다.
        }
    }

    public static void printMenu(Bonsa bonsa) {
        bonsa.printMenu();
    }
}
