package chapter10;

public class Pass10_05 {
	public static void main(String[] args) {
		/*
		 * 10章通過テスト5
		 * 飲酒と喫煙に関する個人データ、発病危険度の表を元にプログラムを作成
		 */
		String[] name = { "田中", "前田", "鈴木", "中村", "田辺", "浦川", "島田", "岩田" };
		int[] drinking = { 7, 0, 3, 3, 2, 0, 0, 6 };
		int[] smoking = { 60, 10, 0, 20, 10, 0, 30, 0 };
		String risk = null; //発病危険度

		for (int i = 0; i < name.length; i++) {
			int d = drinking[i];
			int s = smoking[i];
			if (d == 0 && s == 0) {
				risk = "安全";
			} else if (d == 0 && s <= 20) {
				risk = "注意";
			} else if (d <= 3 && s == 0) {
				risk = "注意";
			} else if (d <= 3 && s <= 20) {
				risk = "要指導";
			} else {
				risk = "要検査";
			}
			String coment = String.format("%s (%d ,%3d)  %s", name[i], d, s, risk);
			System.out.println(coment);
		}
	}
}
