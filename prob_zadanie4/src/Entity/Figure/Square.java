package Entity.Figure;

public class Square extends Figure{

	private int side;

	public Square(int x, int y,int side) {
		super(x, y);
		this.side = side;
	}

	public int getSide() {
		return side;
	}

	@Override
	public double getArea() {
		return side*side;
	}
}
