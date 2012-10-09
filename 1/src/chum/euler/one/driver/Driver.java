package chum.euler.one.driver;

import chum.euler.one.common.Parameters;

public class Driver {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i < Parameters.RANGE; i++) {

			// Very dumb algorithm, just check if i is divisible by 3 or 5 and add to sum
			if (i % 3 == 0 || i % 5 == 0) {
				sum += i;
			}
		}
		System.out.println("Sum: " + sum);
	}
}
