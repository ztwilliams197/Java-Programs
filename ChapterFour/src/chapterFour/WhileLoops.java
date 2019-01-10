package chapterFour;
import java.util.*;
public class WhileLoops 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int pinNumber = 12345;
				
//		System.out.println("Enter your 5 digit pin number");
//		int entry = sc.nextInt();
		
		int pinGuess = 10000 + (int)(Math.random() * 100000);
		

		while(pinNumber != pinGuess)
		{
			System.out.println(pinGuess);
			pinGuess = 10000 + (int)(Math.random() * 10000);
		}
		System.out.println("That is correct. Welcome to your account dumbass.");
	}

}
