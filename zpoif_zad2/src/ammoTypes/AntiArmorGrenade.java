package ammoTypes;


public class AntiArmorGrenade extends Grenade {
	private int CO2Emission;

	public AntiArmorGrenade() {
		super();
		this.CO2Emission = RandomSupplier.provideRandomCO2EmissionGenerator(220,250);

	}

	public int getCO2Emission() {
		return CO2Emission;
	}
}
