import accounting_proofs.AccountingProof;
import accounting_proofs.Invoice;
import accounting_proofs.Recipe;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.Scanner;

public class AccountingProofParser {
	public LinkedList<AccountingProof> parseAccountingProofs(String fileName) {
		File file = new File("." + File.separator + "zadanie3" + File.separator + "resource" + File.separator + fileName);
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
		LinkedList<AccountingProof> accountingProofs = new LinkedList<>();
		try {
			Scanner myReader = new Scanner(file);
			while (myReader.hasNextLine()) {
				String data = myReader.nextLine();
				String[] splicedData = data.split("---");
				// Sprawdzam czy pierwszy element można przedstawić jako liczbę (jeśl tak, to dokument jest paragonem, jeśli nie to fakturą
				if (splicedData[0] != null && splicedData[0].matches("[0-9.]+")) {
					int id = Integer.parseInt(splicedData[0]);
					boolean fiscal = Boolean.parseBoolean(splicedData[1]);
					String nip = splicedData[2];
					String desc = splicedData[3];
					float amount = Float.parseFloat(splicedData[4]);
					Date date = formatter.parse(splicedData[5]);
					if (date.after(new Date())) {
						return accountingProofs;
					}
					AccountingProof record = new Recipe(id, fiscal, nip, desc, amount, date);
					accountingProofs.add(record);
				} else {
					String id = splicedData[0];
					String nip = splicedData[1];
					String desc = splicedData[2];
					float amount = Float.parseFloat(splicedData[3]);
					float VATAmount = Float.parseFloat(splicedData[4]);
					Date date = formatter.parse(splicedData[5]);
					if (date.after(new Date())) {
						return accountingProofs;
					}
					AccountingProof record = new Invoice(id, nip, desc, amount, VATAmount, date);
					accountingProofs.add(record);
				}

			}
			myReader.close();
		} catch (FileNotFoundException | ParseException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}

		return accountingProofs;
	}

}
