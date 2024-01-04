package chapter7;

public class Pass07_03 {

	public static void main(String[] args) {
		/*
		 * 7章通過テスト3
		 * 出力結果を参考に空欄A,Bを埋める
		 * 結果＝ 987654321
		 */

		int[] n = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		for (int i = n.length - 1; i >= 0; i--) {
			System.out.print(n[i]);
		}
	}

}
