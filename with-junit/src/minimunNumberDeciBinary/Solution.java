package minimunNumberDeciBinary;

public class Solution {
	
    public int minPartitions(String n) {

    	int output = n.chars().max().orElse(0) - 48;
    	
        return output;
    }

	public static void main(String[] args) {
		String[] input = {"32", "82734", "27346209830709182346"};
		int[] expectedOutput = {3, 8, 9};

		Solution solution = new Solution();
		for (int i = 0; i<3; i++) {
			int output = solution.minPartitions(input[i]);
			System.out.println("output:          " + output);
			System.out.println("expected output: " + expectedOutput[i]);
		}
	}

}
