package hw3;

import java.util.Scanner;
/**
 * 阿文很喜歡簽大樂透(1~49),但他是個善變的人,上次討厭數字是4,但這次他想要依心情決定討
 * 厭哪個數字,請您設計一隻程式,讓阿文可以輸入他不想要的數字(1~9),畫面會顯示他可以選擇 的號碼與總數
 */
public class Hw3_3 {
	// 進階題未寫
	static Scanner sc = new Scanner(System.in); // 全域共用只建一次
	/**
	 * 主程式進入點
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		LottoFilter();
		sc.close();
	}
	public static void LottoFilter() {
		int hate = getHateNum(); // 1~9
		printAvailableNum(hate);
		getRandomNum(hate);
	}
	/**
	 * 取得使用者輸入的數字
	 * 
	 * @return 使用者討厭的數字(0~9)
	 */
	public static int getHateNum() {
		int hate = 0;
		System.out.print("阿文...請輸入你討厭哪個數字?(1~9)：");
		while (true) {
			if (sc.hasNextInt()) {
				hate = sc.nextInt();
				if (hate >= 1 && hate <= 9) {
					break;
				} else {
					System.out.print("請輸入(0~9)的整數：");
				}
			} else {
				System.out.print("請輸入有效整數：");
				sc.next(); // 清除錯誤輸入
			}
		}
		System.out.println("你討厭的數字是：" + hate);
		return hate;
	}
	/**
	 * 印出排除討厭的數字 並且以6個一列為清單印出
	 * 
	 * @param hate
	 *            你討厭的數字
	 */
	public static void printAvailableNum(int hate) {
		int count = 0;
		for (int k = 1; k <= 49; k++) {
			int tens = k / 10; // 取得十位數
			int units = k % 10; // 取得個位數
			if (tens == hate || units == hate) {
				continue; // 有 4 的數字就跳過
			}
			System.out.printf("%2d ", k);
			count++;
			if (count % 6 == 0) {
				System.out.println(); // 每 6 個數字換行
			}
		}
		System.out.printf("總共有 %d 個數字可選%n", count);
	}
	/**
	 * (進階挑戰:輸入不要的數字後,直接亂數印出6個號碼且不得重複)
	 */
	public static void getRandomNum(int hate) {
		boolean[] used = new boolean[50]; // 1~49
		int count = 0;
		System.out.println("隨機6組數字:");
		while (count < 6) {
			int n = (int) (Math.random() * 49) + 1; // 1~49
			int tens = n / 10;
			int units = n % 10;

			if ((tens == hate || units == hate) || used[n]) {
				continue; // 跳過討厭數字或已抽過號碼
			}

			System.out.printf("%2d ", n);
			used[n] = true;
			count++;
		}
		System.out.println();
	}
}