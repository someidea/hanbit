package syntax;

import java.util.Scanner;
/**
 * 2016. 4. 9.
 * Variable.java
 * pakjkwan@gmail.com
 * Story : 변수에 관한 문법
 */
public class Variable {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("=== 회원가입 ===");

		System.out.println("아이디 : ");
		String id = scanner.next();
		System.out.println("비밀번호 : ");
		String password = scanner.next();
		System.out.println("이름 : ");
		String name = scanner.next();
		System.out.println("생년월일(800101) : ");
		int birthday = scanner.nextInt(); // 정수는 int
		System.out.println("성인여부(성인true, 미성년false) : ");
		boolean isAdult = scanner.nextBoolean();
		System.out.println("키(소수점 1자리까지) : ");
		double height = scanner.nextDouble();
		System.out.println("혈액형(A) : ");
		// char blood = 'A'; 문자 한글자 표시 할 때만 사용
		String blood = "A";
		System.out.println(id);
		System.out.println(password);
		System.out.println(name);
		System.out.println(birthday);
		System.out.println(isAdult);
		System.out.println(height);
		System.out.println(blood);	
	}
}
