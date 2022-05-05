package Cloths;

import PocketItems.AddressSheet;
import PocketItems.Button;
import PocketItems.Grenade;
import PocketItems.PocketItem;

import java.util.LinkedList;
import java.util.Random;

public abstract class Cloth {
	private boolean clean;
	private LinkedList <PocketItem> pocket;

	public Cloth() {
		clean = false;
		int pocketSize = 1+new Random().nextInt(2);
		for (int i=0;i<pocketSize;i++){
			int mat = new Random().nextInt(3);
			if (mat == 0) {
				this.pocket.add(new Button());
			} else if (mat == 1) {
				this.pocket.add(new AddressSheet("Broomstick Street"));
			} else {
				this.pocket.add(new Grenade());
			}
		}
	}

	public LinkedList<PocketItem> getPocket() {
		return pocket;
	}

	public void setClean(boolean clean) {
		this.clean = clean;
	}
}
