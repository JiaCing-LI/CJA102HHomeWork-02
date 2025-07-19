package hw7;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class AnimalIOData {
	private final File file;
	public AnimalIOData(String dirPath, String fileName) {
		this.file = prepareFile(dirPath, fileName);
	}
	/** 建立資料夾與檔案 */
	///能非 static 就非 static，只有在「真與物件無關」時才 static。 原本的
	private File prepareFile(String dirPath, String fileName) {
		File dir = new File(dirPath);
		if (!dir.exists() && dir.mkdirs()) {
			System.out.println("資料夾已建立：" + dir.getAbsolutePath());
		}
		return new File(dir, fileName);
	}

	/** 建立多型動物物件陣列 */
	private Animal[] createAnimals() {
		return new Animal[]{new Dog("Dog1"), new Dog("Dog2"), new Cat("Cat1"),
				new Cat("Cat2")};
	}
	/** 寫入所有動物到檔案 */
	public void saveAll() {
		Animal[] animals = createAnimals();
		//FileOutputStream 是最底層的串流，直接對檔案寫 bytes（位元組）
		//FileOutputStream 因為它支援 append 模式
		try (FileOutputStream fos = new FileOutputStream(file);
				ObjectOutputStream oos = new ObjectOutputStream(fos)) {
			for (Animal a : animals) {
				oos.writeObject(a);
			}
			System.out.println("成功將物件寫入：" + file.getAbsolutePath());
		} catch (IOException e) {
			System.err.println("寫入錯誤：" + e.getMessage());
		}
	}

	/** 讀取並呼叫 speak()，使用多型與 EOF 安全處理 */
	public void readAndSpeak() {
		try (ObjectInputStream ois = new ObjectInputStream(
				new FileInputStream(file))) {
			System.out.println("開始讀取物件並呼叫 speak()：");
			while (true) {
				try {
					Object obj = ois.readObject();
					if (obj instanceof Animal animal) {
						animal.speak();
					} else {
						System.err.println("非 Animal 類型物件！");
					}
				} catch (EOFException eof) {
					break;
				}
			}
		} catch (IOException | ClassNotFoundException e) {
			if (e instanceof IOException) {
				System.err.println("IO 錯誤：" + e.getMessage());
			}
			if (e instanceof ClassNotFoundException) {
				System.err.println("類別遺失：" + e.getMessage());
			}
		}
	}
}
