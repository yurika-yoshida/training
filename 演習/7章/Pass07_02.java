package chapter7;

public class Pass07_02 {

	public static void main(String[] args) {
		/*
		 * 7章通過テスト2
		 * 成績データの空欄部分を(1)～(5)の指示に従って表示
		 */

		//(1)氏名のデータ作成
		String[] name = { "田中", "中村", "鈴木", "山本", "本田" };
		//(2)国語
		double[] kokugo = { 82, 85, 74, 90, 70 };
		//(3)英語
		double[] eigo = { 70, 74, 88, 74, 82 };
		//(4)国語平均の表示
		double kokugoAve = 0;
		for (double a : kokugo) {
			kokugoAve += a;
		}
		System.out.println("国語平均＝" + kokugoAve / kokugo.length);
		//(5)英語平均の表示
		double eigoAve = 0;
		for (double a : eigo) {
			eigoAve += a;
		}
		System.out.println("英語平均＝" + eigoAve / eigo.length);
		//(6)科目平均の表示
		System.out.println("科目平均＝" + (kokugoAve + eigoAve) / (kokugo.length + eigo.length));
		//(7)個人平均の表示
		for (int i = 0; i < name.length; i++) {
			System.out.println(name[i] + " : " + (kokugo[i] + eigo[i]) / 2);
		}
	}

}
