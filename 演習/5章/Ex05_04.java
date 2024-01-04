
public class Ex05_04 {

	public static void main(String[] args) {
		/* String str1 = "http://localhost:8080/index.html";について
		（1）replaceメソッドを使ってstr1の"localhost"を"k-webs.jp"に置き換えた文字列str2を作る
		（2）substringメソッドを使って、str2の「k-webs.jp:8080」の部分を抜き出した文字列str3を作る
		（3）toUpperCaceメソッドを使ってstr3を大文字変換した文字列str4を作る
		（4）str1～str4を出力		
		*/

		String str1 = "http://localhost:8080/index.html";

		//(1)
		String str2 = str1.replace("localhost", "k-webs.jp");

		//(2)
		String str3 = str2.substring(7, 21);
		//(3)
		String str4 = str3.toUpperCase();

		//(4)出力
		System.out.println("str1 = " + str1);
		System.out.println("str2 = " + str2);
		System.out.println("str3 = " + str3);
		System.out.println("str4 = " + str4);

	}

}
