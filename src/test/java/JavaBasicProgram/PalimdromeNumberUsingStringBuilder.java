package JavaBasicProgram;

import org.testng.annotations.Test;

public class PalimdromeNumberUsingStringBuilder {
	@Test
	public void runPalimdromeNumberUsingStringBuilder() {
		
		int PalimdromeIntNumber=153;
		if(PalimdromeIntNumber==Integer.parseInt((new StringBuilder(Integer.toString(PalimdromeIntNumber))).reverse().toString()))
		{
			System.out.println("Given Number "+PalimdromeIntNumber+" is palindrome");
		}
		else
		{
			System.out.println("Given Number "+PalimdromeIntNumber+" is not palindrome");
		}
	}

}
