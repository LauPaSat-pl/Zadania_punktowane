package PocketItems;

public class Button extends PocketItem {

	private static int buttonCounter = 0;
	private final int id;


	public Button() {
		buttonCounter += 1;
		id = buttonCounter;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Button button = (Button) o;

		return id == button.id;
	}

	@Override
	public int hashCode() {
		return id;
	}
}
