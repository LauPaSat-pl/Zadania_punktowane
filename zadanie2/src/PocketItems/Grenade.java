package PocketItems;

import java.util.Random;

public class Grenade extends PocketItem {
	private boolean unlocked;

	public Grenade() {
		int temp = new Random().nextInt(10);
		unlocked = temp != 0;

	}
}
