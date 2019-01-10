package arraysGuided;

public class ArraysGuided {

	public static void main(String[] args) 
	{
		int[] numbers = {1,213,432,34,56,43,53,23,54,76};

		
		for(int p : numbers)
		{
			if(p == 1)
			{
				System.out.println(p + " is 1");
			}
			else
			{
				System.out.println(p + " is not 1");
			}
		}
	}

}
