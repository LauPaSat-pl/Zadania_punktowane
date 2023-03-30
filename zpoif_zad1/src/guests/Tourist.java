package guests;

public class Tourist extends Guest{
	@Override
	public void scareMe(int power) {
		if (power > resistance) {
			switch (state) {
				case NORMAL:
					this.state = States.FRIGHTENED;
					break;
				case FRIGHTENED:
					this.state = States.PANIC;
					break;
				case PANIC:
					break;
			}
			return;
		}
		switch (state) {
			case PANIC:
				this.state = States.FRIGHTENED;
				break;
			case FRIGHTENED:
				this.state = States.NORMAL;
				break;
			case NORMAL:
				break;
		}
	}

	@Override
	public String toString() {
		return "Tourist{" +
				"state=" + state +
				'}';
	}
}
