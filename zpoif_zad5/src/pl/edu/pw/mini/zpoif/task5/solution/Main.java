package pl.edu.pw.mini.zpoif.task5.solution;

import java.lang.reflect.Field;
import java.util.List;

public class Main {
	public static void main(String[] args) throws Exception {
		List<Class<?>> classes  = Helper.classes;
		for (Class<?> cl : classes){
			if(cl.getSimpleName().equals("Kierowca")){
				Field f = cl.getDeclaredField("staz");
				System.out.println(f.getName());
			}
		}
		System.out.println("");
	}
}
