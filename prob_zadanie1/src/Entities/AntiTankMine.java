package Entities;

import java.util.Random;

public class AntiTankMine extends Mine {
	private double explosiveMass;

	public AntiTankMine() {
		super();
		this.explosiveMass = 1.5 + new Random().nextDouble();

	}
	@Override
	public void pressMe() {
		if (armed){
			System.out.println("Kaboom!!!");
		} else {
			System.out.println("Chrup");
		}

	}
	@Override
	public String toString() {
		return "X";
	}
}
