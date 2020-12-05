package JavaBasicProgram;

import org.testng.annotations.Test;

public class CheckEvenOdd {
	@Test
	public void runCheckEvenOdd() {
		// TODO Auto-generated method stub
		
		int checkNumber=21;
		if(checkNumber%2==0)
		{
			System.out.println("Given Number "+checkNumber+" is even number");
		}
		else
		{
			System.out.println("Given Number "+checkNumber+" is odd number");
		}
	}

}
