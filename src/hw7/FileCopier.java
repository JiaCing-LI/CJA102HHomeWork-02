package hw7;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
//註釋、還有這是初版
public class FileCopier {
	public void copyFile(String sourcePath, String destPath) {
		File source = new File(sourcePath);
		File dest = new File(destPath);
		if (!source.exists()) {
			System.err.println("❌ 原始檔案不存在：" + sourcePath);
			return;
		}
		try (FileInputStream fis = new FileInputStream(source);
				FileOutputStream fos = new FileOutputStream(dest);) {
			int length = 0;
			byte[] buffer = new byte[2024];
			while ((length = fis.read(buffer)) != -1) {
				fos.write(buffer, 0, length);
				System.out.println("檔案複製成功！");
			}
		} catch (Exception e) {
			System.err.println("複製過程錯誤：" + e.getMessage());
		}
	}
}
