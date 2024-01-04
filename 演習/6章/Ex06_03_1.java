package chapter6;

public class Ex06_03_1 {

	public static void main(String[] args) {
		// for文を使ってすべての要素を表示するプログラムの作成		
		String[] s = { "田中宏", "田口靖子", "前田勉", "前原史江" };

		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}
	}

}
