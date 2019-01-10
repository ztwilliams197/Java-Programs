//Zachary Williams
//Period 9

package divisibilityDoWhile;
import java.util.*;
public class DivisibilityDoWhile 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		//Variables
		int year;
		int remainder;
		
		do
		{
			System.out.println("Enter a year that is divisible by 4");
			year = sc.nextInt();
			remainder = year % 4;
			if(remainder !=0)
			{
				System.out.println(year + " is not a leap year");
			}
		}
		while(remainder != 0);
		
		System.out.println(year + " is a leap year");

		sc.close();
	}

}
