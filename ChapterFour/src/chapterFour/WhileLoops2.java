package chapterFour;
import java.util.*;
public class WhileLoops2 
{

	public static void main(String[] args) 
	{
		//Create Random Number between 1 and 100 store and have user guess a number
		//Loop through until number matches guess if the guess is higher than the number, tell them it is too high
		
		Scanner sc = new Scanner(System.in);
		
		/*int random = 1 + (int)(Math.random() * 100);
		
		//Gathering User Guess
		System.out.println("Guess a number between 1 and 100");
		int guess = sc.nextInt();
		
		//Loop
		while(guess != random)
		{
			if(guess > random)
			{
				System.out.println("Your guess was too high. Guess again:");
				guess = sc.nextInt();
			}
			else
			{
				System.out.println("Your guess was too low. Guess again:");
				guess = sc.nextInt();
			}
			random = 1 + (int)(Math.random() * 100);
		}
		
		System.out.println("Congratulations, you won! Secret number is:" + random);*/
		
		int sum;
		int numberOfValues = 0;
		int shutoff;
		
		System.out.println("Enter a number value");
		int number = sc.nextInt();
		numberOfValues ++;
		sum = number;
		System.out.println("Enter 0 to quit the program.");
		
		while(number != 0)
		{
			numberOfValues ++;
			System.out.println("Enter another number value");
			number = sc.nextInt();
			sum += number;
		}
		
		double average = (sum/numberOfValues);
		System.out.println("Your average = " + average);
		
		sc.close();
	}

}
