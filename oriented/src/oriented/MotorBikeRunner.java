package oriented;

public class MotorBikeRunner {

	public static void main(String[] args) {
		MotorBike ducati = new MotorBike(100);
		ducati.start();
		ducati.increaseSpeed(100);
		System.out.println(ducati.getSpeed());
		// ducati.decreaseSpeed(200);
		System.out.println(ducati.getSpeed());


	}

}
