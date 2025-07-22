package hw8;

import java.util.Collection;
import java.util.List;

public class CollectionTest {

	public static void main(String[] args) {
		Collection<Object> col = CollectionFactory.createCollection();
		//Iterator 印出元素
		CollectionFactory.printWithIterator(col);
		//foreach 印出元素
		CollectionFactory.printWithForeach(col);
		//for 必須轉型為 List 才能使用 get(i)
		if (col instanceof List<Object>) {
			CollectionFactory.printWithFor((List<Object>) col);
		}
		CollectionFactory.removeNonNumberElements(col);
		System.out.println("▶ 移除非 Number 類型後：");
		CollectionFactory.printWithIterator(col); // 只剩下數字型
	}

}
