package mostVisitedSector;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    public List<Integer> mostVisited(int n, int[] rounds) {
    	List<Integer> output = new ArrayList<Integer>();
    	int[] visits = new int[n+1];
    	
    	for (int j=0; j<rounds.length-1;j++) {
    		if (rounds[j] < rounds[j+1]) {
    			for (int i = rounds[j]; i<rounds[j+1]; i++) {
    				visits[i]++;
    			}
    		} else {
    			for (int i = rounds[j]; i<=n; i++) {
    				visits[i]++;
    			}
    			for (int i = 1;i<rounds[j+1];i++) {
    				visits[i]++;
    			}
    		}
    	}
    	visits[rounds[rounds.length-1]]++;
    	
    	// pegar o número máximo
    	int max = Arrays.stream(visits).max().getAsInt();
    	
    	// pegar todos com visitas = máximo
    	for (int i = 1; i<visits.length; i++) {
    		if(visits[i] == max) {
    			output.add(i);
    		}
    	}
    	
    	return output;
    }
}
