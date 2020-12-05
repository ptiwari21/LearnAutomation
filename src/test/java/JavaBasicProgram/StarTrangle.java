package JavaBasicProgram;

import org.testng.annotations.Test;

public class StarTrangle {
	@Test
		public void runStarTrangle()
		// TODO Auto-generated method stub
		{
		int numberOfStarLine=10;
		for(int i=0;i<numberOfStarLine;i++)
		{	for(int k=numberOfStarLine-1;k>i;k--)
				{
					System.out.print(" ");
				}
			for(int j=0;j<=i;j++)
			{
				System.out.print("*");
				if(j!=i)
					{System.out.print(" ");}
			}
			System.out.println();
		
		}
	}

}
