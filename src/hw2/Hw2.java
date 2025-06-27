package hw2;
//• 請設計一隻Java程式,計算1~1000的偶數和 (2+4+6+8+...+1000)
//• 請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用for迴圈)
//• 請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用while迴圈)
//• 請設計一隻Java程式,輸出結果為以下:
//1 4 9 16 25 36 49 64 81 100
//• 阿文很熱衷大樂透 (1 ~ 49),但他不喜歡有4的數字,不論是個位數或是十位數。請設計一隻程式,
//輸出結果為阿文可以選擇的數字有哪些?總共有幾個?
//• 請設計一隻Java程式,輸出結果為以下:
//1 2 3 4 5 6 7 8 9 10
//1 2 3 4 5 6 7 8 9
//1 2 3 4 5 6 7 8
//1 2 3 4 5 6 7
//1 2 3 4 5 6
//1 2 3 4 5
//1 2 3 4
//1 2 3
//1 2
//1
//• 請設計一隻Java程式,輸出結果為以下:
//A
//BB
//CCC
//DDDD
//EEEEE
//FFFFFF
public class Hw2 {
	public static void main(String[] args) {
		// • 請設計一隻Java程式,計算1~1000的偶數和 (2+4+6+8+...+1000)
		int sum1 = 0;
		for (int i = 0; i <= 1000; i = i + 2) {
			sum1 += i;
		}
		System.out.println("1~1000的偶數和:" + sum1);
		// • 請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用for迴圈)
		int sum2 = 1;
		for (int i = 1; i <= 10; i++) {
			sum2 = i * sum2;
		}
		System.out.println("1~10的乘積和(for):" + sum2);
		// 請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用while迴圈)
		int j = 1, sum3 = 0;
		while (j <= 10) {
			sum3 = j * sum3;
			j++;
		}
		System.out.println("1~10的乘積和(while):" + sum3);
		// • 請設計一隻Java程式,輸出結果為以下:
		// 1 4 9 16 25 36 49 64 81 100
		int i = 1;
		// while 迴圈印出 1~10 的平方
		while (i <= 10) {
			System.out.print((i * i) + " ");
			i++;
		}
		System.out.println();
//		阿文很熱衷大樂透 (1 ~ 49),但他不喜歡有4的數字,不論是個位數或是十位數。請設計一隻程式,
//		輸出結果為阿文可以選擇的數字有哪些?總共有幾個?
		int count = 0;
		System.out.println("阿文可以選擇的數字有：");
		for (int k = 1; k <= 49; k++) {
			int tens = k / 10; // 取得十位數
			int units = k % 10; // 取得個位數
			if (tens == 4 || units == 4) {
				continue; // 有 4 的數字就跳過
			}

			System.out.print(k + " ");
			count++;
		}

		System.out.println("\n總共有 " + count + " 個數字可以選擇。");

//		請設計一隻Java程式,輸出結果為以下:
//			1 2 3 4 5 6 7 8 9 10
//			1 2 3 4 5 6 7 8 9
//			1 2 3 4 5 6 7 8
//			1 2 3 4 5 6 7
//			1 2 3 4 5 6
//			1 2 3 4 5
//			1 2 3 4
//			1 2 3
//			1 2
//			1
		// 每列遞減輸出：第一列印 1~10，最後一列印 1
		for (int i1 = 10; i1 >= 1; i1--) { // (y軸)外層控制列數（從10列遞減）
			for (int j1 = 1; j1 <= i1; j1++) {// (X軸)內層控制每列要印的數字
				System.out.print(j1 + " ");
			}
			System.out.println();
		}
//		• 請設計一隻Java程式,輸出結果為以下:
//			A
//			BB
//			CCC
//			DDDD
//			EEEEE
//			FFFFFF
		// 每列印出對應英文字母，列數 +1 就多印一次
		for (int i2 = 0; i2 <= 5; i2++) {
			char ch = (char) ('A' + i2); // 將整數轉為對應字母
			for (int j2 = 0; j2 <= i2; j2++) {
				System.out.print(ch);
			}
			System.out.println();
		}

	}
}
