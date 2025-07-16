package hw3;

import java.util.Arrays;
import java.util.Scanner;

import common.Result;
/**
 * 三角形判別程式：使用者輸入三個整數邊長後，判斷其屬性（正三角形、等腰、直角、其他或不是三角形）
 */
public class Hw3_1 {
	// class ShapeChecker
	/**
	 * • 請設計一隻程式,使用者輸入三個數字後,輸出結果會為正三角形、等腰 三角形、其它三角形或不是三角形,如圖示結果:
	 * 
	 * (提示:Scanner,三角形成立條件,判斷式if else) (進階功能:加入直角三角形的判斷)
	 */
	public static void main(String[] args) {
		startTriangle();
	}
	/**
	 * 執行三角形邊長輸入與屬性判斷流程，並輸出結果
	 */
	public static void startTriangle() {
		Result<int[], String> result = readTriSides();

		if (result.isOk()) {
			int[] sides = result.getOk();
			String type = triangleChecker(sides[0], sides[1], sides[2]);
			System.out.println("判斷結果：" + type);
		} else {
			System.out.println("輸入失敗：" + result.getErr());
		}
	}
	/**
	 * 提示使用者輸入單一正整數（代表邊長），若格式錯誤或非正整數則回傳錯誤
	 * 
	 * @param label
	 *            提示文字（例如「第一」、「第二」）
	 * @param sc
	 *            Scanner 物件，負責讀取使用者輸入
	 * @return 包含成功數值或錯誤訊息的 Result<Integer, String>
	 */
	private static Result<Integer, String> readPositiveInt(String label,
			Scanner sc) {
		System.out.print("請輸入" + label + "個邊長：");

		if (!sc.hasNextInt()) {
			String wrong = sc.next(); // 清除錯誤輸入
			return Result.err("輸入錯誤：「" + wrong + "」不是整數！");
		}

		int input = sc.nextInt();
		if (input <= 0) {
			return Result.err("輸入錯誤：「" + input + "」不是正數！");
		}

		return Result.ok(input);
	}
	/**
	 * 要求使用者依序輸入三角形三邊（正整數），進行基本格式驗證
	 * 
	 * @return 三邊整數陣列（長度為3）或錯誤訊息
	 */
	private static Result<int[], String> readTriSides() {
		try (Scanner sc = new Scanner(System.in)) {
			int[] triSides = new int[3];
			String[] labels = {"第一", "第二", "第三"};

			for (int i = 0; i < 3; i++) {
				Result<Integer, String> inputResult = readPositiveInt(labels[i],
						sc);
				if (!inputResult.isOk()) {
					return Result.err(inputResult.getErr());
				}
				triSides[i] = inputResult.getOk();
			}
			return Result.ok(triSides);
		}
	}
	/**
	 * 判斷輸入的三邊是否構成三角形，並分類
	 * 
	 * @param a
	 *            第一邊長
	 * @param b
	 *            第二邊長
	 * @param c
	 *            第三邊長
	 * @return 判斷結果字串
	 */
	public static String triangleChecker(int a, int b, int c) {
		// 排序三邊：讓 a <= b <= c
		int[] sides = {a, b, c};
		Arrays.sort(sides);
		a = sides[0];
		b = sides[1];
		c = sides[2];
		// 判斷是否為三角形
		if (a + b <= c) {
			return "不是三角形";
		}
		// 正三角形
		if (a == b && b == c) {
			return "正三角形";
		}
		// 等腰三角形（兩邊相等）
		if (a == b || b == c) {
			return "等腰三角形";
		}
		// 直角三角形：a² + b² = c²
		if (a * a + b * b == c * c) {
			return "直角三角形";
		}
		// 其他三角形
		return "其他三角形";
	}
}
