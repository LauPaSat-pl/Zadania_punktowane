package pl.edu.pw.mini.zpoif.task3.generator;

import java.util.LinkedList;
import java.util.List;

import pl.edu.pw.mini.zpoif.task3.model.Kajak;
import pl.edu.pw.mini.zpoif.task3.model.StatekNawodny;
import pl.edu.pw.mini.zpoif.task3.model.jacht.JachtKabinowy;
import pl.edu.pw.mini.zpoif.task3.model.jacht.JachtMotorowy;
import pl.edu.pw.mini.zpoif.task3.model.jacht.JachtOdkrytopokladowy;

public class GeneratorStatkow {

	public static List<StatekNawodny> generujStatkiNawodne(){
		List<StatekNawodny> result = new LinkedList<StatekNawodny>();
		
		result.add(new JachtKabinowy("Janmor", 730, 900, "JV24", 30d, 40));
		result.add(new JachtKabinowy("Janmor", 616, 1300, "Janmor 20", 20d, 30));
		result.add(new JachtKabinowy("JAnmoR", 945, 4500, "Janmor 33", 33, 77));
		result.add(new JachtMotorowy("Parker Poland", 660, 110, "Parker 660 Pilothouse", 150));
		result.add(new JachtKabinowy("JAnmoR", 945, 4500, "Janmor 33", 33, 77));
		result.add(new JachtMotorowy("Regal", 1228, 12474, "Regal 42 Fly", 870));
		result.add(new JachtMotorowy("RegaL", 860, 2971, "Regal 29 OBX", 400));
		result.add(new JachtKabinowy("TES", 600, 365, "TES 20 MICO", 33, 50));
		result.add(new JachtKabinowy("TES", 550, 1200, "TES 550 MASTER", 19.7, 26));
		result.add(new JachtMotorowy("Regal", 1034, 4717, "Regal 3300", 700));
		result.add(new Kajak("Aquariusport", 405, 31, false));
		result.add(new JachtOdkrytopokladowy("JEDREK", 620, 351, "Omega", 16, false));
		result.add(new Kajak("Aquariusport", 525, 27, true));
		result.add(new JachtOdkrytopokladowy("JEDREK", 620, 351, "Omega", 16, false));
		result.add(new JachtMotorowy("Regal", 870, 3084, "Regal 2800", 380));
		result.add(new JachtMotorowy("ReGal", 615, 1542, "Regal 2000 ES", 200));
		result.add(new JachtKabinowy("TES", 720, 1500, "TES 678 / 720BT", 23, 30));
		result.add(new JachtOdkrytopokladowy("Sigma-active", 600, 370, "Sigma 600", 17.4, true));
		result.add(new JachtKabinowy("TES", 749, 1800, "TES 246 VERSUS", 28, 35));
		result.add(new JachtKabinowy("TES", 868, 3700, "TES 28 MAGNAM", 34.5, 36));
		result.add(new JachtKabinowy("TES", 969, 4000, "TES 32 DREAMER", 34, 46));
		result.add(new JachtKabinowy("Delphia Yachts", 883, 2600, "Phila 880", 39.4, 36));
		result.add(new JachtMotorowy("REgAL", 742, 2131, "Regal LS4C", 300));
		result.add(new JachtKabinowy("Delphia Yachts", 952, 2800, "Phila 900", 37.8, 40));
		result.add(new JachtKabinowy("Northman", 625, 110, "Maxus 21", 23, 30));
		result.add(new JachtKabinowy("Northman", 638, 1250, "Maxus 22", 23, 30));
		result.add(new JachtKabinowy("Northman", 995, 3900, "Maxus 33 balastowy", 50, 50));
		result.add(new JachtKabinowy("Northman", 995, 3900, "Maxus 33 mieczowy", 50, 50));
		result.add(new JachtOdkrytopokladowy("Puck", 555, 290, "Puck", 15, false));
		result.add(new JachtMotorowy("TES", 969, 4000, "TES 32 DREAMER ", 200));
		result.add(new JachtKabinowy("JaNmor", 749, 1750, "Janmor 20 GREEN", 39.3, 33));
		result.add(new JachtMotorowy("TES", 1270, 4100, "TES 393 ILLUMINATUS", 330));
		result.add(new JachtMotorowy("REgal", 680, 1724, "Regal LX2", 200));
		result.add(new JachtMotorowy("Regal", 680, 1724, "Regal LS2", 280));
		result.add(new JachtMotorowy("REGAL", 740, 2063, "Regal LS4", 300));
		result.add(new JachtKabinowy("Northman", 850, 3000, "Maxus 28 mieczowy", 38, 45));
		result.add(new JachtMotorowy("REGAL", 740, 2063, "Regal LS4", 300));
		result.add(new JachtMotorowy("REGAL", 1140, 7281, "Regal LS36", 860));
		result.add(new JachtMotorowy("REgAL", 742, 2131, "Regal LS4C", 300));
		result.add(new JachtKabinowy("JANMOR", 798, 2700, "PEGAZ 800", 33.4, 30));
		result.add(new JachtMotorowy("REgAL", 742, 2131, "Regal LS4C", 300));
		result.add(new JachtMotorowy("AM Jacht Service", 432, 350, "AM 460", 50));
		result.add(new JachtKabinowy("Northman", 720, 1490, "Maxus 24 mieczowy", 27, 35));
		result.add(new JachtKabinowy("Janmor", 660, 1450, "Sasanka 660", 21.5,32));
		result.add(new JachtKabinowy("Janmor", 953, 4500, "Janmor32 BLUE",41, 50));
		result.add(new JachtMotorowy("AM Jacht Service", 480, 450, "AM 480", 100));
		result.add(new JachtKabinowy("Northman", 995, 3900, "Maxus 33 mieczowy", 50, 50));
		result.add(new JachtMotorowy("AM Jacht Service", 560, 700, "AM 5700", 150));
		result.add(new JachtMotorowy("Parker Poland", 790, 2200, "Parker 800 Weekend", 250));
		
		return result;
	}
}
