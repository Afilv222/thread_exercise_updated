package exercise_3;


public class Resource {

	int counter;
	
	synchronized public int increment() {
		return counter++;
	}
	
}
