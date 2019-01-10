//Zach Williams
//Period 9

package diceGame;

public class DiceGame 
{
	
	public static void main(String[] args) 
	{
		//Initializing and Declaring Variables
		int dice1 = 1 + (int)(6 * Math.random());
		int dice2 = 1 + (int)(6 * Math.random());
		int totalValue = (dice1 + dice2);
		
		//Print Statements
		System.out.println("The first die rolled a " + dice1);
		System.out.println("The second die rolled a " + dice2);
		System.out.println("The total of the two dice was " + totalValue);
	}

}
