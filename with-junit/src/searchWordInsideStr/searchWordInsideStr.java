package searchWordInsideStr;

import java.util.List;

public class searchWordInsideStr {

	public static void main(String[] args) {

		String[] str = { "wordgoodgoodgoodbestword", "barfoofoobarthefoobarman", "lingmindraboofooowingdingbarrwingmonkeypoundcake" };
		String[][] words = { { "word", "good", "best", "word" }, { "bar", "foo", "the" }, { "fooo","barr","wing","ding","wing" } };

		Solution solution = new Solution();

		for (int i = 0; i < 3; i++) {
			List<Integer> result = solution.findSubstring(str[i], words[i]);

			System.out.println(result);
		}
	}
}
