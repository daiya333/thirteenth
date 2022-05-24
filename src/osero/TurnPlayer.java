package osero;

public class TurnPlayer {
	
		public static boolean blackPlayer() {
			for (int i = 1; i <= 8; i++) {
				for (int j = 1; j <= 8; j++) {
			        if ((SetStone.vertical(Main.board, Main.black, Main.white, i, j) || SetStone.vertical2(Main.board, Main.black, Main.white, i, j) 
	    	            || SetStone.horizontal(Main.board, Main.black, Main.white, i, j) || SetStone.horizontal2(Main.board, Main.black, Main.white, i, j) 
	    		        || SetStone.diagonalRight(Main.board, Main.black, Main.white, i, j) || SetStone.diagonalRight2(Main.board, Main.black, Main.white, i, j) 
	    		        || SetStone.diagonalLeft(Main.board, Main.black, Main.white, i, j) || SetStone.diagonalLeft2(Main.board, Main.black, Main.white, i, j))
			            && Main.board[i][j].equals(" ")) {
				        return true;
			        }
			    }
			 }
			return false;
		}
		
		public static boolean whitePlayer() {
			for (int i = 1; i <= 8; i++) {
				for (int j = 1; j <= 8; j++) {
			        if ((SetStone.vertical(Main.board, Main.white, Main.black, i, j) || SetStone.vertical2(Main.board, Main.white, Main.black, i, j) 
			    		|| SetStone.horizontal(Main.board, Main.white, Main.black, i, j) || SetStone.horizontal2(Main.board, Main.white, Main.black, i, j) 
			    		|| SetStone.diagonalRight(Main.board, Main.white, Main.black, i, j) || SetStone.diagonalRight2(Main.board, Main.white, Main.black, i, j) 
			    		|| SetStone.diagonalLeft(Main.board, Main.white, Main.black, i, j) || SetStone.diagonalLeft2(Main.board, Main.white, Main.black, i, j))
			    		&& Main.board[i][j].equals(" ")) {
				        return true;
			        }
			    }
			 }
			return false;
		}

}
