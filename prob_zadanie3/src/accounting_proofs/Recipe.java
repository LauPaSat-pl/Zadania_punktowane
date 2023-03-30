package accounting_proofs;

import java.util.Date;

public class Recipe extends AccountingProof {
	private int id;
	private boolean fiscal;

	public Recipe(int id, boolean fiscal,String nip, String description, float amount, Date date) {
		super(nip, description, amount, date);
		this.id = id;
		this.fiscal = fiscal;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Recipe recipe = (Recipe) o;

		return id == recipe.id;
	}

	@Override
	public int hashCode() {
		return id;
	}
}
