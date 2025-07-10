package hw4;
/**
 * 請建立一個字串,經過程式執行後,輸入結果是反過來的 例如String s = “Hello World”,執行結果即為dlroW olleH
 * (提示:String方法,陣列)
 */
public class Hw4_2 {
	public static void main(String[] args) {
		String s = "Hello World";
		System.out.println("反轉後結果：" + reverse(s));

		String reversed = new StringBuilder(s).reverse().toString();
		System.out.println("反轉後結果：" + reversed);
	}
	/**
	 * 反轉方法
	 * 
	 * @param input
	 *            要反轉的字串
	 * @return 反轉後的字串
	 */
	private static String reverse(String input) {
		String reverseResult = "";
		for (int i = input.length() - 1; i >= 0; i--) {
			reverseResult += input.charAt(i);// 一個字元一個字元加到前面
		}

		return reverseResult;
	}

}
