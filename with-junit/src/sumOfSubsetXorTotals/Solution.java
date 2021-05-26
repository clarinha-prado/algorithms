package sumOfSubsetXorTotals;

import java.util.Arrays;

public class Solution {

	public int subsetXORSum(int[] nums) {
		int sum = 0;
		int subsetXOR = 0;
		int n = nums.length;

		// Run a loop to build all 2^n
		// subsets one by one
		for (int i = 0; i < (1 << n); i++) {

			// build current subset
			for (int j = 0; j < n; j++) {

				// (1<<j) is a number with jth bit 
				// so when this bit == 1 and we 'and' them with the
				// subset number we get which numbers
				// are present in the subset and which
				// are not
				if ((i & (1 << j)) > 0)
					subsetXOR ^= nums[j];
			}
			sum += subsetXOR;
			subsetXOR = 0;
		}

		return sum;
	}

	public static void main(String[] args) {
		int[][] input = { { 1, 3 }, { 5, 1, 6 }, { 3, 4, 5, 6, 7, 8 } };
		int[] expectedOutput = { 6, 28, 480 };

		Solution solution = new Solution();
		for (int i = 0; i < 3; i++) {
			int output = solution.subsetXORSum(input[i]);
			System.out.println(output);
			System.out.println(expectedOutput[i]);
		}
	}

}
