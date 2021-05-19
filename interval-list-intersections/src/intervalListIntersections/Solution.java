package intervalListIntersections;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
		List<int[]> output = new ArrayList<int[]>();
		
		if ((firstList.length == 0) || (secondList.length == 0))
		{
			int[][] outputArr = new int[0][0];
			return outputArr;
		}
		
		int firstIndex = 0;
		int secondIndex = 0;

		// pega primeiro e segundo intervalo
		int[] first = firstList[firstIndex];
		int[] second = secondList[secondIndex];

		while (true) {

			// se primeiro est� bem depois do segundo
			if (first[0] > second[1]) {
				// pega o pr�ximo segundo intervalo
				if (secondIndex == secondList.length-1) {
					break;
				} else {
					secondIndex++;
					second = secondList[secondIndex];
				}

			} else if (first[1] < second[0]) {
				// se primeiro est� bem antes
				// pega o pr�ximo primeiro intervalo
				if (firstIndex == firstList.length-1) {
					break;
				} else {
					firstIndex++;
					first = firstList[firstIndex];
				}

			} else {
				// se tem intersec��o
				int[] intersec = { Math.max(first[0], second[0]), Math.min(first[1], second[1]) };
				output.add(intersec);

				if (first[1] > second[1]) {
					// pega o pr�ximo segundo intervalo
					if (secondIndex == secondList.length-1) {
						break;
					} else {
						secondIndex++;
						second = secondList[secondIndex];
					}
				} else {
					// pega o pr�ximo primeiro intervalo
					if (firstIndex == firstList.length-1) {
						break;
					} else {
						firstIndex++;
						first = firstList[firstIndex];
					}
				}
			}
		}
		
		int[][] outputArr = new int[output.size()][2];
		for (int i=0 ; i<output.size();i++) {
			outputArr[i] = output.get(i);
		}
		return outputArr;
	}
}
