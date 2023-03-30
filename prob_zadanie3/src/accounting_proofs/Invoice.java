package accounting_proofs;

import java.util.Date;

public class Invoice extends AccountingProof implements Comparable<Invoice> {
	private String id;
	private float VATAmount;

	public Invoice(String id, String nip, String description, float amount, float VATAmount, Date date) {
		super(nip, description, amount, date);
		this.id = id;
		this.VATAmount = VATAmount;
	}

	public String getId() {
		return id;
	}

	public float getVATAmount() {
		return VATAmount;
	}


	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Invoice invoice = (Invoice) o;

		return id.equals(invoice.id);
	}

	@Override
	public int hashCode() {
		return id.hashCode();
	}

	@Override
	public int compareTo(Invoice o) {
		return this.getId().compareTo(o.getId());
	}
}
