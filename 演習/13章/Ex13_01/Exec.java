package Ex13_01;

//練習問題13-2
// Cardクラスからオブジェクトを作成
public class Exec {
	public static void main(String[] args) {
		Card card = new Card();

		//練習問題13-3
		// Cardオブジェクトのフィールド変数に値を代入
		card.suit = "スペード";
		card.number = 1;

		//練習問題13-4
		// フィールド変数をコンソールに表示するdispメソッド
		card.disp();
	}

}
