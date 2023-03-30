package pl.edu.pw.mini.zpoif.task3.model.jacht;

import java.util.Objects;

public class JachtKabinowy extends JachtZaglowy {
	protected int zanurzenie;
	protected String komentarz;
	
	public JachtKabinowy(String nazwaProducenta, int dlugosc, int masa, String typ, double powierzchniaZagla,
			int zanurzenie) {
		super(nazwaProducenta, dlugosc, masa, typ, powierzchniaZagla);
		this.zanurzenie = zanurzenie;
	}

	public void setKomentarz(String komentarz) {
		this.komentarz = komentarz;
	}

	public String getKomentarz() {
		return komentarz;
	}

	public int getZanurzenie() {
		return zanurzenie;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(komentarz, zanurzenie);
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
		JachtKabinowy other = (JachtKabinowy) obj;
		return Objects.equals(komentarz, other.komentarz) && zanurzenie == other.zanurzenie;
	}
	
}
