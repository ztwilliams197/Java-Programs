//Zach Williams
//Period 9

package flagWithMethods;

public class FlagWithMethods 
{
	//All Methods are portions of the flag and will be repeated in Main
	public static void oddStars()
	{
		System.out.println("|* * * * * * * * * * |----------------------------------------|");
	}
	
	public static void evenStars()
	{
		System.out.println("| * * * * * * * * * *|________________________________________|");
	}
	
	public static void redStripe()
	{
		System.out.println("|-------------------------------------------------------------|");
	}
	
	public static void whiteStripe()
	{
		System.out.println("|_____________________________________________________________|");
	}
	
	public static void main(String[] args) 
	{
		//Using Methods to print flag
		oddStars();
		evenStars();
		oddStars();
		evenStars();
		oddStars();
		whiteStripe();
		redStripe();
		whiteStripe();
		redStripe();
		whiteStripe();
		redStripe();
		whiteStripe();
		redStripe();
	}

}
