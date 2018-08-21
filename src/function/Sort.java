package function;

import java.util.ArrayList;
import java.util.List;

public class Sort {
	public static void main(String[] args) {
		Sort sort = new Sort();
		List<Integer> array = new ArrayList<Integer>(10);
		array.add(2);
		array.add(5);
		array.add(3);
		array.add(1);
		array.add(4);
		array.add(1);

		// System.out.println(sort.bubbleSort(array));
		System.out.println(sort.selectSort(array));
	}

	/*
	 * 冒泡排序 O(n2)
	 * 
	 */
	public List<Integer> bubbleSort(List<Integer> array) {
		int size = array.size();
		for (int i = size - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if ((Integer) array.get(j) > (Integer) array.get(j + 1)) {
					int k = array.get(j + 1);
					array.set(j + 1, array.get(j));
					array.set(j, k);

				}
			}
		}
		return array;

	}

	/*
	 * 直接选择排序 O(n2)
	 */
	public List<Integer> selectSort(List<Integer> array) {
		int size = array.size();

		int location = 0;
		for (int i = size; i > 0; i--) {
			int max = array.get(0);
			for (int j = 0; j < i; j++) {
				if (array.get(j) > max) {
					max = array.get(j);
					location = j;
				}

			}
			System.out.println(array);
			array.set(location, array.get(i - 1));
			array.set(i - 1, max);

		}
		return array;
	}

	/*
	 * 二分排序
	 */
	public List<String> diviceSort(List<String> array) {

		return array;

	}
}
