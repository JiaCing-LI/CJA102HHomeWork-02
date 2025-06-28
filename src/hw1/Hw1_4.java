package hw1;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * 請定義一個常數為3.1415(圓周率)，並計算半徑為5的圓面積與圓周長
 */
public class Hw1_4 {

	public static void main(String[] args) {

		// === double 計算版本 ===
		final double PI = 3.1415;// 圓周率常數
		int radius = 5;// 半徑

		// 使用 double 計算
		printByDouble(PI, radius);

		// 使用 BigDecimal 精準計算
		printByBigDecimal("3.1415", "5");
	}

	public static void printByDouble(double pi, double radius) {
		double circumference = pi * radius * 2;// 圓周長
		double areaOfCircle = pi * radius * radius;// 圓面積
		System.out.printf("圓周長為: %.4f\n", circumference);// 印出圓周長並取到第四位
		System.out.printf("圓面積為: %.4f\n", areaOfCircle);// 印出圓面積並取到第四位
	}

	public static void printByBigDecimal(String piText, String radiusText) {
		System.out.println("=====BigDecimal 精準版本====");

		// BigDecimal 精準版本
		BigDecimal radiusBD = new BigDecimal(piText);
		BigDecimal piBD = new BigDecimal(radiusText);

		// 計算圓周長：2 × pi × r, BigDecimal 的乘法方法:multiply();
		BigDecimal circumferenceBD = piBD.multiply(radiusBD).multiply(new BigDecimal("2"));

		// 園面積 =pi * r * r,
		BigDecimal areaBD = piBD.multiply(radiusBD).multiply(radiusBD);
		// 印出 BigDecimal 結果（四捨五入至小數第 4 位）
		// setscale(int ,RoundingMode)方法 (第幾位,捨入模式) (4,四捨五入)
		System.out.println("圓周長為:" + circumferenceBD.setScale(4, RoundingMode.HALF_UP));
		System.out.println("圓面積為:" + areaBD.setScale(4, RoundingMode.HALF_UP));
	}
}
