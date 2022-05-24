package osero;

public class SetStoneAgain {
    public static int  countStone(String board[][], String stoneColor) {
        int count = 0;
        for (int i = 1; i <= 8; i++) {
        	for (int j = 1; j <= 8; j++) {
        		if (board[i][j].equals(stoneColor)) {
        			count++;
        		}
        	}
        }
        return count;
    }
    
}

