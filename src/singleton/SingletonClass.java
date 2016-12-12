package singleton;

public class SingletonClass {

	private SingletonClass() {
	}

	private static class SingletonHolder {
		private static final SingletonClass INSTANCE = new SingletonClass();
	}

	public static SingletonClass getInstance() {
		return SingletonHolder.INSTANCE;
	}
}