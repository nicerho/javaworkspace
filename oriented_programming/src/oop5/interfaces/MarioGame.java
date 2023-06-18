package oop5.interfaces;

public class MarioGame implements GamingConsole {

	@Override
	public void up() {
		System.out.println("jump");
	}

	@Override
	public void down() {
		System.out.println("구멍으로");
	}

	@Override
	public void left() {

	}

	@Override
	public void right() {
		System.out.println("앞으로");
	}

}
