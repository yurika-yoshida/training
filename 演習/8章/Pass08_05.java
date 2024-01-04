package chapter8;

import lib.Input;

public class Pass08_05 {

	public static void main(String[] args) {
		/*
		 * 8章通過テスト5
		 * キーボード入力した文字列がnullであれば"null"
		 * そうでなければ入力した文字をそのまま表示する
		 */
		String str = Input.getString();
		System.out.println(str == null ? "null" : str);
	}

}
