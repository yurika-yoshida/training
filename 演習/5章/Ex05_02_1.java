
public class Ex05_02_1 {

	public static void main(String[] args) {
		//a=30.51 b=2.68
		double a = 30.51;
		double b = 2.68;

		//(1)a/bを四捨五入した値を表示
		System.out.println(Math.round(a / b));

		//(2)aのb乗を計算し表示
		System.out.println(Math.pow(a, b));

		//(3)aとbの小さい方を表示
		System.out.println(Math.min(a, b));

		//(4)aの平方根とbの平方根の合計を計算し表示
		System.out.println(Math.sqrt(a) + Math.sqrt(b));

		//(5)乱数を2つ求めて表示
		System.out.println(Math.random() + "、" + Math.random());
	}
}
