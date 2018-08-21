package function;
/*
 * 有 n 瓶饮料，三个空瓶可再换一瓶，一共可以喝多少瓶？
 */

public class EmptyBottle {

	public void drink1(int n) {
		int exnum = 0; // 赠送饮料数

		int num = n; // num:接收输入的起始购买饮料数
		int knum = num; // knum:暂存初始饮料数
		while (num >= 3) {
			int temp = num / 3; // 不论这里输入的是否被3整除，答案都是送的饮料数目
			exnum += temp;
			num = (num % 3) + temp; // 这是第二轮饮料总数:第一轮剩下的加上第一轮送的之和
		}

		System.out.println(exnum + knum);

	}

	public int drink(int num) {
		int all = num;
		if (num < 3) {
			return num;
		} else {
			int temp = num / 3;
			int numb = num % 3 + temp;
			all = all + temp;
			drink(numb);
			return all;
		}

	}

	public static void main(String[] args) {
		EmptyBottle d = new EmptyBottle();
		int n = 101;
		d.drink1(n);
		System.out.println(d.drink(10));

	}

}
