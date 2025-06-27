package hw1;

//請設計一隻Java程式，計算200顆蛋共是幾打幾顆？(一打為12顆
public class Hw1_2 {
	public static void main(String[] args) {
		int eggs = 200;// 蛋 200 顆
		int dozen = eggs / 12;// 一打12顆，計算總共有幾打
		int totaleggs = eggs % 12;// 剩餘的蛋

		System.out.println("總共是:" + dozen + "打又" + totaleggs + "顆");
	}
}
