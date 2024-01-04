package chapter6;

public class Ex06_03_3 {

	public static void main(String[] args) {
		// for文を使って各要素を10倍した値を表示するプログラムの作成
		int[] n = { 5, 7, 9, 4, 8 };

		for (int i = 0; i < n.length; i++) {
			System.out.print(n[i] * 10 + "\t");
		}
	}

}
