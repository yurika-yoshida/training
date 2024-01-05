package chapter10;

import lib.Input;

public class Pass10_02 {

	public static void main(String[] args) {
		/*
		 * 10章通過テスト2
		 * 走行距離(km)で入力すると送料を算出する
		 */
		int distance = 0; // 距離
		int price = 0; // 料金

		distance = Input.getInt("距離");
		if (distance < 50) {
			price = 300;
		} else if (distance < 100) {
			price = 500;
		} else if (distance < 500) {
			price = 700;
		} else if (distance >= 500) {
			price = 1000;
		}
		System.out.println("送料：" + price + "円");
	}

}
