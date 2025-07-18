package hw7;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class RandomInData {
	RandomInData() {
		RandomNum();
	}
	public void RandomNum() {
		Set<Integer> RandSet = new HashSet<>();
		Random random = new Random();
		while (RandSet.size() < 10) {
			int num = random.nextInt(1000) + 1;
			RandSet.add(num);
		}

	}
	public static void main(String[] args) {
		RandomInData randomInData = new RandomInData();
		randomInData.RandomNum();
	}

}
