package mode.singlemode;

//静态内部类
public class Single {
	private Single() {
	}

	private static final class SingleHolder {
		private static final Single INSTANCE = new Single();
	}

	public static final Single getInstance() {
		return SingleHolder.INSTANCE;
	}

}
