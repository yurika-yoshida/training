package chapter6;

public class Ex06_01_2 {

	public static void main(String[] args) {
		// d1,d2,d3の値はそれぞれいくつか
		double[] date = { 1.1, 2.2, 3.3 };
		double d1, d2, d3;
		d1 = date[0] + date[1];
		d2 = date[2] / date[0];
		d3 = (date[0] + date[1] + date[2]) / 3;

		System.out.println("d1=" + d1);
		System.out.println("d2=" + d2);
		System.out.println("d3=" + d3);
	}

}
