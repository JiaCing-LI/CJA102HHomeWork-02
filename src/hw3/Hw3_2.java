package hw3;

import java.util.Scanner;
public class Hw3_2 {
	// class GuessNuberGame
	/**
	 * 請設計一隻程式,會亂數產生一個0~9的數字,然後可以玩猜數字遊戲,猜錯會顯示錯誤訊息,猜 對則顯示正確訊息,如圖示結果:
	 * 
	 * (提示:Scanner,亂數方法,無窮迴圈) (進階功能:產生0~100亂數,每次猜就會提示你是大於還是小於正確答案)
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		startGuessNumberGame();
		startGuessNumberGame2();
	}
	/**
	 * 數字猜測（0~9）
	 */
	public static void startGuessNumberGame() {
		Scanner userGuess = new Scanner(System.in);

		int answer = (int) (Math.random() * 10);
		int guess = -1;
		while (true) {
			System.out.println("開始猜數字吧(0~9)");
			if (userGuess.hasNextInt()) {
				guess = userGuess.nextInt();

				if (guess < 0 || guess > 9) {
					System.out.println("請輸入 0 到 9 的數字！");
					continue;
				}

				if (guess == answer) {
					System.out.println("答對了！答案就是" + answer);
					break;
				} else {
					System.out.println("猜錯囉");
				}
			} else {
				System.out.println("請輸入有效整數！");
				userGuess.next(); // 清除錯誤輸入
			}
		}
		userGuess.close();
	}
	/**
	 * 猜測（0~100），並提示大小 直到答對為止
	 */
	public static void startGuessNumberGame2() {
		Scanner userGuess = new Scanner(System.in);

		int answer = (int) (Math.random() * 101);
		int guess;
		int tries = 0;
		while (true) {
			System.out.println("開始猜數字吧(0~100)");
			if (userGuess.hasNextInt()) {
				guess = userGuess.nextInt();
				tries++;
				if (guess < 0 || guess > 100) {
					System.out.println("請輸入 0 到 100 的數字！");
					continue;
				}

				if (guess == answer) {
					System.out.printf(" 答對了！答案就是 %d，總共猜了 %d 次！%n", answer,
							tries);
					break;
				} else if (guess <= answer) {
					System.out.println("小於正確答案");
				} else {
					System.out.println("大於正確答案");
				}
			} else {
				System.out.println("請輸入有效整數！");
				userGuess.next(); // 清除錯誤輸入
			}
		}
		userGuess.close();
	}
}
