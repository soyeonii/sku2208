package day04;

public class Test {
	public static void main(String[] args) {
		Bird b = null;

		if (args[0].equals("Sparrow")) {
			b = new Cuckoo();
		} else if (args[0].equals("Parrot")) {
			b = new Parrot();
		}

		b.sing();
	}
}
