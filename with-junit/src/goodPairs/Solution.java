package goodPairs;

public class Solution {
	
    public int numIdenticalPairs(int[] nums) {
    	int goodPairs = 0;
    	
        for (int i = 0; i< nums.length - 1; i++) {
        	for (int j = i+1; j<nums.length;j++) {
        		if (nums[i] == nums[j])
        			goodPairs ++;
        	}
        }
        
        return goodPairs;
    }

	public static void main(String[] args) {
		int[][] input = {
				{1,2,3,1,1,3},
				{1,1,1,1},
				{1,2,3}
		};
		int[] expectedOutput = {4,6,0};

		Solution solution = new Solution();
		for (int i = 0 ; i<3; i++) {
			int output = solution.numIdenticalPairs(input[i]);
			System.out.println(output);
			System.out.println(expectedOutput[i]);
		}
	}

}
