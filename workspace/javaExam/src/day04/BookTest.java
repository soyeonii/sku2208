package day04;

public class BookTest {
	public static void main(String[] args) {
		Book b1 = new Book("모두의 자바");
		Book b2 = new Book("모두의 자바");
		
		if (b1 == b2) {
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}
		
		if (b1.equals(b2)) {
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}
	}
}
