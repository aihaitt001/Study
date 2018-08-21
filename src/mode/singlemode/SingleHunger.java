package mode.singlemode;

//线程安全的饿汉
public class SingleHunger {
	private SingleHunger() {
	}

	private static SingleHunger instance = new SingleHunger();

	public static SingleHunger getInstance() {
		return instance;
	}

}
