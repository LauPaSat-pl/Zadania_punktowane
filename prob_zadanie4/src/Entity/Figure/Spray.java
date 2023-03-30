package Entity.Figure;

import Entity.Dot;

import java.util.ArrayList;
import java.util.Random;

public class Spray extends Figure {

	private ArrayList<Dot> dots;

	public Spray(int x, int y, int radius) {
		super(x, y);
		this.dots = new ArrayList<>();
		for (int i = 0; i < 150; i++) {
			int r = new Random().nextInt(radius + 1);
			double theta = 2*Math.PI*new Random().nextDouble();
			int dotX = (int) (r * Math.cos(theta));
			int dotY = (int) (r * Math.sin(theta));
			this.dots.add(new Dot(dotX, dotY));
		}
	}


	@Override
	public double getArea() {
		return 0;
	}

	public ArrayList<Dot> getDots() {
		return dots;
	}
}
