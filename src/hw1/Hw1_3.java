package hw1;

// 請由程式算出256559秒為多少天、多少小時、多少分與多少秒
public class Hw1_3 {
	public static void main(String[] args) {
		int totalSeconds = 256559;// 總秒數
		int day, hour, min, sec;// 宣告存放 天、時、分、秒
		// 一天有24*60*60 = 86400 秒
		day = totalSeconds / 86400;// 計算有幾天
		// 剩餘秒數（扣掉整天的部分）
		int remainingSeconds = totalSeconds % 86400;
		hour = remainingSeconds / 3600;// 一小時有 3600 秒，從剩餘秒數中再取出幾小時
		remainingSeconds %= 3600;// 再更新剩餘秒數（扣掉小時部分）
		min = remainingSeconds / 60;// 一分鐘有 60 秒，接著取出幾分鐘
		sec = remainingSeconds % 60;// 再更新剩餘秒數（扣掉小時部分）
		// 印出最終結果
		System.out.println(totalSeconds + "秒為:");
		System.out.println(day + "天" + hour + "時" + min + "分" + sec + "秒");
	}
}
