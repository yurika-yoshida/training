package pass15_01;

public class Dice {
	int val; //目数
	String color; //色

	//コンストラクタ
	//コンストラクタは初期値をセットしてオブジェクトを初期化してくれる
	public Dice(int val, String color) {
		this.val = val; //このオブジェクトのフィールド変数valに、（）内のval代入
		this.color = color;
	}

	public Dice() {
		this(1, "白");
	}

	public void play() {
		val = (int) (Math.random() * 6) + 1; //目数を変更
	}

	public int getVal() {
		return val;
	}

	public void setVal(int val) {
		this.val = val;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}