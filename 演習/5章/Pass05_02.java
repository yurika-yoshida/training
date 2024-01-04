import lib.Input;

public class Pass05_02 {

	public static void main(String[] args) {
		//5章通過テスト2
		// 2x2乗 + 3x -5 =0の解を求める

		double a, b, c;
		a = Input.getDouble(); //2.0を代入
		b = Input.getDouble(); //3.0を代入
		c = Input.getDouble(); //-5.0を代入

		double d, sq, ans1, ans2;

		d = Math.pow(b, 2) - 4 * a * c;
		sq = Math.sqrt(d);
		ans1 = (-b + sq) / (2 * a);
		ans2 = (-b - sq) / (2 * a);

		System.out.println("解1=" + ans1);
		System.out.println("解1=" + ans2);
	}
}