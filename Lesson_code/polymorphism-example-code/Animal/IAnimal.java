package Animal;

public interface IAnimal {
	void speak();
}

class Cat implements IAnimal{
	public void speak() {
		System.out.println("Meow!");
	}
}