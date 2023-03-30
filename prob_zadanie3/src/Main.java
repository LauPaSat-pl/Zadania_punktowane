import accounting_proofs.AccountingProof;

import java.util.LinkedList;

public class Main {
	public static void main(String[] args) {
		AccountingProofParser parser = new AccountingProofParser();
		LinkedList<AccountingProof> data = parser.parseAccountingProofs("dowody.txt");
		AccountingProofProcessor processor = new AccountingProofProcessor(data);
		System.out.println(processor.getOrderedInvoices());
		processor.printAmountOfAccountingProofsByDay();
	}
}
