package chapter12;

import lib.Input;

public class Pass12_01 {
	/*
	 * 12章通過テスト1
	 * マイルの値を入力しキロメートルに変換して表示するプログラムを作成
	 * マイル、キロメートルの変換だけを行うmileToKmメソッドを作成
	 * mainメソッドでは入力したマイルの値をmileToKmで変換し表示
	 * 1マイルは1.609344
	 */

	public static void main(String[] args) {
		double mile = Input.getDouble("mile");
		System.out.println(mile + "マイル = " + mileToKm(mile) + "キロ");
	}

	public static double mileToKm(double mile) {
		return mile * 1.609344;
	}
}
