import Cloths.Cloth;
import Cloths.Coat;
import Cloths.Kufajka;
import Cloths.Shirt;

import java.util.LinkedHashSet;

public class Customer {
	private final LaundryMachine laundryMachine;

	public Customer(LaundryMachine laundryMachine) {
		this.laundryMachine = laundryMachine;
	}

	public void doJob() {
		for (int i = 0; i < 3; i++) {
			laundryMachine.putToWash(new Coat());
			laundryMachine.putToWash(new Kufajka());
			laundryMachine.putToWash(new Shirt());
		}
		laundryMachine.washAll();
		LinkedHashSet<Cloth> cleanCloths = laundryMachine.pickUpWashedClothes();
		for (Cloth cloth : cleanCloths) {
			laundryMachine.getPocketStuffByClothes(cloth);
		}

	}
}
