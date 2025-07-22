package hw8;

import java.util.Set;
import java.util.TreeSet;

public class TrainTest {

	public static void main(String[] args) {
		Set<Train> trainSet = new TreeSet<>();
		trainSet.add(new Train(202, "普悠瑪", "樹林", "花蓮", 400));
		trainSet.add(new Train(1254, "區間", "屏東", "基隆", 700));
		trainSet.add(new Train(118, "自強", "高雄", "台北", 500));
		trainSet.add(new Train(1288, "區間", "新竹", "基隆", 400));
		trainSet.add(new Train(122, "自強", "台中", "花蓮", 600));
		trainSet.add(new Train(1222, "區間", "樹林", "七堵", 300));
		trainSet.add(new Train(1254, "區間", "屏東", "基隆", 700)); // 重複資料
		// Iterator印出所有車次
		Train.printWithIterator(trainSet);
		// foreach印出所有車次
		Train.printWithForeach(trainSet);
		//for印出所有車次
		Train.printWithFor(trainSet);
		//System.out.println("去除重複火車資料：");

	}
//		Collections.sort(trainSet);
//		for (Train t : trainSet) {
//			System.out.println("原始排序後:" + t);
//		}
//		Collections.sort(uniqueTrains);
//		for (Train t : uniqueTrains) {
//			System.out.println("原始排序後:" + t);
//		}

}
