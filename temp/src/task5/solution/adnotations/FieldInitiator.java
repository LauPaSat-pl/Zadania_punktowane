package task5.solution.adnotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
public @interface FieldInitiator {
	String wartoscString() default "Default";
	int wartoscInt() default 2;
}
