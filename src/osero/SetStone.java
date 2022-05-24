package osero;

public class SetStone {
	
	public static void setBlack(int y, int x) {
    	if (!Main.board[y][x].equals(" ")) {
    		System.out.println("そこには置けません");
    	} else if (vertical(Main.board, Main.black, Main.white, y, x) || vertical2(Main.board, Main.black, Main.white, y, x) 
    			|| horizontal(Main.board, Main.black, Main.white, y, x) || horizontal2(Main.board, Main.black, Main.white, y, x) 
    			|| diagonalRight(Main.board, Main.black, Main.white, y, x) || diagonalRight2(Main.board, Main.black, Main.white, y, x) 
    			|| diagonalLeft(Main.board, Main.black, Main.white, y, x) || diagonalLeft2(Main.board, Main.black, Main.white, y, x)) {
    		Main.board[y][x] = "●";
    		TurnStone.blackTurnWhite(y, x);
    	} else {
    		System.out.println("そこには置けません");
    	}
    }
	
    public static void setWhite(int y, int x) {
    	if (!Main.board[y][x].equals(" ")) {
    		System.out.println("そこには置けません");
    	} else if (vertical(Main.board, Main.white, Main.black, y, x) || vertical2(Main.board, Main.white, Main.black, y, x) 
    			|| horizontal(Main.board, Main.white, Main.black, y, x) || horizontal2(Main.board, Main.white, Main.black, y, x) 
    			|| diagonalRight(Main.board, Main.white, Main.black, y, x) || diagonalRight2(Main.board, Main.white, Main.black, y, x) 
    			|| diagonalLeft(Main.board, Main.white, Main.black, y, x) || diagonalLeft2(Main.board, Main.white, Main.black, y, x)) {
    		Main.board[y][x] = "○";
    		TurnStone.whiteTurnBlack(y, x);
    	} else {
    		System.out.println("そこには置けません");
    	}
    	
    }
    
    public static boolean vertical(String board[][], String stoneColor, String stoneColor2, int y, int x) {
    	for (int i = 2; i <= y-1; i++) {
    	    if (board[y-1][x].equals(stoneColor2) && board[y-i][x].equals(stoneColor) && verticalIf(Main.board, y, x, i)) {
    		    return true;
    	    } 
    	}
		return false;
    }
    
    public static boolean verticalIf(String board[][], int y, int x, int i) {
    	for (int j = 1; j <= i; j++) {
    		if (board[y-j][x].equals(" ")) {
    			return false;
    		}
    	}
		return true;
    }
    
    public static boolean vertical2(String board[][], String stoneColor, String stoneColor2, int y, int x) {
    	for (int j = 2; j < 9-y; j++) {
    		if (board[y+1][x].equals(stoneColor2) &&  board[y+j][x].equals(stoneColor) && vertical2If(board, y , x, j)) {
    			return true;
    		}
    	}
		return false;
    }
    
    public static boolean vertical2If(String board[][], int y, int x, int j) {
    	for (int i = 1; i <= j; i++) {
    		if (board[y+i][x].equals(" ")) {
    			return false;
    		}
    	}
		return true;
    }
    
    public static boolean horizontal(String board[][], String stoneColor, String stoneColor2, int y, int x) {
    	for (int i = 2; i <= x-1; i++) {
    	    if (board[y][x-1].equals(stoneColor2) && board[y][x-i].equals(stoneColor) && horizontalIf(Main.board, y, x, i)) {
    		    return true;
    	    } 
    	}
		return false;
    }
    
    public static boolean horizontalIf(String board[][], int y, int x, int i) {
    	for (int j = 1; j <= i; j++) {
    		if (board[y][x-j].equals(" ")) {
    			return false;
    		}
    	}
		return true;
    }
    
    public static boolean horizontal2(String board[][], String stoneColor, String stoneColor2, int y, int x) {
    	for (int j = 2; j < 9-x; j++) {
    		if (board[y][x+1].equals(stoneColor2) &&  board[y][x+j].equals(stoneColor) && horizontal2If(board, y, x, j)) {
    			return true;
    		}
    	}
		return false;
    }
    
    public static boolean horizontal2If(String board[][], int y, int x, int j) {
    	for (int i = 1; i <= j; i++) {
    		if (board[y][x+i].equals(" ")) {
    			return false;
    		}
    	}
		return true;
    }
    
    public static boolean diagonalRight(String board[][], String stoneColor, String stoneColor2, int y, int x) {
    	for (int i = 2, j = 2; i <= y-1 && j < 9-x; i++, j++) {
    	    if (board[y-1][x+1].equals(stoneColor2) && board[y-i][x+j].equals(stoneColor)) {
    	    	return true;
    	    }
    	}
		return false;
    } 
    
    public static boolean diagonalRight2(String board[][], String stoneColor, String stoneColor2, int y, int x) {
    	for (int i = 2, j = 2; i <= x-1 && j < 9-y; i++, j++) {
    	    if (board[y+1][x-1].equals(stoneColor2) && board[y+j][x-i].equals(stoneColor)) {
    	    	return true;
    	    }
    	}
		return false;
    }
    
    public static boolean diagonalLeft(String board[][], String stoneColor, String stoneColor2, int y, int x) {
    	for (int i = 2, j = 2; i < 8-y && j < 9-x; i++, j++) {
    	    if (board[y+1][x+1].equals(stoneColor2) && board[y+j][x+j].equals(stoneColor)) {
    	    	return true;
    	    }
    	}
		return false;
    } 
    
    public static boolean diagonalLeft2(String board[][], String stoneColor, String stoneColor2, int y, int x) {
    	for (int i = 2, j = 2; i <= y-1 && j <= x-1; i++, j++) {
    	    if (board[y-1][x-1].equals(stoneColor2) && board[y-i][x-j].equals(stoneColor)) {
    	    	return true;
    	    }
    	}
		return false;
    } 
 
}
