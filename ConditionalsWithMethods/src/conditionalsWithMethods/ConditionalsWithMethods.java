//Zach Williams
//Period 9

package conditionalsWithMethods;

public class ConditionalsWithMethods 
{
	//Methods used when conditions are met
	public static void first() {
		System.out.print("I                               \r");
	}

	public static void second() {
		System.out.print("  pledge                        \r");
	}

	public static void third() {
		System.out.print("         allegiance             \r");
	}

	public static void fourth() {
		System.out.print("                    to the      \r");
	}

	public static void fifth() {
		System.out.print("                           flag.\r");
	}

	public static void main(String[] args) 
	{
		//Variable
		int r;

		//Loops through to determine what method is called each time
		for ( int i=0; i<100000; i++ ) {
			r = 1 + (int)(Math.random()*5);
			
			//If statements to call methods
			if(r == 1)
			{
				first();
			}
			if(r == 2)
			{
				second();
			}
			if(r == 3)
			{
				third();
			}
			if(r == 4)
			{
				fourth();
			}
			if(r == 5)
			{
				fifth();
			}
			// Write five if statements here.
			// If r is 1, then call the function named 'first'.
			// If r is 2, then call the function named 'second', and so on to eventually call all 5 methods into main.
		}

		System.out.println("I pledge allegiance to the flag.");


	}

}
