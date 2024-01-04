public class Ex05_02_2 {
	public static void main(String[] args) {
		//次の乱数を表示するプログラムを作成

		//（1）0以上6未満の乱数x を1つ表示
		double x = Math.random() * 6;
		System.out.println(Math.round(x * 10.0) / 10.0);

		//（2）上記をint型にキャストして0,1,…5の整数乱数を表示
		int y = (int) x;
		System.out.println(y);

		//（3）上記の乱数に1を足して1,2,…6の整数乱数を表示
		y = y + 1;
		System.out.println(y);
	}

}
