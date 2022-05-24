package osero;

public class JudgeStone {
    public static void judgeStone(String board[][]) {
    	int Black = 0;
    	int White = 0;
    	
    	for (int i = 1; i <= 8; i++) {
			for (int j = 1; j <= 8; j++) {
		      if (board[i][j].equals(Main.black)) {
		    	  Black++;
		      } else if (board[i][j].equals(Main.white)) {
		    	  White++;
		      }
		        
		    }
		}
        
    	if (Black > White) {
    		System.out.println("•" + Black + "Î‘Î”’" + White + "Î‚Å•‚ÌŸ‚¿");
    	} else if (Black < White) {
    		System.out.println("•" + Black + "Î‘Î”’" + White + "Î‚Å”’‚ÌŸ‚¿");
    	} else if (Black == White) {
    		System.out.println("•" + Black + "Î‘Î”’" + White + "Î‚Åˆø‚«•ª‚¯");
    	}
    	
    }
}
