import Cloths.Cloth;
import PocketItems.Grenade;
import PocketItems.PocketItem;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class LaundryMachine {
	private HashSet<Cloth> toWash;
	private LinkedHashSet<Cloth> washed;
	private HashMap<Cloth, LinkedList<PocketItem>> pocketItems;

	public LaundryMachine() {
		toWash = new HashSet<>();
		washed = new LinkedHashSet<>();
		pocketItems = new HashMap<>();
	}

	public void putToWash(Cloth cloth) {
		toWash.add(cloth);
	}

	public void washAll() {
		LinkedList<PocketItem> pocket;
		for (Cloth cloth : toWash) {
			pocket = cloth.getPocket();
			pocketItems.put(cloth, pocket);
			for (PocketItem pocketItem : pocket) {
				if (pocketItem instanceof Grenade) {
					return;
				}
			}
			cloth.setClean(true);
			toWash.remove(cloth);
			washed.add(cloth);
		}

	}

	public LinkedHashSet<Cloth> pickUpWashedClothes() {
		LinkedHashSet<Cloth> temp = washed;
		washed = new LinkedHashSet<>();
		return temp;
	}
	public LinkedList<PocketItem> getPocketStuffByClothes(Cloth cloth){
		LinkedList<PocketItem> temp = pocketItems.get(cloth);
		pocketItems.remove(cloth);
		return temp;
	}

}
