//Zach Williams
//Period 9

package diceDoubles;

public class DiceDoubles {

	public static void main(String[] args) 
	{
		//Creating Random Roll Variables
		int rollOne = 1 + (int)(Math.random() * 6);
		int rollTwo = 1 + (int)(Math.random() * 6);
		int timesRolled = 1;
		
		//Loop Test
		while(rollOne != rollTwo)
		{
			System.out.println("This is roll number: " + timesRolled);
			System.out.println("The first die rolled: " + rollOne);
			System.out.println("The second die rolled: " + rollTwo);
			rollOne = 1 + (int)(Math.random() * 6);
			rollTwo = 1 + (int)(Math.random() * 6);
			timesRolled++;
		}
		System.out.println("The die matched at roll " + timesRolled + ". The die both rolled a " + rollOne);

	}

}
