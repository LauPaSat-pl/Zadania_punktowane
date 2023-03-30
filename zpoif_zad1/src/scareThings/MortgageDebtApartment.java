package scareThings;

import guests.Guest;

import java.util.Random;

public class MortgageDebtApartment extends Apartment {
	public MortgageDebtApartment() {
		debt = 1+new Random().nextInt(10_000);
	}

	@Override
	public void visit(Guest guest) {
		visitBathroom(guest);
		visitWashingRoom(guest);
	}

	@Override
	protected void visitBathroom(Guest guest) {
		Bailiff bailiff1 = new Bailiff();
		Bailiff bailiff2 = new Bailiff();
		bailiff1.scareSomeone(guest);
		bailiff2.scareSomeone(guest);
	}
}
