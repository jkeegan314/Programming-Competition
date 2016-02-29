import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class MinFlip {
 
    /* convert sequence of flips saved as char[][] into a String */
    private static String buildString(char coins[][]) {
		String seq = "";
		int numFlip = coins.length;
		for (int j=0; j<numFlip; j++) {
			seq = seq + new String(coins[j]) + " ";
		}
		return seq;
    }
    
    /* Given a String of coin positions, find all minimal length
     * sequences of flips that result in all heads. For each sequence,
     * show the coin positions separated by spaces. Return all sequences 
     * in an ArrayList<String>, which will be sorted by alphabetical order
     * before being output. No flips should be returned if coins are
     * initially all heads.
     * 
     * For instance, given [TTT] return [HHH]. [HHH] returns empty ArrayList.
     */

    private static ArrayList<String> findMinFlip(String board) {
		char coins[] = board.toCharArray();
		int numCoins = coins.length;
		ArrayList<String> soln = new ArrayList<String>();

        /* ------------------- INSERT CODE HERE ---------------------*/
		
		char result[][] = new char[1][numCoins];
		result[0] = coins.clone();		/* example flip result */
		soln.add(buildString(result));	/* convert flips into a String */
 
    	
		
		
    	
    	
    	
    		
        /* -------------------- END OF INSERTION --------------------*/
		
    	return soln;
    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int numOfTestCases = sc.nextInt();

		for (int testCase=0; testCase < numOfTestCases; testCase++) {
			String board = sc.next();

			ArrayList<String> soln = findMinFlip(board);
			System.out.printf("Coins %s \n", board);
			Collections.sort(soln);
			for (String s : soln) 
				System.out.printf("%s %s \n", board, s.trim());
		}
		
		sc.close();
	}
}

