import Entities.Entity;

import java.util.Random;

public class Bozena implements Flailable{
	MineField mineField;

	public Bozena(MineField mineField) {
		this.mineField = mineField;
	}

	@Override
	public void destroyMines(MineField mineField) {
		Random random = new Random();
		Entity[][] field = mineField.getField();
		int row = random.nextInt(100);
		for (int col = 0; col < field[row].length; col++) {
			if (field[row][col]!=null){
				field[row][col].pressMe();
			}
		}
	}
}
