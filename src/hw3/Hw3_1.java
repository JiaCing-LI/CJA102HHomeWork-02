package hw3;

import java.util.Scanner;

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

	public static void startTriangle() {
		int[] trisides = readTriSides();
		triangleChecker(trisides[0], trisides[1], trisides[2]);
	}
	/**
	 * 讀取三個邊長輸入
	 * 
	 * @return 輸入的三邊長 int[]
	 */
	public static int[] readTriSides() {// 未防呆
		Scanner userinput = new Scanner(System.in);
		int[] triSides = new int[3];
		System.out.print("請輸入第一個邊長：");
		triSides[0] = userinput.nextInt();

		System.out.print("請輸入第二個邊長：");
		triSides[1] = userinput.nextInt();

		System.out.print("請輸入第三個邊長：");
		triSides[2] = userinput.nextInt();
		userinput.close();
		return triSides;
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
	 */
	public static void triangleChecker(int a, int b, int c) {
		// 檢查是否為三角形 //精簡版本未做
		if (a + b > c && a + c > b && b + c > a) {
			// 判斷是否為正三角形
			if (a == b && b == c) {
				System.out.println("正三角形");
			}
			// 判斷是否為等邀三角形
			else if (a == b || b == c || a == c) {
				System.out.println("等腰三角形");
			}
			// 判斷是否為直角三角形（畢氏定理）
			else if (a * a + b * b == c * c || a * a + c * c == b * b
					|| b * b + c * c == a * a) {
				System.out.println("直角三角形");
			}
			// 其他三角形
			else {
				System.out.println("其他三角形");
			}
		} else {
			System.out.println("不是三角形");
		}
	}
}
