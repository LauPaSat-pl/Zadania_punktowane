package Entities;

import java.util.Random;

public class Lycoperdon extends AliveEntity{
	public Lycoperdon() {
		setEcological(new Random().nextBoolean());
		double height = 3.5 + 4 * new Random().nextDouble();
		setHeight(height);
	}

	@Override
	public void pressMe() {
		System.out.println("Puffff");
	}
	@Override
	public String toString() {
		return "o";
	}
}
