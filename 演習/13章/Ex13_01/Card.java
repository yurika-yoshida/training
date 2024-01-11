package Ex13_01;

//練習問題13-1
//トランプのカードを表すCardクラス（フィールドだけ）
public class Card {
	String suit;
	int number;

	//練習問題13-4
	// フィールド変数をコンソールに表示するdispメソッド
	public void disp() {
		System.out.println("種類 = " + suit);
		System.out.println("番号 = " + number);
	}

}