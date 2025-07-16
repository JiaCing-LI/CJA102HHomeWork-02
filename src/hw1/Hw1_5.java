package hw1;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * 計算銀行複利：本金150萬，年利率2%，計算10年後本利和
 */
public class Hw1_5 {

	public static void main(String[] args) {
		double principal = 1_500_000; // 本金
		double rate = 0.02;           // 年利率
		int years = 10;               // 期數

		printByDouble(principal, rate, years);

		System.out.println("=====Bigdecimal精準版本========");
		printByBigDecimal(new BigDecimal("1500000"), new BigDecimal("1.02"),
				years);
	}
	/**
	 * 使用 double 計算複利，Math.pow 版本
	 */
	private static void printByDouble(double principal, double rate,
			int years) {
		double total = principal * Math.pow(1 + rate, years);
		// 印出本利和並取值到小數點第二位
		System.out.printf("%d年後本利和為：%.2f 元%n", years, total);
	};
	private static void printByBigDecimal(BigDecimal principalBD,
			BigDecimal rateBD, int years) {
		// 使用 BigDecimal 精確計算，避免浮點誤差
		BigDecimal totalBD = principalBD;
		for (int i = 0; i < years; i++) {
			totalBD = totalBD.multiply(rateBD);
		}
		// 10年後本利和，取到小數第二位、四捨五入
		System.out.println(years + "年後本利和為: "
				+ totalBD.setScale(2, RoundingMode.HALF_UP) + "元");
	};
}
