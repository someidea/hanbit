package kaup;

import java.util.Scanner;

public class KaupMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		KaupBean kaup = new KaupBean();
		KaupService service = new KaupServiceImpl();
		while(true){
			System.out.println("=== kaup 지수 구하기 프로그램 ===");
			System.out.println("[메뉴] 1.계속 2.종료");
			int key = scanner.nextInt();
			switch (key) {
			case 1:	
				System.out.println("이름 [ ] 몸무게 [ ] 키 [ ]");
				kaup.setName(scanner.next());
				kaup.setWeight(scanner.nextDouble());
				kaup.setHeight(scanner.nextDouble());
				System.out.println(kaup.getName() + "은(는)" + service.getResult(service.getIndex(kaup)) + "입니다.");
				break;
			case 2:	System.out.println("시스템 종료입니다."); return;
			default: System.out.println("1, 2번만 선택이 가능합니다.");
				break;
			}
		}
	}
}
