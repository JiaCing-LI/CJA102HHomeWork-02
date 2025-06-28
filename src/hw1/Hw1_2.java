package hw1;

//請設計一隻Java程式，計算200顆蛋共是幾打幾顆？(一打為12顆
public class Hw1_2 {
	public static void main(String[] args) {
		int eggs = 200;// 蛋 200 顆

		// 呼叫方法，取得計算結果
		printDozenResult(eggs);
	}

	/**
	 * 根據蛋的總數，輸出其等於幾打幾顆。
	 * 
	 * @param eggs 的總數
	 */
	public static void printDozenResult(int eggs) {
		int dozen = eggs / 12;// 每打12顆
		int totaleggs = eggs % 12;// 剩餘的顆數

		System.out.println("總共是:" + dozen + "打又" + totaleggs + "顆");
	}
}
