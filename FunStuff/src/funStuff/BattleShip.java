package funStuff;
import java.util.*;
public class BattleShip 
{
	public static Scanner sc = new Scanner(System.in);
	
	//Reset GameBoard
	public static void resetGameBoard(String[][] gameBoard){
		for(int row = 0; row < gameBoard.length; row++)
		{
			for(int col = 0; col < gameBoard[0].length; col++)
			{
				gameBoard[row][col] = " ";
			}
		}
	}
	
	//Reset RandomBoard
	public static void resetRandomBoard(String[][] randomBoard){
		for(int row = 0; row < randomBoard.length; row++)
		{
			for(int col = 0; col < randomBoard[0].length; col++)
			{
				randomBoard[row][col] = " ";
			}
		}
	}
	
	//Determining Locations of Battleships
	public static void battleshipLocations(String[][] randomBoard, int[] battleshipRows, int[] battleshipColumns){
		int row;
		int col;
		for(int i = 0; i < 5; i++)
		{
			col = (int)(Math.random()*10);
			row = (int)(Math.random()*10);
			randomBoard[row][col] = "O";
			battleshipRows[i] = row;
			battleshipColumns[i] = col;
		}	
	}
	
	//Prints GameBoard
	public static void printGameBoard(String[][] gameBoard){
		System.out.println(" 0123456789");
		for(int row = 0; row< gameBoard.length; row++)
		{
			System.out.print("|");
			for(int col = 0; col < gameBoard[0].length; col++)
			{
				System.out.print(gameBoard[row][col]);
			}
			System.out.println("|");
		}
		System.out.println();
	}
	
	//Print RandomBoard
	public static void printRandomBoard(String[][] randomBoard){
		System.out.println(" 0123456789");
		for(int row = 0; row< randomBoard.length; row++)
		{
			System.out.print("|");
			for(int col = 0; col < randomBoard[0].length; col++)
			{
				System.out.print(randomBoard[row][col]);
			}
			System.out.println("|");
		}
		System.out.println();
	}
	
	//Making Move
	public static void makeMove(String[][] gameBoard, int row, int col, String[][] randomBoard){
		System.out.println("Pick a position to place a marker");
		System.out.print("Row: ");
		row = sc.nextInt();
		System.out.println("Column: ");
		col = sc.nextInt();
		gameBoard[row][col] = "X";
		if(hitTest(randomBoard, row, col))
		{
			System.out.println("You hit a battle ship at : (" + row + "," + col + ")");
		}
		else
		{
			System.out.println("You missed");
		}
	}
	
	//Testing for Hit
	public static boolean hitTest(String[][]randomBoard, int row, int col){
		if(!(randomBoard[row][col].equals(" ")))
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public static void main(String[] args) 
	{
		
		//Creating Arrays and Variables
		String[][] gameBoard = new String[10][10];
		String[][] randomBoard = new String[10][10];
		int[] battleshipRows = new int[5];
		int[] battleshipColumns = new int[5];
		int[] sunkShipsRows = new int[5];
		int[] sunkShipsColumns = new int[5];
		int row = 0;
		int col = 0;
		int hitCounter = 0;

		resetRandomBoard(randomBoard);
		resetGameBoard(gameBoard);
		printGameBoard(gameBoard);
		battleshipLocations(randomBoard, battleshipRows, battleshipColumns);
		printRandomBoard(randomBoard);
		
		while(hitCounter < 4)
		{
			makeMove(gameBoard, row,col,randomBoard);
			printGameBoard(gameBoard);
			if(hitTest(randomBoard, row, col))
			{
				sunkShipsRows[hitCounter] = row;
				sunkShipsColumns[hitCounter] = col;
				System.out.println(sunkShipsRows[hitCounter]);
				System.out.println(sunkShipsColumns[hitCounter]);
				hitCounter++;
			}
			System.out.println(hitCounter);
		}
		
	}

}
