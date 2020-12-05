package JavaBasicProgram;

import org.testng.annotations.Test;

public class ReverseNumber {
	@Test
	public void runReverseNumber() {
		int PalimdromeIntNumber=1992;
		int performPalimdromeCheck=PalimdromeIntNumber;
		int verifyNumberResult=0;
		while((performPalimdromeCheck%10)>0)
		{
			verifyNumberResult=verifyNumberResult*10+performPalimdromeCheck%10;
			performPalimdromeCheck=performPalimdromeCheck/10;
		}
		
		System.out.println("Reverse Number is "+verifyNumberResult+" for given number"+PalimdromeIntNumber);
		
		
	}

}
