package task5.solution.adnotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
public @interface FieldCensorship {
	String alternatywa();
}
