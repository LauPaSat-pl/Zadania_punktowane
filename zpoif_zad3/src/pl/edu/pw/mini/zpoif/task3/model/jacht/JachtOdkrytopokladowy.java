package pl.edu.pw.mini.zpoif.task3.model.jacht;

import java.util.Objects;

public class JachtOdkrytopokladowy extends JachtZaglowy {
	protected boolean pasyBalastowe;

	public JachtOdkrytopokladowy(String nazwaProducenta, int dlugosc, int masa, String typ, double powierzchniaZagla,
			boolean pasyBalastowe) {
		super(nazwaProducenta, dlugosc, masa, typ, powierzchniaZagla);
		this.pasyBalastowe = pasyBalastowe;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(pasyBalastowe);
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
		JachtOdkrytopokladowy other = (JachtOdkrytopokladowy) obj;
		return pasyBalastowe == other.pasyBalastowe;
	}
	
}
