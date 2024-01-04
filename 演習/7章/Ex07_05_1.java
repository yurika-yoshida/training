package chapter7;

public class Ex07_05_1 {

	public static void main(String[] args) {
		// for文を拡張for文に書き換える
		/*
		String [] str = { "abc", "def", "ghi"};
		String ss = "";
		for ( int i = 0; i < str.length; i++) {
			ss += str[i];
		}
		System.out.println(ss);
		*/

		String[] str = { "abc", "def", "ghi" };
		String ss = "";
		for (String st : str) {
			ss += st;
		}
		System.out.println(ss);
	}

}
