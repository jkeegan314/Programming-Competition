import java.util.Scanner;

public class DigitProductSequence {
	private static int solveDSPSequence(int base, int seq) {

		/* ------------------- INSERT CODE HERE ---------------------*/

		/* For the Digit Product Sequence using Base = base, find and return the next number 
		 * after seq
		 */

		/* -------------------- END OF INSERTION --------------------*/

		return -1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int numCases = sc.nextInt();

		for(int n = 0; n < numCases; n++)
		{
			int base = sc.nextInt();
			int seq = sc.nextInt();
			System.out.println("In Base " + base + " DSP sequence, the number after " +  seq + " is " +  solveDSPSequence(base, seq));
		}

		sc.close();
	}
}
