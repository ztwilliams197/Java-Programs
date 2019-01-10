package funStuff;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Sudoku {

	public static void resetBoard(int[][] boardValues)
	{
		for(int row = 0; row < boardValues.length; row++)
		{
			for(int col = 0; col < boardValues[0].length; col++)
			{
				boardValues[row][col] = col;
			}
		}
	}
	
	public static void checkRows(int[][] boardValues, boolean[] boardValidity, int boardSum)
	{
		for(int row = 0; row < boardValues.length; row++)
		{
			boardSum = 0;
			for(int col = 0; col < boardValues[0].length; col++)
			{
				boardSum += boardValues[row][col];
			}
			if(boardSum == 45)
			{
				boardValidity[row] = true;
			}
		}
	}
	
	public static void checkCols(int[][] boardValues, boolean[] boardValidity, int boardSum)
	{
		for(int row = 0; row < boardValues.length; row+=3)
		{
			boardSum = 0;
			for(int col = 0; col < boardValues[0].length; col+=3)
			{
				for(int col2 = col; col2 < col + 3; col2++)
				{
					for(int row2 = row; row2 < row + 3; row2++)
					{
						boardSum += boardValues[row2][col2];
					}
					if(boardSum == 45)
					{
						boardValidity[row] = true;
					}
				}
			}
		}
	}
	
	public static void checkBoxes(int[][] boardValues, boolean[] boardValidity, int boardSum)
	{
		for(int row = 0; row < boardValues.length; row++)
		{
			for(int col = 0; col < boardValues[0].length; row++)
			{
				boardSum += boardValues[row][col];
			}
			if(boardSum == 45)
			{
				boardValidity[row] = false;
			}
		}
	}
	
	public static void main(String[] args) {
		
		/*int[][] boardValues = new int[9][9];
		boolean[][] boardValidity = new boolean[9][3];
		int boardSum = 0;
		
		resetBoard(boardValues);
		
		for(int row = 0; row < boardValues.length; row++)
		{
			for(int col = 0; col < boardValues[0].length; col++)
			{
				System.out.println(boardValues[row][col]);;
			}
		}*/
		
		Integer[] x = new Integer[9];
		x[0] = 3;
		x[1] = 5;
		x[2] = 9;
		x[3] = 2;
		x[4] = 4;
		x[5] = 3;
		x[6] = 7;
		x[7] = 3;
		
		Arrays.sort(x,0,8);
		
		for(int i = 0; i < x.length; i++)
		{
			System.out.println(x[i]);
		}
				
	}

}
