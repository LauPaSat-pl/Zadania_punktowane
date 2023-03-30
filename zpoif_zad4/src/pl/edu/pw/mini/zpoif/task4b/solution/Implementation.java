package pl.edu.pw.mini.zpoif.task4b.solution;

import pl.edu.pw.mini.zpoif.task4b.building.Budka;
import pl.edu.pw.mini.zpoif.task4b.building.WygodnaBudka;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Implementation extends Solution {

	private WygodnaBudka wygodnaBudka;

	@Override
	protected WygodnaBudka task1() throws Exception {
		Class<?> budkaClass = Class.forName("pl.edu.pw.mini.zpoif.task4b.building.WygodnaBudka");
		Constructor<?> cons = budkaClass.getConstructor();
		return (WygodnaBudka) cons.newInstance();
	}

	@Override
	protected void task2(WygodnaBudka wygodnaBudka) throws Exception {
		Field field = WygodnaBudka.class.getDeclaredField("bazgrol");
		field.setAccessible(true);
		String bazgrol = (String) field.get(wygodnaBudka);
		System.out.println(bazgrol);
	}

	@Override
	protected void task3(WygodnaBudka wygodnaBudka) throws Exception {
		Field field = WygodnaBudka.class.getDeclaredField("szyfrDoSejfu");
		field.setAccessible(true);
		Field universal = Budka.class.getDeclaredField("UNIWERSALNY_SZYFR_DO_SEJFU");
		universal.setAccessible(true);
		String uni_safe_pass = (String) universal.get(wygodnaBudka);
		field.set(wygodnaBudka, uni_safe_pass);
	}

	@Override
	protected void task4(WygodnaBudka wygodnaBudka) throws Exception {
		Method[] methods = WygodnaBudka.class.getMethods();
		Method integerMethod = getIntegerMethod(methods);

	}



	@Override
	protected void task5() throws Exception {
		Field field = WygodnaBudka.class.getDeclaredField("dobreWyrko");
		field.setAccessible(true);
		Class<?> valueClass  = field.getType();
		while (!valueClass.getSimpleName().equals("Object")){
			valueClass = valueClass.getSuperclass();
			System.out.println(valueClass.getSimpleName());
		}


	}

	@Override
	protected WygodnaBudka task6() throws Exception {
		Class<?> budkaClass = Class.forName("pl.edu.pw.mini.zpoif.task4b.building.WygodnaBudka");
		Constructor<?> cons = budkaClass.getConstructor(String.class, String.class);

		return (WygodnaBudka) cons.newInstance("Super","Dobre graty");
	}

	@Override
	protected void task7(WygodnaBudka wygodnaBudka) throws Exception {
		Class<?> safe = null;
		for (Class<?> declaredClass : WygodnaBudka.class.getDeclaredClasses()) {
			if (declaredClass.getSimpleName().equals("Sejf")){
				safe = declaredClass;
				break;
			}
		}

		Field passField = WygodnaBudka.class.getDeclaredField("szyfrDoSejfu");
		passField.setAccessible(true);
		String safePass = (String) passField.get(wygodnaBudka);
		Field safeField = WygodnaBudka.class.getDeclaredField("sejf");
		safeField.setAccessible(true);
		assert safe != null;
		Constructor<?> constructor = safe.getDeclaredConstructor(WygodnaBudka.class);
		constructor.setAccessible(true);

		Method openMethod = safe.getDeclaredMethod("open");
		openMethod.invoke(safePass);


	}

	@Override
	protected void task8() throws Exception {
		for (Class<?> declaredClass : WygodnaBudka.class.getDeclaredClasses()) {
			System.out.println (declaredClass.getProtectionDomain().toString());
		}
	}

	@Override
	protected int task9(WygodnaBudka wygodnaBudka) throws Exception {
		int res = 0;
		for (Field declaredField : WygodnaBudka.class.getDeclaredFields()) {
			if(declaredField.getType().equals(Integer.TYPE)){
				res-=(int) declaredField.get(wygodnaBudka);
			}
		}

		return 0;
	}

	private Method getIntegerMethod(Method[] methods) {
		for (Method loopMethod : methods) {
			if (loopMethod.getReturnType().equals(Integer.TYPE)) {
				return loopMethod;
			}
		} return null;
	}
}
