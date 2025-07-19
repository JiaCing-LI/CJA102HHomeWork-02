package hw7;

public class SerializableAnimal {

	public static void main(String[] args) {
		AnimalIOData animalIO = new AnimalIOData("C:/data", "Object.ser");
		animalIO.saveAll();
		animalIO.readAndSpeak();
		AnimalIOData_NIO animalIO_NIO = new AnimalIOData_NIO("C:/data",
				"Object_NIO.ser");
		animalIO_NIO.saveAll();
		animalIO_NIO.readAndSpeak();
	}
}