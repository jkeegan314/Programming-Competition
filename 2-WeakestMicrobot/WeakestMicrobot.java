import java.util.ArrayList;
import java.util.Scanner;

class Edge {
	String node1;
	String node2;
	Edge(String n1, String n2) {
		node1 = n1;
		node2 = n2;
	}
}

public class WeakestMicrobot {

	private static String solveWeakestMicrobot(ArrayList<Edge> edges)
	{
		/* ------------------- INSERT CODE HERE ---------------------
		 *
		 * For a node, define local_density = count(how many edges among its neighbors)/count(how many possible edges among its neighbors)
		 *
		 * Find the node with the least density as defined in the problem description.
		 *
		 * */

		return null;
		/* -------------------- END OF INSERTION --------------------*/
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int numTests = sc.nextInt();		// number of test cases

		for (int t = 0; t < numTests; t++) {
			int numEdges = sc.nextInt();
			ArrayList<Edge> edges = new ArrayList<Edge>();

			for(int i = 0; i < numEdges; i++) 
				edges.add(new Edge(sc.next(), sc.next()));

			System.out.println("The lexicographically first microbot with the weakest neighborhood is " + solveWeakestMicrobot(edges));
		}

		sc.close();
	}
}
