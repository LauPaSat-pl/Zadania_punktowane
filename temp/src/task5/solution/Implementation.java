package task5.solution;

import task5.solution.adnotations.MethodCaller;
import task5.solution.adnotations.MyBean;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedList;
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

	public LinkedList<Object> exercise3() {
		LinkedList<Object> objects = new LinkedList<>();
		for (Class<?> cl : this.classes){
			MyBean times = cl.getAnnotation(MyBean.class);
			for (int i=0;i<times.ilosc();i++){
				try {
					objects.add(cl.getConstructor().newInstance());
				} catch (Exception ignored) {}
			}
		}
		return objects;
	}

	public void exercise5(LinkedList<Object> objects) throws Exception {
		for (Object o : objects){
			for (Method method : o.getClass().getMethods()) {
				if (method.isAnnotationPresent(MethodCaller.class)){
					MethodCaller annotation = method.getAnnotation(MethodCaller.class);
					for (int i=0;i< annotation.iloscWywolan();i++){
						method.invoke(o);
					}
				}
			}


		}
	}
}
