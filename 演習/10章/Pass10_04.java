package chapter10;

public class Pass10_04 {

	public static void main(String[] args) {
		/*
		 * 10章通過テスト4
		 * 選択問題（１）解答：A.true  （２）解答：D.コンパイルエラー
		 */
		//（１）
		boolean b = false;
		if(b = true) { // bにtrueを代入 ==でなく=
			System.out.println("true");
		}else {
			System.out.println("false");
		}
	}

}
