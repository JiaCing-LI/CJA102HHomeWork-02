package hw8;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class CollectionFactory {
	public static Collection<Object> createCollection() {
		Collection<Object> col = new ArrayList<>() {
			private static final long serialVersionUID = 1L;
		};
		col.add(new Integer(100));
		col.add(new Double(3.14));
		col.add(new Long(21L));
		col.add(new Short("100"));
		col.add(new Double(5.1));
		col.add("Kitty");
		col.add(new Integer(100));
		col.add(new Object());
		col.add("Snoopy");
		col.add(new BigInteger("1001"));

		return col;
	}
	/**
	 * 利用Iterator<?> 取出所有元素
	 * @param col Collection裡的物件
	 */
	public static void printWithIterator(Collection<Object> col) {
		System.out.println("使用 Iterator 印出元素：");
		Iterator<?> it = col.iterator();
		while (it.hasNext()) {
			Object obj = it.next();
			System.out.println(obj);
		}
	}
	/**
	 * 利用For 取出所有元素
	 * @param list List裡的元素
	 */
	public static void printWithFor(List<Object> list) {
		System.out.println("使用 For 印出元素：");
		for (int i = 0; i < list.size(); i++) {
			//Object obj = list.get(i);
			System.out.println(list.get(i));
		}
	}
	/**
	 * 利用Foreach 取出所有元素
	 * @param colCollection裡的物件
	 */
	public static void printWithForeach(Collection<Object> col) {
		System.out.println("使用 Foreach 印出元素：");
		for (Object obj : col) {
			System.out.println(obj);
			//System.out.println(obj+"->"+obj.getClass().getSimpleName());
		}
	}
	/**
	 * 移除非Number元素
	 * @param col colCollection裡的物件
	 */
	public static void removeNonNumberElements(Collection<Object> col) {
		Iterator<?> it = col.iterator();
		while (it.hasNext()) {
			Object obj = it.next();
			//每次讀取 obj，先檢查是否不是 Number
			if (!(obj instanceof Number)) {
				it.remove(); //只刪掉不是數字的
				System.out.println("移除：" + obj);
			}
		}
	}

}
