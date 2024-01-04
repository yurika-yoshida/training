package chapter9;

import lib.Input;

public class Pass09_01 {

	public static void main(String[] args) {
		/*
		 * 9章通過テスト1
		 * キーボードをタイプし文字列を繰り返し入力
		 * 毎回、文字列の長さ(文字数)と文字列を表示
		 * nullで終了
		 */
		String x;
		while ((x = Input.getString()) != null) {
			System.out.print("<" + x.length() + ">");
			System.out.println(x);
		}
	}

}
