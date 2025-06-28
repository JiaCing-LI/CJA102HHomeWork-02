package hw1;

/**
 * 請寫一隻程式，利用System.out.println()印出以下三個運算式結果： 5 + 5 5 + ‘5’ 5 + “5
 */
public class Hw1_6 {

	public static void main(String[] args) {
		// 整數加法
		// 結果：10（int）
		System.out.println(5 + 5);

		// 字元與整數加法
		// '5' 為 char，其 Unicode 編碼為 53（可用 (int)'5' 檢查）
		// 5 + 53 = 58
		// 結果：58（int）
		System.out.println(5 + '5');

		// 字串與整數加法（字串串接
		// "5" 為 String，5 為 int，遇到字串 + 任意型別 → 皆轉為字串串接
		// 結果："55"（String）
		System.out.println(5 + "5");
	}

}
