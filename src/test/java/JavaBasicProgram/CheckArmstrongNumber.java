package JavaBasicProgram;

import org.testng.annotations.Test;

public class CheckArmstrongNumber {
	@Test
	public void runCheckArmstrongNumber() {
		// TODO Auto-generated method stub
		
		int checkNumber=221;
		int checkNumberClone=checkNumber;
		int generatedArmstrongNumber=0;
		while(checkNumberClone!=0)
		{
		
			generatedArmstrongNumber=(int)(generatedArmstrongNumber+ Math.pow(checkNumberClone%10, Integer.toString(checkNumber).length()));
			checkNumberClone=checkNumberClone/10;
		}
		
		if(checkNumber==generatedArmstrongNumber)
		{
			System.out.println("Given Number "+checkNumber+" is armstrong");
		}
		else
		{
			System.out.println("Given Number "+checkNumber+" is not armstrong");
		}
	}

}
