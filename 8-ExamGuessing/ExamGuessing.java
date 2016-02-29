//----------------------------------------------------------------------
// Best viewed with tabs every 4 columns
//----------------------------------------------------------------------

import java.util.*;

/** ExamGuessing - Determines how many questions to guess at on an exam.
 *
 * There are n questions on an exam, and let C and W be two positive
 * integers.
 *
 *  - If an answer is given and it is correct, we receive C points.
 *
 *  - If an answer is given and it is incorrect, we lose W points.
 *
 *  - If a question is left blank, we receive 0 points.
 *
 * Our teacher does not want any negative scores, so every student will
 * receive a score of at least zero. Thus, if we answer i out of n
 * questions correctly, our score will be:
 *
 *		max(0, i * C - (n-i) * W)
 *
 * We are given an array of probabilities, p[0], ..., p[n-1], where p[i]
 * is the probability that our answer for the i-th exam question is
 * correct. The computational problem is this: Which questions should we
 * attempt to answer in order to maximize the expected score on the
 * exam?
 *
 * Provide the body for the function whichToAttempt below. The
 * function's output is in the form of the boolean array attempt, where
 * attempt[i] is true if we determine that we should attempt the i-th
 * question.
 *
 * To make the problem a bit easier to solve efficiently, we are told
 * that there will be only five possible probability values: 1/4, 1/2,
 * 3/4, and 1. (The solution can either take advantage of this fact or
 * ignore it.)
 *
 */
public class ExamGuessing {

	/** 
	 *  Main Program - Reads the input and outputs the final answer.
	 */
	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		int numTrials = scanner.nextInt();	// number of trials to run

		for(int t = 1; t <= numTrials; t++) {
			int n = scanner.nextInt();		// number of questions
			int C = scanner.nextInt();		// points for correct answer
			int W = scanner.nextInt();		// penalty for incorrect answer
			double[] p = new double[n];		// probabilities

			for (int i = 0; i < n; i++) {	// input the probabilities
				p[i] = scanner.nextDouble();
											// check
				if (p[i] != 0.25 && p[i] != 0.50 && p[i] != 0.75 && p[i] != 1.00) {
					System.out.println("Error - Invalid probability value");
					scanner.close();
					return;
				}
			}

											// the questions to attempt
			boolean[] attempt = new boolean[n];

			for (int i = 0; i < n; i++) {	// initialize
				attempt[i] = false;
			}
											// summarize input
			System.out.println("Trial " + t + ":\n" +
					"  " + n + " questions\n" +
					"  " + C + " points for correct answers\n" +
					"  " + W + " point deduction for incorrect answers\n");

											// determine which to try
			double maxExpScore = whichToAttempt(n, C, W, p, attempt);
											// output results
			System.out.println("  Maximum expected score = " + maxExpScore);

			for (int i = 0; i < n; i++) {
				System.out.print("  Prob[" + i + "] = " + p[i] + "  ---  ");
				if (attempt[i]) 
				{
					System.out.println("attempt");
				}
				else
				{
					System.out.println("skip");
				}
			}
			System.out.println();
		}
		scanner.close();					// close input stream
	}

	private static double whichToAttempt(int n, int C, int W, double[] p, boolean[] attempt) {

		/* -------------------- INSERT CODE HERE ----------------------*/

		return 0;				// return max expected score
	}

	/** Return score assuming i correct out of k guessed.
	 * 
	 */
	private static int score(int i, int k, int C, int W) {
		int rawScore = i * C - (k-i) * W;
		if (rawScore < 0) {
			return 0;
		}
		else {
			return rawScore;
		}
	}
}
