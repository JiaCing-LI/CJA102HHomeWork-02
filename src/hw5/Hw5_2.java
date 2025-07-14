package hw5;

import java.util.Random;

/**
 * 請設計一個方法為randAvg(),從10個 0~100(含100)的整數亂數中取平均值並印出這10個亂數與平均值,如圖:S
 */
public class Hw5_2 {

	public static void main(String[] args) {
		randAvg();
	}

	static void randAvg() {
		Random rand = new Random();
		int[] nums = new int[10];
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			nums[i] = rand.nextInt(101);// 0~100
			System.out.print(nums[i] + " ");
			sum += nums[i];
		}
		double avg = 1.0 * sum / nums.length;
		System.out.printf("%n平均值為：%d%n", (int) avg);
	}
}
