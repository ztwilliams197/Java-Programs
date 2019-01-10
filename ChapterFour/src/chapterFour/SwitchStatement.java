package chapterFour;
import java.util.*;
public class SwitchStatement 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int month;
		String monthName;
		
		//Using a switch statement to find month based on user input
		System.out.println("What month do you want (1-12): ");
		month = sc.nextInt();
		
		switch(month)
		{
		case 1:
			monthName = "January";
			break;
		case 2:
			monthName = "February";
			break;
		case 3:
			monthName = "March";
			break;
		case 4:
			monthName = "April";
			break;
		case 5:
			monthName = "May";
			break;
		case 6:
			monthName = "June";
			break;
		default:
			monthName = "error";
		}
		
		System.out.println("Your month is " + monthName);
	}

}
