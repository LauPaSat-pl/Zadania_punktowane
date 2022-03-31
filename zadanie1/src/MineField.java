import Entities.*;

import java.util.Random;

public class MineField {
	private Entity[][] field;

	public MineField() {
		Random random = new Random();
		field = new Entity[100][100];
		for (int row = 0; row < field.length; row++) {
			for (int col = 0; col < field[row].length; col++) {
				double tempRandom = random.nextDouble();
				if (tempRandom < 0.1) {
					field[row][col] = new AntiPersonnelMine();
					if (random.nextDouble() < 0.9) {
						((Mine) field[row][col]).armMe();
					}
				} else if (tempRandom < 0.2) {
					field[row][col] = new AntiTankMine();
					if (random.nextDouble() < 0.9) {
						((Mine) field[row][col]).armMe();
					}
				} else if (tempRandom < 0.3) {
					field[row][col] = new Grass();
				} else if (tempRandom < 0.4) {
					field[row][col] = new Lycoperdon();
				} else {
					field[row][col] = null;
				}
			}
		}
	}


}
