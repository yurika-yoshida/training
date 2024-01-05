package chapter11;

public class Pass11_03 {

	public static void main(String[] args) {
		/*
		 * 11章通過テスト3
		 *次のプログラムを実行するとき正しいものはどれか　選択問題
		 *（１）B. 012  （２）C. 012
		 */
		// （１）
		int num = 0;
		while (num < 5) {
			if (num == 3) {
				break;
			}
			System.out.print(num++);
		}
		
		// （２）flagを2つ連続して書いてもエラーは出ない
		flag1: flag2: while (true) {
			for (int i = 0; i < 5; i++) {
				if (i == 3)
					break flag1;
				System.out.print(i);
			}
		}
	}
}
