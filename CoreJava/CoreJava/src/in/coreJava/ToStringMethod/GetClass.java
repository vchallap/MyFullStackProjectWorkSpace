package in.coreJava.ToStringMethod;

import java.lang.reflect.Method;

public class GetClass {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		GetClass gc = new GetClass();
		Class cs = gc.getClass();
		System.out.println(cs.getName());

		System.out.println(gc.getClass().getName());//method chaining..
		
		Object object = cs.newInstance();
		System.out.println(object);
		
		Method[] methods = cs.getMethods();
		System.out.println(methods);
		
	
		
		
	}

}
