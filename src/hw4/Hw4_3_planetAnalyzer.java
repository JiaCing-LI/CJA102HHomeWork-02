package hw4;
/**
 * PlanetAnalyzer 類別 封裝八大行星名稱資料，並提供統計母音的方法
 */
public class Hw4_3_planetAnalyzer {
	/** 行星名稱陣列 */
	private String[] planets;
	/**
	 * 建構子:建立分析物件，並設定行星資料
	 * 
	 * @param planets
	 *            八大行星的英文名稱陣列
	 */
	public Hw4_3_planetAnalyzer(String[] planets) {
		this.planets = planets;
	}
	/**
	 * 計算母音
	 * 
	 * @param planets
	 *            八大行星字串
	 * @return count 母音
	 */
	public int countVowels() {
		int count = 0;
		for (int i = 0; i < planets.length; i++) {
			String word = planets[i];
			word = word.toLowerCase();// 轉換小寫，
			for (int j = 0; j < word.length(); j++) {
				char ch = word.charAt(j);
				if (isVowel(word.charAt(j))) {
					count++;
				}

			}
		}
		return count;
	}
	private boolean isVowel(char ch) {
		return "aeiou".indexOf(ch) != -1;
	}
	/**
	 * 印出目前所有行星名稱
	 */
	public void printPlanets() {
		System.out.print("行星列表：");
		for (int i = 0; i < planets.length; i++) {
			System.out.print(planets[i] + " ");
		}
		System.out.println();

	}
}
