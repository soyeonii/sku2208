package day01;

public class Swap {
	public static void main(String[] args) {
		int n1 = 10;
		int n2 = 30;
		if (n1 < n2) {
			int tmp = n1;
			n1 = n2;
			n2 = tmp;
		}
		System.out.println("n1: " + n1);
		System.out.println("n2: " + n2);
		int a1 = 20;
		int a2 = 10;
		int a3 = 50;
		if (a1 >= a2) {
			if (a2 > a3) {
				System.out.println("a1이 최대값입니다.");
			}
		} else {
			System.out.println("a1(" + a1 + ")은 a2(" + a2 + ")보다 작습니다.");
		}
	}
}
