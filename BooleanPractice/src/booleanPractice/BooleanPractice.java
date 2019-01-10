package booleanPractice;

public class BooleanPractice 
{

	public static void main(String[] args) 
	{
		//Testing boolean values
		int number1 = 5;
		int number2 = 6;
		
		boolean test1;
		boolean test2;
		boolean test3;
		boolean test4;
		
		test1 = (number1 == number2);
		System.out.println(test1);
		
		test2 = (number1 != number2);
		System.out.println(test2);
		
		test3 = (number1 >= number2);
		System.out.println(test1 + "\t" + test2 + "\t" + test3);
		System.out.println();
		System.out.println();
		
		number1 = 4;
		number2 = 3;
		System.out.println("New values...");
		test1 = (number1 <= number2);
		System.out.println(test1);
		
		test2 = (2 + 2 == 5);
		System.out.println(test2);
		
		boolean test5 = (3+6 <= 9);
		System.out.println(test5);
	}

}
