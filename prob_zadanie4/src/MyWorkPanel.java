import Entity.Dot;
import Entity.Entity;
import Entity.Figure.Circle;
import Entity.Figure.Spray;
import Entity.Figure.Square;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MyWorkPanel extends JPanel {

	private List<Entity> entities = new ArrayList<>();

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		paintEntities(g);

	}

	private void paintEntities(Graphics g) {
		g.setColor(new Color(0, 0, 0));
		for (Entity entity : entities) {
			if (entity instanceof Square) {
				g.drawRect(entity.getX(), entity.getY(), ((Square) entity).getSide(), ((Square) entity).getSide());
			} else if (entity instanceof Circle) {
				g.drawOval(entity.getX(), entity.getY(), ((Circle) entity).getRadius(), ((Circle) entity).getRadius());
			} else if (entity instanceof Spray) {
				for (Dot dot : ((Spray) entity).getDots())
					g.drawOval(entity.getX() + dot.getX(), entity.getY() + dot.getY(), 1, 1);
			}
		}
	}


	public void addCircle(int x, int y) {
		int radius = new Random().nextInt(31) + 30;
		entities.add(new Circle(x - radius / 2, y - radius / 2, radius));
	}

	public void addSquare(int x, int y) {
		int side = new Random().nextInt(11) + 10;
		entities.add(new Square(x - side / 2, y - side / 2, side));
	}

	public List<Entity> getEntityList() {
		return entities;
	}

	public void addSpray(int x, int y) {
		int radius = new Random().nextInt(31) + 30;
		entities.add(new Spray(x, y, radius));
	}
}
