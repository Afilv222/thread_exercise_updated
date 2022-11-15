package exercise_2;


import java.util.Random;

public class RandomGen{
	
	int random = 0;
	
	
	public int randomized(){	
		Random r = new Random();
		return random = r.nextInt(100) + 1;
	}

}
