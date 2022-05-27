package osero;

public class SetStoneAgain {
    public static int  countStone(String board[][], String stoneColor) {
        int count = 0;
        for (int i = 1; i <= Main.BOARDINDEX; i++) {
        	for (int j = 1; j <= Main.BOARDINDEX; j++) {
        		if (board[i][j].equals(stoneColor)) {
        			count++;
        		}
        	}
        }
        return count;
    }
    
}

