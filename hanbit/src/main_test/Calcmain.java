package main_test;

import java.util.Scanner;

import syntax.Calculator;

/**
 * 2016. 4. 16.
 * Calcmain.java
 * pakjkwan@gmail.com
 * Story : 계산기 객체지향 테스트
 */
public class Calcmain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = 0, b = 0;
		String op = "", result = "";
		System.out.println("첫번째 정수 입력");
		a = scanner.nextInt();
		System.out.println("연산자 종류를 입력( +, -, *, / )");
		op = scanner.next();
		System.out.println("두번째 정수 입력");
		b = scanner.nextInt();
		//------------[파라미터 입력]------------
		Calculator calculator = new Calculator();
		result = calculator.execute(a, op, b);
		//------------[리턴값 출력]------------
		System.out.println(result);
	}
}
