package JavaBasicProgram;

public class ReverseString {

	public static void main(String[] args) {
		
		String needToReverse="Tsest";
		String reverseString="";
		for(int i=needToReverse.length()-1;i>=0;i--)
		{
			reverseString=reverseString+needToReverse.charAt(i);
		}
		
		System.out.println(reverseString);
	}

}
