package oop3.inheritance;

public class AnimalRunner {

	public static void main(String[] args) {
		Animal[] animals = { new Cat(), new Dog() };
		for (Animal animal : animals) {
			animal.bark();
		}
	}
}

abstract class Animal {
	abstract void bark();
}

class Dog extends Animal {

	@Override
	void bark() {
		System.out.println("bowbow");

	}

}

class Cat extends Animal {

	@Override
	void bark() {
		System.out.println("meow");

	}

}
