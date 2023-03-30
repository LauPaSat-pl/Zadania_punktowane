package pl.edu.pw.mini.zpoif.task3.model.jacht;

import java.util.Objects;

import pl.edu.pw.mini.zpoif.task3.model.StatekNawodny;

public abstract class Jacht extends StatekNawodny {

	protected String typ;

	public Jacht(String nazwaProducenta, int dlugosc, int masa, String typ) {
		super(nazwaProducenta, dlugosc, masa);
		this.typ = typ;
	}

	public String getTyp() {
		return typ;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(typ);
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
		Jacht other = (Jacht) obj;
		return Objects.equals(typ, other.typ);
	}

}
