
public class Pass05_01 {

	public static void main(String[] args) {
		//5章通過テスト1
		double a = 21.3;
		double b = 11.5;

		//(1) a3乗とb5乗で大きい値をxに代入
		double x = Math.max(Math.pow(a, 3), Math.pow(b, 5));

		//(2) -a～aの範囲の乱数をyに代入
		double y = a * Math.random();

		//(3) (2a + b) / cの答えを四捨五入し、long zに代入
		double c = 2;
		long z = Math.round((2 * a + b) / c);

		System.out.println(x);
		System.out.println(y);
		System.out.println(z);

	}

}
