package hw4;

import java.util.Set;

/**
 * PlanetAnalyzer 類別 封裝八大行星名稱資料，並提供統計母音的方法
 */
public class Hw4_3_planetAnalyzer {
	/** 行星集合 */
	private Set<String> planets;

	private static final Set<Character> VOWELS = Set.of('a', 'e', 'i', 'o',
			'u');
	/**
	 * 
	 * 建構子:建立分析物件，並設定行星資料
	 * 
	 * @param planets
	 *            八大行星的英文名稱陣列
	 */
	public Hw4_3_planetAnalyzer(Set<String> planets) {
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
		for (String word : planets) {
			word = word.toLowerCase();// 轉換小寫，
			for (char ch : word.toCharArray()) {
				if (isVowel(ch)) {
					count++;
				}
			}
		}
		return count;
	}
	private boolean isVowel(char ch) {
		return VOWELS.contains(Character.toLowerCase(ch));
	}
	/**
	 * 印出目前所有行星名稱
	 */
	public void printPlanets() {
		System.out.print("行星列表：");
		for (String name : planets) {
			System.out.print(name + " ");
		}
		System.out.println();

	}
}
