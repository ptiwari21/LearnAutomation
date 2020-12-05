package JavaBasicProgram;

public class CheckVowalConsonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char a='%';
		if((int)a==65 || (int)a==69  || (int)a==73 || (int)a==79 || (int)a==85 || (int)a==97 || (int)a==101 || (int)a==105 || (int)a==111 || (int)a==117)
		{
			System.out.println("Given Character "+a+" is vowel");
		}
		else
		{	
			if((a>='a' && a<='z') || (a>='A' && a<='Z'))
				{System.out.println("Given Character "+a+" consonant");}
			else
			{System.out.println("Given Character "+a+" is not alphabate");}
		}
	}

}
