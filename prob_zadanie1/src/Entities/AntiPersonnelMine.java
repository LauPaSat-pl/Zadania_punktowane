package Entities;

import java.util.Random;

public class AntiPersonnelMine extends Mine {
	private Material material;

	public AntiPersonnelMine() {
		super();
		int mat = new Random().nextInt(3);
		if (mat == 0) {
			this.material = Material.METAL;
		} else if (mat == 1) {
			this.material = Material.PLASTIC;
		} else {
			this.material = Material.CARDBOARD;
		}
		if (this.material == Material.CARDBOARD) {
			setEcological(true);
		}
	}

	@Override
	public void pressMe() {
		if (armed){
			System.out.println("Boom!" +
					"");
		} else {
			System.out.println("Chrup");
		}

	}

	@Override
	public String toString() {
		return "x";
	}
}
