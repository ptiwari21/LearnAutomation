package JavaBasicProgram;

public class CheckPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int checkNumber=1;
		int counter = 0;
		for(int i=1;i<=checkNumber;i++)
		{
			if(checkNumber%i==0)
			{counter=counter+1;}
		}
		if(counter<=2)
		{
			System.out.println("Given Number "+checkNumber+" is prime number");
		}
		else
		{
			System.out.println("Given Number "+checkNumber+" is not prime number");
		}
	}

}
