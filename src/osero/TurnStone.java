package osero;

public class TurnStone {
	public static void blackTurnWhite(int y, int x) {
		
		if (SetStone.vertical(Main.board, Main.black, Main.white, y, x)) {
			Main.board[y-1][x] =  "œ";
			for (int i = 2; i <= y-1; i++) {
	    	    if (Main.board[y-i][x].equals(Main.white)) {
	    	    	Main.board[y-i][x] = "œ";
	    	    } else if (!Main.board[y-i][x].equals(Main.white)) {
	    	    	break;
	    	    }
	    	}
		}
		
        if (SetStone.vertical2(Main.board, Main.black, Main.white, y, x)) {
        	Main.board[y+1][x] =  "œ";
        	for (int j = 2; j < 9-y; j++) {
        		if (Main.board[y+j][x].equals(Main.white)) {
        			Main.board[y+j][x] = "œ";
        		} else if (!Main.board[y+j][x].equals(Main.white)) {
	    	    	break;
	    	    }
        	}
		}
        
		if (SetStone.horizontal(Main.board, Main.black, Main.white, y, x)) {
			Main.board[y][x-1] =  "œ";
			for (int i = 2; i <= x-1; i++) {
	    	    if (Main.board[y][x-i].equals(Main.white)) {
	    	    	Main.board[y][x-i] = "œ";
	    	    } else if (!Main.board[y][x-i].equals(Main.white)) {
	    	    	break;
	    	    }
	    	}
		}
		
        if (SetStone.horizontal2(Main.board, Main.black, Main.white, y, x)) {
        	Main.board[y][x+1] =  "œ";
        	for (int j = 2; j < 9-x; j++) {
        		if (Main.board[y][x+j].equals(Main.white)) {
        			Main.board[y][x+j] = "œ";
        		} else if (!Main.board[y][x+j].equals(Main.white)){
        			break;
        		}
        	}
		}
        
        if (SetStone.diagonalRight(Main.board, Main.black, Main.white, y, x)) {
        	Main.board[y-1][x+1] =  "œ";
        	for (int i = 2, j = 2; i <= y-1 && j < 9-x; i++, j++) {
        	    if (Main.board[y-i][x+j].equals(Main.white)) {
        	    	Main.board[y-i][x+j] = "œ";
        	    } else if (!Main.board[y-i][x+j].equals(Main.white)) {
        	    	break;
        	    }
        	}
		}
        
        if (SetStone.diagonalRight2(Main.board, Main.black, Main.white, y, x)) {
        	Main.board[y+1][x-1] =  "œ";
        	for (int i = 2, j = 2; i <= x-1 && j < 9-y; i++, j++) {
        	    if (Main.board[y+j][x-i].equals(Main.white)) {
        	    	Main.board[y+j][x-i] = "œ";
        	    } else if (!Main.board[y+j][x-i].equals(Main.white)) {
        	    	break;
        	    }
        	}
		}
        
        if (SetStone.diagonalLeft(Main.board, Main.black, Main.white, y, x)) {
        	Main.board[y+1][x+1] = "œ";
        	for (int i = 2, j = 2; i < 8-y && j < 9-x; i++, j++) {
        	    if (Main.board[y+j][x+j].equals(Main.white)) {
        	    	Main.board[y+j][x+j] = "œ";
        	    } else if (!Main.board[y+j][x+j].equals(Main.white)) {
        	    	break;
        	    }
        	}
		}
        
        if (SetStone.diagonalLeft2(Main.board, Main.black, Main.white, y, x)) {
        	Main.board[y-1][x-1] = "œ";
        	for (int i = 2, j = 2; i <= y-1 && j <= x-1; i++, j++) {
        	    if (Main.board[y-i][x-j].equals(Main.white)) {
        	    	Main.board[y-i][x-j] = "œ";
        	    } else if (!Main.board[y-i][x-j].equals(Main.white)) {
        	    	break;
        	    }
        	}
		}
	}
	
