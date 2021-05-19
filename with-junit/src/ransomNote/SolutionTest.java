package ransomNote;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class SolutionTest {

	@Test
	final void testCanConstruct() {
		String[] ransomNote = {"aa", "bg"};
		String[] magazine = {"aab", "efjbdfbdgfjhhaiigfhbaejahgfbbgbjagbddfgdiaigdadhcfcj"};
		boolean[] expectedOutput = {true, true};

		Solution solution = new Solution();
		
		for (int i = 0; i<2; i++) {
			boolean output = solution.canConstruct(ransomNote[i], magazine[i]);
			
			System.out.println(output);
			System.out.println(expectedOutput[i]);
			
			assertEquals(expectedOutput[i], output);
		}
	}
}
