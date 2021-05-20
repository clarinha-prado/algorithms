package blueBulbs;

import java.util.Arrays;

// https://leetcode.com/problems/bulb-switcher-iii/
public class Solution {

	public int numTimesAllBlue(int[] light) {
    	int[] bulbs = new int[light.length];
    	int allBlue = 0;
    	int lastIndex = 0;
    	
    	for (int i = 0; i<light.length; i++) {
    		bulbs[light[i]-1] = 1;
    		boolean allOn = true;
    		lastIndex = lastIndex > light[i]-1 ? lastIndex : light[i]-1;
    		for (int j=0; j< lastIndex;j++) {
    			if (bulbs[j] == 0) {
    				allOn = false;
    				break;
    			}
    		}
    		if (allOn)
        		allBlue++;
    	}
    	return allBlue;
    }

	public static void main(String[] args) {
		int[][] light = {
				{4,1,2,3},
				{3,2,4,1,5},
				{4,1,2,3},
				{2,1,4,3,6,5},
				{1,2,3,4,5,6},
		};
		int[] expectedOutput = {1,2,1,3,6};
		
		Solution solution = new Solution();
		for (int i = 0; i<5; i++) {
			int output = solution.numTimesAllBlue(light[i]);
			
			System.out.println(output);
			System.out.println(expectedOutput[i]);
		}
	}

}
