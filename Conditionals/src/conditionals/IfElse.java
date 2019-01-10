package conditionals;
import java.util.*;
public class IfElse 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		//Using if else statements
		//Guessing Game using if/else
		final int MAX = 10;
		int answer = 7;
		System.out.println("Can you guess my number. Guess a number from 1 to " + MAX);
		int guess = sc.nextInt();
		
		while(guess != answer)
		{	
			if(guess > MAX)
			{
				System.out.println("Too high, try again");
				guess = sc.nextInt();
			}
			else
			{
				System.out.println("Wrong Answer, Guess again");
				guess = sc.nextInt();
			}
		}
		if(guess == answer)
		{
			System.out.println("Good Job, that's correct");
		}
		sc.close();
	}

}
