/*
 * 練習問題 1 - 12
 * int 型の変数 x に任意の数値を代入し、
 * インクリメント演算子、デクリメント演算子を適用して
 * 結果を表示することにより演算子の効果を確認するプログラムを作成しなさい。
 */
public class KitaSoft1_12 {

	public static void main(String[] args) {
		int x = 10;
		x++;
		System.out.println("インクリメント演算子 : " + x);

		x = 10;
		x--;
		System.out.println("デクリメント演算子 : " + x);
	}

}
