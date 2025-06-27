package hw1;

import java.math.BigDecimal;
import java.math.RoundingMode;

//請定義一個常數為3.1415(圓周率)，並計算半徑為5的圓面積與圓周長
public class Hw1_4 {

	public static void main(String[] args) {
		final double PI = 3.1415;// 宣告PI為常數
		int radius = 5;// 半徑
		double circumference = PI * radius * 2;// 圓周長
		double areaOfCircle = PI * radius * radius;// 圓面積
		System.out.printf("圓周長為: %.4f\n", circumference);// 印出圓周長並取到第四位
		System.out.printf("圓面積為: %.4f\n", areaOfCircle);// 印出圓面積並取到第四位
		// BigDecimal 精準版本
		BigDecimal radiusBD = new BigDecimal(radius);
		BigDecimal piBD = new BigDecimal(PI);
		BigDecimal circumferenceBD = piBD.multiply(radiusBD).multiply(new BigDecimal("2"));
		// c=pi * r * 2, BigDecimal 的乘法方法:multiply();
		BigDecimal areaBD = piBD.multiply(radiusBD).multiply(radiusBD);
		// area =pi * r * r,
		System.out.println("=====BigDecimal 精準版本====");
		System.out.println("圓周長為:" + circumferenceBD.setScale(4, RoundingMode.HALF_UP));
		// 圓周長 setscale(int ,RoundingMode)方法 (第幾位,捨入模式) (4,四捨五入)
		System.out.println("圓面積為:" + areaBD.setScale(4, RoundingMode.HALF_UP));
		// 圓面積
	}

}
