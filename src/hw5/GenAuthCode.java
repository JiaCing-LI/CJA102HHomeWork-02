package hw5;

import java.util.HashMap;
import java.util.Random;

public class GenAuthCode {
	private final String code;
	//儲存所有可用的亂數字元對照表，索引值 0 ~ 61，對應 AZ、az、0~9。
	private static final HashMap<Integer, Character> charMap = generateAuthCodeCharMap();
	public GenAuthCode() {
		StringBuilder sb = new StringBuilder();
		Random rand = new Random();
//每次從 charMap 隨機取一個字元（透過 index 取得 value），共選取 8 次。
		for (int i = 0; i < 8; i++) {
			int index = rand.nextInt(charMap.size());
			sb.append(charMap.get(index));
		}
		code = sb.toString();
	}

	@Override
	public String toString() {
		return code; // 印出物件時回傳驗證碼字串
	}
	/**
	 * 將合法驗證碼用的字元依序加入 HashMap<Integer, Character> 0>'A'~61>'9'
	 * 
	 * @return
	 */
	private static HashMap<Integer, Character> generateAuthCodeCharMap() {
		HashMap<Integer, Character> indexToCharMap = new HashMap<>();
		int index = 0;
		for (char c = 'A'; c <= 'Z'; c++) {
			indexToCharMap.put(index++, c);
		}
		for (char c = 'a'; c <= 'z'; c++) {
			indexToCharMap.put(index++, c);
		}
		for (char c = '0'; c <= '9'; c++) {
			indexToCharMap.put(index++, c);
		}
		return indexToCharMap;
	}
}
