import lib.Input;

public class Ex05_03_2 {

	public static void main(String[] args) {
		// キーボードをタイプしてdoubleの値2つを入力 （xとy）
		// x3乗 * y3乗を計算、表示するプログラム

		double x = Input.getDouble("[xの値]");
		double y = Input.getDouble("[yの値]");
		double answer = Math.pow(x, 3) / Math.pow(y, 3);

		System.out.println("Math.pow(x, 3) ÷ Math.pow(y, 3)=" + Math.round(answer * 1000.0) / 1000.0);
	}

}