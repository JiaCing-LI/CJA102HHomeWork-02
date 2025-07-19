package hw7;

import java.io.Serializable;
//物件傳輸 需要 實作 Seriallizable
public class Cat implements Animal, Serializable {
	//serialVersionUID 是版本識別（避免序列化錯誤）
	private static final long serialVersionUID = 1L;
	private String name;

	public Cat(String name) {
		this.name = name;
	}

	@Override
	public void speak() {
		System.out.println("This is Cat " + name + " speaking!喵");
	}

}
