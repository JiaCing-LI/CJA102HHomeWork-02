package hw6;

import java.util.Scanner;

/**
 * 請加入例外處理機制,讓程式能解決以下狀況: 
 * 1. x與y同時為0,(產生自訂的CalException例外物件)
 * 2.y為負值,而導致x的y次方結果不為整數 
 * 3. x與y皆正確情況下,會顯示運算後結果
 * 在Calculator.java裡有個自訂 方法為powerXY(int x, int y),
 * 功能是會計算x的y次方並回傳結果。
 */
public class Calculator {
	public Calculator() {
	}
	public int powerXY(int x, int y) throws CalException {
		if (x == 0 && y == 0) {
			throw new CalException("0 的 0 次方沒有定義！");
		}
		if (y < 0) {
			throw new CalException("次方為負數，結果回傳不為整數！");
		}
		return (int) Math.pow(x, y);
	}
	public static int readInt(Scanner sc, String prompt) {
		while (true) {
			System.out.print(prompt);
			if (sc.hasNextInt()) {
				return sc.nextInt();
			} else {
				System.out.println("輸入格式不正確");
				sc.next(); // 清除錯誤輸入
			}
		}
	}
}
