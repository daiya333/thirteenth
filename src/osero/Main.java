package osero;

import java.util.Scanner;

public class Main {
	public static String white = "○";
	public static String black = "●";
	public static String [][] board = new String [9][9];
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int y;
    	int x;
    	
        ShowBoard.boardInitValue();
        ShowBoard.boardSetup();
        ShowBoard.SB(board);
        
        
        while (TurnPlayer.blackPlayer() || TurnPlayer.whitePlayer()) {
        	
        	if (TurnPlayer.blackPlayer()) {
        		int a;
        		int b;
                do{ 
                    try {
                	    a = SetStoneAgain.countStone(board, black);
        	            System.out.print("●のY座標は：");
                        y = sc.nextInt();
                        System.out.print("●のX座標は：");
                        x = sc.nextInt();
                        SetStone.setBlack(y, x);
                        ShowBoard.SB(board);
                        b = SetStoneAgain.countStone(board, black);
                    } catch (ArrayIndexOutOfBoundsException e) {
                    	System.out.println("１から８の中から選んでください");
                    	a = 0;
                    	b = 0;
                    }
        		  }while (a == b);
                 
            } else {
            	System.out.println("PASS");
            }
        
            if(TurnPlayer.whitePlayer()) {
            	int a;
        		int b;
        		do{  
        			try {
        			    a = SetStoneAgain.countStone(board, white);
                        System.out.print("○のY座標は：");
                        y = sc.nextInt();
                        System.out.print("○のX座標は：");
                        x = sc.nextInt();
                        SetStone.setWhite(y, x);
                        ShowBoard.SB(board);
                        b = SetStoneAgain.countStone(board, white);
        			} catch (ArrayIndexOutOfBoundsException e) {
                    	System.out.println("１から８の中から選んでください");
                    	a = 0;
                    	b = 0;
                    }
        		}while (a == b);
        		
             } else {
             	System.out.println("PASS");
             }
          
        }
       
       JudgeStone.judgeStone(board);
        
    }
}
