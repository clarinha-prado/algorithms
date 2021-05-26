package sumOfSubsetXorTotals;

import java.util.Arrays;

public class Solution {

	public int subsetXORSum(int[] nums) {
		int sum = 0;
		int partialXOR = 0;
		int subArrayXOR = 0;

		if (nums.length == 0)
			return sum;

		if (nums.length == 1)
			return nums[0];

		if (nums.length == 2)
			return (nums[0] ^ nums[1]) + nums[0] + nums[1];

		sum = Arrays.stream(nums).sum();

		for (int sub = 1; sub < nums.length; sub++) {
			for (int i = 0; i < nums.length - sub; i++) {
				subArrayXOR = subsetXOR(Arrays.copyOfRange(nums, i, sub + i));
				for (int j = sub + i; j < nums.length; j++) {
					partialXOR = subArrayXOR ^ nums[j];
					sum += partialXOR;
				}
			}
		}

		return sum;
	}

	private int subsetXOR(int[] input) {
		if (input.length == 1)
			return input[0];
		else {
			return Arrays.stream(input).reduce(0, (acc, item) -> acc ^ item);
		}
	}

	public static void main(String[] args) {
		int[][] input = { { 1, 3 }, { 5, 1, 6 }, {3,4,5,6,7,8} };
		int[] expectedOutput = { 6, 28, 480 };

		Solution solution = new Solution();
		for (int i = 0; i < 3; i++) {
			int output = solution.subsetXORSum(input[i]);
			System.out.println(output);
			System.out.println(expectedOutput[i]);
		}
	}

}
