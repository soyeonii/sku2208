package day04;

public interface AInter {
	public void aMethod();
	
	default void dm() {
		System.out.println("default method test A");
	}
}
