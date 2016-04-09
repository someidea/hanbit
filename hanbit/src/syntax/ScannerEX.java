package syntax;

import java.util.Scanner;

public class ScannerEX {
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
		int birthday = scanner.nextInt();
		System.out.println("성인여부(성인true, 미성년false) : ");
		boolean isAdult = scanner.nextBoolean();
		System.out.println("키(소수점 1자리까지) : ");
		double height = scanner.nextDouble();
		System.out.println("혈액형(A) : ");
		char blood = 'A';
		System.out.println(id);
		System.out.println(password);
		System.out.println(name);
		System.out.println(birthday);
		System.out.println(isAdult);
		System.out.println(height);
		System.out.println(blood);
		
	}
}
