package pl.edu.pw.mini.zpoif.task5.solution.adnotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
public @interface MethodCaller {
	int iloscWywolan();
}
