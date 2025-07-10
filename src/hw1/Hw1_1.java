package hw1;

//請設計一隻Java程式，計算12，6這兩個數值的和與積

public class Hw1_1 {
	/**
	 * 執行加總與乘積計算。
	 * 
	 * @param args
	 *            執行參數（此處未使用）
	 */

	public static void main(String[] args) {

		int a = 12;
		int b = 6;

		// 呼叫方法並印出結果
		System.out.println("和: " + getSum(a, b));
		System.out.println("積: " + getProduct(a, b));
	}

	/**
	 * 計算兩整數之和
	 * 
	 * @param x
	 *            第一個整數
	 * @param y
	 *            第二個整數
	 * @return x + y 的結果
	 */
	public static int getSum(int x, int y) {
		return x + y;
	}

	/**
	 * 計算兩整數之積
	 * 
	 * @param x
	 * @param y
	 * @return x * y之積
	 */
	public static int getProduct(int x, int y) {
		return x * y;
	}
}
