package pass15_01;

public class Exec {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Dice dice1 = new Dice(6, "黒");
		Dice dice2 = new Dice(dice1.getVal(), dice1.getColor());

		dice2.play();

		System.out.println("doce1 = (" + dice1.getVal() + ", " + dice1.getColor() + ")");
		System.out.println("doce2 = (" + dice2.getVal() + ", " + dice2.getColor() + ")");
	}

}