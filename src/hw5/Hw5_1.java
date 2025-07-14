package hw5;

import java.util.Scanner;
/**
 * 請設計一個方法為starSquare(int width, int height)，當使用者鍵盤輸入寬與高時，即會印出對應的*長方形，如 圖
 */
public class Hw5_1 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("請輸入寬度：");
			int width = sc.nextInt();
			System.out.print("請輸入高度：");
			int height = sc.nextInt();
			Drawable shape = new StarSquare(width, height);
			shape.draw();
		}

	}
}
