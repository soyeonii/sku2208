package day01;

public class test {
	public static void main(String[] args) {
		int count = 0;
		int i = 0;
		while (i < 10) {
			count++;
			i++;
		}
		System.out.println("while : " + count);

		count = 0;
		for (int j = 0; j < 10; j++) {
			count++;
		}
		System.out.println("for : " + count);
	}
}
