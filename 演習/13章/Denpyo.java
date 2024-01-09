/*　
 * 13章通過テスト1 オブジェクト
 *パッケージpass13_01 に Denpyoクラスを作成
 *4つのフィールド変数を持つ（日付、項目、単価、個数）
 *フィールド変数の値をコンソールに表示するメソッドdispを持つ
 *dospの形式 ⇒ 01-15 / パソコン / 50000 / 1
 */

package pass13_01;

public class Denpyo {
	String date; // 日付
	String item; // 項目
	int price; // 単価
	int number; // 個数

	public void disp() {
		System.out.println(date + " / " + item + " / " + price + " / " + number);
	}
}
