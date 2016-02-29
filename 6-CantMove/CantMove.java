//----------------------------------------------------------------------
// Best viewed with tabs every 4 columns
//----------------------------------------------------------------------

import java.util.*;

/**
 * CantMove - This program determines the winner in a stone removal
 * game.
 *
 * In the can't-move game there are two players, P1 and P2. They share a
 * common pile of stones, and each starts with a designated maximum
 * number of stones that this player may remove. The players alternate
 * turns, with Player 1 starting. With each turn a player can remove
 * either one or two stones from the pile. A player loses when it is
 * this player's turn and either the stone pile is empty or the player
 * has exhausted his/her allocation of stones to remove.
 *
 * Given an input configuration, consisting of the initial number of
 * stones, the number of stones player 1 can take, and the number of 
 * stones player 2 can take, the program determines which player has a 
 * winning strategy.
 */
public class CantMove {

	/** 
	 *  Main Program - Reads the input and outputs the final answer.
	 */
	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		int numTrials = scanner.nextInt();	// number of trials to run

		for(int t = 1; t <= numTrials; t++) {
			int nStones = scanner.nextInt();// initial number of stones
			int nTake1 = scanner.nextInt();	// number of stones P1 may take
			int nTake2 = scanner.nextInt();	// number of stones P2 may take

			System.out.println("Trial " + t + ":\n" +
					"  " + nStones + " stones\n" +
					"  up to " + nTake1 + " stones may be taken by P1 in total\n" +
					"  up to " + nTake2 + " stones may be taken by P2 in total\n");

											// input sanity check
			if (nStones < 0 || nTake1 < 0 || nTake2 < 0) {
				System.out.println("Error: Inputs must be nonnegative");
				scanner.close();
				return;
			}
			if (nStones > 1000 || nTake1 > nStones || nTake2 > nStones) {
				System.out.println("Warning: Inputs beyond reasonable limits");
			}

											// determine the winner
			int winner = getWinner(nStones, nTake1, nTake2);

											// print the output
			if (winner == 1 || winner == 2) {
				System.out.println("Player P" + winner + " wins");
			}
			else {
				System.out.println("Error - The answer must be either 1 or 2");
			}
			System.out.println();
		}
		scanner.close();					// close input stream
	}

	private static int getWinner(int nStones, int nTake1, int nTake2) {

		/* -------------------- INSERT CODE HERE ----------------------*/

		return 0;
		/* --------------------- END OF INSERTION ---------------------*/
	}

}
