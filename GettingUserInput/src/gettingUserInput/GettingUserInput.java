//Zachary Williams
//Period 9

package gettingUserInput;
import java.util.*;
public class GettingUserInput 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		//Declaring variables
		String name;
		String color;
		int age;
		double gpa;
		String school;
		
		//Print lines for questions to store inputs
		System.out.println("What is your first name?");
		name = sc.next();
		
		System.out.println("What is your favorite color?");
		color = sc.nextLine();
		
		sc.nextLine();
		
		System.out.println("How old are you in whole numbers?");
		age = sc.nextInt();
		
		System.out.println("What is your gpa with 2 decimals?");
		gpa = sc.nextDouble();
		
		sc.nextLine();
		
		System.out.println("What school do you go to?");
		school = sc.nextLine();
		
		System.out.println("Thank you for participating in my questionnaire, " + name);
		
		sc.close();
	}

}
