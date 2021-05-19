package intervalListIntersections;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int[][][] firstList = { 
				{ { 0, 2 }, { 5, 10 }, { 13, 23 }, { 24, 25 } },
				{ { 1, 3 }, { 5, 9 } }
				};
		int[][][] secondList = { 
				{ { 1, 5 }, { 8, 12 }, { 15, 24 }, { 25, 26 } },
				{ }
				};
		int[][][] expectedOutput = { 
				{ { 1, 2 }, { 5, 5 }, { 8, 10 }, { 15, 23 }, { 24, 24 }, { 25, 25 } },
				{ }
				};

		Solution solution = new Solution();

		for (int i = 0; i < 2; i++) {
			int[][] output = solution.intervalIntersection(firstList[i], secondList[i]);
			System.out.println("\n\noutput: ");
			print2D(output);
			System.out.println("\nexpectedOutput: ");
			print2D(expectedOutput[i]);
		}
	}
	
    public static void print2D(int mat[][])
    {
        // Loop through all rows
        for (int[] row : mat)
 
            // converting each row as string
            // and then printing in a separate line
            System.out.print(Arrays.toString(row));
    }
 
}
