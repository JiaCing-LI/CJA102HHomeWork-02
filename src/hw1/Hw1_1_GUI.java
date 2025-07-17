package hw1;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

/**
 * Swing版：加總與乘積計算程式 輸入兩個整數，按下按鈕後顯示和與積 星努力老師設計
 */
public class Hw1_1_GUI extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField inputA, inputB;
	private JButton calcButton;
	private JLabel resultSum, resultProduct;

	public Hw1_1_GUI() {
		setTitle("兩數加總與乘積計算");
		setSize(400, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(4, 2, 10, 10));

		// 元件初始化
		inputA = new JTextField();
		inputB = new JTextField();
		calcButton = new JButton("計算");
		resultSum = new JLabel("和: ", SwingConstants.LEFT);
		resultProduct = new JLabel("積: ", SwingConstants.LEFT);

		// 加入元件
		add(new JLabel("數字 A："));
		add(inputA);
		add(new JLabel("數字 B："));
		add(inputB);
		add(calcButton);
		add(new JLabel()); // 空格用
		add(resultSum);
		add(resultProduct);

		// 按鈕事件
		calcButton.addActionListener(e -> calculate());

		setVisible(true);
	}

	/**
	 * 計算並顯示結果
	 */
	private void calculate() {
		try {
			int a = Integer.parseInt(inputA.getText().trim());
			int b = Integer.parseInt(inputB.getText().trim());

			int sum = getSum(a, b);
			int product = getProduct(a, b);

			resultSum.setText("和: " + sum);
			resultProduct.setText("積: " + product);
		} catch (NumberFormatException ex) {
			JOptionPane.showMessageDialog(this, "請輸入有效整數", "錯誤",
					JOptionPane.ERROR_MESSAGE);
		}
	}

	/** 計算加總 */
	public static int getSum(int x, int y) {
		return x + y;
	}

	/** 計算乘積 */
	public static int getProduct(int x, int y) {
		return x * y;
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> new Hw1_1_GUI());
	}
}
