package JavaBasicProgram;

import org.testng.annotations.Test;

public class ReverseString {
	@Test
	public void runReverseString() {
		
		String needToReverse="Tsest";
		String reverseString="";
		for(int i=needToReverse.length()-1;i>=0;i--)
		{
			reverseString=reverseString+needToReverse.charAt(i);
		}
		
		System.out.println(reverseString);
	}

}
