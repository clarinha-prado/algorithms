package mergeSortedArray;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int[][] nums1 = {
				{1,2,3,0,0,0},
				{1},
				{0}
		};
		int[][] nums2 = {
				{2,5,6},
				{},
				{1}
		};
		int[][] expectedOutput = {
				{1,2,2,3,5,6},
				{1},
				{1}
		};
		
		Solution solution = new Solution();

		for (int i = 0; i < 3; i++) {
			int[] output = solution.merge(nums1[i], nums1[i].length-nums2[i].length, nums2[i], nums2[i].length);
			System.out.println("output: " + Arrays.toString(output));
			System.out.println("expectedOutput: " + Arrays.toString(expectedOutput[i]));
		}

	}

}
