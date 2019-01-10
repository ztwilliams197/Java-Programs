package funStuff;
import java.util.*;
public class TicTacToe {
	
	
	public static void gameBoard(int[] letter){
	System.out.println(letter[0] + "|" + letter[1] + "|" + letter[2]);
	System.out.println("-----");
	System.out.println(letter[3] + "|" + letter[4] + "|" + letter[5]);
	System.out.println("-----");
	System.out.println(letter[6] + "|" + letter[7] + "|" + letter[8]);
}
	
	public static void winTest(int[] letter){
		boolean firstRow = (letter[0] == letter[1] && letter[1] == letter[2]);
		boolean secondRow = (letter[3] == letter[4] && letter[4] == letter[5]);
		boolean thirdRow = (letter[6] == letter[7] && letter[7] == letter[8]);
		boolean firstColumn = (letter[0] == letter[3] && letter[3] == letter[6]);
		boolean secondColumn = (letter[1] == letter[4] && letter[4] == letter[7]);
		boolean thirdColumn = (letter[2] == letter[5] && letter[5] == letter[8]);
		boolean leftToRightCross = (letter[0] == letter[4] && letter[4] == letter[8]);
		boolean rightToLeftCross = (letter[2] == letter[4] && letter[4] == letter[6]);
		boolean finalWinTest = (firstRow || secondRow || thirdRow || firstColumn || secondColumn || thirdColumn || leftToRightCross || rightToLeftCross);
	}
	
	public static void zeroTest(int[] letter){
		boolean firstRow = (letter[0] == 0 && letter[1] == 0 && letter[2] == 0);
		boolean secondRow = (letter[3] == 0 && letter[4] == 0 && letter[5] == 0);
		boolean thirdRow = (letter[6] == 0 && letter[7] == 0 && letter[8] == 0);
		boolean firstColumn = (letter[0] == 0 && letter[3] == 0 && letter[6] == 0);
		boolean secondColumn = (letter[1] == 0 && letter[4] == 0 && letter[7] == 0);
		boolean thirdColumn = (letter[2] == 0 && letter[5] == 0 && letter[8] == 0);
		boolean leftToRightCross = (letter[0] == 0 && letter[4] == 0 && letter[8] == 0);
		boolean rightToLeftCross = (letter[2] == 0 && letter[4] == 0 && letter[6] == 0);
		boolean finalZeroTest = (firstRow || secondRow || thirdRow || firstColumn || secondColumn || thirdColumn || leftToRightCross || rightToLeftCross);
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int letter[] = {0,1,2,3,4,5,6,7,8};
		boolean finalWinTest = false;
		boolean finalZeroTest = false;
		String player;
		
		gameBoard(letter);
		for(int i = 0; i<=8; i++)
		{
			letter[i] = 0;
		}
		
		System.out.println("First Player enter the position then 1 or 2");
		int position = sc.nextInt();
		int OneorTwo = sc.nextInt();
		letter[position] = OneorTwo;
		
		int playerCount = 1;
		
		winTest(letter);
		zeroTest(letter);
		
		while(!finalWinTest && !finalZeroTest)
		{
			gameBoard(letter);
			System.out.println("Next Player's turn");
			position = sc.nextInt();
			OneorTwo = sc.nextInt();
			letter[position] = OneorTwo;
			playerCount++;
			winTest(letter);
			zeroTest(letter);
		}
		
		gameBoard(letter);
		
		if(playerCount % 2 == 0)
		{
			player = "Player One";
		}
		else
		{
			player = "Player Two";
		}
		
		System.out.println("Congratulations " + player + "! You won!");
		
		

	}

}
