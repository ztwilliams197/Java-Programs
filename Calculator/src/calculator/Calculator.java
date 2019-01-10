//Zach Williams
//Period 9

package calculator;
import java.util.*;
public class Calculator 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		//Declaring Variables for numbers
		double firstNumber;
		double secondNumber;
		double thirdNumber;
		double answer;
		
		//Getting User Input
		System.out.print("What is your first number to the nearest tenth place?");
		firstNumber = sc.nextDouble();
		
		System.out.print("What is your second number to the nearest tenth place?");
		secondNumber = sc.nextDouble();
		
		System.out.print("What is your third number to the nearest tenth place?");
		thirdNumber = sc.nextDouble();
		
		//Calculating and Displaying Answer
		answer = (firstNumber + secondNumber + thirdNumber) / 2;
		System.out.println("(" + firstNumber + " + " + secondNumber + " + " + thirdNumber + ")/2 is " + answer);
			
		sc.close();
	}

}
