package JavaBasicProgram;

import org.testng.annotations.Test;

public class PalimdromeNumberUsingMath {
	@Test
	public void runPalimdromeNumberUsingMath() {
		
		int PalimdromeIntNumber=1992;
		int performPalimdromeCheck=PalimdromeIntNumber;
		int verifyNumberResult=0;
		while((performPalimdromeCheck%10)>0)
		{
			verifyNumberResult=verifyNumberResult*10+performPalimdromeCheck%10;
			performPalimdromeCheck=performPalimdromeCheck/10;
		}
		
		if(PalimdromeIntNumber==verifyNumberResult)
		{
			System.out.println("Given Number "+PalimdromeIntNumber+" is palindrome");
		}
		else
		{
			System.out.println("Given Number "+PalimdromeIntNumber+" is not palindrome");
		}
	}

}
