package hw7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileStats {
	public static void main(String[] args) {
		File file = new File("src/hw7/Sample.txt");
		if (!file.exists()) {
			System.out.println("找不到檔案");
			return;
		}

		long byteCount = file.length(); // 檔案大小（位元組）
		int charCount = 0; // 字元總數
		int lineCount = 0; // 行數
		//BufferedReader
		//　└── InputStreamReader（字節轉字元）
		//　　└── FileInputStream（實際從檔案讀位元組）
		try (FileInputStream fis = new FileInputStream(file);
				BufferedReader br = new BufferedReader(
						new InputStreamReader(fis)))//InputStreamReader(fis, "UTF-8"))
		{
			String line;
			//StringBuilder jsonText = new StringBuilder();
			while ((line = br.readLine()) != null) {
				charCount += line.length();
				lineCount++;
			}
			//System.out.println(jsonText.toString());

		} catch (IOException e) {
			System.out.println("讀檔錯誤：" + e.getMessage());
			e.printStackTrace();
		}
		System.out.printf("Sample.txt檔案共有%d個位元組，%d個字元，%d列資料%n", byteCount,
				charCount, lineCount);
	}

}
