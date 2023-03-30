package ammoTypes;

import static ammoTypes.RandomSupplier.provideRandomCaliberGenerator;

public class Bullet extends Ammo{
	private Calibers caliber;
	private static int bulletCounter = 0;
	private int bulletId;

	public Bullet() {
		bulletCounter+=1;
		this.bulletId = bulletCounter;
		this.caliber = provideRandomCaliberGenerator();
	}

	public Calibers getCaliber() {
		return caliber;
	}

	public void setCaliber(Calibers caliber) {
		this.caliber = caliber;
	}
}
