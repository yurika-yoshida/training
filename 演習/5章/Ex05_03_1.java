import lib.Input;

public class Ex05_03_1 {

	public static void main(String[] args) {
		//キーボードをタイプしてオリンピック開催までの年数(int)を入力
		//それを埋め込んで"オリンピックまであと●年"と表示

		int year = Input.getInt();

		System.out.println("オリンピックまであと" + year + "年");

	}

}
