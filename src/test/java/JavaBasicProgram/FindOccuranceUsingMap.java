package JavaBasicProgram;

import java.util.HashMap;


public class FindOccuranceUsingMap {

	public static void main(String[] args) {
		String strToFindOccurance = "abcdrfhkjxfghfkgkfjgklhjljhluyjfhkjkuioyhsrtsyryhdfghdfghdfht";
		char arrayToFindOccurance[] = strToFindOccurance.toCharArray();
		HashMap<Character, Integer> mapToFindOccurance = new HashMap<Character, Integer>();
		for (char charToFindOccurance : arrayToFindOccurance) {
			if (mapToFindOccurance.containsKey(charToFindOccurance)) {
				mapToFindOccurance.put(charToFindOccurance, mapToFindOccurance.get(charToFindOccurance) + 1);
			} else {
				mapToFindOccurance.put(charToFindOccurance, 1);
			}
		}

		for (char test : mapToFindOccurance.keySet()) {
			System.out.println(test + " : " + mapToFindOccurance.get(test));
		}
	}

}
