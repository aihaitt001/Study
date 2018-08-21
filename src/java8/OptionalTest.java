package java8;

import java.util.Optional;

public class OptionalTest {
	public static void main(String[] args) {
		String value = "hello";
		String valuenull = null;
		String valueblank = "";
		System.out.println(isNull(value));
		System.out.println(isNull(valuenull));
		System.out.println(isNull(valueblank));
	}

	public static boolean isNull(String value) {
		return !Optional.ofNullable(value).map(String::trim).map(String::isEmpty).orElse(true);
	}

}
