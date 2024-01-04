package chapter7;

public class Pass07_01 {

	public static void main(String[] args) {
		/*
		 * 7章通過テスト1
		 * 拡張for文を使って作成
		 * */
		double[] a = { 12.3, 13.5, 11.5, 13.0, 12.8, 12.5 };
		double total = 0;

		for (double b : a) {
			total += b;
		}
		System.out.println("合計＝" + total);
		System.out.println("平均＝" + total / a.length);

		for (double b : a) {
			System.out.print(b + "\t");
		}
	}

}
