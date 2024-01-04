package chapter9;

import lib.Input;

public class Pass09_02 {

	public static void main(String[] args) {
		/*
		 * 9章通過テスト2
		 * キーボードをタイプし繰り返しdouble値を入力
		 * 0を入力(Enterキーだけでも0を入力)すると繰り返しを終了し
		 * 入力した値について合計、入力件数、平均を計算し出力
		 */
		// 入力x、合計total、件数count、平均(total/count)
		double x, total = 0;
		int count = 0;

		while (( x = Input.getDouble()) != 0) {
			total += x;
			count++;
		}
		
		System.out.println("合計＝" + total);
		System.out.println("件数＝" + count);
		System.out.println("平均＝" + total / count);
	}

}
