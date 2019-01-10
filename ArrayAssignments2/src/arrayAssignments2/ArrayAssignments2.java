

package arrayAssignments2;
import java.util.*;
public class ArrayAssignments2 
{
	
	//Assignment 40
	public static void lowestTempInArrays()
	{
		int[] temps = new int[6];
		
		//Fills Array
		for(int i = 0; i < temps.length; i++)
		{
			temps[i] = (int)(1 + (Math.random() * 100));
		}
		
		//Computes Average
		int sum = 0;
		int numberLower = 0;
		for(int i = 0; i < temps.length; i++)
		{
			sum = sum + temps[i];
		}
		int average = sum/temps.length;
		
		//Determines number lower than average
		for(int i = 0; i < temps.length; i++)
		{
			if(temps[i] < average)
			{
				numberLower++;
			}
		}
		System.out.println("The average was " + average + " there were " + numberLower + " temperatures lower than the average");
		
		//Computes lowest
		int lowestIndex = 0;
		for(int i = 0; i < temps.length; i++)
		{
			if(temps[i] < temps[lowestIndex])
			{
				lowestIndex = i;
			}
		}
		System.out.println("The lowest temperature was " + temps[lowestIndex]);
	}
	
	//Assignment41
	public static void assignment41()
	{
		Scanner sc = new Scanner(System.in);
		
		String[] heroes = {"Abderus", "Achilles", "Aeneas", "Ajax", "Amphitryon", "Bellerophon", "Castor", "Chrysippus", "Daedalus", "Diomedes", "Eleusis", "Eunostus", "Ganymede", "Hector", "Lolaus", "Jason", "Meleager", "Odysseus", "Orpheus", "Perseus", "Theseuas"};
		String userEntry;
		
		//Runs Quiz
		do
		{
			System.out.println("Enter a hero from greek mythology. Enter \"Quit\" to quit.");
			userEntry = sc.next();
			int heroIndex = 0;
			
			//Searches for entry in array
			for(int i = 0; i < heroes.length; i++)
			{
				heroIndex = i;
				if(userEntry.equalsIgnoreCase(heroes[i]))
				{
					System.out.println(heroes[i] + " is a hero from greek mythology");
					break;
				}
			}
			if(!userEntry.equalsIgnoreCase(heroes[heroIndex]))
			{
				System.out.println(userEntry + " is not a hero from greek mythology");
			}
		}
		while(!userEntry.equalsIgnoreCase("Quit"));
	}

	public static void main(String[] args) 
	{
		lowestTempInArrays();
		assignment41();
	}

}
