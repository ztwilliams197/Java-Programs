//Zach Williams
//Period 9

package bMICategories;
import java.util.*;
public class BMICategories
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		//Actual Assignment
		
		//Used for Actual Assignment
		double BMI;
		String healthCondition;
		
		//Introduction Print Statements and Gathering User Input (Used for Both)
		System.out.println("Body Mass Index (BMI) is a person’s weight in kilograms divided by the square of height in meters.\nA high BMI can be an indicator of high body fatness.\nBMI can be used to screen for weight categories that may lead to health problems\nbut it is not diagnostic of the body fatness or health of an individual.");
		System.out.println("What is your BMI?");
		BMI = sc.nextDouble();
		
		//If and Else Statements (Actual Assignment)
		if(BMI > 41.0)
		{
			healthCondition = "Very Severely Unhealthy";
		}
		else if(BMI > 35.0)
		{
			healthCondition = "Severely Unhealthy";
		}
		else if(BMI > 30.0)
		{
			healthCondition = "Moderately Unhealthy";
		}
		else if(BMI > 25.0)
		{
			healthCondition = "Unhealthy";
		}
		else if(BMI > 18.5)
		{
			healthCondition = "Ideal";
		}
		else if(BMI > 16.0)
		{
			healthCondition = "Underweight";
		}
		else
		{
			healthCondition = "Severely Underweight";
		}

		//Used for Actual Assignment
		System.out.println("You are " + healthCondition);
		
		//Program With Arrays and Loops
		
		//Initializing/Declaring Variables and Arrays (Used for Arrays/Loop)
		/*int i;
		double BMI;
		String healthCondition;
		double[] ranges = {41.0, 35.0, 30.0, 25.0, 18.5, 16.0, 0};
		String[] healthCondition = {"Very Severely Unhealthy", "Severely Unhealthy", "Moderately Unhealthy", "Unhealthy", "Ideal", "Underweight", "Severely Underweight"};
		
		//Introduction Print Statements and Gathering User Input (Used for Both)
		System.out.println("Body Mass Index (BMI) is a person’s weight in kilograms divided by the square of height in meters.\nA high BMI can be an indicator of high body fatness.\nBMI can be used to screen for weight categories that may lead to health problems\nbut it is not diagnostic of the body fatness or health of an individual.");
		System.out.println("What is your BMI?");
		BMI = sc.nextDouble();
		
		//Loop and If statements
		for(i = 0; i < 7;)
		{
			if(BMI > ranges[i])
			{
				break;
			}
			else
			{
				i++;
			}
		}*/
		
		//Used for Arrays and loops
//		System.out.println("You are " + healthCondition[i]);
		
		sc.close();
	}

}
