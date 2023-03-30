package accounting_proofs;

import java.util.Date;

public abstract class AccountingProof {
	private String nip;
	private String description;
	private float amount;
	private Date date;

	public AccountingProof(String nip, String description, float amount, Date date) {
		this.nip = nip;
		this.description = description;
		this.amount = amount;
		this.date = date;
	}

	public float getAmount() {
		return amount;
	}

	public Date getDate() {
		return date;
	}
}
