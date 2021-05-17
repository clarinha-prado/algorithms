package removeCoveredIntervals;

public class Main {

	public static void main(String[] args) {
		int[][][] intervals = { { { 1, 4 }, { 3, 6 }, { 2, 8 } }, { { 1, 4 }, { 2, 3 } }, { { 0, 10 }, { 5, 12 } },
				{ { 3, 10 }, { 4, 10 }, { 5, 11 } }, { { 1, 2 }, { 1, 4 }, { 3, 4 } } };

		int[] expectedResult = { 2, 1, 2, 2, 1 };

		for (int i = 0; i < 5; i++) {
			Solution solution = new Solution();
			int result = solution.removeCoveredIntervals(intervals[i]);
			if (result == expectedResult[i]) {
				System.out.println("Sucesso!!! ");
			} else {
				System.out.println("Falhou: ");
			}
			System.out.print(result);
		}
	}

}
