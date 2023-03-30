package scareThings;

import guests.Guest;

import java.util.Random;

public class WaterDebtApartment extends Apartment{
	public WaterDebtApartment() {
		debt = 1+new Random().nextInt(1000);
	}

	@Override
	public void visit(Guest guest) {
		if (new Random().nextBoolean()){
			visitWashingRoom(guest);
		} else{
			visitBathroom(guest);
		}
	}

	@Override
	protected void visitBathroom(Guest guest) {
		Swimmer swimmer1 = new Swimmer();
		Swimmer swimmer2 = new Swimmer();
		swimmer1.scareSomeone(guest);
		swimmer2.scareSomeone(guest);
	}

	private class Swimmer extends Ghost{
		@Override
		public void scareSomeone(Guest guest) {
			guest.scareMe(10+new Random().nextInt(21));
		}
	}
}
