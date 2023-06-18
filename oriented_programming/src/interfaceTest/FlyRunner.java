package interfaceTest;

interface Flyable {
	void fly();
}
class Bird implements Flyable {
	@Override
	public void fly() {
		System.out.println("with wing");
	}
}

class Aeroplane implements Flyable {

	@Override
	public void fly() {
		System.out.println("with fuel");

	}

}
public class FlyRunner {
	public static void main(String[] args) {
		Flyable[] flyingObjects = { new Bird(), new Aeroplane() };
		for (Flyable object : flyingObjects) {
			object.fly();
		}
	}

}
