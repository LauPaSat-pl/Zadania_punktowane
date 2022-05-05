package Cloths;

import java.util.Random;

public class Coat extends Cloth {
	private int weight;

	public Coat() {
		weight = 5+new Random().nextInt(5);
	}
}
