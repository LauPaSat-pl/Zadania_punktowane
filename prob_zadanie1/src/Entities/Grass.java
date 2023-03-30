package Entities;

import java.util.Random;

public class Grass extends AliveEntity {
	public Grass() {
		setEcological(true);
		double height = 10.5 + 41 * new Random().nextDouble();
		setHeight(height);
	}

	@Override
	public void pressMe() {
		System.out.println("Chrup");
	}

	@Override
	public String toString() {
		return "|";
	}
}
