package day04;

public class ExceptionTest5 {
	public static void m1() throws Exception {
		System.out.println("예외 처리가 필요해요.");
	}
	
	public static void inputScore() {
		int score;
	}
	
	public static void main(String[] args) {
		try {
			m1();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}