package osero;

public class ShowBoard {
    public static void SB(String board[][]) {
    	
    	for (int i = 0; i  <= Main.BOARDINDEX; i++) {
    		for (int j = 0; j  <= Main.BOARDINDEX; j++) {
    			System.out.print("b" + board[i][j]);
    			
    			if(j == 8) {
    				System.out.println("b");
    			}
    		}
    	}
    }
    
    public static void boardInitValue() {
        for(int i=0; i <= Main.BOARDINDEX; i++) {
            for(int j=0; j <= Main.BOARDINDEX; j++) {
                Main.board[i][j] = " ";
            }
        }
    }
    
    public static void boardSetup() {
        for(int i=1; i <= Main.BOARDINDEX; i++) {
        	
            Main.board[0][i] = String.valueOf(i);
  
            Main.board[i][0] = String.valueOf(i);
        }
        
        Main.board[4][4] = Main.white;
        Main.board[5][4] = Main.black;
        Main.board[5][5] = Main.white;
        Main.board[4][5] = Main.black;
    }

}
