package chapter11;

import lib.Input;

public class Pass11_01 {

	public static void main(String[] args) {
		/*
		 * 11章通過テスト1
		 * 商品の価格が商品コードにより決められている
		 * キーボードをタイプし商品の数量と商品コードを入力、合計金額を計算し表示
		 * switch文指定
		 */
		// 価格price 数量quantity 商品コードproductCode 

		int quantity = Input.getInt("商品の数量");
		String productCode = Input.getString("商品コード");
		int price;
		switch (productCode) {
		case "a100":
		case "b100":
			price = 100;
			break;
		case "a110":
		case "b110":
		case "b120":
			price = 200;
			break;
		case "c100":
		case "c110":
			price = 300;
			break;
		case "d100":
			price = 400;
			break;
		default:
			price = 500;
			break;
		}
		System.out.println("合計金額=" + quantity * price + "円");
	}

}
