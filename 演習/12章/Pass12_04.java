package chapter12;

import lib.Input;

public class Pass12_04 {
	/*
	 * 12章通過テスト4
	 * 送料を計算するクラス
	 * isOkメソッド
	 * 	・荷物の3辺の長さを仮引数に受け取り、合計が180を超えていないか検査
	 * 	・180以上ならtrue
	 * ryokinメソッド
	 * 	・荷物の3辺の長さ、また荷物の重さを仮引数に受け取り、料金を計算
	 * mainメソッド
	 * 	・指定のSPDのように作成
	 */
	public static void main(String[] args) {
		double height = Input.getDouble("縦(cm)");
		double width = Input.getDouble("横(cm)");
		double depth = Input.getDouble("厚さ(cm)");

		//180cm以下(true)なら送料を表示、180より大きければサイズオーバーと表示
		if (isOk(height, width, depth)) {
			double weight = Input.getDouble("重さ(kg)");
			int price = ryokin(height, width, depth, weight);
			System.out.println("送料：" + price + "円");
		} else {
			System.out.println("サイズオーバー");
		}
	}

	//true か false を返す
	public static boolean isOk(double height, double width, double depth) {
		return height + width + depth <= 180;
	}

	//送料を計算し返す
	public static int ryokin(double height, double width, double depth, double weight) {
		int price = 0;
		double length = height + width + depth;

		if (length <= 90) {
			if (weight <= 5) {
				price = 500;
			} else if (weight <= 10) {
				price = 1000;
			} else {
				price = 1500;
			}
		} else {
			if (weight <= 5) {
				price = 1000;
			} else if (weight <= 10) {
				price = 2000;
			} else {
				price = 3000;
			}
		}
		return price;
	}

}
