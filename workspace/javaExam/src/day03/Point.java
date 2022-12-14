package day03;

public class Point {
	private int x;
	private int y;

	Point() {
	}

	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void show() {
		System.out.println("좌표[x=" + x + ",y=" + y + "]에 점을 그렸습니다.");
	}
}
