package pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class processor implements Runnable {
	int id;

	public processor(int id) {
		this.id = id;

	}

	public void run() {

		System.out.println("starting the work: " + id);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("completed the work the id: " + id);
	}

}

public class App {

	public static void main(String[] args) {

		ExecutorService executor = Executors.newFixedThreadPool(3);

		System.out.println("All task submitted");
		for (int i = 0; i < 10; i++) {
			executor.submit(new processor(i));
		}
		
		try {
			executor.awaitTermination(1, TimeUnit.HOURS);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
