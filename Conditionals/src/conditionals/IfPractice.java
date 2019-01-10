package conditionals;
import java.util.*;
public class IfPractice 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		//Conditional Statements using if
		System.out.println("How old are you?");
		int age = sc.nextInt();
		System.out.println("You are: " + age);
		
		if(age < 13)
		{
			System.out.println("Too young for Instagram.");
		}
		
		if(age < 16)
		{
			System.out.println("Too young to drive.");
		}	
		
		if(age < 18)
		{
			System.out.println("Too young to vote.");
		}
		
		if(age < 35)
		{
			System.out.println("Too young to be president.");
		}
		sc.close();
	}

}
