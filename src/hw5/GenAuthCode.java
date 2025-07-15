package hw5;

import java.util.Random;

public class GenAuthCode {
	private String code;

	public GenAuthCode() {
		String chars = generateLegalChars(); // A-Z a-z 0-9 共 62 字元
		StringBuilder sb = new StringBuilder();
		Random rand = new Random();

		for (int i = 0; i < 8; i++) {
			int index = rand.nextInt(chars.length());
			sb.append(chars.charAt(index));
		}
		code = sb.toString();
	}

	@Override
	public String toString() {
		return code; // 印出物件時回傳驗證碼字串
	}

	private static String generateLegalChars() {
		StringBuilder sb = new StringBuilder();
		for (char c = 'A'; c <= 'Z'; c++) {
			sb.append(c);
		}
		for (char c = 'a'; c <= 'z'; c++) {
			sb.append(c);
		}
		for (char c = '0'; c <= '9'; c++) {
			sb.append(c);
		}
		return sb.toString();
	}
}
