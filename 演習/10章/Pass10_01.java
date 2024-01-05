package chapter10;

import lib.Input;

public class Pass10_01 {
	public static void main(String[] args) {
		/*
		 * 10章通過テスト1
		 * キーボードをタイプして繰り返し英単語を入力、日本語訳を表示
		 * 指定の単語以外は？と表示
		 * nullで終了
		 */

		String e; // 英単語
		String j; // 日本語訳

		while ((e = Input.getString()) != null) {
			if (e.equals("dog")) {
				j = "いぬ";
			} else if (e.equals("cat")) {
				j = "ねこ";
			} else if (e.equals("mouse")) {
				j = "ねずみ";
			} else if (e.equals("rabbit")) {
				j = "うさぎ";
			} else {
				j = " ? ";
			}
			System.out.println("日本語訳：" + j);
		}

	}
}
