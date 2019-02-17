package pl.com.andrzej.game;
//import java.io.Console;
//import java.security.Provider;
import java.util.Scanner;

public class Table extends Board {
    private static String point,pointCopy;
    private static String pointFirstCodeTurn,pointFirstUserTurn;
    private static String pointSecCodeTurn,pointSecUserTurn;
    private static String pointThirdUserTurn, pointThirdCodeTurn;;

    private static short z;
    private static short axisZCodeTurn;
    private static short axisZUserTurn;
    private static short axisZSecCodeTurn;
    private static short axisZSecUserTurn;
    private static short axisZThirdUserTurn;
    private static short axisZThirdCodeTurn;

    private static char[] board= new char[9];
    private static char state,stateSecond,stateThird;

    @SuppressWarnings("static-access")
    public Table(String point, char[] board, char state, short z, String pointFirstCodeTurn, String pointCopy) {
        //this.z = z;
        this.point=point;
        this.pointFirstCodeTurn=pointFirstCodeTurn;
        this.state=state;
        //this.board=board;
    }
    public Table() {
        super();
    }
    /*private short getZ(short z) {
        return z;
    }
    public short setZ(short z) {
        Table.z=z;
        return z;
    }*/
    public String getPoint() {
        return point;
    }

    public String setPoint(String point) {
        Table.point=point;
        return point;
    }
    public String setPointCopy(String pointCopy) {
        Table.pointCopy=pointCopy;
        return pointCopy;
    }
    public String setPointFirstUserTurn(String pointFirstUserTurn) {
        Table.pointFirstUserTurn=pointFirstUserTurn;
        return pointFirstUserTurn;
    }
    public String setPointFirstCodeTurn(String pointFirstCodeTurn) {
        Table.pointFirstCodeTurn=pointFirstCodeTurn;
        return pointFirstCodeTurn;
    }
    public char setState(char state) {
        Table.state=state;
        return state;
    }
    public char setBoard(char[] board) {
        Table.board[z]=board[z];
        return board[z];
    }

    public char addState() {
        state=' ';
        Scanner skan= new Scanner(System.in);
        System.out.println("Podaj jaki znak chcesz wstawić kółko(O) czy krzyżyk(X)");
        state= skan.next().charAt(0);
        skan.reset();
        return ' ';
    }

    public String thirdUserTurn() {//throws InterruptedException {
        stateThird=state;

        Scanner skan= new Scanner(System.in);
        System.out.println("Legenda programu: ");
        System.out.println("Podawaj dane tak: górny lewy róg, dolny prawy róg, środek dół, środek góra, lewy środek, prawy środek itp");
        System.out.println("Kod wybrał:  "+stateSecond+" na pozycji: "+pointSecCodeTurn+" | "+z);
        do {
            do {

                System.out.println("Podaj współrzędne");
                pointThirdUserTurn=skan.nextLine();

            } while (pointSecCodeTurn.equals(pointThirdUserTurn));
            //itsAvailableDlaSecondUserTurn();
        } while (pointFirstUserTurn.equals(pointThirdUserTurn));
        //Thread.sleep(100);
        setPoint(pointThirdUserTurn);
        ifyWszystkieRazem();

        Table.axisZThirdUserTurn=Table.z;
        board[axisZThirdUserTurn]=stateThird;
        board[z]=board[axisZThirdUserTurn];
        printBoard();
        skan.reset();
		return " ";
    }

