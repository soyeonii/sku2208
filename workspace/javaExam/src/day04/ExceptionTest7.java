package day04;

public class ExceptionTest7 {
	public static void inputScore(int score) throws DingdingException {
		if (score < 0 || score > 100) {
			throw new DingdingException();
		}
		System.out.println("점수는 " + score);
	}
	
	public static void main(String[] args) {
		try {
			inputScore(101);
		} catch (DingdingException e) {
			e.printStackTrace();
		}
	}
}
