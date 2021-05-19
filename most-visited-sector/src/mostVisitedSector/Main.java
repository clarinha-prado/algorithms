package mostVisitedSector;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		int[] n = {4, 2, 7};
		
		int[][] input = {
				{1,3,1,2},
				{2,1,2,1,2,1,2,1,2},
				{1,3,5,7}
		};
		
		int[][] expectedOutput = {
				{1,2},
				{2},
				{1,2,3,4,5,6,7}
		};
		
		for (int i = 0; i<3; i++) {
			Solution solution = new Solution();
			List<Integer> output = solution.mostVisited(n[i], input[i]);
			
			System.out.println("output: " + output.toString());
			System.out.println("expected: " + Arrays.toString(expectedOutput[i]));
		}
	}
}
