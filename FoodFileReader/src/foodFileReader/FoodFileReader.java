//Zach Williams
//Period 9

package foodFileReader;
import java.io.*;
import java.util.*;
public class FoodFileReader 
{

	public static void main(String[] args) throws Exception
	{
		Scanner fileIn = new Scanner(new File("foodinfo.txt"));
		
		//Preparing Arrays
		String[] people = {" ", " ", "", "", " "};
		String[] foods = {" ", " ", "", "", ""};
		
		System.out.println("This is the Thanksgiving menu this year:");
		
		//Gathering info from file
		for(int i=0; i<5; i++)
		{
			people[i] = fileIn.nextLine();
			foods[i] = fileIn.nextLine();
			System.out.println(people[i] + " is bringing " + foods[i]);
		}
		System.out.println("My favorite food is the " + foods[2]);

		fileIn.close();
	}

}
