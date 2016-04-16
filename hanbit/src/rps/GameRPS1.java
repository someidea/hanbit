package rps;

import java.util.Scanner;
/**
 * 2016. 4. 16.
 * GameRPS.java
 * pakjkwan@gmail.com
 * Story : 가위바위보 게임
 */
public class GameRPS1 {
	/**
	 컴퓨터와 사용자 간의 가위바위보 게임을 완성하시오.
	 Math.random()*E+S
	 S 는 시작값
	 E 는 마지막값
	 * */
	public static void main(String[] args) {
		int scissors = 1, rock = 2, paper = 3, rpsValue = 0, comValue = 0;
		System.out.println("=== 가위바위보 게임 ===");
		System.out.println("가위 : 1, 바위 : 2, 보 : 3");
		Scanner scanner = new Scanner(System.in);
		rpsValue = scanner.nextInt();
		comValue = (int) (Math.random()*3+1);
		switch (rpsValue) {
		case 1:
			if (comValue == 1) {
				System.out.println("무승부");
			} else if (comValue == 2) {
				System.out.println("패배");
			} else {
				System.out.println("승리");
			}
			break;
		case 2:
			if (comValue == 2) {
				System.out.println("무승부");
			} else if (comValue == 3) {
				System.out.println("패배");
			} else {
				System.out.println("승리");
			}
			break;
		case 3:
			if (comValue == 3) {
				System.out.println("무승부");
			} else if (comValue == 1) {
				System.out.println("패배");
			} else {
				System.out.println("승리");
			}
			break;
		default: System.out.println("1~3까지의 숫자만 입력바랍니다.");
			break;
		}
	}
}
