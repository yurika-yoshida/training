package chapter6;

public class Ex06_03_2 {

	public static void main(String[] args) {
		// for文を使ってすべての要素を表示するプログラムの作成
		double[] a = { 1.5, 2.3, 0.6, 3.3, 9.0 };

		for (int i = 0; i < a.length; i++) {
			System.out.println("a[" + i + "] = " + a[i]);
		}
	}

}
