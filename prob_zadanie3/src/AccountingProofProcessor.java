import accounting_proofs.AccountingProof;
import accounting_proofs.Invoice;

import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;

public class AccountingProofProcessor {
	private LinkedList<AccountingProof> accountingProofs;

	public AccountingProofProcessor(LinkedList<AccountingProof> accountingProofs) {
		this.accountingProofs = accountingProofs;
	}

	public LinkedList<Invoice> getOrderedInvoices() {
		LinkedList<Invoice> res = new LinkedList<>();
		for (AccountingProof accountingProof : accountingProofs) {
			if (accountingProof instanceof Invoice) {
				float tax = ((Invoice) accountingProof).getVATAmount();
				if (tax > 0.4) {
					res.add((Invoice) accountingProof);
				}
			}
		}
		Collections.sort(res);
		return res;
	}

	public void printAmountOfAccountingProofsByDay() {
		HashMap<Date, Integer> amountOfAccountingProofsByDay = new HashMap<>();
		for (AccountingProof document : accountingProofs) {
			Date date = document.getDate();
			if (amountOfAccountingProofsByDay.containsKey(date)) {
				amountOfAccountingProofsByDay.put(date, amountOfAccountingProofsByDay.get(date) + 1);
			} else {
				amountOfAccountingProofsByDay.put(date, 1);
			}
		}
		System.out.println(amountOfAccountingProofsByDay);
	}
}
