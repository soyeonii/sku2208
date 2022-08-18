package kr.ac.sku.ioc;

public class BTV implements TV {
	private boolean power;
	private int volume;

	public BTV() {
		volume = 1;
	}

	@Override
	public void turnOn() {
		this.power = true;
		System.out.println(this.power);
	}

	@Override
	public void turnOff() {
		this.power = false;
		System.out.println(this.power);
	}

	@Override
	public void volumeUp() {
		this.volume++;
		System.out.println(this.volume);
	}

	@Override
	public void volumeDown() {
		this.volume--;
		System.out.println(this.volume);
	}
}