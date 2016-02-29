import java.util.Scanner;


public class SignPostI {
	static class Square{
		String direction; 
		int number;

		Square(String direction, int number) {
			this.direction = direction;
			this.number = number;
		}
		Square(int number, String direction) {
			this.direction = direction;
			this.number = number;
		}
		public String toString(){
			return ""+String.format("%02d", number)+" "+direction;
		}
	}
	
	public static int solveSignPostI(Square[][] puzzle){
		//
		//
		//  INSERT YOUR CODE HERE
		//
		//  Your code should check if the provided solution is valid, or not. 
		//  If it is valid, return -1.
		//  If not: return the first number that is out of place.
		//
		
		return -1; // the puzzle solution is valid
	}
	
	public static Square[][] readPuzzle(Scanner sc){
		int puzzSize = sc.nextInt();
		// Read a puzzSize * puzzSize * 2 array of entries and instantiate the Squares array
		Square[][] puzzle = new Square[puzzSize][puzzSize];
		for(int i = 0; i < puzzSize; i++)  {
			for(int j = 0; j < puzzSize; j++)  {
				puzzle[i][j] = new Square(sc.nextInt(), sc.next());
			}
		}
		return puzzle;
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		//  Read in each puzzle, solve it, and write results to output
		
		int numPuzzles = sc.nextInt();  //  the first line contains the number of puzzles in the file

		for(int n = 0; n < numPuzzles; n++){
			Square[][] puzzle = readPuzzle(sc);

			// Solve the puzzle using YOUR routine
			int isValid = solveSignPostI(puzzle);

			if(isValid < 0)
				System.out.println("The solution is valid");
			else
				System.out.println("The solution is invalid, and the first incorrect number is " + isValid);
		}		
	}
}
