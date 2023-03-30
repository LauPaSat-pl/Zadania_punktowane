package scareThings;

import guests.Guest;
import guests.States;

public class Hospital extends Place{
	@Override
	public void visit(Guest guest) {
		Ghost ghost = new Ghost() {
			@Override
			public void scareSomeone(Guest guest) {
				if (guest.getState()== States.NORMAL){
					guest.scareMe(15);
				}
			}
		};
		ghost.scareSomeone(guest);
	}
}
