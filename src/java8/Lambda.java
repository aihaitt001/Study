package java8;

import java.util.Arrays;
import java.util.List;

public class Lambda {
	static void example1() {
		// 不使用lambda
		List<Integer> costBeforeTax = Arrays.asList(100, 200, 300, 400);
		for (Integer cost : costBeforeTax) {
			double price = cost * 1.1;
			System.out.println(price);
		}
		// 使用lambda
		costBeforeTax.stream().map((cost) -> cost * 1.1).forEach(System.out::println);
	}

	public static void main(String[] args) {
		example1();

		// 类型声明
		MathOperation addition = (int a, int b) -> a + b;

		// 不用类型声明
		MathOperation subtraction = (a, b) -> a - b;
		// 大括号返回

		// 不用大括号返回
		// 不用括号
		// 用括号
	}

	interface MathOperation()
	{

		int operation(int a, int b);
	}

	interface GreetingService()
	{}

		void sayMessage(String message);
	}

	private int operate(int a, int b, MathOperation operation) {
		return operation.operation(a, b);
	}
}
