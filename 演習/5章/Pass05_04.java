import lib.Input;

public class Pass05_04 {

	public static void main(String[] args) {
		/*
		5章通過テスト4
		(1) キーボードタイプで半角英字を含む、10文字以内の任意の文字列をstr1に入力
		(2) str1 の長さを変数nに代入 
		(3) str1 に含まれる英字を大文字に変えたstr2を作成
		(4) str1の先頭から5文字を取り出してstr3に代入
		(5) n,str1,str2,str3を表示
		 */

		//(1)
		String str1 = Input.getString();
		//(2)
		int n = str1.length();
		//(3)
		String str2 = str1.toUpperCase();
		//(4)
		String str3 = str1.substring(0, 5);
		//(5)
		System.out.println("str1 =" + str1);
		System.out.println("n =" + n);
		System.out.println("str2 =" + str2);
		System.out.println("str3 =" + str3);
	}
}
