package booleanPractice;

public class Practice 
{

	public static void main(String[] args) 
	{
		int x = 27;
		int y = -1;
		int z = 32;
		boolean b = false;
		
		System.out.println(b);
		System.out.println(b || false);
		System.out.println((x>y) && (x <= z));
		System.out.println(!(x % 2 == 0));
		System.out.println(b && !b);
		System.out.println(!(x/2 == 13) || b || (z*3 == 96));
		
	}

}
