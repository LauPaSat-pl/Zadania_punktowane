package pl.edu.pw.mini.zpoif.task5.solution;

import java.lang.reflect.Field;
import java.util.List;

public class Implementation {
	private final List<Class<?>> classes  = Helper.classes;
	public void exercise2() throws Exception {
		for (Class<?> cl : this.classes){
			if(cl.getSimpleName().equals("Motocykl")){}
			if(cl.getSimpleName().equals("Kierowca")){
				Field f = cl.getDeclaredField("staz");
				System.out.println(f.getAnnotatedType());
			}

		}
	}
}
