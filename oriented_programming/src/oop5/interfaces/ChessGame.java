package oop5.interfaces;

public class ChessGame implements GamingConsole {

	@Override
	public void up() {
		System.out.println("말을 위로");
	}

	@Override
	public void down() {
		System.out.println("말을 아래로");
	}

	@Override
	public void left() {
		System.out.println("말을 왼으로");
	}

	@Override
	public void right() {
		System.out.println("말을 오른쪽으로");
	}

}
