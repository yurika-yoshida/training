package chapter10;

import lib.Input;

public class Pass10_03 {

	public static void main(String[] args) {
		/*
		 * 10章通過テスト3
		 * while文で繰り返し月を入力、対応する季節を
		 * 1~12以外が入力されたら？と表示
		 * 0を入力すると終了
		 */

		int month; // 月
		String season; // 季節

		System.out.println("月を入力してください([0]入力で終了)");

		while ((month = Input.getInt("月")) != 0) {
			if (month <= 2 || month == 12) {
				season = "冬";
			} else if (month <= 5) {
				season = "春";
			} else if (month <= 8) {
				season = "夏";
			} else if (month <= 11) {
				season = "秋";
			} else {
				season = "?";
			}
			System.out.println("季節：" + season);
		}
	}

}
