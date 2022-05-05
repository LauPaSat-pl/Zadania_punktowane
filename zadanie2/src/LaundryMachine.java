import Cloths.Cloth;
import PocketItems.Grenade;
import PocketItems.PocketItem;

import java.util.*;

public class LaundryMachine <T> {
	private final HashSet<Cloth> toWash;
	private LinkedHashSet<Cloth> washed;
	private final HashMap<Cloth, LinkedList<PocketItem>> pocketItems;
	private T certificate;


	public LaundryMachine() {
		toWash = new HashSet<>();
		washed = new LinkedHashSet<>();
		pocketItems = new HashMap<>();
		certificate = (T) new Certificate();
	}

	public void putToWash(Cloth cloth) {
		toWash.add(cloth);
	}

	public void washAll() {
		LinkedList<PocketItem> pocket;
		for (Iterator<Cloth> it = toWash.iterator(); it.hasNext();) {
			Cloth cloth = it.next();
			pocket = cloth.getPocket();
			pocketItems.put(cloth, pocket);
			for (PocketItem pocketItem : pocket) {
				System.out.println("You forgot something");
				if (pocketItem instanceof Grenade) {
					if (((Grenade) pocketItem).isUnlocked()) {
						System.out.println("You wanted to kill us?!?!?!?!?!?!?!?!?!?!!?!?!");
						return;
					}
				}
			}
			cloth.setClean(true);
			it.remove();
			washed.add(cloth);
		}

	}

	public LinkedHashSet<Cloth> pickUpWashedClothes() {
		LinkedHashSet<Cloth> temp = washed;
		washed = new LinkedHashSet<>();
		return temp;
	}

	public LinkedList<PocketItem> getPocketStuffByClothes(Cloth cloth) {
		LinkedList<PocketItem> temp = pocketItems.get(cloth);
		pocketItems.remove(cloth);
		return temp;
	}
	public T retrieveCertificate() {
		System.out.println(certificate);
		return certificate;
	}
}
