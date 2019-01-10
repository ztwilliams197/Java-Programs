//Zach Williams
//Period 9

package collegeAdmission;
import java.util.*;
public class CollegeAdmission 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		//Actual Assignment
		
		//Used in Actual Assignment
		int mathScore;
		String admissionsChances;
		
		//Introduction Print Statements and Gathering User Input (Used for both Assignments)
		System.out.println("What is your SAT math score?");
		mathScore = sc.nextInt();
		
		//If/Else Statements (used for Actual Assignment)
		if(mathScore > 790)
		{
			admissionsChances = "will definitely";
		}
		else if(mathScore > 710)
		{
			admissionsChances = "are very likely to";
		}
		else if(mathScore > 580)
		{
			admissionsChances = "will probably";
		}
		else if(mathScore > 500)
		{
			admissionsChances = "may";
		}
		else if(mathScore > 390)
		{
			admissionsChances = "are very likely not to";
		}
		else
		{
			admissionsChances = "will definitely not";
		}
		
		//Final statement (used for actual assignment)
		System.out.println("You " + admissionsChances + " get into the school based upon your SAT math score alone.");
		
		//Assignment with Loops and Arrays
		
		//Initializing/Declaring Variables and Arrays (Used for Loop and arrays)
		/*int i;
		int mathScore;
		int[] ranges = {790, 710, 580, 500, 390, 0};
		String[] admissionsChances = {"will definitely", "are very likely to", "will probably", "may", "are very likely not to", "will definitely not"};
		
		//Loop and If statements (Used for Loop and Arrays)
		for(i = 0; i < 6;)
		{
			if(mathScore >= ranges[i])
			{
				break;
			}
			else
			{
				i++;
			}
		}*/
		
		//Final statement for loop and arrays
//		System.out.println("You " + admissionsChances[i] + " get into the school based upon your SAT math score alone.");
		
		sc.close();
	}
	

}
