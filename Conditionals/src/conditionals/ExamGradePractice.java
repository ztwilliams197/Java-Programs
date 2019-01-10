package conditionals;
import java.util.*;
public class ExamGradePractice 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		//Creating arrays
		int value;
		int[] examGrades = {98, 93, 90, 88, 83, 80, 78, 73, 70, 65, 0};
		String[] letterGrade = {"A+", "A", "A-", "B+", "B", "B-", "C+", "C", "C-", "D", "F"};
		int gradeReceived;
		
		//Gathering User Input
		System.out.println("What was your exam grade?");
		gradeReceived = sc.nextInt();
		
		//Using If Statements
		//iterating variable
		
		for(value = 0; value < 11; value++)
		{
			if(gradeReceived > examGrades[value])
			{
				break;
			}
		}
		System.out.println("Your Letter Grade is a " + letterGrade[value]);
	}

}
