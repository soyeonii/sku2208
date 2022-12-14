package day04;

public class ArrayException {
	public static void main(String[] args) {
		int[] intArray = new int[5];
		intArray[0] = 0;
		for (int i = 0; i < 5; i++) {
			try {
				intArray[i + 1] = i + 1 + intArray[i]; // i=4인 경우 예외 발생
			} catch (Exception e) {
			} finally {
				System.out.println("intArray[" + i + "]" + "=" + intArray[i]);
			}
		}
	}
}