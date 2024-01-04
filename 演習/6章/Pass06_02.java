package chapter6;

import lib.Input;

public class Pass06_02 {

	public static void main(String[] args) {
		/*
		6章通過テスト1 = 選択問題回答 E
		
		6章通過テスト2
		SPDにしたがってプログラム作成
		 */

		// startと表示
		System.out.println("start");

		// int型の変数mとnを宣言
		int m, n;

		// for文3回繰り替えす
		for (int i = 0; i < 3; i++) {
			m = Input.getInt();
			n = Input.getInt();
			System.out.println(n + "÷" + m + "の余りは [" + n % m + "]");
		}
		// endと表示
		System.out.println("end");
	}

}
