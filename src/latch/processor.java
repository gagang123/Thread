package latch;

import java.util.concurrent.CountDownLatch;

public class processor implements Runnable{

	private CountDownLatch latch;

	public processor(CountDownLatch latch) {
	    this.latch = latch;
	}

	public void run() {
	    System.out.println("Started.");

	    try {
	        Thread.sleep(3000);
	    } catch (InterruptedException e) {
	        // TODO Auto-generated catch block
	        e.printStackTrace();
	    }

	    latch.countDown();
	}

}
