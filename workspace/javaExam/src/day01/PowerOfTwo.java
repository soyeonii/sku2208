package day01;

import java.util.*; // Scanner 클래스를 사용하기 위함
//Scanner 클래스와 System.in, nextInt() 메소드는 추후 다룰 것임

public class PowerOfTwo {
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		int result = 1;
		System.out.print("승수: ");
		int pow = stdin.nextInt();
		int n = pow;
		// Q: 아래 while 반복문을 작성하시오.
		while (n > 0) {
			result *= 2;
			n--;
		}
		System.out.println("2의 " + pow + "제곱근은 " + result + "입니다.");
	}
}
