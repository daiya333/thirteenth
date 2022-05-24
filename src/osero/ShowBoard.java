package osero;

public class ShowBoard {
    public static void SB(String board[][]) {
    	
    	for (int i = 0; i < 9; i++) {
    		for (int j = 0; j < 9; j++) {
    			System.out.print("b" + board[i][j]);
    			
    			if(j == 8) {
    				System.out.println("b");
    			}
    		}
    	}
    }
    
    public static void boardInitValue() {
        for(int i=0; i<9; i++) {
            for(int j=0; j<9; j++) {
                Main.board[i][j] = " ";
            }
        }
    }
    
    public static void boardSetup() {
        for(int i=1; i<9; i++) {
        	
            Main.board[0][i] = String.valueOf(i);
  
            Main.board[i][0] = String.valueOf(i);
        }
        
        Main.board[4][4] = Main.white;
        Main.board[5][4] = Main.black;
        Main.board[5][5] = Main.white;
        Main.board[4][5] = Main.black;
    }

}
