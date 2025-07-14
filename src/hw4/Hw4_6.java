package hw4;

/**
 * • 班上有8位同學,他們進行了6次考試結果如下: 請算出每位同學考最高分的次數
 */
public class Hw4_6 {

	public static void main(String[] args) {
		int[][] studentScores = {{10, 35, 40, 100, 90, 85, 75, 70},
				{37, 75, 77, 89, 64, 75, 70, 95},
				{100, 70, 79, 90, 75, 70, 79, 90},
				{77, 95, 70, 89, 60, 75, 85, 89},
				{98, 70, 89, 90, 75, 90, 89, 90},
				{90, 80, 100, 75, 50, 20, 99, 75}};
		// 6 次考試（橫的）X × 8 位學生（直的）Y成績紀錄。
		int[] topCount = new int[8];// 紀錄8位學生考最高分次數
		// 外圈 for：處理每一場考試
		for (int i = 0; i < studentScores.length; i++) {

			int max = studentScores[i][0];// i=exam 第i場考試的初始最大分設為第一位同學的成績
			// 先找出這一場考試的最高分

			for (int j = 1; j < studentScores[i].length; j++) {
				max = Math.max(max, studentScores[i][j]);
				// if (studentScores[i][j] > max) {
				// max = studentScores[i][j];
				// }
			}
			// 再次迴圈：找出所有分數 == max 的學生，次數 +1
			for (int j = 0; j < studentScores[i].length; j++) {
				if (studentScores[i][j] == max) {
					topCount[j]++;// 這位學生得最高分，累加一次
				}
			}
		}

		// 輸出統計結果：每位學生考最高分的次數
		for (int i = 0; i < topCount.length; i++) {
			System.out.printf("學生 %d 號考最高分 %d 次%n", i + 1, topCount[i]);
		}
	}

}
