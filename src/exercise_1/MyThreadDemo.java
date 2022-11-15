package exercise_1;

public class MyThreadDemo {
	public static void main(String[] args) {
		MyThread t1 = new MyThread("A", 1);
		MyThread t2 = new MyThread("B", 1000);
		MyThread t3 = new MyThread("C", 1);
		t1.run();
		t2.run();
		t3.run();
	}
}
