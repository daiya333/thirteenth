package osero;

public class JudgeStone {
    public static void judgeStone(String board[][]) {
    	int Black = 0;
    	int White = 0;
    	
    	for (int i = 1; i <= Main.BOARDINDEX; i++) {
			for (int j = 1; j <= Main.BOARDINDEX; j++) {
		      if (board[i][j].equals(Main.black)) {
		    	  Black++;
		      } else if (board[i][j].equals(Main.white)) {
		    	  White++;
		      }
		        
		    }
		}
        
    	if (Black > White) {
    		System.out.println("��" + Black + "�ΑΔ�" + White + "�΂ō��̏���");
    	} else if (Black < White) {
    		System.out.println("��" + Black + "�ΑΔ�" + White + "�΂Ŕ��̏���");
    	} else if (Black == White) {
    		System.out.println("��" + Black + "�ΑΔ�" + White + "�΂ň�������");
    	}
    	
    }
}
