package JavaBasicProgram;

public class PalimdromeNumberUsingStringBuilder {
	public static void main(String[] args) {
		
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
