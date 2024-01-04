package chapter6;

public class Pass06_03 {

	public static void main(String[] args) {
		/*
		6章通過テスト3
		5人分の氏名、年齢、身長のデータを配列で表す
		これを1行が1人分のデータになるように出力
		 */
		String[] name = { "田中", "青木", "松田", "斉藤", "鈴木" };
		int[] year = { 22, 19, 24, 26, 18 };
		double[] height = { 175.5, 183.2, 170.5, 165.3, 185.0 };

		for (int i = 0; i < name.length; i++) {
			System.out.println(name[i] + "\t" + year[i] + "\t" + height[i]);
		}
	}

}