    public String secondUserTurn() {//throws InterruptedException {
        stateSecond=' ';

        Scanner skan= new Scanner(System.in);
        System.out.println("Legenda programu: ");
        System.out.println("Podawaj dane tak: górny lewy róg, dolny prawy róg, środek dół, środek góra, lewy środek, prawy środek itp");
        System.out.println("Kod wybrał:  "+state+" na pozycji: "+point+" | "+z);
        do {
            System.out.println("Podaj współrzędne");
            pointSecUserTurn=skan.nextLine();
            //itsAvailableDlaSecondUserTurn();
        } while (point.equals(pointSecUserTurn));
        //Thread.sleep(100);
        setPointCopy(point);
        setPoint(pointSecUserTurn);
        ifyWszystkieRazem();
        if (state=='x' || state=='X') {
            stateSecond='O';
        }
        else stateSecond='X';


        Table.axisZSecUserTurn=Table.z;

        board[axisZSecUserTurn]=stateSecond;
        board[z]=board[axisZSecUserTurn];

        printBoard();
        setPoint(pointCopy);
        skan.reset();
		return " ";
    }

    public String firstUserTurn() {//throws InterruptedException {
        //String point;
        stateThird=state;
        Scanner skan= new Scanner(System.in);
        System.out.println("Legenda programu: ");
        System.out.println("Podawaj dane tak: górny lewy róg, dolny prawy róg, środek dół, środek góra, lewy środek, prawy środek itp");
        System.out.println("Podaj współrzędne");
        point=skan.nextLine();
        //Thread.sleep(100);
        setPointFirstUserTurn(point);//bardzo ważne
        ifyWszystkieRazem();
        Table.axisZUserTurn=Table.z;
        board[axisZUserTurn]=state;
        board[z]=board[axisZUserTurn];
        printBoard();
        return " ";
    }

    public String secondCodeTurn() throws InterruptedException {
        stateSecond=' ';
        java.security.SecureRandom turnChoice = new java.security.SecureRandom();
        int choice=0;
        if (state=='x' || state=='X') {
            stateSecond='O';
            System.out.println("Player choose Cross " + " and choose field " + pointFirstUserTurn+" on Axis(z): "+axisZUserTurn);
        }
        else {
            stateSecond='X';
            System.out.println("Player choose Circle " + "and choose field " + pointFirstUserTurn+" on Axis(x,y): "+axisZUserTurn);
        }
        logicSecondCodeTurn();
        setPoint(pointSecCodeTurn);
        System.out.println("Kod wybrał współrzędne:  "+point+" , "+z);
        ifyWszystkieRazem();

        Table.axisZSecCodeTurn=Table.z;

        board[axisZSecCodeTurn]=stateSecond;
        board[z]=board[axisZSecCodeTurn];
        printBoard();
		return " ";
    }

    public String firstCodeTurn() throws InterruptedException, SecurityException {

        char codeChoice;//= {'o','O','x','X'};
        int messengerOfChoice=0;
        java.security.SecureRandom changeForChoice= new java.security.SecureRandom();
        messengerOfChoice=changeForChoice.nextInt(3);
        System.out.println("Legenda programu: ");
        System.out.println("Dane podajemy tak: górny lewy róg, dolny prawy róg, środek dół, środek góra, lewy środek, prawy środek itp");
        if (messengerOfChoice==0) {
            codeChoice='o';
            point="górny lewy róg";
            System.out.println("Wybrano kółko na "+point+"\n");
            state=codeChoice;
            setPointFirstCodeTurn(point);
            board[0]='o';
        }
        else if (messengerOfChoice==1) {
            codeChoice='O';
            point="górny prawy róg";
            System.out.println("Wybrano kółko na "+point+"\n");
            state=codeChoice;
            setPointFirstCodeTurn(point);
            board[2]='O';
        }
        else if (messengerOfChoice==2) {
            codeChoice='x';
            point="dolny lewy róg";
            System.out.println("Wybrano krzyżyk na "+point+"\n");
            state=codeChoice;
            setPointFirstCodeTurn(point);
            board[6]='x';
        }
        else {//if (messengerOfChoice==3) {
            codeChoice='X';
            point="dolny prawy róg";
            System.out.println("Wybrano krzyżyk na "+point+"\n");
            state=codeChoice;
            setPointFirstCodeTurn(point);
            board[8]='X';
        }
        stateThird=state;
        //String repeat="|||".repeat(5);
        //String customIzer= new String (" .");
        //while((ch=getchar('/'))!='\n') System.out.printf("\r%c",ch);
//													WY����CZAM SPOWOLNIENIA NA JAKI�� CZAS
	/*	System.out.print("Kod wybiera współrzędne ");
		Thread.sleep(500);
		System.out.print(".");
		Thread.sleep(500);
		System.out.print(".");

		Thread.sleep(500);
		System.out.print(".");
		Thread.sleep(500);
		System.out.print(".");
		Thread.sleep(500);
		System.out.print('.');
		Thread.sleep(500);
		System.out.print('.');
		System.out.print("\n");*/
        ifyWszystkieRazem();

        Table.axisZCodeTurn=Table.z;

        board[axisZCodeTurn]=stateThird;
        board[z]=board[axisZCodeTurn];

        printBoard();
        return " ";
    }

