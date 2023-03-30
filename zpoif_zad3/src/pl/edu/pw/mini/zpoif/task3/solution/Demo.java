package pl.edu.pw.mini.zpoif.task3.solution;

import pl.edu.pw.mini.zpoif.task3.model.StatekNawodny;

import java.util.LinkedList;
import java.util.List;

public class Demo {
	public static void main(String[] args) {
		Implementation demo = new Implementation();
		System.out.println(demo.getNajciezszyStatek());
		System.out.println(demo.getStatekONajdluzszejNazwieProducentaNaR());
		System.out.println(demo.getJachtMotorowyONajwiekszejMocySilnika());
		System.out.println(demo.getLekkiJachtKabinowyONajmniejszymOzaglowaniu().getPowierzchniaZagla());
		System.out.println(demo.getCoNajwyzej11DlugichICiezkichJachtow());
		System.out.println(demo.getStatkiPosortowaneWzgledemDlugosciBez2());
		System.out.println(demo.getPierwsze8ZPosortowanychWzgledemOzaglowaniaBezTrzechPierwszych());
		demo.oznaczJachtyDobreNaPlycizny();
		System.out.println(demo.get12UnikalnychNazwTypow());
		System.out.println(demo.getMapaJachtowMotorowych());
		System.out.println(demo.getJachtyOdkrytopokladoweIMotoroweJednePoDrugich());



	}
}

