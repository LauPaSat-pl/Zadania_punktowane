package guests;

import java.util.Random;

public abstract class Guest {
	protected States state;
	protected int resistance;

	public Guest() {
		state = States.NORMAL;
		resistance = 10 + new Random().nextInt(11);
	}

	public void scareMe(int power) {
	}

	public States getState() {
		return state;
	}

	@Override
	public String toString() {
		return "Guest{" +
				"state=" + state +
				'}';
	}
}
