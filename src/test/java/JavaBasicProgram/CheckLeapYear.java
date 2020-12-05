package JavaBasicProgram;

public class CheckLeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year=2100;
		
		if(year%4==0)
		{
			if(year%100==0)
			{
				if(year%400==0)
				{
					System.out.println("Given year "+year+" is leap year");
				}
				else
				{
					System.out.println("Given year "+year+" is not leap year");
				}
				
			}
			else
			{
				System.out.println("Given year "+year+" is leap year");
			}
		}
		else
		{
			System.out.println("Given year "+year+" is not leap year");
		}
				

	}

}
