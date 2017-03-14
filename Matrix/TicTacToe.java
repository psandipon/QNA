/**
Design a Tic-tac-toe game that is played between two players on a n x n grid
*/
/*
This code solves this nxn TT problem with space complexity O(n). 
There are only 2 main array of size n and two int var. 
And move() is just bunch of conditions. 
*/


package MatrixManipulation;



public class TicTacToe {
	
	public static void main (String [] args) {
		int p = -100 ;
		TicTacToeCode ttc = new TicTacToeCode(3) ;
		//These are just example inputs
		//inputOne(p, ttc);
		//inputTwo(p, ttc);
	}

	private static void inputTwo(int p, TicTacToeCode ttc) {
		System.out.println("p="+p+"\n1");
		p = ttc.move(1,1,1);
		
		System.out.println("p="+p+"\n2");
		p = ttc.move(0,1,2);
		
		System.out.println("p="+p+"\n3");
		p = ttc.move(0,0,1);
		
		System.out.println("p="+p+"\n4");
		p = ttc.move(1,0,2);
		
		System.out.println("p="+p+"\n5");
		p = ttc.move(2,2,1);
		
		System.out.println();
		
		if (p==2)
		System.out.println("p="+p+" \nWinner is Player 02");
		else 
			System.out.println("p="+p+" \nWinner is Player 01");
	}

	private static void inputOne(int p, TicTacToeCode ttc) {
		System.out.println("p="+p+"\n1");
		p = ttc.move(1,1,1);
		
		System.out.println("p="+p+"\n2");
		p = ttc.move(0,1,2);
		
		System.out.println("p="+p+"\n3");
		p = ttc.move(1,2,1);
		
		System.out.println("p="+p+"\n4");
		p = ttc.move(1,0,2);
		
		System.out.println("p="+p+"\n5");
		p = ttc.move(2,1,1);
		
		System.out.println("p="+p+"\n6");
		p = ttc.move(2,0,2);
		
		System.out.println("p="+p+"\n7");
		p = ttc.move(0,2,1);
		
		System.out.println("p="+p+"\n8");
		p = ttc.move(0,0,2);
		
		System.out.println("p="+p+"\n9");
		
		System.out.println();
		if (p==2)
		System.out.println("Winner is Player 02");
		else 
			System.out.println("Winner is Player 01");
	}
	
}

class TicTacToeCode {
    int[] rows;
    int[] cols;
    int dc1;
    int dc2;
    int n;
    /** Initialize your data structure here. */
    public TicTacToeCode(int n) {
        this.n=n;
        this.rows=new int[n];
        this.cols=new int[n];
    }
 
    /** Player {player} makes a move at ({row}, {col}).
        @param row The row of the board.
        @param col The column of the board.
        @param player The player, can be either 1 or 2.
        @return The current winning condition, can be either:
                0: No one wins.
                1: Player 1 wins.
                2: Player 2 wins. */
    public int move(int row, int col, int player) {
        int val = (player==1?1:-1);
 
        rows[row]+=val;
        cols[col]+=val;
 
        if(row==col){
            dc1+=val;
        }
        if(col==n-row-1){
            dc2+=val;
        }
 
//        These are just simple print
//        printArray("rows",rows) ;
//        printArray("cols",cols) ;
//        System.out.println("                 DC1= "+dc1);
//        System.out.println("                 DC2= "+dc2);
        
        if(Math.abs(rows[row])==n 
        || Math.abs(cols[col])==n 
        || Math.abs(dc1)==n 
        || Math.abs(dc2)==n){
            return player;
        }

        
        return 0;
    }

	private void printArray(String msg ,int[] rows2) {
		System.out.print(msg+":  ");
		for (int i : rows2) {
			if(i<0)
			System.out.print(i+" ");
			else
				System.out.print(" "+i+" ");
		}
	 System.out.println();
		
	}
}