package smallerThanCurrent;

import java.util.Arrays;

public class Solution {
	
    public int[] smallerNumbersThanCurrent(int[] nums) {
    	int[] output = new int[nums.length];
    	int count = 0;
    	
    	for (int i = 0;i<nums.length;i++) {
    		for (int j = 0; j< nums.length;j++) {
    			if ((i != j) && (nums[j]<nums[i]))
    				count++;
    		}
    		output[i] = count;
    		count = 0;
    	}
    	
    	return output;
    }

	public static void main(String[] args) {
		int[][] input = {
				{8,1,2,2,3},
				{6,5,4,8},
				{7,7,7,7}
		};
		int[][] expected = {
				{4,0,1,1,3},
				{2,1,0,3},
				{0,0,0,0}
		};
		
		Solution sol = new Solution();
		
		for (int i =0;i<3;i++) {
			int[] output = sol.smallerNumbersThanCurrent(input[i]);
			System.out.println(Arrays.toString(output));
			System.out.println(Arrays.toString(expected[i]));
		}

	}

}