    public String ifyWszystkieRazem() {// throws InterruptedException {
        if (point.equals("górny prawy róg") || point.equals("gorny prawy rog")
                || point.equals("prawy górny róg") || point.equals("prawy gorny rog")) {
            z=2;//bardziej czytelne jest z klamrami

        }
        else if (point.equals("górny lewy róg") || point.equals("gorny lewy rog")) {
            z=0;
        }

        else if (point.equals("dolny lewy róg") || point.equals("dolny lewy rog")) {
            z=6;
        }
        else if (point.equals("dolny prawy róg") || point.equals("dolny prawy rog") || point.equals("prawy dolny róg") || point.equals("prawy dolny rog")) {
            z=8;
        }

        else if (point.equals("środek góra") || point.equals("srodek gora")) {
            z=1;
        }
        else if (point.equals("środek") || point.equals("srodek")) {
            z=4;
        }
        else if (point.equals("środek dół") || point.equals("srodek dol")) {
            z=7;
        }
        else if (point.equals("lewy środek") || point.equals("lewy srodek")) {
            z=3;
        }
        else if (point.equals("prawy środek") || point.equals("prawy srodek")) {
            z=5;
        }
        System.out.println("************************************************************************************************");
        return " ";
    }

    public String logicSecondCodeTurn() {
        java.security.SecureRandom turnChoice = new java.security.SecureRandom();
        int choice=0;
        if (point.equals("środek") || point.equals("środek dół") || point.equals("środek góra")) {
            choice=turnChoice.nextInt(4);
            if (choice==0) {

                pointSecCodeTurn="górny lewy róg";

            }
            else if (choice==1) {

                pointSecCodeTurn="górny prawy róg";

            }
            else if (choice==2) {

                pointSecCodeTurn="dolny lewy róg";

            }
            else if (choice==3){
                pointSecCodeTurn="dolny prawy róg";

            }
        }
        if (point.equals("lewy górny róg") || point.equals("dolny lewy róg") || point.equals("prawy górny róg") || point.equals("dolny prawy róg")
                || point.equals("prawy dolny róg") || point.equals("lewy dolny róg") || point.equals("górny lewy róg")) {
            choice=turnChoice.nextInt(5);
            if (choice==0) {

                pointSecCodeTurn="środek";
            }
            else if (choice==1) {

                pointSecCodeTurn="środek góra";
            }
            else if (choice==2) {

                pointSecCodeTurn="środek dół";
            }
            else if (choice==3) {

                pointSecCodeTurn="lewy środek";
            }
            else if (choice==4){

                pointSecCodeTurn="prawy środek";
            }
        }
        if (point.equals("lewy środek") || point.equals("prawy środek")) {
            choice=turnChoice.nextInt(2);
            if (choice==0) {

                pointSecCodeTurn="środek";
            }
            else if (choice==1){

                pointSecCodeTurn="górny prawy róg";
            }
        }
        return " ";
    }

    static void printBoard() {
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
