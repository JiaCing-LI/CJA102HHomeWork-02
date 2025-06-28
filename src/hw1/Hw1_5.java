package hw1;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * 某人在銀行存入150萬，銀行利率為2% 如果每年利息都繼續存入銀行， 請用程式計算10年後，本金加利息共有多少錢
 */
public class Hw1_5 {

	public static void main(String[] args) {
		// 使用 double 計算版本
		double principal = 1500000; // 本金
		double rate = 0.02; // 年利率 2%
		int years = 10; // 10年
		// 複利公式：FV = PV × (1 + r)^n
		// 本利和利用函式Math.pow(1+rate,year)計算複利
		double total = principal * Math.pow(1 + rate, years);
		// 印出本利和並取值到小數點第二位
		System.out.printf("10年後本利和為: %.2f 元\n", total);
		System.out.println("=====Bigdecimal精準版本========");
		// 使用 BigDecimal 精確計算，避免浮點誤差
		BigDecimal principalBD = new BigDecimal("150000");// 本金
		BigDecimal rateBD = new BigDecimal("1.02");// 1+年利率

		BigDecimal totalBD = principalBD;

		// 複利計算，每年本金 × 1.02（總共滾10次）
		for (int i = 0; i < years; i++) {
			totalBD = totalBD.multiply(rateBD);
		}
		System.out.println("10年後本利和為:" + totalBD.setScale(2, RoundingMode.HALF_UP));
		// 10年後本利和，取到小數第二位、四捨五入
	}

}
