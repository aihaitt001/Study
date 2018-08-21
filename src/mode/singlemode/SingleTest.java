package mode.singlemode;

public class SingleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleLazy single = SingleLazy.getIntance();
		SingleLazy single2 = SingleLazy.getIntance();
		System.out.println(single);
		System.out.println(single2);
		SingleHunger single3 = SingleHunger.getInstance();
		SingleHunger single4 = SingleHunger.getInstance();
		System.out.println(single3);
		System.out.println(single4);

		Single single5 = Single.getInstance();
		Single single6 = Single.getInstance();
		System.out.println(single5);
		System.out.println(single6);

		SingleEnum single7 = SingleEnum.INSTANCE;
		SingleEnum single8 = SingleEnum.INSTANCE;
		System.out.println(single7);
		System.out.println(single8);
	}

}
