package hw7;

public class FileCopierMain {

	public static void main(String[] args) {
		String source = "src/hw7/data.txt";
		String dest = "src/hw7/data_copy.txt";
		FileCopier fileCopier = new FileCopier();
		fileCopier.copyFile(source, dest);
	}

}
