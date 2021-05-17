package removeCoveredIntervals;

import java.util.ArrayList;

// https://leetcode.com/problems/remove-covered-intervals/

public class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
    	ArrayList<Integer> itemsToRemove = new ArrayList<Integer>();
    	
    	for (int i=0; i<intervals.length;i++) {
    		
    		int[] current = intervals[i];
    		
    		for (int j=0; j<intervals.length;j++) {
    			if (i == j) {
    				continue;
    			}
    			if (isCovered(current, intervals[j])) {
    				itemsToRemove.add(Integer.valueOf(i));
    				break;
    			}
    		}
    	}
    	System.out.println("itens a remover: " +itemsToRemove.toString());
        return intervals.length - itemsToRemove.size();
    }
    
    // Interval [a,b) is covered by interval [c,d) if and only if c <= a and b <= d.
    // Interval [3,8) is covered by interval [2,9) if and only if 2 <= 3 and 8 <= 9.
   // For example, [3, 8) is the interval of real numbers between 3 and 8, including 3 and excluding 8.
    
    private boolean isCovered(int[] first, int[] second) {
    	if ((second[0] <= first[0]) && (first[1] <= second[1])) {
    		return true;
    	} else {
    		return false;
    	}
    }
}
