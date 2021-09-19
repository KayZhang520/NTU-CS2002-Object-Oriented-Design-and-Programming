package Animal;
// here as dynamic binding happens in runtime, java use the Cat class's speak method automatically
//
public class Main {
	public static void main(String[] args) {
		CareTaker ct = new CareTaker();
		IAnimal cat = new Cat();
		ct.patAnimal(cat);
	}
}
