package day04;

public interface BInter {
	public void bMethod();
	
	default void dm() {
		System.out.println("default method test B");
	}
}
