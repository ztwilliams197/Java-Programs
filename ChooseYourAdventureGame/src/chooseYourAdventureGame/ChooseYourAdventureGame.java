//Zach Williams
//Period 9

package chooseYourAdventureGame;
import java.util.*;
public class ChooseYourAdventureGame 
{
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		//Declaring Variable
		String answer = "No";
		int score = 0;
		
		//Initial Print Statements
		System.out.println("Welcome to the game of life!\nMake your decisions carefully.\nYou just graduated high school, will you go to college?(Y/N)");
		answer = sc.next();
		
		//If Statements
		if(answer.equalsIgnoreCase("Y"))
		{
			System.out.println("So you decided to go to college, you got into MIT with no scholarships and Purdue with a full ride. Where will you go?");
			answer = sc.next();
			
			if(answer.equalsIgnoreCase("MIT"))
			{
				System.out.println("You come out of college with $150,000 of debt and land a job at NASA. You have the chance to become an astronaut, will you take it?(Y/N)");
				answer = sc.next();
				
				if(answer.equalsIgnoreCase("Y"))
				{
					System.out.println("You become an astronaut and are selected to go on a mission to Mars, however, there is a malfunction during takeoff and the shuttle breaks apart. You perish in the accident living to only 35.");
					score = 35;
				}
				else
				{
					System.out.println("You turn down a position as an astronaut but later in your career you become a lead engineer at NASA and live in luxury. You live to the ripe old age of 97 when you perish of natural causes.");
					score = 97;
				}
			}
			else
			{
				System.out.println("You come out of college with no debt and land a job as an engineer. You get an offer to move up in the company, will you take it?(Y/N)");
				answer = sc.next();
				
				if(answer.equalsIgnoreCase("Y"))
				{
					System.out.println("You move up in the company and eventually become the CEO, unfortunately, a former employee that was layed off sabotages the company leading to you becoming homeless. You perish at the age of 72 due to malnutrition.");
					score = 72;
				}
				else
				{
					System.out.println("You eventually move on from the company and begin your own company in medicine. Your company takes off and you become one of the richest people to ever live. You die at the age of 150 as the oldest living person due to access to the best medicine available.");
					score = 150;
				}
			}
		}
		else
		{
			System.out.println("You decided not to go to college, will you work or join the military?");
			answer = sc.next();
			
			if(answer.contains("work")) 
			{
				System.out.println("You got a job at a factory as an assembler and are living at home. Will you continue to work at the factory?(Y/N) ");
				answer = sc.next();
				
				if(answer.equalsIgnoreCase("Y"))
				{
					System.out.println("You continue to work hard and because of this you are noticed and are promoted to a manager. You work until you can retire then live out the rest of your life relaxing. You perish at the age of 76 due to a heart attack.");
					score = 76;
				}
				else
				{
					System.out.println("You leave your job and on your way to your new job you cross the street without looking and perish at the age of 23 after getting hit by a bus.");
					score = 23;
				}
			}
			else
			{
				System.out.println("You join the military and are deployed to Syria. Will you go?(Y/N)");
				answer = sc.next();
				
				if(answer.equalsIgnoreCase("Y"))
				{
					System.out.println("You go to Syria and serve for 8 years, when on your birthday you are under attack. You perish protecting the rest of your group at the age of 26.");
					score = 26;
				}
				else
				{
					System.out.println("You are on the run and are forced to leave your home and live on the streets. You perish at the age of 57 after getting in a fight with another hobo over a sandwich.");
					score = 57;
				}
			}
		}
		
		//Final Print Statement
		System.out.println("Congratulations, You made it through life. You got a score of " + score + " out of 150.");
		
		sc.close();
	}

}
