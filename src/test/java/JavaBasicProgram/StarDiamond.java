package JavaBasicProgram;

import org.testng.annotations.Test;

public class StarDiamond {
	@Test
	public void runStarDiamond() {
		// TODO Auto-generated method stub
		int numberOfStarLine=3;
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
		for(int i=numberOfStarLine;i>=0;i--)
		{	
			for(int k=0;k<=numberOfStarLine-i;k++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<=i-2;j++)
			{
				System.out.print("*");
				if(j!=i-2)
					{System.out.print(" ");}
			}
			System.out.println();
		}

	}

}
