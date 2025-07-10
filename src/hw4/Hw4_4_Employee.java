package hw4;
/**
 * 員工類別
 */
public class Hw4_4_Employee {
	private int id;
	private int cash;
	public Hw4_4_Employee(int id, int cash) {
		this.id = id;
		this.cash = cash;
	}
	/**
	 * 得到員工ID
	 * 
	 * @return 員工ID
	 */
	public int getId() {
		return id;
	}
	/**
	 * 判斷夠不夠錢借
	 * 
	 * @param amount
	 *            使用者輸入多少錢
	 * @return 同事身上的錢>=使用者輸入多少錢 則回傳可以借
	 */
	public boolean canLend(int amount) {
		return cash >= amount;
	}
}
