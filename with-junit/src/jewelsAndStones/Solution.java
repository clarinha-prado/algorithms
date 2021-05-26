package jewelsAndStones;

public class Solution {
	
    public int numJewelsInStones(String jewels, String stones) {
    	int sum = 0;
    	
    	for (int i = 0; i<jewels.length();i++) {
    		char c = jewels.charAt(i);
    		sum += stones.chars().filter(item -> item == c).count();
    	}
    	return sum;
    }

	public static void main(String[] args) {
		String[] jewels = {"aA", "z"};
		String[] stones = {"aAAbbbb", "ZZ"};
		int[] expected = {3,0};

		Solution sol = new Solution();
		for (int i =0;i<2;i++) {
			int output = sol.numJewelsInStones(jewels[i], stones[i]);
			System.out.println(output);
			System.out.println(expected[i]);
		}
	}

}
