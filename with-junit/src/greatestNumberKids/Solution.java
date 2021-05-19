package greatestNumberKids;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
	
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
    	List<Boolean> output = new ArrayList<Boolean>();
    	
    	int max =  Arrays.stream(candies).max().getAsInt();
    	
    	for (int i = 0; i<candies.length; i++) {
    		if (candies[i]+extraCandies >= max) {
    			output.add(Boolean.valueOf(true));
    		} else {
    			output.add(Boolean.valueOf(false));
    		}
    	}
    	return output;
    }

	public static void main(String[] args) {
		int[][] candies = {{2,3,5,1,3}};
		int[] extraCandies = {3};
		boolean[][]	expectedOutput = {{true,true,true,false,true}};
		
		Solution solution = new Solution();
		
		for (int i = 0; i<1; i++) {
			Boolean[] output = (solution.kidsWithCandies(candies[i], extraCandies[i])).toArray(new Boolean[expectedOutput[i].length]);
			System.out.println(Arrays.toString(output));
			System.out.println(Arrays.toString(expectedOutput[i]));
		}

	}

}
