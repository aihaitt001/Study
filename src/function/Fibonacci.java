package function;

/*
 * 用循环，迭代，递归的方式来求斐波那契数列中的第n个值
 * */
public class Fibonacci {

	public static void main(String[] args) {
		Fibonacci compu = new Fibonacci();
		System.out.println(compu.compute(7));
		System.out.println(compu.compute2(7));
		System.out.println(compu.compute3(7));
	}

	// 用递归的方式求斐波那契数列
	public Integer compute(int n) {
		if (n == 1 || n == 2) {
			return 1;
		} else {
			return compute(n - 1) + compute(n - 2);
		}

	}

	// 用迭代的方式求斐波那契数列
	// 普通循环while求斐波那契数列
	public Integer compute2(int n) {
		int i = 1;
		int a = 0, b = 1;

		if (n < 0) {
			return 0;
		}
		if (n == 1 || n == 2) {
			return 1;
		}

		Integer[] list = new Integer[2];
		while (i < n) {
			list = swap(a, b, n);
			a = list[0];
			b = list[1];
			i++;
		}
		return b;
	}

	public Integer[] swap(int a, int b, int n) {
		Integer[] list = new Integer[2];
		b = a + b;
		a = b - a;
		list[0] = a;
		list[1] = b;
		return list;
	}

	// 普通循环for求斐波那契数列
	public Integer compute3(int n) {
		int a = 0, b = 1;
		if (n < 0) {
			return 0;
		}
		if (n == 1 || n == 2) {
			return 1;
		}
		// 第n个数要求n-1次
		for (int i = 1; i < n; i++) {
			b = a + b;
			a = b - a;
		}

		return b;
	}
}
