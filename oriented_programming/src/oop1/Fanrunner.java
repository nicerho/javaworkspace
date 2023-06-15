package oop1;

public class Fanrunner {
	public static void main(String[] args) {
		Fan fan = new Fan("Manufacture1", 0.34567, "blue");
		fan.switchOn();
		System.out.println(fan.toString());
		fan.setSpeed((byte) 3);
		System.out.println(fan.toString());
		fan.switchOff();
		System.out.println(fan.toString());
	}
}
