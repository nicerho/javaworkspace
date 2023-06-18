package oop5.interfaces;

public class GameRunner {
	public static void main(String[] args) {
		GamingConsole[] games = { new MarioGame(), new ChessGame() };
		GamingConsole game = new MarioGame();
		// GamingConsole game = new ChessGame();
		game.up();
		game.down();
		game.left();
		game.right();
	}
}
