package hw4;

import java.util.Scanner;

public class Hw4_5 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// System.out.print("請輸入日期 (yyyy mm dd)：");
		System.out.print("請輸入年份 (yyyy)：");
		int year = sc.nextInt();

		System.out.print("請輸入月份 (mm)：");
		int month = sc.nextInt();

		System.out.print("請輸入日期 (dd)：");
		int day = sc.nextInt();
		Hw4_5_daysInMonth calc = new Hw4_5_daysInMonth(year);
		calc.calculateDayOfYear(month, day);
		sc.close();
	}
}
