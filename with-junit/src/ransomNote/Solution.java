package ransomNote;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
    	if (magazine.length() < ransomNote.length()) {
    		return false;
    	}

    	for (int i = 0; i< magazine.length(); i++) {
    		int positionToRemove = ransomNote.indexOf(magazine.charAt(i));
    		if ( positionToRemove != -1 ) {
    			if (ransomNote.length() > 1) {
    			ransomNote = ransomNote.substring(0, positionToRemove) + ransomNote.substring(positionToRemove + 1);
    			} else {
    				return true;
    			}
    		}
    	}
    	
    	return false;
    }
    
    public static void main(String[] args) {
		String[] ransomNote = {"aa", "bg"};
		String[] magazine = {"aab", "efjbdfbdgfjhhaiigfhbaejahgfbbgbjagbddfgdiaigdadhcfcj"};
		boolean[] expectedOutput = {true, true};

		Solution solution = new Solution();
		
		for (int i = 0; i<2; i++) {
			boolean output = solution.canConstruct(ransomNote[i], magazine[i]);
			
			System.out.println(output);
			System.out.println(expectedOutput[i]);
		}
    }
}
