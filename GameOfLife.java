/*
Space complexity: O(1)
Time Complexity: O(mn)
*/
import java.util.*;

public class GameOfLife {
	public void gameOfLife(int[][] board) {
        for(int row=0; row<board.length; row++){
            for(int col=0; col<board[row].length; col++){
                int neighborScore=0;
                for (int i = Math.max(row-1, 0); i < Math.min(row+2, board.length); i++)
                    for (int j = Math.max(col-1, 0); j < Math.min(col+2, board[0].length); j++)
                        neighborScore += (board[i][j] & 1);
                neighborScore -= board[row][col] & 1;
                
                if (board[row][col] == 1 && neighborScore >= 2 && neighborScore <= 3) 
                    board[row][col] = 3;
                else if (board[row][col] == 0 && neighborScore == 3)
                    board[row][col] = 2; 
            }
        }
        for(int row=0; row<board.length; row++){
            for(int col=0; col<board[row].length; col++){
                board[row][col]>>=1;
            }
        }
    }
}