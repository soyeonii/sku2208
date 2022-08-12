package day04;

public class DingdingException extends Exception {
	public DingdingException() {
		super("score는 0-100 사이의 값만 가능 !!");
	}
}
