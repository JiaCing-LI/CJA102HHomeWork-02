package hw5;

public class MyRectangleMain {
	public static void main(String[] args) {
		// 使用無參數建構子，設定 width=10, depth=20
		MyRectangle r1 = new MyRectangle();
		r1.setWidth(10);
		r1.setDepth(20);
		System.out.println("r1 面積 = " + r1.getArea());

		// 使用有參數建構子，直接設定 width=10, depth=20
		MyRectangle r2 = new MyRectangle(10, 20);
		System.out.println("r2 面積 = " + r2.getArea());
	}
}
