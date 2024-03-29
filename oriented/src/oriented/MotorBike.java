package oriented;

public class MotorBike {
	// state
	private int speed;
	public int getSpeed() {
		return speed;
	}

	MotorBike(int speed) {
		this.speed = speed;
	}

	public void setSpeed(int speed) {
		if (speed > 0)
		this.speed = speed;
	}

	public void increaseSpeed(int howMuch) {
		setSpeed(this.speed + howMuch);
		this.speed = this.speed + howMuch;
	}

	public void decreaseSpeed(int howMuch) {
		setSpeed(this.speed - howMuch);
		this.speed = this.speed - howMuch;
	}
	void start() {
		System.out.println("Bike started");
	}
}
