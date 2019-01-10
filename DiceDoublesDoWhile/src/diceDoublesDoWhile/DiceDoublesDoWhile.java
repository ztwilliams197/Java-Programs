//Zachary Williams
//Period 9

package diceDoublesDoWhile;

public class DiceDoublesDoWhile 
{

	public static void main(String[] args) 
	{
		//Creating Random Roll Variables
				int rollOne;
				int rollTwo;
				int timesRolled = 0;
				
				//Loop Test
				do
				{
					timesRolled++;
					rollOne = 1 + (int)(Math.random() * 6);
					rollTwo = 1 + (int)(Math.random() * 6);
					System.out.println("This is roll number: " + timesRolled);
					System.out.println("The first die rolled: " + rollOne);
					System.out.println("The second die rolled: " + rollTwo);
				}
				while(rollOne != rollTwo);
				System.out.println("The die matched on roll " + timesRolled + ". The die both rolled a " + rollOne);

	}

}
