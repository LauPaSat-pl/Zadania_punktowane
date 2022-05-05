package Cloths;

import java.util.Random;

public class Kufajka extends ClothWithSize {

	public Kufajka() {
		super();

		int size = 35 + new Random().nextInt(11);
		this.setSize(size);
	}
}
