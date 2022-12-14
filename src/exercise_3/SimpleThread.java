package exercise_3;

public class SimpleThread extends Thread{

	Resource resource;
	
	
	SimpleThread(Resource resource){
		this.resource = resource;
	}
	
	
	public void run() {
		
		for(int i = 0; i<10; i++){
			try {
			System.out.println(resource.increment());
			
			Thread.sleep(1);
			
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	


	public static void main(String args[]) {
		Resource resource = new Resource();
		Thread t = new SimpleThread(resource);
		Thread s = new SimpleThread(resource);
		
		t.start();
		s.start();

	}

}
