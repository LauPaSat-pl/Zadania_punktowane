package PocketItems;

import java.util.Random;

public class Grenade extends PocketItem {
	private final boolean unlocked;

	public Grenade() {
		int temp = new Random().nextInt(10);
		unlocked = temp != 0;

	}

	public boolean isUnlocked() {
		return unlocked;
	}
}
