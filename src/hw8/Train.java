package hw8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 * 一班火車資訊
 */
public class Train implements Comparable<Train> {

	private int number;       // 班次
	private String type;      // 車種
	private String start;     // 出發地
	private String dest;      // 目的地
	private double price;     // 票價
	public Train() {
	}
	public Train(
			int number,
			String type,
			String start,
			String dest,
			double price) {
		this.number = number;
		this.type = type;
		this.start = start;
		this.dest = dest;
		this.price = price;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getStart() {
		return start;
	}
	public void setStart(String start) {
		this.start = start;
	}
	public String getDest() {
		return dest;
	}
	public void setDest(String dest) {
		this.dest = dest;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return String.format(
				"班次:%d, 車種:%s, 出發地:%s, 目的地:%s, 票價:%.0f",
				number,
				type,
				start,
				dest,
				price);
	}
//	@Override
//	public int hashCode() {
//		return Objects.hash(dest, number, price, start, type);
//	}
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj) {
//			return true;
//		}
//		if (obj == null) {
//			return false;
//		}
//		//檢查類別是否一樣
//		if (getClass() != obj.getClass()) {
//			return false;
//		}
//		Train other = (Train) obj;
//		//班次 + 車種 + 出發地 + 目的地 + 票價 都要一樣
//		return number == other.number && Objects.equals(type, other.type)
//				&& Objects.equals(start, other.start)
//				&& Objects.equals(dest, other.dest) && price == other.price;
//	}
	@Override
	public int compareTo(Train other) {
		return Integer.compare(number, other.number); // 以班次大到小
	}
	public static void printWithIterator(Set<Train> ts) {
		System.out.println("使用 Iterator 印出元素：");
		Iterator<?> it = ts.iterator();
		while (it.hasNext()) {
			Object obj = it.next();
			System.out.println(obj);
		}
	}
	public static void printWithForeach(Set<Train> ts) {
		System.out.println("使用 Foreach 印出元素：");
		for (Train train : ts) {
			System.out.println(train);
		}
	}
	public static void printWithFor(Set<Train> ts) {
		System.out.println("使用 For 印出元素：");
		List<Train> listTs = new ArrayList<>(ts);
		for (int i = 0; i < listTs.size(); i++) {
			System.out.println(listTs.get(i));
		}
	}
}
