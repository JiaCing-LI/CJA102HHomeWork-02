package hw4;

import java.util.Scanner;

public class Hw4_4 {
	// class Hw4_EmployeeManager管理同事行為 class Hw4_4_Employee 裝同事類別
	public static void main(String[] args) {
		// 建立員工物件陣列，每位員工包含：員工編號、在身上現金
		Hw4_4_Employee[] employees = {new Hw4_4_Employee(25, 2500),
				new Hw4_4_Employee(32, 800), new Hw4_4_Employee(8, 500),
				new Hw4_4_Employee(19, 1000), new Hw4_4_Employee(27, 1200)};

		Scanner sc = new Scanner(System.in);
		System.out.print("請輸入欲借的金額：");
		int input = sc.nextInt();

		int count = 0;
		String ids = "";

		for (int i = 0; i < employees.length; i++) {
			if (employees[i].canLend(input)) {
				ids += employees[i].getId() + " ";
				count++;
			}
		}

		if (count > 0) {
			System.out.printf("有錢可借的員工編號：%s共 %d 人！%n", ids.trim(), count);
		} else {
			System.out.println("沒有人可以借！");
		}

		sc.close();
	}

}
