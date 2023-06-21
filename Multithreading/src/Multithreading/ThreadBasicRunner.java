package Multithreading;

//스레드의 여려 상태

//NEW : 코드 실행 준비 끝,사용자는 아직 실행요구 하지 않은 상태
//RUNNABLE:실행은 가능하나, 다른 스레드가 우선적으로 실행중
//RUNNING:실행중
//BLOCKED/WAITING:외부인터페이스나 데이터베이스로부터 어떤 입력을 대기중이거나, 실행이 완료되지 않은 스레드로부터 데이터를 입력받아야하는 상태
//TERMINATED/DEAD:실행이 모두 끝난 상태
//scheduler : 스케쥴러? 한정된 메모리를 여러 프로세스가 효율적으로 사용할 수 있또록 실행할 프로세스를 선택하는 것
//Thread.sleep(n) : 스레드를 n 밀리초만큼 일시정지
//Thread.yield(): 스레드를 대기상태로.. 우선순위를 다른 스레드에게 넘겨주기 스케쥴러는 이를 무시할 수 있다
class Task1 extends Thread {
	public void run() {// SIGNATURE
		System.out.print("\nTask1 Started");
		for (int i = 101; i <= 199; i++)
			System.out.print(i + " ");

		System.out.print("\nTask1 Done");
	}
}

class Task2 implements Runnable {

	@Override
	public void run() {
		System.out.print("\nTask2 Started");
		for (int i = 201; i <= 299; i++)
			System.out.print(i + " ");
		System.out.print("\nTask2 Done");
		

	}

}

public class ThreadBasicRunner {
	public static void main(String[] args) throws InterruptedException {
		// Task1 101 ~ 199
		System.out.print("\nTask1 Kicked Off");
		Task1 task1 = new Task1();
		task1.setPriority(1); // .setPriority(1~10) <- 스레드에게 우선순위를 추천해준다.. 항상 반영되는것은 아니고 50%정도 숫자가 높을수록 우선된다
		task1.start(); // task1.run();
		System.out.print("\nTask2 Kicked Off");
		// Task2
		Task2 task2 = new Task2();
		Thread task2Thread = new Thread(task2);
		task2Thread.setPriority(10);
		task2Thread.start();

		// task1,task2 이 완료될때까지 task3의 실행을 보류하려면 ?
		task1.join();
		task2Thread.join();
		System.out.print("\nTask3 Kicked Off");
		// Task3
		for (int i = 301; i <= 399; i++)
			System.out.print(i + " ");
		System.out.print("\nTask3 Done");
		System.out.print("\nMain Done");

	}
}
