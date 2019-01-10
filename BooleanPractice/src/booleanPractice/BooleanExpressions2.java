package booleanPractice;
import java.util.*;
public class BooleanExpressions2 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		//evaluate boolean expressions
		boolean a;
		boolean b;
		boolean c;
		boolean d;
		
		System.out.println("Give me two numbers. First: ");
		int x = sc.nextInt();
		System.out.println("The second: ");
		int y = sc.nextInt();
		
		a = (x<y);
		b = (x!=y);
		
		//Compare two set of equations and print
		System.out.println(!(a) + "\t" + b);
		
		sc.close();
	}

}
