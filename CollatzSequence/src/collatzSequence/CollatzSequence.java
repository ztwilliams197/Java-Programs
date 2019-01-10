package collatzSequence;
import java.util.*;
public class CollatzSequence 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		//Declaring and Gathering User input
		int evenOrOdd;
		System.out.println("Enter any natural number");
		int n = sc.nextInt();
		
		//Testing Divisibility
		do
		{
			evenOrOdd = n % 2;
			if(evenOrOdd == 0)
			{
				n = n/2;
			}
			else
			{
				n = 3*n + 1;
			}
			System.out.println(n);
		}
		while(n != 1);
		
		sc.close();
	}

}
