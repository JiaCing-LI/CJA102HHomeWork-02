package hw1;

//某人在銀行存入150萬，銀行利率為2%
//如果每年利息都繼續存入銀行，
//請用程式計算10年後，本金加利息共有多少錢
public class Hw1_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double principal = 1500000; // 本金
		double rate = 0.02; // 年利率 2%
		int years = 10; // 10年
//       複利 FV = PV × (1 + r)^n 
//        		FV：未來值（本利和）
//        		PV：現在本金
//        		r：年利率
//        		n：年數
		//本利和利用函式Math.pow(1+rate,year)計算複利
		double total = principal * Math.pow(1 + rate, years);
		//印出本利和並取值到小數點第二位
		System.out.printf("10年後本利和為: %.2f 元\n", total);
	}

}
