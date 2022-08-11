package day04;

public interface CInter extends AInter, BInter {
	public void cMethod();

	@Override
	default void dm() {
		AInter.super.dm();
		BInter.super.dm();
	}
}
