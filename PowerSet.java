package project_2017_exampleCode;

import java.util.Scanner;

public class PowerSet {

	public static void main(String[] args) {
		System.out.println("This program prints the power set of the set of natural numbers 0 ... N.");
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter N (0 <= N <= 100: )");
		int n = sc.nextInt();

		System.out.println("The PowerSet of{");
		// Loop to print all elements zero to n, being included in the Subsets.
		for (int k = 0; k <= n; k++) {
			System.out.print(k);
			if (k < n)
				System.out.print(",");

		}
		System.out.print("}:is");
		System.out.println();

		printSubsets(n);

	}

	/**
	 * Method to calculate the Power Set.
	 * 
	 * @param n
	 *            Argument n represents all natural numbers from zero to N, as
	 *            potential elements of subsets.
	 * 
	 */

	private static void printSubsets(int n) {

		int k = 0;

		// outer loop. This loop is repeated 2^n+1 times, due to the Power Set,
		// having 2^n elements.
		for (int i = 0; i < Math.pow(2, n + 1); i++) {
			if (i == 0) {
				System.out.print("{");
			}
			// convert i to a binary string and save it in the temporary
			// variable tempb of type String.
			String tempb = Integer.toBinaryString(i);

			int a = i;

			System.out.print("{");

			// inner loop. It is being processed for as many times as i,
			// respectively a, has marked binary digits.
			for (int j = 0; j < tempb.length(); j++) {

				if ((a & 1) == 1) {

					System.out.print(j);

					// set "," if necessary
					if (j < tempb.length() - 1)
						System.out.print(",");

				}
				// shift a for 1 digit in the right direction. to do the inner
				// loop again.
				a = a >> 1;

			}
			if (k < Math.pow(2, n + 1) - 1) {
				System.out.print("},");
				k++;
			} else {
				System.out.print("}}");
			}

		}
	}
}
