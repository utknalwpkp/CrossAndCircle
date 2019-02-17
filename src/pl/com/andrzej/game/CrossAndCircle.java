package pl.com.andrzej.game;

import java.util.Scanner;

public class CrossAndCircle {
    static char forCheck=' ';

    public CrossAndCircle() {
        super();
    }

    public static void main(String[] args) throws InterruptedException {
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
    public static char check() throws InterruptedException, SecurityException {

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
            return ' ';
        }
        return ' ';
    }
}
