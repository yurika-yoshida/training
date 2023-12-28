
public class Java {

	public static void main(String[] args) {

		/*
		 * 「Java入門」3商p135練習問題3-3 条件分岐と繰り返し
		 * isHungryには0か1を代入しておく
		 *  0ならお腹がいっぱい、違うならはらぺこ
		 *  1ならから揚げ食べる
		 */
		int isHungry = 1;
		String food = "からあげ";

		System.out.println("こんにちは");

		if (isHungry == 0) {
			System.out.println("お腹がいっぱいです");
		} else {
			System.out.println("はらぺこです");
		}
		if (isHungry == 1) {
			System.out.println(food + "をいただきます");
		}
		System.out.println("ご馳走様でした！");

		/*
		 * 「Java入門」4商p176練習問題4-2 配列
		 *  3つの口座番号を格納、配列の要素を1つずつfor文で取り出し表示
		 *  同じ配列の要素を拡張for文で1つずつ取り出し表示
		 */
		int[] moneyList = { 121902, 8302, 55100 };
		for (int n = 0; n < moneyList.length; n++) {
			System.out.println(moneyList[n]);
		}
		for (int i : moneyList) {
			System.out.println(i);
		}
	}

}
