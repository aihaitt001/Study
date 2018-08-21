package javacore.chapter3;

public class Primitivetype {
	public static void main(String[] args) {
		/*
		 * 整形 int -2e+ ~ 2e+ short -32768 ~ 32768 long -9ee+ ~ 9ee+ byte -128 ~ 127
		 */

		int a = 1_000_000;
		byte b = 64;
		/*
		 * 浮点 float 有效位数6-7 double 有效位数15 BigDecimal
		 */
		float c = 3.14f;
		double d = 3.1415d;
		System.out.println(d - c);

	}

}
