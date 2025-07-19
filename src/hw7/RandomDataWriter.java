package hw7;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class RandomDataWriter {
	RandomDataWriter() {
		// default constructor
	}
	/**
	* 產生亂數並寫入檔案（附加模式）
	* 寫入目標為：src/hw7/data.txt
	*/
	public void writeRandomNumbers() {
		Set<Integer> numberSet = new HashSet<>();
		Random random = new Random();
		// 產生 10 個不重複的亂數（1~1000）//要把亂數寫成方法嗎?
		while (numberSet.size() < 10) {
			int num = random.nextInt(1000) + 1;
			numberSet.add(num);
		}
		String content = buildLine(numberSet); // 組合字串
		appendToFile("src/hw7/data.txt", content); // 寫入檔案
	}
	/**
	 * 將整數集合組合為一行字串（空格分隔 + 換行） (使用 append 模式)
	 */
	private String buildLine(Set<Integer> numberSet) {
		// 組合成一行字串
		StringBuilder sb = new StringBuilder();
		Iterator<Integer> it = numberSet.iterator();
		while (it.hasNext()) {
			sb.append(it.next());
			if (it.hasNext()) {
				sb.append(" "); // 只有不是最後一個才加空格
			}
		}
		//		for (int n : numberSet) {
		//			sb.append(n).append(" ");
		//		}
		sb.append(System.lineSeparator()); // 換行（跨平台支援）
		return sb.toString();
	}
	/**
	* 以附加模式將內容寫入指定檔案
	*/
	private void appendToFile(String filePath, String content) {
		File file = new File("src/hw7/data.txt");
		try (FileWriter fWriter = new FileWriter(file, true)) {
			fWriter.write(content);
			System.out.println("成功寫入 10 個亂數到 Data.txt！");
			//我來測試路徑
			System.out.println("實際路徑：" + file.getAbsolutePath());
		} catch (IOException e) {
			System.out.println("寫入失敗：" + e.getMessage());
		}
	}
	public static void main(String[] args) {
		RandomDataWriter randDataWriter = new RandomDataWriter();
		randDataWriter.writeRandomNumbers();
	}

}
