package day02;

public class User {
	public static void run(자동차 c) {
		c.run();
	}
	
	public static void main(String[] args) {
		// 부모는 자식을 가리킬 수 있다.
		자동차 c1 = new 버스();
		자동차 c2 = new 스포츠카();

		// 오류
		// Bus b1 = new Car();

		c2.run();
		((스포츠카) c2).open(); // 형 변환
		
		run(c1);
		run(c2);
	}
}
