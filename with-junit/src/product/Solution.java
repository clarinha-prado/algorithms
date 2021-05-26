package product;

import java.util.Arrays;

public class Solution {

	public static int[] productExceptSelf(int[] nums) {
		int[] product = new int[nums.length];
		int result = 1;

		for (int i = 0; i < nums.length; i++) {
			for (int j = 1; j < nums.length +1; j++) {
				if (i+1 != j) {
					result = result * j;
				}
			}
			product[i] = result;
			result = 1;
		}
		return product;
	}
	public static void main(char[] args) {
	}
	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4 };

		System.out.println(Arrays.toString(Solution.productExceptSelf(nums)));

	}

}
