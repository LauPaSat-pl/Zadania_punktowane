package Cloths;

import PocketItems.Button;

import java.util.LinkedHashSet;
import java.util.Random;

public class Shirt extends ClothWithSize {
	LinkedHashSet<Button> buttons;

	public Shirt() {
		super();
		buttons = new LinkedHashSet<>();
		for (int i = 0; i < 6; i++) {
			buttons.add(new Button());
		}



		int size = 35 + new Random().nextInt(6);
		this.setSize(size);
	}
}
