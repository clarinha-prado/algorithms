package searchWordInsideStr;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
	public List<Integer> findSubstring(String s, String[] words) {

		List<Integer> result = new ArrayList<Integer>();

		String currentStr;
		long sizeBefore;

		int substrSize = words[0].length();
		int wordsCount = words.length;

		int qtyFound = 0;
		List<String> wordsList = new ArrayList<String>();
		Collections.addAll(wordsList, words);

		for (int index = 0; index < s.length() - (substrSize * wordsCount) + 1; index++) {

			// separa um pedaço da string a ser analisada, começando no index
			currentStr = s.substring(index, index + substrSize);

			// se o pedaço não estiver no array words
			if (!wordsList.contains(currentStr)) {
				continue;
			}

			// armazena o tamanho do stream de palavras antes da busca e remoçao da palavra
			// encontrada
			sizeBefore = wordsList.size();

			// faz uma cópia do array
			ArrayList<String> modifiedList = new ArrayList<String>(wordsList);

			while (true) {
				modifiedList = findAndRemoveSubstr(currentStr, modifiedList);

				if (modifiedList.size() == sizeBefore) {
					break;
				} else if (modifiedList.size() == 0) {
					result.add(index);
					break;
				} else {
					sizeBefore = modifiedList.size();
					qtyFound = (int) (wordsCount - modifiedList.size());
					currentStr = s.substring(index + substrSize * qtyFound, index + substrSize * qtyFound + substrSize);
				}
			}
		}
		return result;
	}

	private ArrayList<String> findAndRemoveSubstr(String currentStr, ArrayList<String> wordsList) {

		for (int index = 0; index < wordsList.size(); index++) {
			if (wordsList.get(index).equals(currentStr)) {

				// Remove the specified element
				wordsList.remove(index);
				break;
			}
		}
		return wordsList;
	}
}