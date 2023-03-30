package scareThings;

import guests.Guest;

public abstract class Apartment extends Place {
	int debt;

	protected void visitBathroom(Guest guest) {
	}

	protected void visitWashingRoom(Guest guest) {
		Bailiff bailiff = new Bailiff();
		bailiff.scareSomeone(guest);
	}

	protected class Bailiff extends Ghost {
		@Override
		public void scareSomeone(Guest guest) {
			guest.scareMe(debt / 200);
		}
	}
}
