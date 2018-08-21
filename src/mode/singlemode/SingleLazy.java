package mode.singlemode;

//线程不安全的懒汉
public class SingleLazy {
	private static SingleLazy instance;

	private SingleLazy() {
	}

	public static SingleLazy getIntance() {
		if (instance == null) {
			instance = new SingleLazy();
		}
		return instance;
	}

}
