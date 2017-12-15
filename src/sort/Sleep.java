package sort;

public class Sleep extends Sort {

	public static int factor = 20;
	
	@Override
	public int[] sort(int[] arr) {
		Worker[] workers = new Worker[arr.length];
		Thread[] threads = new Thread[arr.length];
		for (int i = 0; i < workers.length; i++) {
			workers[i] = new Worker(arr[i]);
			threads[i] = new Thread(workers[i]);
		}
		for (Thread worker : threads) {
			worker.start();
		}
		int index = 0;
		while (index < arr.length) {
			for (Worker worker : workers) {
				if (worker.getStatus() == 1) {
					arr[index++] = worker.getNumber();
					worker.setStatus(2);
				}
			}
		}
		return arr;
	}

}

class Worker implements Runnable {
	
	private int number;
	private int status;
	
	public Worker(int number) {
		this.number = number;
		this.status = 0;
	}
	
	public int getNumber() {
		return number;
	}
	
	public int getStatus() {
		return status;
	}
	
	public void setStatus(int status) {
		this.status = status;
	}
	
	@Override
	public void run() {
		try {
			Thread.sleep(number * Sleep.factor);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		this.status = 1;
	}
}


