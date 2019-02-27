package pl.com.andrzej.game;

import java.util.Scanner;

public class CrossAndCircle {
    static private char forCheck=' ';
    static boolean draw=true;

    public CrossAndCircle() {
        super();
    }

    public static void main(String[] args) throws InterruptedException, SecurityException {
        Board board = new Board();
        board.drawBoard();
        Scanner skanForCheck = new Scanner(System.in);
        System.out.println("Who plays first?? Program(c) or User(u)");
        forCheck=skanForCheck.next().charAt(0);
        while ((forCheck = check()) =='u' || (forCheck = check()) =='U') {
            System.out.print("Do zobaczenia");
            Thread.sleep(850);
            System.out.print(" niebawem ");
        }
        System.out.print("Do Zobaczenia ");
        Thread.sleep(850);
        System.out.print("wkrótce \n");
        skanForCheck.close();
    }
    private static char check() throws InterruptedException, SecurityException {

        Table tableObject = new Table();
        if (forCheck=='c' || forCheck=='C') {
            //tableObject.printBoard();
            System.out.println(tableObject.firstCodeTurn());
            System.out.println(tableObject.secondUserTurn());
            return ' ';
        } else if (forCheck=='u' || forCheck=='U') {
            System.out.println(tableObject.addState());
            //tableObject.firstUserTurn();
            System.out.println(tableObject.firstUserTurn());
            System.out.println(tableObject.secondCodeTurn());
            System.out.println(tableObject.thirdUserTurn());
            System.out.println(tableObject.thirdCodeTurn());
            System.out.println(tableObject.fourthUserTurn());
            tableObject.results();
            System.out.println(tableObject.fourthCodeTurn()); ///* metoda void */
            tableObject.results();
            System.out.println(tableObject.fifthUserTurn());
            tableObject.results();
            System.out.println(tableObject.fifthCodeTurn());
            tableObject.results();
            System.out.println(tableObject.sixthUserTurn());
            tableObject.results();
            if (tableObject.results()==false) System.out.println(" ̣̣̣Ṃạṃỵ̣Ṛẹṃịṣ̣̣̣̣");
            return ' ';
        }
        return ' ';
    }
}
