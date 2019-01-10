//Zach Williams
//Period 9

package arrayAssignments;

public class ArrayAssignments {
	
	//Assignment 36
	public static void assignment36()
	{
		//Creating and assigning array
		int[] primeNumbers = new int[10];
		primeNumbers[0] = 2;
		primeNumbers[1] = 3;
		primeNumbers[2] = 5;
		primeNumbers[3] = 7;
		primeNumbers[4] = 11;
		primeNumbers[5] = 13;
		primeNumbers[6] = 17;
		primeNumbers[7] = 19;
		primeNumbers[8] = 23;
		primeNumbers[9] = 29;
		
		//Printing each index of the array
		System.out.println("Slot 0 contains " + primeNumbers[0]);
		System.out.println("Slot 1 contains " + primeNumbers[1]);
		System.out.println("Slot 2 contains " + primeNumbers[2]);
		System.out.println("Slot 3 contains " + primeNumbers[3]);
		System.out.println("Slot 4 contains " + primeNumbers[4]);
		System.out.println("Slot 5 contains " + primeNumbers[5]);
		System.out.println("Slot 6 contains " + primeNumbers[6]);
		System.out.println("Slot 7 contains " + primeNumbers[7]);
		System.out.println("Slot 8 contains " + primeNumbers[8]);
		System.out.println("Slot 9 contains " + primeNumbers[9]);
		
	}
	
	//Assignment 37
	public static void assignment37()
	{
		int[] array = new int[10];
		
		//Assigns -113 to each index and prints it
		for(int i = 0; i < array.length; i++)
		{
			array[i] = -113;
			System.out.println("Slot " + i + " contains a " + array[i]);
		}
	}
	
	//Assignment 38
	public static void assignment38()
	{
		int[] array = new int[10];
				
		//Assigns random value to each index and prints it
		for(int i = 0; i < array.length; i++)
		{
			array[i] = (int)(1 + Math.random()*100);
			System.out.println("Slot " + i + " contains a " + array[i]);
		}
	}
	
	//Assignment 39
	public static void assignment39()
	{
		int[] array = new int[1000];
		
		//Assigns a random number to each index and prints it
		for(int i = 0; i < array.length; i++)
		{
			array[i] = (int)(10 + Math.random()* 90);
			if(i % 20 == 0)
			{
				System.out.println();
			}
			System.out.print(array[i] + " ");
		}
	}

	public static void main(String[] args) {

		assignment36();
		System.out.println();
		
		assignment37();
		System.out.println();
		
		assignment38();
		System.out.println();
		
		assignment39();
		System.out.println();
	}

}
