package singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SingletonFactory {
	private static Singleton singleton;
	static{
		try {
			Class cl = Class.forName(Singleton.class.getName());
			Constructor constructor = cl.getDeclaredConstructor(null);
			constructor.setAccessible(true);
			singleton = (Singleton) constructor.newInstance(null);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		
	}
	
	public static Singleton getSingleton(){
		return singleton;
	}
}
