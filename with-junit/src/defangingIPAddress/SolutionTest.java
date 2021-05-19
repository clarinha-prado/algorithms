package defangingIPAddress;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

	@Test
	final void testDefangIPaddr() {
		String input = new String("1.1.1.1");
		String expectedOutput = new String("1[.]1[.]1[.]1");
		
		Solution solution = new Solution();
		String output = solution.defangIPaddr(input);
		System.out.println();
		System.out.println("output        : " + output);
		System.out.println("expectedOutput: " + expectedOutput);
		assertEquals(expectedOutput,output);
	}

}
