package bMICategories;
import java.util.*;
public class BMICategoriesExperiment 
{
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		//Initializing/Declaring Variables and Arrays (Used for Arrays/Loop)
				int i = 0;
				double BMI;
				double[] ranges = {41.0, 35.0, 30.0, 25.0, 18.5, 16.0, 0};
				String[] healthCondition = {"Very Severely Unhealthy", "Severely Unhealthy", "Moderately Unhealthy", "Unhealthy", "Ideal", "Underweight", "Severely Underweight"};
				
				//Introduction Print Statements and Gathering User Input (Used for Both)
				System.out.println("Body Mass Index (BMI) is a person’s weight in kilograms divided by the square of height in meters.\nA high BMI can be an indicator of high body fatness.\nBMI can be used to screen for weight categories that may lead to health problems\nbut it is not diagnostic of the body fatness or health of an individual.");
				System.out.println("What is your BMI?");
				BMI = sc.nextDouble();
				
				//Loop and If statements
				for(i = 0; i < 7; i++)
				{
					if(BMI > ranges[i])
					{
						break;
					}
					else
					{
						i++;
					}
				}
				
				String category = "Unidentifiable";
				
				//While Loop
				/*while(i < 7)
				{
					if(BMI >= ranges[i])
					{
						category = healthCondition[i];
					}
					i++;
				}*/
				
				//Used for Arrays and loops
				System.out.println("Your category is: " + category);
		
		sc.close();
	}

}
