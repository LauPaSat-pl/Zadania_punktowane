package scareThings;

import guests.Guest;

public class OldCastle extends Place {
	int whiteLadyPower;

	public OldCastle() {
		whiteLadyPower = 20;
	}

	@Override
	public void visit(Guest guest) {
		WhiteLady whiteLady = new WhiteLady();
		whiteLady.scareSomeone(guest);
		CastleOwner castleOwner1 = new CastleOwner();
		CastleOwner castleOwner2 = new CastleOwner();
		castleOwner1.scareSomeone(guest);
		castleOwner2.scareSomeone(guest);

	}

	class WhiteLady extends Ghost{
		@Override
		public void scareSomeone(Guest guest) {
			guest.scareMe(whiteLadyPower);
		}
	}

	class CastleOwner extends Ghost{
		@Override
		public void scareSomeone(Guest guest) {
			guest.scareMe(0);
		}
	}

}
