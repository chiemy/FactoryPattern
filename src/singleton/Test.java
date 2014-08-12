package singleton;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Singleton singleton = SingletonFactory.getSingleton();
		singleton.doSomething();
	}

}
