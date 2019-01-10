//Zach Williams
//Period 9

package ageInFiveYears;
import java.util.*;
public class AgeInFiveYears 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		//Declaring Variables
		String name;
		int age;
		int agePlusFive;
		int ageMinusFive;
		
		//Print Statements
		System.out.print("Hello. What is your name?");
		name = sc.nextLine();
		
		System.out.print("Your name is " + name + ". How old are you?");
		age = sc.nextInt();
		
		//Determining Age in 5 years and 5 years ago
		agePlusFive = age + 5;
		ageMinusFive = age - 5;
		
		//Final Print Statement
		System.out.println("Did you know that in five years you will be " + agePlusFive + " years old?");
		System.out.println("And five years ago, you were " + ageMinusFive + "!");
		sc.close();
	}

}
