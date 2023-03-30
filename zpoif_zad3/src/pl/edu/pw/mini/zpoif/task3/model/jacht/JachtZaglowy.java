package pl.edu.pw.mini.zpoif.task3.model.jacht;

import java.util.Objects;

public abstract class JachtZaglowy extends Jacht {

	protected double powierzchniaZagla;

	public JachtZaglowy(String nazwaProducenta, int dlugosc, int masa, String nazwa, double powierzchniaZagla) {
		super(nazwaProducenta, dlugosc, masa, nazwa);
		this.powierzchniaZagla = powierzchniaZagla;
	}

	public double getPowierzchniaZagla() {
		return powierzchniaZagla;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(powierzchniaZagla);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		JachtZaglowy other = (JachtZaglowy) obj;
		return Double.doubleToLongBits(powierzchniaZagla) == Double.doubleToLongBits(other.powierzchniaZagla);
	}
	
}
