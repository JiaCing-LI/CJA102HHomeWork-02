package hw4;
/**
 * 有個字串陣列如下 (八大行星): {“mercury”, “venus”, “earth”, “mars”, “jupiter”, “saturn”,
 * “uranus”, “neptune”} 請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u) (提示:字元比對,String方法)
 */
public class Hw4_3 {

	public static void main(String[] args) {
		String[] planets = {"mercury", "venus", "earth", "mars", "jupiter",
				"saturn", "uranus", "neptune"};
		Hw4_3_planetAnalyzer analyzer = new Hw4_3_planetAnalyzer(planets);
		analyzer.printPlanets();
		int vowelCount = analyzer.countVowels();
		System.out.printf("總共有%d個母音", vowelCount);
	}

}
