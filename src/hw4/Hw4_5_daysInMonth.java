package hw4;

public class Hw4_5_daysInMonth {
	private int[] daysInMonth;
	public Hw4_5_daysInMonth(int year) {
		daysInMonth = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		if (isLeapYear(year)) {
			daysInMonth[1] = 29;
		}
	}
	/**
	 * 判斷是不是潤年
	 * 
	 * @param year
	 *            使用者輸入的年
	 * @return 閏年=true 非閏年=false
	 */
	public boolean isLeapYear(int year) {
		return (year % 4 == 0 && year % 100 != 0 || (year % 400 == 0));
	}
	/**
	 * 驗證日期是否正確
	 * 
	 * @param month使用者輸入的月
	 * @param day使用者輸入的天
	 * @return true:日期正確 false:日期錯誤
	 */
	public boolean isValidDate(int month, int day) {
		if (month < 1 || month > 12) {
			System.out.println("錯誤：月份必須在 1 ~ 12 之間！");
			return false;
		}
		if (day < 1 || day > daysInMonth[month - 1]) {
			System.out.printf("錯誤：%d 月沒有 %d 日！%n", month, day);
			return false;
		}
		return true;
	}
	/**
	 * 計算輸入日期為該年第幾天
	 * 
	 * @param month使用者輸入的月
	 * @param day使用者輸入的天
	 */
	public void calculateDayOfYear(int month, int day) {
		if (isValidDate(month, day) == false) {
			return;
		} else {
			int totalDays = 0;
			for (int i = 0; i < month - 1; i++) {
				totalDays += daysInMonth[i];
			}
			totalDays += day;
			System.out.printf("輸入的日期為該年第 %d 天%n", totalDays);
		}
	}
}
