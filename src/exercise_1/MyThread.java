package exercise_1;


class MyThread implements Runnable {
	private long sleepTime;
	private String name;

	MyThread(String name, long time) {
		this.name = name;
		this.sleepTime = time;
		System.err.println("Name: " + name + "; sleep: " + sleepTime);
	}

	public void run() {
		for(int i = 0; i < 5; i++){
			try{
				Thread.sleep(sleepTime);
				System.err.println(name + " started.");
			}
			catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
}
