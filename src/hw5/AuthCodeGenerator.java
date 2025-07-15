package hw5;

public class AuthCodeGenerator {

	public static void main(String[] args) {
		// // === 開始前記憶體使用量 ===
		// Runtime rt = Runtime.getRuntime();
		// rt.gc(); // 先建議 JVM 做一次 GC，降低雜訊
		// long before = rt.totalMemory() - rt.freeMemory();
		// // === 產生 10000 筆驗證碼 ===
		// GenAuthCode[] codes = new GenAuthCode[10000];// GenAuthCode[] 陣列
		// for (int i = 0; i < codes.length; i++) {
		// codes[i] = new GenAuthCode(); // 建立並保留
		// System.out.println("本次隨機產生驗證碼為：" + codes[i]);
		// }
		// 單次產生、只印出
		for (int i = 0; i < 3; i++) {
			GenAuthCode code = new GenAuthCode();
			System.out.println("本次隨機產生驗證碼為：" + code);
		}
		// // === 結束後記憶體使用量 ===
		// long after = rt.totalMemory() - rt.freeMemory();
		// long usedBytes = after - before;
		// double usedKB = usedBytes / 1024.0;
		//
		// System.out.printf("產生 10000 組驗證碼共使用記憶體：約 %.2f KB%n", usedKB);

	}

}
