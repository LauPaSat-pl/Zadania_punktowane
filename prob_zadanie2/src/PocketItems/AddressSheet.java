package PocketItems;

import java.util.Random;

public class AddressSheet extends PocketItem {


	private final String street;
	private final int houseNumber;


	public AddressSheet(String street) {
		this.street = street;
		this.houseNumber = 1 + new Random().nextInt(222);
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		AddressSheet that = (AddressSheet) o;

		if (houseNumber != that.houseNumber) return false;
		return street.equals(that.street);
	}

	@Override
	public int hashCode() {
		int result = street.hashCode();
		result = 31 * result + houseNumber;
		return result;
	}
}
