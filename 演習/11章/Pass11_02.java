package chapter11;

public class Pass11_02 {

	public static void main(String[] args) {
		/*
		 * 11章通過テスト2
		 *配列を宣言、拡張for文を使ってvalの要素を一つずつ取り出しその平方根を表示
		 *要素の値が負であれば「負の値です」と表示、continue文を使い計算処理だけキャンセル
		 */
		int[] val = { 10, -12, 5, -12, 12, 25 };
		for (int value : val) {
			if (value < 0) {
				System.out.println("負の値です");
				continue;
			}
			System.out.println(Math.sqrt(value));
		}
	}
}
