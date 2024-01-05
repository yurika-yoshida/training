package chapter12;

import lib.Input;

public class Pass12_02 {
	/*
	 * 12章通過テスト2
	 * 文字列がnullあるいは空文字の場合true、そうでなければfalse を返すisEmptyメソッドを作成
	 * mainメソッドではキーボードをタイプしStringの値を入力、isEmptyでチェック
	 * 結果は例示の通りに表示する
	 */
	// 文字列string  結果result

	public static void main(String[] args) {
		String string = Input.getString("テストする文字列");
		//isEmpty  trueなら空、falseなら空じゃない
		String result = isEmpty(string) ? "nullまたは空" : "nullでも空でもない";

		System.out.println(result);
	}

	public static boolean isEmpty(String str) {
		return str == null || str == ""; // nullか空白
	}
}