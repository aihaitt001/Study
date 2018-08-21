/**   
 * Copyright © 2018 www.lifeforfun.cn. All rights reserved.
 * 
 * @Package: function 
 * @author: ovo   
 * @date: 2018年8月14日 下午1:52:29 
 */
package function;

/**
 * @ClassName: KMPTest
 * @Description: 尝试实现KMP匹配 以及多关键字匹配问题
 * @author: ovo
 * @date: 2018年8月14日 下午1:52:29
 */
public class KMPTest {

	/**
	 * @Title: main
	 * @Description: TODO
	 * @param args
	 *            void
	 * @author ovo
	 * @date 2018年8月14日下午1:52:29
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abcdabcdabcdabcdabcdababcabcdabcde";
		String key = "abcde";
		System.out.println("kpm:" + KMP(str, key));
		System.out.println("baoli:" + Violent(str, key));
	}

	/**
	 * 
	 * @Title: KMP
	 * @Description: KMP匹配
	 * @param str
	 * @param key
	 * @return String
	 * @author ovo
	 * @date 2018年8月14日下午1:55:56
	 */
	public static int KMP(String str, String key) {
		int num = 0;
		int i = 0, j = 0;

		int[] next = getNext(key);
		char[] s = str.toCharArray();
		char[] k = key.toCharArray();
		while (i < s.length && j < key.length()) {
			num++;
			if (j == -1 || s[i] == k[j]) {
				// i = i - j + 1;
				i++;
				j++;
			} else {
				j = next[j];

			}
		}
		System.out.println("kmp比较" + num);

		if (j == k.length) {
			return i - j;
		} else {
			return -1;
		}

	}

	public static int[] getNext(String str) {
		int num = 0;
		char[] c = str.toCharArray();
		int[] next = new int[c.length];
		next[0] = -1;
		int j = 0;
		int k = -1;
		while (j < c.length - 1) {
			num++;
			if (k == -1 || c[j] == c[k]) {
				next[++j] = ++k;
			} else {
				k = next[k];
			}

		}
		System.out.println("getNext比较" + num);
		return next;
	}

	/**
	 * 
	 * @Title: Violent
	 * @Description: TODO 暴力依次寻找
	 * @param str
	 * @param key
	 * @return int
	 * @author ovo
	 * @date 2018年8月17日下午4:38:22
	 */

	public static int Violent(String str, String key) {
		int num = 0;
		int i = 0, j = 0;
		char[] s = str.toCharArray();
		char[] k = key.toCharArray();
		while (i < s.length && j < key.length()) {
			num++;

			if (s[i] == k[j]) {
				i++;
				j++;
			} else {
				i = i - j + 1;
				j = 0;

			}
		}
		System.out.println("暴力匹配比较" + num);
		if (j == k.length) {
			return i - j;
		} else {
			return -1;
		}

	}
}
