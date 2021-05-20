package shuffleArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    public int[] shuffle(int[] nums, int n) {
    	List<Integer> output = new ArrayList<Integer>();
    	
    	for (int i = 0; i<nums.length/2 ; i++) {
    		output.add(nums[i]);
    		output.add(nums[i+n]);
    	}
    	
    	return output.stream().mapToInt(Integer::intValue).toArray();
    }
    
    public static void main(String[] args) {
    	int[] input = {2,5,1,3,4,7};
    	int n = 3;
    	int[] expectedOutput = {2,3,5,4,1,7};
    	
    	Solution solution = new Solution();
    	int[] output = solution.shuffle(input, n);
    	
    	System.out.println(Arrays.toString(output));
    	System.out.println(Arrays.toString(expectedOutput));
	}

}
