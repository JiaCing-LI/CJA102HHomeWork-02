package hw4;
/**
 * 員工類別
 */
public class Hw4_4_Employee {
	private final int id;
	private final int cash;

	public int getId() {
		return id;
	}
	public int getCash() {
		return cash;
	}
	public Hw4_4_Employee(int id, int cash) {
		this.id = id;
		this.cash = cash;
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
