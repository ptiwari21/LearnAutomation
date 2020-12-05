package JavaBasicProgram;

public class PalimdromeString {

	public static void main(String[] args) {
		
		String needToReverse="Tsest";
		String reverseString="";
		for(int i=needToReverse.length()-1;i>=0;i--)
		{
			reverseString=reverseString+needToReverse.charAt(i);
		}
		
		if(reverseString.equalsIgnoreCase(needToReverse))
		{
			System.out.println("Given String "+needToReverse+" is palimdrome");
		}
		else
		{
			System.out.println("Given String "+needToReverse+" is not palimdrome");
		}
	}

}
