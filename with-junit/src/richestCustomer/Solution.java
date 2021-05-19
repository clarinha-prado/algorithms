package richestCustomer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public int maximumWealth(int[][] accounts) {
    	//List<Integer> result = new ArrayList<Integer>();
    	int[] result2 = new int[accounts.length];
    	
    	for (int i=0; i<accounts.length; i++) {
    		//result.add(Integer.valueOf(Arrays.stream(accounts[i]).reduce(0, (accumulator, item) -> accumulator + item)));
    		result2[i] = Arrays.stream(accounts[i]).reduce(0, (acc, item) -> acc + item);
    	}
    	
    	int max = Arrays.stream(result2).max().orElse(0); 
        return max;
    }

	public static void main(String[] args) {
		int[][] accounts = {{1,2,3},{3,2,1}};
		int expectedOutput = 6;
		
		Solution solution = new Solution();
		
		int output = solution.maximumWealth(accounts);
		System.out.println(output);
		System.out.println(expectedOutput);
	}
}
