package grade;

import java.util.Scanner;

/**
 * 2016. 4. 16.
 * GradeMain.java
 * pakjkwan@gmail.com
 * Story : 성적표 프로그램
 */
public class GradeMain {
	/**
	 [문제]
	 과목 별 점수를 입력 받아 총점, 평균, 학점을 구하는 프로그램을 완성하시오.
	 (과목은 국어, 영어, 수학)
	 * */
	public static void main(String[] args) {
		//----- 변수 선언 영역 -----
		Scanner scanner = new Scanner(System.in);
		GradeBean grade = new GradeBean();
		GradeService service = new GradeServiceByHanbitImpl();
		//----- 파라미터 입력 영역 -----
		System.out.println("이름 : [ ], 국어 : [ ], 영어 : [ ], 수학 : [ ], 자바 : [ ]");
		//----- 메소드 호출 -----
		grade.setName(scanner.next());
		grade.setKor(scanner.nextInt());
		grade.setEng(scanner.nextInt());
		grade.setMath(scanner.nextInt());
		grade.setJava(scanner.nextInt());
		//----- 리턴값 출력 영역 -----
		System.out.println(grade.getName()+" : "+service.getGrade(grade)+"학점");
	}
}
