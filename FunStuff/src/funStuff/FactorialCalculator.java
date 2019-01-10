package funStuff;
import java.util.*;
public class FactorialCalculator 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		//Variables
		int input = sc.nextInt();
		int output = 1;
		
		for(int i = input; i>=1; i -= 1)
		{
			output *= i;
			System.out.println(output);
		}
	}
}
