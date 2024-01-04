package chapter7;

public class Ex07_02_1 {

	public static void main(String[] args) {
		// (1)～(3)を一つのプログラムとして各処理を順に作成

		// (1)配列valを作成しすべての要素をコンソールに表示
		double[] val = { 180.2, 175.5, 164.0, 168.5, 178.0 };
		for (int i = 0; i < val.length; i++) {
			System.out.println(val[i]);
		}

		// (2)valの配列要素の平均値を計算し、変数meanに入れる
		double total = 0;
		for (int i = 0; i < val.length; i++) {
			total += val[i];
		}
		double mean = total / val.length;

		//  (3)すべての要素について、(val[i]-mean)2乗を計算し表示
		for (int i = 0; i < val.length; i++) {
			System.out.println(Math.pow(val[i] - mean, 2));
		}
	}
}
