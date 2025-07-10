package hw4;
/**
 * • 有個一維陣列如下: {29, 100, 39, 41, 50, 8, 66, 77, 95, 15}
 * 請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素 (提示:陣列,length屬性)
 */
public class Hw4_1 {
	public static void main(String[] args) {
		int[] arrayStore = {29, 100, 39, 41, 50, 8, 66, 77, 95, 15};
		printArray(arrayStore);
	}
	/**
	 * 印出陣列{29, 100, 39, 41, 50, 8, 66, 77, 95, 15} 平均值，以及大於平均值的元素
	 */
	public static void printArray(int[] data) {
		int sumEle = 0;
		for (int i = 0; i < data.length; i++) {
			sumEle += data[i];
		}
		double avg = (double) sumEle / data.length;
		System.out.printf("平均值為：%.2f%n", avg);
		for (int j = 0; j < data.length; j++) {
			if (data[j] > avg) {
				System.out.println(data[j] + " ");
			}

		}
		System.out.println();
	}
}
