package JavaBasicProgram;

import org.testng.annotations.Test;

public class StarSideTrangle {
	@Test
	public void runStarSideTrangle() {
		// TODO Auto-generated method stub
		int numberOfStarLine=10;
		for(int i=0;i<numberOfStarLine;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
