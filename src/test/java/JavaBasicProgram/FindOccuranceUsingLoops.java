package JavaBasicProgram;

public class FindOccuranceUsingLoops {

	public static void main(String[] args) {

		String strToFindOccurance = "abcdrfhkjxfghfkgkfjgklhjljhluyjfhkjkuioyhsrtsyryhdfghdfghdfht";
		char arrayToFindOccurance[] = strToFindOccurance.toCharArray();
		for (int i = 0; i < arrayToFindOccurance.length; i++) {
			int counter = 0;
			boolean charAlreadyChecked = false;
			for (int k = 0; k < i; k++) {
				if (arrayToFindOccurance[i] == arrayToFindOccurance[k]) {
					charAlreadyChecked = true;
					break;
				}
			}
			if (charAlreadyChecked == false) {
				for (int j = i; j < arrayToFindOccurance.length; j++) {
					if (arrayToFindOccurance[i] == arrayToFindOccurance[j]) {
						counter = counter + 1;
					}
					if (j == arrayToFindOccurance.length - 1) {
						System.out.println(arrayToFindOccurance[i] + " : " + counter);
					}

				}
			}
		}

	}

}
