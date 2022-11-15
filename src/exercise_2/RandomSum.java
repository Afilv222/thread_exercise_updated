package exercise_2;


public class RandomSum extends Thread{
	RandomGen randomGen;
	private static int randomSum;
	
	public RandomSum(RandomGen randomGen) {
		this.randomGen = randomGen;
	}
	
	public void run() {
		int r = randomGen.randomized();	
		randomSum += r;
		System.out.println(r);
	}
	
	public static void main(String args[]){
		
		System.out.println("The 5 random numbers generated are:");
		
		RandomGen randomGen = new RandomGen();
		Thread a = new RandomSum(randomGen);
		Thread b = new RandomSum(randomGen);
		Thread c = new RandomSum(randomGen);
		Thread d = new RandomSum(randomGen);
		Thread e = new RandomSum(randomGen);
		a.start();
		b.start();
		c.start();
		d.start();
		e.start();

		try{
			a.join();
			b.join();
			c.join();
			d.join();
			e.join();
		} catch(InterruptedException f){
			f.printStackTrace();
		}

		System.out.println(randomSum);
		
		
	}	
}


