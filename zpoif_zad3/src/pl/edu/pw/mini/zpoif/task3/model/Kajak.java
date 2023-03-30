package pl.edu.pw.mini.zpoif.task3.model;

import java.util.Objects;

public class Kajak extends StatekNawodny {

	protected boolean miejsceDlaDziecka;

	public Kajak(String nazwaProducenta, int dlugosc, int masa, boolean miejsceDlaDziecka) {
		super(nazwaProducenta, dlugosc, masa);
		this.miejsceDlaDziecka = miejsceDlaDziecka;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(miejsceDlaDziecka);
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
		Kajak other = (Kajak) obj;
		return miejsceDlaDziecka == other.miejsceDlaDziecka;
	}
	
}