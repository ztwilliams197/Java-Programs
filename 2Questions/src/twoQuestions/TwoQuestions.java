//Zach Williams
//Period 9

package twoQuestions;
import java.util.*;
public class TwoQuestions 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		//Declaring Variables
		String answerFirst;
		String answerSecond;
		String chosenObject;
		
		//Print Statement
		System.out.println("Is your object an animal, vegetable, or mineral?");
		answerFirst = sc.next();
		System.out.println("Is your object larger than a breadbox? (Y/N)");
		answerSecond = sc.next();
		
		//If Statements
		if(answerFirst.equalsIgnoreCase("animal"))
		{
			if(answerSecond.equalsIgnoreCase("Y"))
			{
				chosenObject = "moose";
			}
			else
			{
				chosenObject = "squirrel";
			}
		}
		else if(answerSecond.equalsIgnoreCase("vegetable"))
		{
			if(answerSecond.equalsIgnoreCase("Y"))
			{
				chosenObject = "watermelon";
			}
			else
			{
				chosenObject = "carrot";
			}
		}
		else
		{
			if(answerSecond.equalsIgnoreCase("Y"))
			{
				chosenObject = "Camaro";
			}
			else
			{
				chosenObject = "paperclip";
			}
		}

		//Final Statement
		System.out.println("Your object is a " + chosenObject);
		
		sc.close();
	}

}
