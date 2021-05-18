package sumArray;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int[][] input = {{1,2,3,4}, {1,1,1,1,1}, {3,1,2,10,1}};
		int[][] expectedOutput = {{1,3,6,10}, {1,2,3,4,5}, {3,4,6,16,17}};

		for (int i=0;i<3;i++) {
			Solution solution = new Solution();
			int[] output = solution.runningSum(input[i]);
			System.out.println("output: " + Arrays.toString(output));
			System.out.println("expected: " + Arrays.toString(expectedOutput[i]) + "\n");
		}
	}

}
