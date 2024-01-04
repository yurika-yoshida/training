package chapter6;

public class Pass06_04 {

	public static void main(String[] args) {
		/*
		6章通過テスト4
		SPDを参考にプログラム作成
		int型の配列 n1, n2をfor文を使って対応する要素を合計し指定の形式で表示
		 */

		// intの変数keiを宣言
		int kei;

		// 配列 n1, n2を作成 
		int[] n1 = { 12, 11, 31, 51, 72 };
		int[] n2 = { 26, 14, 12, 22, 12 };

		// for文5回繰り返す
		for (int i = 0; i < 5; i++) {
			kei = n1[i] + n2[i];
			System.out.println("n1[" + i + "]+" + "n2[" + i + "]=" + kei);
		}

	}

}
