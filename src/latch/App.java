package latch;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class App {
	public static void main(String[] args) {

	    CountDownLatch latch = new CountDownLatch(2); // coundown from 3 to 0

	    ExecutorService executor = Executors.newFixedThreadPool(1); // 3 Threads in pool

	    for(int i=0; i < 3; i++) {
	        executor.submit(new processor(latch)); // ref to latch. each time call new Processes latch will count down by 1
	    }


	    try {
	        latch.await();  // wait untill latch counted down to 0
	    } catch (InterruptedException e) {
	        // TODO Auto-generated catch block
	        e.printStackTrace();
	    }

	    System.out.println("Completed.");
	    }
}
