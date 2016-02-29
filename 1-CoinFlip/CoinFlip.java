import java.util.Scanner;

public class CoinFlip {
	
	/* Given an array of coin positions & instructions on which range of
	 * coins to flip each time, calculate the resulting coin positions
	 * as an array.
	 * 
	 * For instance, given coins = [HHH], flip = [1 1][1 3],
	 * first flip coins from positions 1 to 1, yielding [THH],
	 * then flip coins from positions 1 to 3, yielding [HTT].
	 * 
	 * Return the sequence of results [ [THH], [HTT] ]
	 */
    private static char[][] flipCoins(char coins[], int flip[][]) {

    	int numFlips = flip.length; /* number of flips */
    	
    	/* allocate storage for solution */
    	char result[][] = new char[numFlips][];
    	for (int i=0; i<numFlips; i++)
    		result[i] = coins.clone();  /* new char[coins.length] */
    		
        /* ------------------- INSERT CODE HERE ---------------------*/
    	char middle[][] = new char[numFlips][];
    	for (int i=0; i<numFlips; i++)
    		middle[i] = coins.clone();  /* new char[coins.length] */
    	for (int i=0; i<numFlips; i++)
    	{
    		for (int x = 0; x < coins.length; x++)
    		{
    			if (x >= (flip[i][0] - 1) && x <= (flip[i][1] - 1))
    			{
    				System.out.println(x);
    				if (middle[i][x] == 'H')
					{
						middle[i][x] = 'T';
						System.out.println("Flipped " + i + x);
					}
    				else
    				{	middle[i][x] = 'H';
    					System.out.println("Flipped " + i + x);
    				}
    			}
    		}
    		System.out.println("NOW PRINTING MID");
    		for(char[] a : middle)
        	{	for(char b : a)
        			System.out.print(b);
    			System.out.println();
        	}
    		System.out.println("NOW PRINTING RESULT");
    		for(char[] a : result)
        	{	for(char b : a)
        			System.out.print(b);
    			System.out.println();
        	}
    		//use for loop to put it in temp so no variable refrences crossing
    		result[i] = middle[i] ;
    		System.out.println("Wrote to result.");
    		if(i<numFlips-1)
			{
				middle[i+1] = middle[i];
				System.out.println("Copied row " + i + "to row" + (i+1) + "in MID");
			}
    		
    		
    		
    		System.out.println("NOW PRINTING MID");
    		for(char[] a : middle)
        	{	for(char b : a)
        			System.out.print(b);
    			System.out.println();
        	}
    		System.out.println("NOW PRINTING RESULT");
    		for(char[] a : result)
        	{	for(char b : a)
        			System.out.print(b);
    			System.out.println();
        	}
    	}
    			
    	
    	
    	
    	
    	
    	
    		
        /* -------------------- END OF INSERTION --------------------*/
    	
        return result;

    }
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int numOfTestCases = sc.nextInt();

		for (int testCase=0; testCase < numOfTestCases; testCase++) {
			String board = sc.next();
			char coins[] = board.toCharArray();

			int numFlips = sc.nextInt();
			int flip[][] = new int[numFlips][2];
			
			for (int i=0; i < numFlips; i++) {
				flip[i][0] = sc.nextInt();
				flip[i][1] = sc.nextInt();
			}

			char result[][] = flipCoins(coins, flip);
		
			System.out.printf("%s ", board);
			for (int i=0; i<numFlips; i++) {
				System.out.printf("%s ", new String(result[i]));		}
			System.out.println();

		}
		
		sc.close();
	}
}

