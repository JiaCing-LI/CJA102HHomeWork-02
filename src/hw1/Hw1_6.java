package hw1;
// 請寫一隻程式，利用System.out.println()印出以下三個運算式結果：
//5 + 5
//5 + ‘5’
//5 + “5
public class Hw1_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(5 + 5);
		//兩個整數相加，結果為10
		System.out.println(5 + '5');
		//'5'為字元，Unicode為53，之後整數5+53為58
		System.out.println(5 + "5");
		//"5"為字串，前一個5轉型字串，變為字串相加為55
	}

}
