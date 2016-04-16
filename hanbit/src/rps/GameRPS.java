package rps;

import java.util.Scanner;
/**
 * 2016. 4. 16.
 * GameRPS.java
 * pakjkwan@gmail.com
 * Story : 가위바위보 게임
 */
public class GameRPS {
	/**
	 컴퓨터와 사용자 간의 가위바위보 게임을 완성하시오.
	 Math.random()*E+S
	 S 는 시작값
	 E 는 마지막값
	 * */
	public String play(int scan){
		//--------------------------[가공해야 할 데이터를 입력하는 부분]---------------------
		int scissors = 1, rock = 2, paper = 3, rpsValue = 0, comValue = 0;
		String result = "";
		rpsValue = scan;
		comValue = (int) (Math.random()*3+1);
		switch (rpsValue) {
		case 1:
			if (comValue == 1) {
				result = "사용자 가위, 컴퓨터 가위 : 무승부";
			} else if (comValue == 2) {
				result = "사용자 가위, 컴퓨터 바위 : 패배";
			} else {
				result = "사용자 가위, 컴퓨터 보 : 승리";
			}
			break;
		case 2:
			if (comValue == 2) {
				result = "사용자 바위, 컴퓨터 바위 : 무승부";
			} else if (comValue == 3) {
				result = "사용자 바위, 컴퓨터 보 : 패배";
			} else {
				result = "사용자 바위, 컴퓨터 가위 : 승리";
			}
			break;
		case 3:
			if (comValue == 3) {
				result = "사용자 보, 컴퓨터 보 : 무승부";
			} else if (comValue == 1) {
				result = "사용자 보, 컴퓨터 가위 : 패배";
			} else {
				result = "사용자 보, 컴퓨터 바위 : 승리";
			}
			break;
		default: result = "1~3까지의 숫자만 입력바랍니다.";
			break;
		}
		//-----------------[결과가 보여지는 부분]---------------------
		return result;
	}
}
