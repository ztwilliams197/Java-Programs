package finalProject;

import java.io.*;
import java.util.*;

public class FinalProject {
	
	Scanner sc = new Scanner(System.in);
	
	/*static String[] firstName = new String[50];
	static String[] lastName = new String[50];
	static String[] names = new String[150];
	static double[] gPA = new double[150];
	static String[] colleges = new String[50];
	static String[] college = new String[150];*/
	
	//Generates GPA and Names
	public static void initialGeneration() throws Exception
	{
		Scanner collegesIn = new Scanner(new File("Colleges.txt"));
		Scanner firstNamesIn = new Scanner(new File("First Names.txt"));
		Scanner lastNamesIn = new Scanner(new File("Last Names.txt"));
		PrintWriter databaseOut = new PrintWriter("Student Database.txt");
		
		String[] firstName = new String[50];
		String[] lastName = new String[50];
		String[] names = new String[150];
		double[] gPA = new double[150];
		String[] colleges = new String[50];
		String[] college = new String[150];
		
		for(int i = 0; i < colleges.length; i++)
		{
			colleges[i] = collegesIn.nextLine();
			firstName[i] = firstNamesIn.next();
			lastName[i] = lastNamesIn.next();
		}
		
		for(int i = 0; i < gPA.length; i++)
		{
			gPA[i] = (double)Math.round((2 + Math.random()*2)*100)/100;
			names[i] = firstName[(int)(1 + Math.random()*49)] + " " + lastName[(int)(1 + Math.random()*49)];
			college[i] = colleges[(int)(1 + Math.random()*49)];
		}
		
		for(int i = 0; i < names.length; i++)
		{
			databaseOut.println(gPA[i] + " " + names[i] + " " + college[i]);
		}
		
		databaseOut.close();
	}
	
	public static void main(String[] args) throws Exception{
		
		initialGeneration();
	}

}
