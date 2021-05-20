package nearbyDuplicate;

public class Solution {

	public boolean containsNearbyDuplicate(int[] nums, int k) {
		if (nums.length <2)
			return false;
		
		for (int j = 0; j < nums.length-1; j++) {
			int current = nums[j];
			int lastIndex = (j+k) < nums.length ? (j+k) : nums.length-1;
			for (int i = j; i < lastIndex; i++) {
				if (current == nums[i + 1])
					return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int[][] nums = { {1,2,3,4,5,6,7,8,9,9},{ 1, 2, 3, 1 }, { 1, 0, 1, 1 }, { 1, 2, 3, 1, 2, 3 } };
		int[] k = { 3, 3, 1, 2 };
		boolean[] expectedOutput = { true,true, true, false };

		Solution solution = new Solution();

		for (int i = 0; i < 4; i++) {
			boolean output = solution.containsNearbyDuplicate(nums[i], k[i]);

			System.out.println("\noutput        : " + output);
			System.out.println("expectedOutput: " + expectedOutput[i]);
		}
	}

}
