import lib.Input;

public class Pass05_03 {

	public static void main(String[] args) {
		/*
		5章通過テスト3
		a,b,cはキーボード入力
		(1) = a2乗 + b2乗 - 2c
		(2) = √a + √b + 3c
		*/

		double a = Input.getDouble();
		double b = Input.getDouble();
		double c = Input.getDouble();
		System.out.println("(1)=" + (Math.pow(a, 2) + Math.pow(b, 2) - 2 * c));
		System.out.println("(2)=" + (Math.sqrt(a) + Math.sqrt(b) + 3 * c));
	}
}
