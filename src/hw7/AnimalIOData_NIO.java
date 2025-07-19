package hw7;
import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
public class AnimalIOData_NIO {
	private final Path fPath;// 用 Path 取代 File

	public AnimalIOData_NIO(String dirPath, String fileName) {
		this.fPath = preparePathFile(dirPath, fileName);

	}
	private Path preparePathFile(String dirPath, String fileName) {
		Path pathDir = Path.of(dirPath);
		try {
			Files.createDirectories(pathDir);
			System.out.println("資料夾已建立：" + pathDir.toAbsolutePath());
		} catch (IOException e) {
			System.err.println("建立資料夾失敗：" + e.getMessage());
		}
		return pathDir.resolve(fileName);// 把檔案名稱加進目錄
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
		try (ObjectOutputStream oos = new ObjectOutputStream(
				Files.newOutputStream(fPath))) {
			for (Animal a : animals) {
				oos.writeObject(a);
			}
			System.out.println("成功將物件寫入：" + fPath.toAbsolutePath());
		} catch (IOException e) {
			System.err.println("寫入錯誤：" + e.getMessage());
		}
	}

	/** 讀取並呼叫 speak()，使用多型與 EOF 安全處理 */
	public void readAndSpeak() {
		try (ObjectInputStream ois = new ObjectInputStream(
				Files.newInputStream(fPath))) {
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