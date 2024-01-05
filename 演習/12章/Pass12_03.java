package chapter12;

public class Pass12_03 {
	/*
	 * 12章通過テスト3
	 * 横棒グラフを描くクラスの作成
	 * graphメソッド
	 * 	・仮引数cntはint型の配列、グラフの各行で表示する"#"の個数が入っている
	 * 	・for文でcntの各要素を引数にdrowメソッドを呼び出してグラフを描写
	 * drowメソッド
	 * 	・仮引数dotsの数だけ"#"をprintで表示、dots個の"#"を表示したら改行
	 * mainメソッド
	 * 	・int型の配列dt = {5,7,9,14,7,4,2}を引数にしてgraph(dt)メソッドを呼ぶ
	 * 	・配列dtの要素にはグラフの各行で表示する"#"の個数が入っている
	 */

	public static void main(String[] args) {
		int[] dt = { 5, 7, 9, 14, 7, 4, 2 };
		graph(dt);
	}

	public static void graph(int[] cnt) {
		for (int i = 0; i < cnt.length; i++) {
			int dots = cnt[i];
			drow(dots);
		}
	}

	public static void drow(int dots) {
		for (int i = 0; i < dots; i++) {
			System.out.print("#");
		}
		System.out.println();
	}

}
