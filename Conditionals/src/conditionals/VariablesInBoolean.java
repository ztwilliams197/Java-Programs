package conditionals;
import java.util.*;
public class VariablesInBoolean 
{
	static final int minor = 21;
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		//If Statements
		System.out.println("Enter age");
		int age = sc.nextInt();
		System.out.println("You entered: " + age);
		
		int age2 = 0;
		
		if(age < minor)
		{
			System.out.println("Youth is great! Enjoy");
			age2 = age + 4;
		}
		
		if(age > minor)
		{
			System.out.println("Program Complete.");
		}
		
		System.out.println("Once you hit " + age2 + " you will be 4 years older");
		
		
		
		sc.close();
	}

}
