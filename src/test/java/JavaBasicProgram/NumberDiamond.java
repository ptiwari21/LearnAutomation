package JavaBasicProgram;

import org.testng.annotations.Test;

public class NumberDiamond {
	@Test
	public void runNumberDiamond() {
		// TODO Auto-generated method stub
		int numberOfStarLine =10;
		boolean starPrint = false;
		for (int i = 0; i < numberOfStarLine; i++) {
			for (int k = numberOfStarLine - 1; k > i; k--) {
				if (starPrint) {
					System.out.print(" ");
				} else {
					System.out.print("  ");
				}
			}
			for (int j = 0; j <= i; j++) {
				if (starPrint) {
					System.out.print("*");
					if (j != i) {
						System.out.print(" ");
					}
				} else {
					if ((j + 1) < 10) {
						System.out.print("0" + (j + 1));
					} else {
						System.out.print(j + 1);
					}
					if (j != i) {
						System.out.print("  ");
					}
				}
			}
			System.out.println();
		}
		for (int i = numberOfStarLine; i >= 0; i--) {
			for (int k = 0; k <= numberOfStarLine - i; k++) {
				if (starPrint) {
					System.out.print(" ");

				} else {
					System.out.print("  ");
				}
			}
			for (int j = 0; j <= i - 2; j++) {
				if (starPrint) {
					System.out.print("*");
					if (j != i - 2) {
						System.out.print(" ");
					}
				} else {
					if ((j + 1) < 10) {
						System.out.print("0" + (j + 1));
					} else {
						System.out.print(j + 1);
					}
					if (j != i - 2) {
						System.out.print("  ");
					}
				}
			}
			System.out.println();
		}

	}

}
