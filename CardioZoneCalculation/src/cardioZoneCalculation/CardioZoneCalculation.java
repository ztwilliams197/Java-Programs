//Zach Williams
//Period 9

package cardioZoneCalculation;
import java.util.*;
public class CardioZoneCalculation 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		//Declaring Variables
		int age;
		int maxHeartRate;
		double zoneMin;
		double zoneMax;
		double zoneMinPlus;
		double zoneMaxPlus;
		
		//Print Statements for initial information
		System.out.println("What is your age in whole numbers?");
		age = sc.nextInt();
		
		//Calculations
		maxHeartRate = 220 - age;
		zoneMin = maxHeartRate * .60;
		zoneMax = maxHeartRate * .80;
		zoneMinPlus = maxHeartRate * .70;
		zoneMaxPlus = maxHeartRate * .90;
		
		//Final Print Statements
		System.out.println("You are " + age + " years old and your maximum heartrate is " + maxHeartRate);
		System.out.println("Your maximum heartrate range is between " + zoneMin + " and " + zoneMax);
		
		sc.close();
	}

}
