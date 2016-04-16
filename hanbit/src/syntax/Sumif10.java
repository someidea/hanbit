package syntax;
/**
 * 2016. 4. 16.
 * Sumif10.java
 * pakjkwan@gmail.com
 * Story : for-loop + if-branch 수열의 합
 */
public class Sumif10 {
	public static void main(String[] args) {
		// 문제 : for-loop 과  syso 를 한번만 써서 홀수합, 짝수합을 구하시오.
		int oddsum = 0, evensum = 0;
		for (int i = 1; i <= 10; i++) {
			if (i%2==1) {
				oddsum += i;
			} else {
				evensum += i;
			}
			
		}
		System.out.println("홀수합은 " + oddsum + " 이고, 짝수합은 " + evensum + " 이다.");
	}
}