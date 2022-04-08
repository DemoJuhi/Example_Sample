import java.util.concurrent.CountDownLatch;

public class Thread11 implements Runnable {

	CountDownLatch latch;
	
	public Thread11(CountDownLatch latch,String value) {
		super();
		this.latch = latch;
		System.out.println(value);
	}

	@Override
	public void run() {
		
		System.out.println("entered inside the run block")
		;
		latch.countDown();
	}

}
