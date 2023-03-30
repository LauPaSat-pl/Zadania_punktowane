package pl.edu.pw.mini.zpoif.task3.model;

import java.util.Objects;

public abstract class StatekNawodny {
	protected String nazwaProducenta;
	protected int dlugosc;
	protected int masa;
	
	public StatekNawodny(String nazwaProducenta, int dlugosc, int masa) {
		this.nazwaProducenta = nazwaProducenta;
		this.dlugosc = dlugosc;
		this.masa = masa;
	}

	public int getMasa() {
		return masa;
	}

	public String getNazwaProducenta() {
		return nazwaProducenta;
	}

	public int getDlugosc() {
		return dlugosc;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dlugosc, masa, nazwaProducenta);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StatekNawodny other = (StatekNawodny) obj;
		return dlugosc == other.dlugosc && masa == other.masa && Objects.equals(nazwaProducenta, other.nazwaProducenta);
	}

}
