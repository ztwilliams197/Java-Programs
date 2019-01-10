package gPABellCurvePlacement;

public class GPABellCurvePlacement {
	
	static Double[] StudentGPA = new Double[500];
	static Double[] UsedGPA = new Double[500];
	
	//Generates GPAs for Students
	public static void GPAGeneration()
	{
		for(int i = 0; i < StudentGPA.length; i++)
		{
			StudentGPA[i] = (double)Math.round(Math.random()*400)/100;
			UsedGPA[i] = StudentGPA[i];
			for(int k = 0; k < UsedGPA.length; k++)
			{
				//Tests whether there are any existing gpas of the same value
				if(StudentGPA[i] == UsedGPA[k] && i != k)
				{
					i -= 1;
					break;
				}
			}
		}
		for(int i = 0; i < StudentGPA.length; i++)
		{
			if(StudentGPA[i] == 1.45)
			{
			System.out.println(StudentGPA[i]);
			}
		}
	}

	public static void main(String[] args) 
	{
		GPAGeneration();
	}

}
