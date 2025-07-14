package hw5;

public class StarSquare implements Drawable {
	private int width, height;
	public StarSquare() {
	}
	public StarSquare(int width, int height) {
		this.width = width;
		this.height = height;
	}

	@Override
	public void draw() {
		for (int i = 0; i < height; i++) { // 高度：印幾行
			for (int j = 0; j < width; j++) { // 寬度：每行印幾個 *
				System.out.print("*");
			}
			System.out.println(); // 換行，不要印空格
		}
	}
}
