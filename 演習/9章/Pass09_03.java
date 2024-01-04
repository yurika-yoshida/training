package chapter9;

import lib.Input;

public class Pass09_03 {

	public static void main(String[] args) {
		/*
		 * 9章通過テスト3
		 * do-while文を使って毎回1つの乱数を画面に表示
		 * 0を入力(Enterキーだけでも0を入力)すると終了し
		 */
		int x;
		do {
			System.out.println(Math.random()); //乱数
			x = Input.getInt();
		} while (x != 0);
	}

}