	public static void whiteTurnBlack(int y, int x) {
		
		if (SetStone.vertical(Main.board, Main.white, Main.black, y, x)) {
			Main.board[y-1][x] =  "›";
			for (int i = 2; i <= y-1; i++) {
	    	    if (Main.board[y-i][x].equals(Main.black)) {
	    	    	Main.board[y-i][x] = "›";
	    	    } else if (!Main.board[y-i][x].equals(Main.black)) {
	    	    	break;
	    	    }
	    	}
		}
		
        if (SetStone.vertical2(Main.board, Main.white, Main.black, y, x)) {
        	Main.board[y+1][x] =  "›";
        	for (int j = 2; j < 9-y; j++) {
        		if (Main.board[y+j][x].equals(Main.black)) {
        			Main.board[y+j][x] = "›";
        		} else if (!Main.board[y+j][x].equals(Main.black)) {
	    	    	break;
	    	    }
        	}
		}
        
		if (SetStone.horizontal(Main.board, Main.white, Main.black, y, x)) {
			Main.board[y][x-1] =  "›";
			for (int i = 2; i <= x-1; i++) {
	    	    if (Main.board[y][x-i].equals(Main.black)) {
	    	    	Main.board[y][x-i] = "›";
	    	    } else if (!Main.board[y][x-i].equals(Main.black)) {
	    	    	break;
	    	    }
	    	}
		}
		
        if (SetStone.horizontal2(Main.board, Main.white, Main.black, y, x)) {
        	Main.board[y][x+1] =  "›";
        	for (int j = 2; j < 9-x; j++) {
        		if (Main.board[y][x+j].equals(Main.black)) {
        			Main.board[y][x+j] = "›";
        		} else if (!Main.board[y][x+j].equals(Main.black)){
        			break;
        		}
        	}
		}
        
        if (SetStone.diagonalRight(Main.board, Main.white, Main.black, y, x)) {
        	Main.board[y-1][x+1] =  "›";
        	for (int i = 2, j = 2; i <= y-1 && j < 9-x; i++, j++) {
        	    if (Main.board[y-i][x+j].equals(Main.black)) {
        	    	Main.board[y-i][x+j] = "›";
        	    } else if (!Main.board[y-i][x+j].equals(Main.black)) {
        	    	break;
        	    }
        	}
		}
        
        if (SetStone.diagonalRight2(Main.board, Main.white, Main.black, y, x)) {
        	Main.board[y+1][x-1] =  "›";
        	for (int i = 2, j = 2; i <= x-1 && j < 9-y; i++, j++) {
        	    if (Main.board[y+j][x-i].equals(Main.black)) {
        	    	Main.board[y+j][x-i] = "›";
        	    } else if (!Main.board[y+j][x-i].equals(Main.black)) {
        	    	break;
        	    }
        	}
		}
        
        if (SetStone.diagonalLeft(Main.board, Main.white, Main.black, y, x)) {
        	Main.board[y+1][x+1] = "›";
        	for (int i = 2, j = 2; i < 8-y && j < 9-x; i++, j++) {
        	    if (Main.board[y+j][x+j].equals(Main.black)) {
        	    	Main.board[y+j][x+j] = "›";
        	    } else if (!Main.board[y+j][x+j].equals(Main.black)) {
        	    	break;
        	    }
        	}
		}
        
        if (SetStone.diagonalLeft2(Main.board, Main.white, Main.black, y, x)) {
        	Main.board[y-1][x-1] = "›";
        	for (int i = 2, j = 2; i <= y-1 && j <= x-1; i++, j++) {
        	    if (Main.board[y-i][x-j].equals(Main.black)) {
        	    	Main.board[y-i][x-j] = "›";
        	    } else if (!Main.board[y-i][x-j].equals(Main.black)) {
        	    	break;
        	    }
        	}
		}
        
	}
}
