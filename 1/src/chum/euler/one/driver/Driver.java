package chum.euler.one.driver;

public class Driver {
	public final static int RANGE = 1000;

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i < Driver.RANGE; i++) {

			// Very dumb algorithm, just check if i is divisible by 3 or 5 and add to sum
			if (i % 3 == 0 || i % 5 == 0) {
				sum += i;
			}
		}
		System.out.println("Sum: " + sum);
	}

}
