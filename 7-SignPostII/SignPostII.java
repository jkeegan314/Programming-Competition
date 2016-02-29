import java.util.ArrayList;
import java.util.Scanner;

public class SignPostII {
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
	
	public static Square[][] solveSignPostII(Square[][] puzzle){
		//  INSERT YOUR CODE HERE
		//
		//  The code should return a completed puzzle
		//
		//
		
		return puzzle;
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
	
	public static void writePuzzle(Square[][] puzz){
		// Write a puzzle to a buffer in text format
		System.out.print(""+puzz.length+"\n");
		for(Square[] row : puzz)  {
			for(Square sq : row)  {
				System.out.print(sq.toString()+"  ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		//  Read in each puzzle from the input file, solve it, and write results to output
		
		int numPuzzles = sc.nextInt();  //  the first line contains the number of puzzles in the file

		System.out.println("" + numPuzzles);

		for(int n = 0; n < numPuzzles; n++){
			Square[][] puzzle = readPuzzle(sc);
			// Solve the puzzle using YOUR routine
			puzzle = solveSignPostII(puzzle);
			// Record results to output file
			writePuzzle(puzzle);
		}

		sc.close();
	}
}
