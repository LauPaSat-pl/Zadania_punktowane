package pl.edu.pw.mini.zpoif.task5.solution.adnotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
public @interface MyBean {
	int ilosc() default 1;
}
