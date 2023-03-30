package pl.edu.pw.mini.zpoif.task3.solution;

import pl.edu.pw.mini.zpoif.task3.generator.GeneratorStatkow;
import pl.edu.pw.mini.zpoif.task3.model.StatekNawodny;
import pl.edu.pw.mini.zpoif.task3.model.jacht.*;

import java.util.*;
import java.util.stream.Collectors;

public class Implementation implements Statki1 {
	List<StatekNawodny> ships;

	public Implementation() {
		ships = GeneratorStatkow.generujStatkiNawodne();
	}

	@Override
	public StatekNawodny getNajciezszyStatek() {
		return ships.stream()
				.max(Comparator.comparing(StatekNawodny::getMasa)).get();
	}

	@Override
	public StatekNawodny getStatekONajdluzszejNazwieProducentaNaR() {
		return ships.stream().
				filter(statekNawodny -> statekNawodny.getNazwaProducenta().startsWith("R")).
				max(Comparator.comparing(statekNawodny -> statekNawodny.getNazwaProducenta().length())).get();
	}

	@Override
	public JachtMotorowy getJachtMotorowyONajwiekszejMocySilnika() {
		return ships.stream().
				filter(statekNawodny -> statekNawodny instanceof JachtMotorowy).
				map(JachtMotorowy.class::cast).
				max(Comparator.comparing(JachtMotorowy::getMocSilnika)).get();
	}

	@Override
	public JachtKabinowy getLekkiJachtKabinowyONajmniejszymOzaglowaniu() {
		return ships.stream().
				filter(statekNawodny -> statekNawodny instanceof JachtKabinowy).
				map(JachtKabinowy.class::cast).
				filter(jachtKabinowy -> jachtKabinowy.getMasa() <= 1000).
				min(Comparator.comparing(JachtZaglowy::getPowierzchniaZagla)).get();
	}

	@Override
	public Set<StatekNawodny> getCoNajwyzej11DlugichICiezkichJachtow() {
		return ships.stream().
				filter(statekNawodny -> statekNawodny.getMasa() >= 1400).
				filter(statekNawodny -> statekNawodny.getDlugosc() >= 700).limit(11).collect(Collectors.toSet());
	}

	@Override
	public List<StatekNawodny> getStatkiPosortowaneWzgledemDlugosciBez2() {
		return ships.stream().skip(2).sorted(Comparator.comparing(StatekNawodny::getDlugosc).reversed()).collect(Collectors.toList());
	}

	@Override
	public List<JachtZaglowy> getPierwsze8ZPosortowanychWzgledemOzaglowaniaBezTrzechPierwszych() {
		return ships.stream().
				filter(statekNawodny -> statekNawodny instanceof JachtZaglowy).
				map(JachtZaglowy.class::cast).
				sorted(Comparator.comparing(JachtZaglowy::getPowierzchniaZagla).reversed()).
				skip(2).limit(8).collect(Collectors.toList());
	}

	@Override
	public void oznaczJachtyDobreNaPlycizny() {
		ships.stream().
				filter(statekNawodny -> statekNawodny instanceof JachtKabinowy).
				map(JachtKabinowy.class::cast).
				filter(jachtKabinowy -> jachtKabinowy.getZanurzenie() <= 30).
				filter(jachtKabinowy -> jachtKabinowy.getMasa() <= 1300).
				forEach(jachtKabinowy -> System.out.println("Jachtem " + jachtKabinowy.getTyp() + " wplyniesz na kazda plycizne!"));
	}

	@Override
	public String get12UnikalnychNazwTypow() {
		return ships.stream().
				filter(statekNawodny -> statekNawodny instanceof Jacht).
				map(Jacht.class::cast).
				filter(jacht -> jacht.getMasa() > 2000).
				distinct().
				skip(3).
				limit(12).
				map(Jacht::getTyp).
				collect(Collectors.joining("-"));
	}

	@Override
	public Map<String, JachtMotorowy> getMapaJachtowMotorowych() {
		return ships.stream().
				filter(statekNawodny -> statekNawodny instanceof JachtMotorowy).
				map(JachtMotorowy.class::cast).
				sorted(Comparator.comparing(jachtMotorowy -> jachtMotorowy.getNazwaProducenta().length())).
				distinct().
				collect(Collectors.toMap(JachtMotorowy::getTyp, jachtMotorowy -> jachtMotorowy));
	}

	@Override
	public List<Jacht> getJachtyOdkrytopokladoweIMotoroweJednePoDrugich() {
		List<JachtOdkrytopokladowy> jachtyOdkrytopokladowe = ships.stream().
				filter(statekNawodny -> statekNawodny instanceof JachtOdkrytopokladowy).
				map(JachtOdkrytopokladowy.class::cast).
				limit(10).collect(Collectors.toList());
		List<JachtMotorowy> jachtyMotorowe = ships.stream().
				filter(statekNawodny -> statekNawodny instanceof JachtMotorowy).
				map(JachtMotorowy.class::cast).
				filter(jachtMotorowy -> jachtMotorowy.getNazwaProducenta().equalsIgnoreCase("regal")).
				skip(4).limit(4).collect(Collectors.toList());
		List<Jacht> jachty = new LinkedList<>();
		jachty.addAll(jachtyMotorowe);
		jachty.addAll(jachtyOdkrytopokladowe);
		return jachty;
	}
}
