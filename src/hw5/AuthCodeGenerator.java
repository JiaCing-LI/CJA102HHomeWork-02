package hw5;

import java.util.Random;

public class AuthCodeGenerator {

	public static void main(String[] args) {
		String code = genAuthCode();
		System.out.println("本次隨機產生驗證碼為：" + code);
	}

	public static String genAuthCode() {
		String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
		StringBuilder sb = new StringBuilder();
		Random rand = new Random();
		for (int i = 0; i < 8; i++) {
			int index = rand.nextInt(chars.length());
			sb.append(chars.charAt(index));
		}
		return sb.toString();
	}
}
