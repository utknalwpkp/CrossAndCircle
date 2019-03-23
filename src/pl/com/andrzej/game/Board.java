package pl.com.andrzej.game;

public class Board {
    protected short z;
    protected char[] board= new char[9];



    public Board(char[] board, short z) {
        this.board=board;
        this.z=z;
    }

    public Board() {
        super();
    }

    protected void drawBoard() {
        for (short z=0 ; z<9 ; z++){
            board[z]='_';
        }
        System.out.println("\n**************************************************************************************************************");
        System.out.println(" –––––––––––––");
        System.out.println(" | " + board[0] + " | " + board[1] + " | " + board[2] + " |");
        System.out.println(" |-----------|");
        System.out.println(" | " + board[3] + " | " + board[4] + " | " + board[5] + " |");
        System.out.println(" |-----------|");
        System.out.println(" | " + board[6] + " | " + board[7] + " | " + board[8] + " |");
        System.out.println(" –––––––––––––");
        System.out.println("\n**************************************************************************************************************\n");
    }


}