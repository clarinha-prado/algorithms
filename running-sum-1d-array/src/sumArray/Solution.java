package sumArray;

public class Solution {
    public int[] runningSum(int[] nums) {
    	int acc = 0;
    	int[] output = new int[nums.length];
        for (int i=0;i<nums.length;i++) {
        	acc += nums[i];
        	output[i] = acc;
        }
        
        return output;
    }
}
