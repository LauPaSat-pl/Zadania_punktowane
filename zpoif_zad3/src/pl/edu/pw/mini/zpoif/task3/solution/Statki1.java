package pl.edu.pw.mini.zpoif.task3.solution;

import java.util.List;
import java.util.Map;
import java.util.Set;

import pl.edu.pw.mini.zpoif.task3.model.StatekNawodny;
import pl.edu.pw.mini.zpoif.task3.model.jacht.Jacht;
import pl.edu.pw.mini.zpoif.task3.model.jacht.JachtKabinowy;
import pl.edu.pw.mini.zpoif.task3.model.jacht.JachtMotorowy;
import pl.edu.pw.mini.zpoif.task3.model.jacht.JachtZaglowy;

public interface Statki1 {

	StatekNawodny getNajciezszyStatek();
	StatekNawodny getStatekONajdluzszejNazwieProducentaNaR();
	JachtMotorowy getJachtMotorowyONajwiekszejMocySilnika();
	JachtKabinowy getLekkiJachtKabinowyONajmniejszymOzaglowaniu();
	Set<StatekNawodny> getCoNajwyzej11DlugichICiezkichJachtow();
	List<StatekNawodny> getStatkiPosortowaneWzgledemDlugosciBez2();
	List<JachtZaglowy> getPierwsze8ZPosortowanychWzgledemOzaglowaniaBezTrzechPierwszych();
	void oznaczJachtyDobreNaPlycizny();
	String get12UnikalnychNazwTypow();
	Map<String, JachtMotorowy> getMapaJachtowMotorowych();
	List<Jacht> getJachtyOdkrytopokladoweIMotoroweJednePoDrugich();
	
}
