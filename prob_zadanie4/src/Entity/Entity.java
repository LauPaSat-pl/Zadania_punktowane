package Entity;

public abstract class Entity {
	private int x, y;

	public Entity(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public abstract double getArea();
}
