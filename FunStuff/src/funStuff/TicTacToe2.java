//Zachary Williams
//Period 9

package funStuff;
import java.util.*;
public class TicTacToe2 
{
	//Resets Array to all spaces
	public static void resetBoard(String[][] board){
		for(int row = 0; row < board.length; row++)
		{
			for(int col = 0; col < board[0].length; col++)
			{
				board[row][col] = " ";
			}
		}
	}
	
	//Prints board using Array
	public static void printBoard(String[][] board ){
	System.out.println(" 1 2 3 ");
	System.out.println("1" + board[0][0] + "|" + board[0][1] + "|" + board[0][2]);
	System.out.println(" -----");
	System.out.println("2" + board[1][0] + "|" + board[1][1] + "|" + board[1][2]);
	System.out.println(" -----");
	System.out.println("3" + board[2][0] + "|" + board[2][1] + "|" + board[2][2]);
	}
	
	//Checks if Move is Valid
	public static boolean validity(String[][] board, int row, int col){
		return (board[row-1][col-1].equals(" "));
	}
	
	//Testing for Winner 
	public static boolean winTest(String[][] board){
		String boardContents = board[0][0] + board[1][0] + board[2][0] + " " + 
	                           board[0][1] + board[1][1] + board[2][1] + " " + 
				               board[0][2] + board[1][2] + board[2][2] + " " + 
	                           board[0][0] + board[0][1] + board[0][2] + " " + 
				               board[1][0] + board[1][1] + board[1][2] + " " + 
	                           board[2][0] + board[2][1] + board[2][2] + " " + 
				               board[0][0] + board[1][1] + board[2][2] + " " + 
	                           board[2][0] + board[1][1] + board[0][2];
		if(boardContents.contains("XXX") || boardContents.contains("OOO"))
		{
			return true;
		}
		else
		{
			return false;
		}
		
		/*for(int row = 0; row < board.length; row++)
		{
			for(int col = 0;)
		}*/
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		//Variables
		int row = 0;
		int col = 0;
		int turnCount = 0;
		String letter = " ";
		String playerNumber = " ";
		
		//Array
		String[][] board = new String[3][3];
		
		resetBoard(board);
		printBoard(board);
		
		//Runs Through and gives turns
		while(!(winTest(board)) && turnCount < 9)
		{
			if(turnCount % 2 == 0)
			{
				System.out.println("First Player's Turn");
				letter = "X";
			}
			else
			{
				System.out.println("Second Player's Turn");
				letter = "O";
			}
			System.out.print("Row: ");
			row = sc.nextInt();
			System.out.print("Column: ");
			col = sc.nextInt();
			
			if(validity(board, row, col))
			{
				board[row-1][col-1] = letter;
				turnCount++;
				printBoard(board);
			}
			else
			{
				System.out.println("That is an incorrect move. Try Again.");
			}
		}
		if(turnCount == 9)
		{
			System.out.println("It's a tie");
		}
		else
		{
			if(letter.equalsIgnoreCase("X"))
			{
				playerNumber = "One";
			}
			else
			{
				playerNumber = "Two";
			}
			System.out.println("Player " + playerNumber + " Wins");
		}
		
		sc.close();
	}

}
