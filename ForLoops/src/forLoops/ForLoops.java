//Zach Williams
//Period 9

package forLoops;
import java.util.*;
public class ForLoops 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		//ForLoopsTens
		for(int i = 0; i < 10; i++)
		{
			System.out.println("South Fayette Lions");
		}
		
		//CountingTensForLoop
		
		//Getting User input
		System.out.print("Enter a number: ");
		int entry = sc.nextInt();
		
		//Loop
		for(int i = 0; i <= entry; i++)
		{
			System.out.println(i);
		}
		
		//CountingNumberToNumber
		
		//Gathering input
		System.out.println("Enter 3 numbers, the program will count from the first number to the second number in increments of the third number");
		int number1 = sc.nextInt();
		int number2 = sc.nextInt();
		int number3 = sc.nextInt();
		
		//Loop
		for(int i = number1; i <= number2; i += number3)
		{
			System.out.println(i);
		}
		
		//CountingNumberHalves
		for(double x = -10.0; x <= 10; x += .5)
		{
			System.out.println(x);
		}

		//EvenNumberLooping
		for(int i = 1; i <= 20; i++)
		{
			System.out.print(i);
			if((i % 2) == 0)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		//AddingValues
		int total = 0;
		
		//Gathering Input
		System.out.print("Enter an integer:");
		int entry = sc.nextInt();
		
		//Loop
		for(int i = 1; i <= entry; i++)
		{
			total += i;
			System.out.println(total);
		}
		System.out.println("Total: " + total);
		
		sc.close();
	}

}
