package ammoTypes;

import static ammoTypes.RandomSupplier.provideRandomSafeGenerator;

public abstract class Grenade extends Ammo{
	private boolean unarmed;
	private static int grenadeCounter = 0;

	private int grenadeId;

	public Grenade() {
		grenadeCounter+=1;
		this.grenadeId = grenadeCounter;
		this.unarmed = provideRandomSafeGenerator(false);
	}

	public boolean isUnarmed() {
		return unarmed;
	}
}
