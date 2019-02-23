package pl.com.andrzej.game;
//import java.io.Console;
//import java.security.Provider;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Table extends Board {
    public static boolean  result=false;
    private static String point,pointCopy;
    private static String pointFirstCodeTurn,pointFirstUserTurn;
    private static String pointSecCodeTurn,pointSecUserTurn;
    private static String pointThirdUserTurn, pointThirdCodeTurn;
    private static String pointFourthUserTurn, pointFourthCodeTurn;
    private static String pointFifthUserTurn, pointFifthCodeTurn;
    private static String pointSixthUserTurn, pointSixthCodeTurn;
    //private static short z;
    private static short axisZCodeTurn,axisZUserTurn;
    private static short axisZSecCodeTurn,axisZSecUserTurn;
    //private static short ;
    private static short axisZThirdUserTurn,axisZThirdCodeTurn;
    private static short axisZFourthUserTurn,axisZFourthCodeTurn,axiZCopy;
    private static short axisZFifthUserTurn, axisZFifthCodeTurn;
    private static short axisZSixthUserTurn, axisZSixthCodeTurn;

    //private static char[] board= new char[9];
    private static char state,stateSecond,stateThird;

    @SuppressWarnings("static-access")
    public Table(String point, char[] board, char state, short z, String pointFirstCodeTurn, String pointCopy
    , String pointFourthCodeTurn, String pointThirdCodeTurn, String pointFifthCodeTurn, String pointSixthCodeTurn, boolean result) {
        //this.z = z;
        this.point=point;
        this.pointFirstCodeTurn=pointFirstCodeTurn;
        this.pointFourthCodeTurn=pointFourthCodeTurn;
        this.pointThirdCodeTurn=pointThirdCodeTurn;
        this.pointFifthCodeTurn=pointFifthCodeTurn;
        this.pointSixthCodeTurn=pointSixthCodeTurn;
        this.state=state;
        this.result=result;
        //this.board=board;
    }
    public Table() {
        super();
    }
    private short getZ(short z) {
        return z;
    }
    public short setZ(short z) {
        Table.z=z;
        return z;
    }
    private short setaxisZThirdCodeTurn(short axisZThirdCodeTurn) {

        return axisZThirdCodeTurn;
    }
    private short setaxisZFourthCodeTurn(short axisZFourthCodeTurn) {

        return axisZFourthCodeTurn;
    }
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
    public String setPointSecCodeTurn(String pointSecCodeTurn) {
        Table.pointSecCodeTurn=pointSecCodeTurn;
        return pointSecCodeTurn;
    }
    public String setPointSecUserCode(String pointSecUserTurn) {
        Table.pointSecUserTurn=pointSecUserTurn;
        return pointSecUserTurn;
    }
    public String setPointThirdCodeTurn(String pointThirdCodeTurn) {
        Table.pointThirdCodeTurn=pointThirdCodeTurn;
        return pointThirdCodeTurn;
    }
    public String setPointThirdUserTurn(String pointThirdUserTurn) {
        Table.pointThirdUserTurn=pointThirdUserTurn;
        return pointThirdUserTurn;
    }
    public String setPointFourthCodeTurn(String pointFourthCodeTurn) {
        Table.pointFourthCodeTurn=pointFourthCodeTurn;
        return pointFourthUserTurn;
    }
    public String setPointFifthCodeTurn(String pointFifthCodeTurn) {
        Table.pointFifthCodeTurn=pointFifthCodeTurn;
        return pointFifthCodeTurn;
    }
    public String setPointFourthUserTurn(String pointFourthUserTurn) {
        Table.pointFourthUserTurn=pointFourthUserTurn;
        return pointFourthUserTurn;
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
    public String sixthUserTurn() {
        Scanner skan= new Scanner(System.in);
        System.out.println("Legenda programu: ");
        System.out.println("Podawaj dane tak: górny lewy róg, dolny prawy róg, środek dół, środek góra, lewy środek, prawy środek itp");
        System.out.println("Kod wybrał:  "+stateSecond+" na pozycji: "+pointFifthCodeTurn+" | "+axisZFifthCodeTurn);
        do {
            do {
                do {
                    do {
                        do {
                            System.out.println("Podaj współrzędne");
                            pointSixthUserTurn = skan.nextLine();
                        } while (pointFifthUserTurn.equals(pointSixthUserTurn));
                    } while (pointFourthUserTurn.equals(pointSixthUserTurn));
                } while (pointThirdUserTurn.equals(pointSixthUserTurn));
            } while (pointSecCodeTurn.equals(pointSixthUserTurn));
            //itsAvailableDlaSecondUserTurn();
        } while (pointFirstUserTurn.equals(pointSixthUserTurn));
        //Thread.sleep(100);
        setPoint(pointSixthUserTurn);
        ifyWszystkieRazem();

        Table.axisZSixthUserTurn=Table.z;
        board[axisZSixthUserTurn]=state;
        board[z]=board[axisZSixthUserTurn];
        printBoard();
        skan.reset();
        return " ";
    }
    public String fifthUserTurn() {
        Scanner skan= new Scanner(System.in);
        System.out.println("Legenda programu: ");
        System.out.println("Podawaj dane tak: górny lewy róg, dolny prawy róg, środek dół, środek góra, lewy środek, prawy środek itp");
        System.out.println("Kod wybrał:  "+stateSecond+" na pozycji: "+pointFourthCodeTurn+" | "+axisZFourthCodeTurn);
        do {
            do {
                do {
                  do {
                      System.out.println("Podaj współrzędne");
                      pointFifthUserTurn = skan.nextLine();
                  } while (pointFourthUserTurn.equals(pointFifthUserTurn));
                } while (pointThirdUserTurn.equals(pointFifthCodeTurn));
            } while (pointSecCodeTurn.equals(pointFifthUserTurn));
            //itsAvailableDlaSecondUserTurn();
        } while (pointFirstUserTurn.equals(pointFifthCodeTurn));
        //Thread.sleep(100);
        setPoint(pointFifthUserTurn);
        ifyWszystkieRazem();

        Table.axisZFifthUserTurn=Table.z;
        board[axisZFifthUserTurn]=state;
        board[z]=board[axisZFifthUserTurn];
        printBoard();
        skan.reset();
        return " ";
    }
    public String fourthUserTurn() {
        //stateThird=state;

        Scanner skan= new Scanner(System.in);
        System.out.println("Legenda programu: ");
        System.out.println("Podawaj dane tak: górny lewy róg, dolny prawy róg, środek dół, środek góra, lewy środek, prawy środek itp");
        System.out.println("Kod wybrał:  "+stateSecond+" na pozycji: "+pointThirdCodeTurn+" | "+axisZThirdCodeTurn);
        do {
            do {
                do {
                    System.out.println("Podaj współrzędne");
                    pointFourthUserTurn = skan.nextLine();
                } while (pointThirdUserTurn.equals(pointFourthUserTurn));
            } while (pointSecCodeTurn.equals(pointFourthUserTurn));
            //itsAvailableDlaSecondUserTurn();
        } while (pointFirstUserTurn.equals(pointFourthUserTurn));
        //Thread.sleep(100);
        setPoint(pointFourthUserTurn);
        ifyWszystkieRazem();

        Table.axisZFourthUserTurn=Table.z;
        board[axisZFourthUserTurn]=stateThird;
        board[z]=board[axisZFourthUserTurn];
        printBoard();
        skan.reset();
        return " ";
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
        setPointCopy(point);
        setPoint(pointThirdUserTurn);
        ifyWszystkieRazem();

        Table.axisZThirdUserTurn=Table.z;
        board[axisZThirdUserTurn]=stateThird;
        board[z]=board[axisZThirdUserTurn];
        printBoard();
        skan.reset();
        setPoint(pointCopy);
		return " ";
    }

    public String secondUserTurn() {//throws InterruptedException {
        stateSecond=' ';

        Scanner skan= new Scanner(System.in);
        System.out.println("Legenda programu: ");
        System.out.println("Podawaj dane tak: górny lewy róg, dolny prawy róg, środek dół, środek góra, lewy środek, prawy środek itp");
        System.out.println("Kod wybrał:  "+state+" na pozycji: "+pointFirstCodeTurn+" | "+z);
        do {
            System.out.println("Podaj współrzędne");
            pointSecUserTurn=skan.nextLine();
            //itsAvailableDlaSecondUserTurn();
        } while (point.equals(pointSecUserTurn));
        //Thread.sleep(100);
        //System.out.println("Player choose: "+pointSecUserTurn+" on position: +"+ z);
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
        //skan.reset();
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
        //skan.reset();
        return " ";
    }
    public String fifthCodeTurn() {
        if (state=='x' || state=='X') {
            //stateSecond='O';
            System.out.println("Player choose Cross " + " and choose field " + pointFifthUserTurn+" on Axis(z): "+axisZFifthUserTurn);
        }
        else {
            //stateSecond='X';
            System.out.println("Player choose Circle " + "and choose field " + pointFifthUserTurn+" on Axis(x,y): "+axisZFifthUserTurn);
        }

        do {
            do {
                do {
                    do {
                        do {
                            do {
                                do {
                                    if (state == 'o' || state == 'O') {
                                        axiZCopy = axisZThirdCodeTurn;
                                        setPointCopy(pointThirdCodeTurn);
                                        logicThirdCodeTurn();
                                        setPointFifthCodeTurn(pointThirdCodeTurn);
                                        setPointThirdCodeTurn(pointCopy);
                                        axisZThirdCodeTurn = axiZCopy;
                                    } else {
                                        axiZCopy = axisZThirdCodeTurn;
                                        setPointCopy(pointThirdCodeTurn);
                                        logicThirdCodeTurn2();
                                        if (pointFifthCodeTurn==null)                          logicAntiUserTurn1();
                                        else {
                                            setPointFifthCodeTurn(pointThirdCodeTurn);
                                            setPointThirdCodeTurn(pointCopy);
                                            axisZThirdCodeTurn = axiZCopy;
                                        }
                                    }
                                    System.out.println("Test while w thirdCodeTurn: user value: " + Table.pointFifthUserTurn + " code value: " + Table.pointFifthCodeTurn + "  z: " + z);
                                } while (pointFifthUserTurn.equals(pointFifthCodeTurn));
                            } while (pointFourthCodeTurn.equals(pointFifthCodeTurn));
                        } while (pointFourthUserTurn.equals(pointFifthCodeTurn));
                        //logic2ThirdCodeTurn();
                    } while (pointThirdCodeTurn.equals(pointFifthCodeTurn));
                } while (pointThirdUserTurn.equals(pointFifthCodeTurn));
            } while (pointSecCodeTurn.equals(pointFifthCodeTurn));
        } while (pointFirstUserTurn.equals(pointFifthCodeTurn));

        //setPointThirdCodeTurn(null);
        //axiZCopy=axisZThirdCodeTurn; kopia już jest zrobiona wcześniej
        //if (state=='o' || state=='o')logicThirdCodeTurn();
        //else logicThirdCodeTurn2();
        //logicThirdCodeTurn();
        //logic2ThirdCodeTurn();
        //setPointFifthCodeTurn(pointThirdCodeTurn);
        setPoint(pointFifthCodeTurn);
        ifyWszystkieRazem();
        //axisZFifthCodeTurn=axisZThirdCodeTurn;
        Table.axisZFifthCodeTurn=Table.z;
        System.out.println("Kod wybrał współrzędne:  "+pointFifthCodeTurn+" , "+axisZFifthCodeTurn);
        board[axisZFifthCodeTurn]=stateSecond;
        board[z]=board[axisZFifthCodeTurn];
        //axisZThirdCodeTurn=axiZCopy;
        //setPointThirdCodeTurn(pointCopy);
        printBoard();
        return " ";
    }
    public String fourthCodeTurn() {
        if (state=='x' || state=='X') {
            //stateSecond='O';
            System.out.println("Player choose Cross " + " and choose field " + pointFourthUserTurn+" on Axis(z): "+axisZFourthUserTurn);
        }
        else {
            //stateSecond='X';
            System.out.println("Player choose Circle " + "and choose field " + pointFourthUserTurn+" on Axis(x,y): "+axisZFourthUserTurn);
        }
        //setPointThirdCodeTurn(null);
        //axiZCopy=axisZThirdCodeTurn;
        //setPointCopy(pointThirdCodeTurn);
        do {
            do {
                do {
                    do {
                        do {
                            if (state=='o' || state=='O') {
                                axiZCopy=axisZThirdCodeTurn;
                                setPointCopy(pointThirdCodeTurn);
                                logicThirdCodeTurn();
                                setPointFourthCodeTurn(pointThirdCodeTurn);
                                setPointThirdCodeTurn(pointCopy);
                                axisZThirdCodeTurn=axiZCopy;
                            }
                            else {
                                axiZCopy=axisZThirdCodeTurn;
                                setPointCopy(pointThirdCodeTurn); /* chyba w ruchu 4 dochodzi do braku wyboru ruchu*/
                                logicThirdCodeTurn2();
                                if (pointFourthCodeTurn==null)                logicAntiUserTurn1();
                                else {
                                    setPointFourthCodeTurn(pointThirdCodeTurn);
                                    setPointThirdCodeTurn(pointCopy);
                                    axisZThirdCodeTurn = axiZCopy;
                                }
                            }
                            System.out.println("Test while w thirdCodeTurn: user value: " + Table.pointFourthUserTurn + " code value: " + Table.pointFourthCodeTurn+"  z: "+z);
                        } while (pointFourthUserTurn.equals(pointFourthCodeTurn));
                        //logic2ThirdCodeTurn();
                    } while (pointThirdCodeTurn.equals(pointFourthCodeTurn));
                } while (pointThirdUserTurn.equals(pointFourthCodeTurn));
            } while (pointSecCodeTurn.equals(pointFourthCodeTurn));
        } while (pointFirstUserTurn.equals(pointFourthCodeTurn));

        //logic2ThirdCodeTurn();
        //setPointFourthCodeTurn(pointThirdCodeTurn);
        setPoint(pointFourthCodeTurn);
        ifyWszystkieRazem();
        //axisZFourthCodeTurn=axisZThirdCodeTurn;
        Table.axisZFourthCodeTurn=Table.z;
        System.out.println("Kod wybrał współrzędne:  "+pointFourthCodeTurn+" , "+axisZFourthCodeTurn);
        board[axisZFourthCodeTurn]=stateSecond;
        board[z]=board[axisZFourthCodeTurn];
        //axisZThirdCodeTurn=axiZCopy;
        //setPointFourthCodeTurn(pointCopy);
        printBoard();
        return " ";
    }
    public String thirdCodeTurn() {
        //stateSecond;
        //pointThirdCodeTurn="dziwny jest ten świat";
        //setPointThirdCodeTurn(point);
        //setPointThirdCodeTurn("dziwny ten null");
        //System.out.println(" Player choose");
        if (state=='x' || state=='X') {
            stateSecond='O';
            System.out.println("Player choose Cross " + " and choose field " + pointThirdUserTurn+" on Axis(z): "+axisZThirdCodeTurn);
        }
        else {
            stateSecond='X';
            System.out.println("Player choose Circle " + "and choose field " + pointThirdUserTurn+" on Axis(x,y): "+axisZThirdCodeTurn);
        }
        do {
            do {
                do {
                    //do {
                        //do {
                            if (state=='o' || state=='O') {
                                logicThirdCodeTurn();
                                if (pointThirdCodeTurn==null) logicAntiUserTurn1();
                                setPointThirdCodeTurn(pointCopy);
                                axiZCopy=axisZThirdCodeTurn;
                            }
                                else logicThirdCodeTurn2();
 System.out.println("Test while w thirdCodeTurn: user value: " + Table.pointThirdUserTurn + " code value: " + Table.pointThirdCodeTurn+"  z: "+z);
                        //} while (pointThirdCodeTurn.equals(pointFifthCodeTurn));
                        //logic2ThirdCodeTurn();
                    //} while (pointFirstUserTurn.equals(pointThirdCodeTurn));
                } while (pointThirdUserTurn.equals(pointThirdCodeTurn));
            } while (pointSecCodeTurn.equals(pointThirdCodeTurn));
        } while (pointFirstUserTurn.equals(pointThirdCodeTurn));

        //logic2ThirdCodeTurn();
        setPointCopy(pointThirdCodeTurn);
        setPoint(pointThirdCodeTurn);
        ifyWszystkieRazem();
        Table.axisZThirdCodeTurn=Table.z;
        System.out.println("Kod wybrał współrzędne:  "+Table.pointThirdCodeTurn+" , "+axisZThirdCodeTurn);
        board[axisZThirdCodeTurn]=stateSecond;
        board[z]=board[axisZThirdCodeTurn];
        setPointThirdCodeTurn(pointCopy);
        printBoard();
        return " ";
    }

    public String secondCodeTurn() throws InterruptedException {
        //stateSecond=' ';
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
        System.out.println("Kod wybrał współrzędne:  "+pointSecCodeTurn+" , "+z);
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
        pointFirstCodeTurn=point;
        //String repeat="|||".repeat(5);
        //String customIzer= new String (" .");
        //while((ch=getchar('/'))!='\n') System.out.printf("\r%c",ch);
//													WYŁĄCZAM SPOWOLNIENIA NA JAKIŚ CZAS
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

    public void ifyWszystkieRazem() {
        if (point.equals("górny prawy róg") || point.equals("gorny prawy rog")
                || point.equals("prawy górny róg") || point.equals("prawy gorny rog")) {
            z=2;//bardziej czytelne jest z klamrami

        }
        else if (point.equals("górny lewy róg") || point.equals("gorny lewy rog") || point.equals("lewy górny róg")) {
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
        else {
            System.out.println("Gdzieś nastąpiła literówka, spacja itd");
            System.exit(9);
        }
        System.out.println("************************************************************************************************");
    }


    public static void logicSecondCodeTurn() {
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
        /* return " "; */
    }
    public void logicAntiUserTurn1() {
        if (stateSecond == 'x' || stateSecond == 'X') {
            if (board[0] == 'x' || board[0] == 'X') {
                if (board[1] == '_') {               /*  poziom od 0 przez 1 do 2  */
                    if (board[2] == 'o' || board[2] == 'O') ;
                    else {
                        setPointThirdCodeTurn("środek góra");
                        z = 1;
                    }
                } else if (board[2] == '_') {
                    if (board[1] == 'o' || board[1] == 'O') ;
                    else {
                        setPointThirdCodeTurn("górny prawy róg");
                        z = 2;
                    }
                } else if (board[4] == '_') {       /*  przekątna od 0 przez 4 do 8  */
                    if (board[8] == 'o' || board[8] == 'O') ;
                    else {
                        setPointThirdCodeTurn("środek");
                        z = 4;
                    }
                } else if (board[3] == '_') {       /*  pionowo od 0 przez 3 do 8   */
                    if (board[6] == 'o' || board[6] == 'O') ;
                    else {
                        setPointThirdCodeTurn("lewy środek");
                        z = 3;
                    }
                }
            }
            if (board[1] == 'x' || board[1] == 'X') {
                if (board[2] == '_') {              /*  poziomo od 1 przez 0 do 2 */
                    if (board[0]=='o' || board[0]=='O');
                    else {
                        setPointThirdCodeTurn("górny prawy róg");
                        z = 2;
                    }
                } else if (board[4] == '_') {       /*  pionowo od 1 przez 4 do 7   */
                    if (board[7]=='o' || board[7]=='O');
                    else {
                        setPointThirdCodeTurn("środek");
                        z = 4;
                    }
                }
            }
            if (board[2] == 'x' || board[2] == 'X') {
                if (board[0] == '_') {              /*  poziomo od 2 przez 1 do 0  */
                    if (board[1]=='o' || board[1]=='O');
                    else {
                        setPointThirdCodeTurn("górny lewy róg");
                        z = 0;
                    }
                }
                else if (board[5] =='_') {
                    if (board[8] == 'o' || board[8] == 'O') ;
                    else {                          /* pionowo od 2 przez 8 do 5    */
                        setPointThirdCodeTurn("prawy środek");
                        z = 5;
                    }
                } else if (board[4]=='_') {
                    if (board[6]=='o' || board[6]=='O');
                    else {                          /* przekątna od 2 przez 6 do 4  */
                        setPointThirdCodeTurn("środek");
                        z=4;
                    }

                }
            }
            if (board[5] == 'x' || board[5] == 'X') {
                if (board[2] == '_') {
                    if (board[8]=='o' || board[8]=='O');
                    else {                          /* pionowo od 5 przez 8 do 2    */
                        setPointThirdCodeTurn("górny prawy róg");
                        z = 2;
                    }
                }
                else if (board[8]=='_') {
                    if (board[2]=='o' || board[2]=='O');
                    else {                          /* pionowo od 5 przez 2 do 8    */
                        setPointThirdCodeTurn("dolny prawy róg");
                        z=8;
                    }

                }
            }
            if (board[8]=='x' || board[8]=='X') {
                if (board[5]=='_') {
                    if (board[2]=='o' || board[2]=='O');
                    else {                          /* pionowo od 8 przez 2 do 5    */
                        setPointThirdCodeTurn("prawy środek");
                        z=5;
                    }
                }
                else if (board[2]=='_') {
                    if (board[5]=='o' || board[5]=='O');
                    else {                          /* pionowo od 8 przez 5 do 2    */
                        setPointThirdCodeTurn("górny prawy róg");
                        z=2;
                    }
                }
                else if (board[4]=='_') {
                    if (board[0]=='o' || board[0]=='O');
                    else {                          /* przekątna od 8 przez 0 do 4  */
                        setPointThirdCodeTurn("środek");
                        z=4;
                    }
                }
                else if (board[0]=='_') {
                    if (board[4]=='o' || board[4]=='O');
                    else {                          /* przekątna od 8 przez 4 do 0  */
                        setPointThirdCodeTurn("górny lewy róg");
                        z=0;
                    }
                }
                else if (board[7]=='_') {
                    if (board[6]=='o' || board[6]=='O');
                    else {                          /* poziomo od 8 przez 6 do 7    */
                        setPointThirdCodeTurn("środek dół");
                        z=7;
                    }
                }
                else if (board[6]=='_') {
                    if (board[7]=='o' || board[7]=='O');
                    else {                          /* poziomo od 8 przez 7 do 6    */
                        setPointThirdCodeTurn("dolny lewy róg");
                        z=6;
                    }
                }
            }
            if (board[7]=='x' || board[7]=='X') {
                if (board[8]=='_') {
                    if (board[6]=='o' || board[6]=='O');
                    else {                          /* poziomo od 7 przez 6 do 8    */
                        setPointThirdCodeTurn("dolny prawy róg");
                        z=8;
                    }
                }
                if (board[6]=='_') {
                    if (board[8]=='o' || board[8]=='O');
                    else {                          /* poziomo od 7 przez 8 do 6    */
                        setPointThirdCodeTurn("dolny lewy róg");
                        z=6;
                    }
                }
                if (board[4]=='_') {
                    if (board[1]=='o' || board[1]=='O');
                    else {                          /* pionowo od 7 przez 1 do 4    */
                        setPointThirdCodeTurn("środek");
                        z=4;
                    }
                }
                if (board[1]=='_') {
                    if (board[4]=='o' || board[4]=='O');
                    else {                          /* pionowo od 7 przez 4 do 1    */
                        setPointThirdCodeTurn("środek góra");
                        z=1;
                    }
                }
            }
            if (board[6]=='x' || board[6]=='X') {
                if (board[7]=='_') {
                    if (board[8]=='o' || board[8]=='O');
                    else {                          /* poziomo od 6 przez 8 do 7    */
                        setPointThirdCodeTurn("środek dół");
                        z=7;
                    }
                }
                if (board[8]=='_') {
                    if (board[7]=='o' || board[7]=='O');
                    else {                          /* poziomo od 6 przez 7 do 8    */
                        setPointThirdCodeTurn("dolny prawy róg");
                        z=8;
                    }
                }
                if (board[4]=='_') {
                    if (board[2]=='o' || board[2]=='O');
                    else {                          /* przekątna od 6 przez 2 do 4  */
                        setPointThirdCodeTurn("środek");
                        z=4;
                    }
                }
                if (board[2]=='_') {
                    if (board[4]=='o' || board[4]=='O');
                    else {                          /* przekątna od 6 przez 4 do 2  */
                        setPointThirdCodeTurn("górny prawy róg");
                        z=2;
                    }
                }
                if (board[3]=='_') {
                    if (board[0]=='o' || board[0]=='O');
                    else {                          /* pionowo od 6 przez 0 do 3    */
                        setPointThirdCodeTurn("lewy środek");
                        z=3;
                    }
                }
                if (board[0]=='_') {
                    if (board[3]=='o' || board[3]=='O');
                    else {                          /* pionowo od 6 przez 3 do 0    */
                        setPointThirdCodeTurn("górny lewy róg");
                        z=0;

                    }
                }
            }
            if (board[3]=='x' || board[3]=='X') {
                if (board[0]=='_') {
                    if (board[6]=='o' || board[6]=='O');
                    else {                          /* pionowo od 3 przez 6 do 0    */
                        setPointThirdCodeTurn("górny lewy róg");
                        z=0;
                    }
                }
                if (board[6]=='_') {
                    if (board[0]=='o' || board[0]=='O');
                    else {                          /* pionowo od 3 przez 0 do 6    */
                        setPointThirdCodeTurn("dolny lewy róg");
                        z=6;
                    }
                }
                if (board[4]=='_') {
                    if (board[5]=='o' || board[5]=='O');
                    else {                          /* poziomo od 3 przez 5 do 4    */
                        setPointThirdCodeTurn("środek");
                        z=4;
                    }
                }
                if (board[5]=='_') {
                    if (board[4]=='o' || board[4]=='O');
                    else {                          /* poziomo od 3 przez 4 do 5    */
                        setPointThirdCodeTurn("prawy środek");
                        z=5;
                    }
                }
            }
            if (board[4]=='x' || board[4]=='X') {
                if (board[8]=='_') {
                    if (board[0]=='o' || board[0]=='O');
                    else {                          /* przekątna od 4 przez 0 do 8    */
                        setPointThirdCodeTurn("dolny prawy róg");
                        z=8;
                    }
                }/* 22/02/2019      ****̣̣̣DOKOŃCzENIE JUTRỌ̣̣̣****    */
            }
            //return ' ';
        }
    }
public char logicThirdCodeTurn() {
    //if (board[1]!='_' && board[2]!='_' && board[3]!='_') nie przejdzie
    if ((stateSecond == 'x' || stateSecond == 'X') && (state == 'o' || state == 'O'))
    {
        if ((board[0] == 'o' || board[0] == 'O') && (board[1] == 'o' || board[1] == 'O')) {
            if (board[2] == 'x' || board[2] == 'X') ;
            else {
                setPointThirdCodeTurn("górny prawy róg");
                z = 2;
                axisZThirdCodeTurn = z;
            }
        }
        if ((board[0] == 'o' || board[0] == 'O') && (board[4] == 'o' || board[4] == 'O')) {
            if (board[8] == 'x' || board[8] == 'X') ;
            else {
                setPointThirdCodeTurn("dolny prawy róg");
                z = 8;
                axisZThirdCodeTurn = z;
            }
        }
        if ((board[0] == 'o' || board[0] == 'O') && (board[3] == 'o' || board[3] == 'O')) {
            if (board[6] == 'x' || board[6] == 'X') ;
            else {
                setPointThirdCodeTurn("dolny lewy róg");
                z = 6;
                axisZThirdCodeTurn = z;
            }
        }
        if ((board[0] == 'o' || board[0] == 'O') && (board[6] == 'o' || board[6] == 'O')) {
            if (board[3] == 'x' || board[3] == 'X') ;
            else {
                setPointThirdCodeTurn("lewy środek");
                z = 3;
                axisZThirdCodeTurn = z;
            }
        }
        if ((board[0] == 'o' || board[0] == 'O') && (board[2] == 'o' || board[2] == 'O')) {
            if (board[1] == 'x' || board[1] == 'X') ;
            else {
                setPointThirdCodeTurn("środek góra");
                z = 1;
                axisZThirdCodeTurn = z;
            }
        }
        if ((board[0] == 'o' || board[0] == 'O') && (board[8] == 'o' || board[8] == 'O')) {
            if (board[4] == 'x' || board[4] == 'X') ;
            else {
                setPointThirdCodeTurn("środek");
                z = 4;
                axisZThirdCodeTurn = z;
            }
        }
        if ((board[1] == 'o' || board[1] == 'O') && (board[4] == 'o' || board[4] == 'O')) {
            if (board[7] == 'x' || board[7] == 'X') ;
            else {
                setPointThirdCodeTurn("środek dół");
                z = 7;
                axisZThirdCodeTurn = z;
            }
        }
        if ((board[1] == 'o' || board[1] == 'O') && (board[7] == 'o' || board[7] == 'O')) {
            if (board[4] == 'x' || board[4] == 'X') ;
            else {
                setPointThirdCodeTurn("środek");
                z = 4;
                axisZThirdCodeTurn = z;
            }
        }
        if ((board[4] == 'o' || board[4] == 'O') && (board[7] == 'o' || board[7] == 'O')) {
            if (board[1] == 'x' || board[1] == 'X') ;
            else {
                setPointThirdCodeTurn("środek góra");
                z = 1;
                axisZThirdCodeTurn = z;
            }
        }
        if ((board[1] == 'o' || board[1] == 'O') && (board[2] == 'o' || board[2] == 'O')) {
            if (board[0] == 'x' || board[0] == 'X') ;
            else {
                setPointThirdCodeTurn("górny lewy róg");
                z = 0;
                axisZThirdCodeTurn = z;
            }
        }
        if ((board[2] == 'o' || board[2] == 'O') && (board[4] == 'o' || board[4] == 'O')) {
            if (board[6] == 'x' || board[6] == 'X') ;
            else {
                setPointThirdCodeTurn("dolny lewy róg");
                z = 0;
                axisZThirdCodeTurn = z;
            }
        }
        if ((board[2] == 'o' || board[2] == 'O') && (board[5] == 'o' || board[5] == 'O')) {
            if (board[8] == 'x' || board[8] == 'X') ;
            else {
                setPointThirdCodeTurn("dolny prawy róg");
                z = 8;
                axisZThirdCodeTurn = z;
            }
        }
        if ((board[2] == 'o' || board[2] == 'O') && (board[6] == 'o' || board[6] == 'O')) {
            if (board[4] == 'x' || board[4] == 'X') ;
            else {
                setPointThirdCodeTurn("środek");
                z = 4;
                axisZThirdCodeTurn = z;
            }
        }
        if ((board[2] == 'o' || board[2] == 'O') && (board[8] == 'o' || board[8] == 'O')) {
            if (board[5] == 'x' || board[5] == 'X') ;
            else {
                setPointThirdCodeTurn("prawy środek");
                z = 5;
                axisZThirdCodeTurn = z;
            }
        }
        if ((board[3] == 'o' || board[3] == 'O') && (board[5] == 'o' || board[5] == 'O')) {
            if (board[4] == 'x' || board[4] == 'X') ;
            else {
                setPointThirdCodeTurn("środek");
                z = 4;
                axisZThirdCodeTurn = z;
            }
        }
        if ((board[6] == 'o' || board[6] == 'O') && (board[8] == 'o' || board[8] == 'O')) {
            if (board[7] == 'x' || board[7] == 'X') ;
            else {
                setPointThirdCodeTurn("środek dół");
                z = 7;
                axisZThirdCodeTurn = z;
            }
        }
        if ((board[7] == 'o' || board[7] == 'O') && (board[8] == 'o' || board[8] == 'O')) {
            if (board[6] == 'x' || board[6] == 'X') ;
            else {
                setPointThirdCodeTurn("dolny lewy róg");
                z = 6;
                axisZThirdCodeTurn = z;
            }
        }
        if ((board[5] == 'o' || board[5] == 'O') && (board[8] == 'o' || board[8] == 'O')) {
            if (board[2] == 'x' || board[2] == 'X') ;
            else {
                setPointThirdCodeTurn("górny prawy róg");
                z = 2;
                axisZThirdCodeTurn = z;
            }
        }
        if ((board[4] == 'o' || board[4] == 'O') && (board[8] == 'o' || board[8] == 'O')) {
            //if (board[0] == 'x' || board[0] == 'X') ;
            if (board[0] == '_') {
                //else {
                setPointThirdCodeTurn("górny lewy róg");
                z = 0;
                axisZThirdCodeTurn = z;
            }
        }
        if ((board[4] == 'o' || board[4] == 'O') && (board[7] == 'o' || board[7] == 'O')) {
            if (board[1] == 'x' || board[1] == 'X') ;
            else {
                setPointThirdCodeTurn("środek góra");
                z = 1;
                axisZThirdCodeTurn = z;
            }
        }
        if ((board[1] == 'o' || board[1] == 'O') && (board[4] == 'o' || board[4] == 'O')) {
            if (board[7] == 'x' || board[7] == 'X') ;
            else {
                setPointThirdCodeTurn("środek dół");
                z = 7;
                axisZThirdCodeTurn = z;
            }
        }
        if ((board[6] == 'o' || board[6] == 'O') && (board[7] == 'o' || board[7] == 'O')) {
            if (board[8] == 'x' || board[8] == 'X') ;
            else {
                setPointThirdCodeTurn("dolny prawy róg");
                z = 8;
                axisZThirdCodeTurn = z;
            }
        }
        if ((board[4] == 'o' || board[4] == 'O') && (board[6] == 'o' || board[6] == 'O')) {
            if (board[2] == 'x' || board[2] == 'X') {

            } else {
                setPointThirdCodeTurn("górny prawy róg");
                z = 2;
                axisZThirdCodeTurn = z;
            }
        }
        if ((board[3] == 'o' || board[3] == 'O') && (board[6] == 'o' || board[6] == 'O')) {
            if (board[0] == 'x' || board[0] == 'X') ;
            else {
                setPointThirdCodeTurn("górny lewy róg");
                z = 0;
                axisZThirdCodeTurn = z;
            }
        }
        if ((board[3] == 'o' || board[3] == 'O') && (board[4] == 'o' || board[4] == 'O')) {
            if (board[5] == 'x' || board[5] == 'X') ;
            else {
                setPointThirdCodeTurn("prawy środek");
                z = 5;
                axisZThirdCodeTurn = z;
            }
        }
        if ((board[4] == 'o' || board[4] == 'O') && (board[5] == 'o' || board[5] == 'O')) {
            if (board[3] == 'x' || board[3] == 'X') ;
            else {
                setPointThirdCodeTurn("lewy środek");
                z = 3;
                axisZThirdCodeTurn = z;
            }
        }

    }
    return ' ';
}
   public char logicThirdCodeTurn2() {
        if ((stateSecond =='o' || stateSecond =='O') && (state =='x' || state =='X'))
        {
                if ((board[0] == 'x' || board[0] == 'X') && (board[1] == 'x' || board[1] == 'X')) {
                    if (board[2] == 'o' || board[2] == 'O') ;
                    else {
                        setPointThirdCodeTurn("górny prawy róg");
                        z = 2;
                        axisZThirdCodeTurn = z;
                    }
                }
                if ((board[0] == 'x' || board[0] == 'x') && (board[4] == 'x' || board[4] == 'x')) {
                    if (board[8] == 'o' || board[8] == 'O') ;
                    else {
                        setPointThirdCodeTurn("dolny prawy róg");
                        z = 8;
                        axisZThirdCodeTurn = z;
                    }
                }
                if ((board[0] == 'x' || board[0] == 'X') && (board[3] == 'x' || board[3] == 'X')) {
                    if (board[6] == 'o' || board[6] == 'O') ;
                    else {
                        setPointThirdCodeTurn("dolny lewy róg");
                        z = 6;
                        axisZThirdCodeTurn = z;
                    }
                }
                if ((board[0] == 'x' || board[0] == 'X') && (board[6] == 'X' || board[6] == 'x')) {
                    if (board[3] == 'o' || board[3] == 'O') ;
                    else {
                        setPointThirdCodeTurn("lewy środek");
                        z = 3;
                        axisZThirdCodeTurn = z;
                    }
                }
                if ((board[0] == 'x' || board[0] == 'X') && (board[2] == 'x' || board[2] == 'X')) {
                    if (board[1] == 'o' || board[1] == 'O') ;
                    else {
                        setPointThirdCodeTurn("środek góra");
                        z = 1;
                        axisZThirdCodeTurn = z;
                    }
                }
                if ((board[0] == 'x' || board[0] == 'X') && (board[8] == 'x' || board[8] == 'X')) {
                    if (board[4] == 'o' || board[4] == 'O') ;
                    else {
                        setPointThirdCodeTurn("środek");
                        z = 4;
                        axisZThirdCodeTurn = z;
                    }
                }
                if ((board[1] == 'x' || board[1] == 'X') && (board[4] == 'x' || board[4] == 'X')) {
                    if (board[7] == 'o' || board[7] == 'O') ;
                    else {
                        setPointThirdCodeTurn("środek dół");
                        z = 7;
                        axisZThirdCodeTurn = z;
                    }
                }
               if ((board[1] == 'x' || board[1] == 'X') && (board[7] == 'x' || board[7] == 'X')) {
                    if (board[4] == 'o' || board[4] == 'O') ;
                    else {
                        setPointThirdCodeTurn("środek");
                        z = 4;
                        axisZThirdCodeTurn = z;
                    }
                }
                if ((board[3] == 'x' || board[3] == 'X') && (board[5] == 'x' || board[5] == 'X')) {
                    if (board[4] == 'o' || board[4] == 'O') ;
                    else {
                        setPointThirdCodeTurn("środek");
                        z = 4;
                        axisZThirdCodeTurn = z;
                    }
                }
                if ((board[4] == 'x' || board[4] == 'X') && (board[7] == 'x' || board[7] == 'X')) {
                    if (board[1] == 'o' || board[1] == 'O') ;
                    else {
                        setPointThirdCodeTurn("środek góra");
                        z = 1;
                        axisZThirdCodeTurn = z;
                    }
                }
                if ((board[1] == 'x' || board[1] == 'X') && (board[2] == 'x' || board[2] == 'X')) {
                    if (board[0] == 'o' || board[0] == 'O') ;
                    else {
                        setPointThirdCodeTurn("górny lewy róg");
                        z = 0;
                        axisZThirdCodeTurn = z;
                    }
                }
                if ((board[2] == 'x' || board[2] == 'X') && (board[4] == 'x' || board[4] == 'X')) {
                    if (board[6] == 'o' || board[6] == 'O') ;
                    else {
                        setPointThirdCodeTurn("dolny lewy róg");
                        z = 6;
                        axisZThirdCodeTurn = z;
                    }
                }
                if ((board[2] == 'x' || board[2] == 'X') && (board[5] == 'x' || board[5] == 'X')) {
                    if (board[8] == 'o' || board[8] == 'O') ;
                    else {
                        setPointThirdCodeTurn("dolny prawy róg");
                        z = 8;
                        axisZThirdCodeTurn = z;
                    }
                }
                if ((board[2] == 'x' || board[2] == 'X') && (board[6] == 'x' || board[6] == 'X')) {
                    if (board[4] == 'o' || board[4] == 'O') ;
                    else {
                        setPointThirdCodeTurn("środek");
                        z = 4;
                        axisZThirdCodeTurn = z;
                    }
                }
                if ((board[2] == 'x' || board[2] == 'X') && (board[8] == 'x' || board[8] == 'X')) {
                    if (board[5] == 'o' || board[5] == 'O') ;
                    else {
                        setPointThirdCodeTurn("prawy środek");
                        z = 5;
                        axisZThirdCodeTurn = z;
                    }
                }
                if ((board[5] == 'x' || board[5] == 'X') && (board[8] == 'x' || board[8] == 'X')) {
                    if (board[2] == 'o' || board[2] == 'O') ;
                    else {
                        setPointThirdCodeTurn("górny prawy róg");
                        z = 2;
                        axisZThirdCodeTurn = z;
                    }
                }
                if ((board[4] == 'x' || board[4] == 'X') && (board[8] == 'x' || board[8] == 'X')) {
                    if (board[0] == 'o' || board[0] == 'O') ;
                    else {
                        setPointThirdCodeTurn("górny lewy róg");
                        z = 0;
                        axisZThirdCodeTurn = z;
                    }
                }
                if ((board[7] == 'x' || board[7] == 'X') && (board[8] == 'x' || board[8] == 'X')) {
                    if (board[6] == 'o' || board[6] == 'O') ;
                    else {
                        setPointThirdCodeTurn("dolny lewy róg");
                        z = 6;
                        axisZThirdCodeTurn = z;
                    }
                }
                if ((board[6] == 'x' || board[6] == 'X') && (board[8] == 'x' || board[8] == 'X')) {
                    if (board[7] == 'o' || board[7] == 'O') ;
                    else {
                        setPointThirdCodeTurn("środek dół");
                        z = 7;
                        axisZThirdCodeTurn = z;
                    }
                }
                if ((board[4] == 'x' || board[4] == 'x') && (board[7] == 'x' || board[7] == 'X')) {
                    if (board[1] == 'o' || board[1] == 'O') ;
                    else {
                        setPointThirdCodeTurn("środek góra");
                        z = 1;
                        axisZThirdCodeTurn = z;
                    }
                }
                if ((board[1] == 'x' || board[1] == 'X') && (board[4] == 'x' || board[4] == 'X')) {
                    if (board[7] == 'o' || board[7] == 'O') ;
                    else {
                        setPointThirdCodeTurn("środek dół");
                        z = 7;
                        axisZThirdCodeTurn = z;
                    }
                }
                if ((board[6] == 'x' || board[6] == 'X') && (board[7] == 'x' || board[7] == 'X')) {
                    if (board[8] == 'o' || board[8] == 'O') ;
                    else {
                        setPointThirdCodeTurn("dolny prawy róg");
                        z = 8;
                        axisZThirdCodeTurn = z;
                    }
                }
                if ((board[4] == 'x' || board[4] == 'x') && (board[6] == 'x' || board[6] == 'X')) {
                    if (board[2] == 'o' || board[2] == 'O') ;
                    else {
                        setPointThirdCodeTurn("górny prawy róg");
                        z = 2;
                        axisZThirdCodeTurn = z;
                    }
                }
                if ((board[3] == 'x' || board[3] == 'X') && (board[6] == 'x' || board[6] == 'X')) {
                    if (board[0] == 'o' || board[0] == 'O') ;
                    else {
                        setPointThirdCodeTurn("górny lewy róg");
                        z = 0;
                        axisZThirdCodeTurn = z;
                    }
                }
                if ((board[3] == 'x' || board[3] == 'X') && (board[4] == 'x' || board[4] == 'X')) {
                    if (board[5] == 'o' || board[5] == 'O') ;
                    else {
                        setPointThirdCodeTurn("prawy środek");
                        z = 5;
                        axisZThirdCodeTurn = z;
                    }
                }
                if ((board[4] == 'x' || board[4] == 'X') && (board[5] == 'x' || board[5] == 'X')) {
                    if (board[3] == 'o' || board[3] == 'O') ;
                    else {
                        setPointThirdCodeTurn("lewy środek");
                        z = 3;
                        axisZThirdCodeTurn = z;
                    }
                }

    }
        return ' ';
}
    public void logic2ThirdCodeTurn() {
        if (pointThirdCodeTurn == null) {
            System.out.println("Program nie wybrał żadnego ruchu");
            //if (pointSecCodeTurn == "górny lewy róg") {
                if (board[8] == '_') setPointThirdCodeTurn("dolny prawy róg");
                else {
                    if (board[6] == '_') setPointThirdCodeTurn("dolny lewy róg");
                    else System.out.println("Oba pola 6 i 8 są zajęte");
                }
            //}
            //if (pointSecCodeTurn == "dolny lewy róg") {
                if (board[2] == '_') setPointThirdCodeTurn("górny prawy róg");
                else {
                    if (board[0] == '_') setPointThirdCodeTurn("górny lewy róg");
                    else System.out.println("Oba pola 2 i 0 są zajęte");
                }
            //}
            //if (pointSecCodeTurn == "górny prawy róg") {
                if (board[6] == '_') setPointThirdCodeTurn("dolny lewy róg");
                else {
                    if (board[8] == '_') setPointThirdCodeTurn("dolny prawy róg");
                    else System.out.println("Oba pola 6 i 8 są zajęte");
                }
            //}
            //if (pointSecCodeTurn == "dolny prawy róg") {
                if (board[0] == '_') setPointThirdCodeTurn("górny lewy róg");
                else {
                    if (board[6] == '_') setPointThirdCodeTurn("dolny lewy róg");
                    else System.out.println("Oba pola 0 i 8 są zajęte");
                }
            //}
        } else System.out.println(pointThirdCodeTurn);
    }
public static boolean results() {
        //result=false;
        if ((board[0] == 'X' && board[1] == 'X' && board[2] == 'X')
                || (board[0] == 'O' && board[1] == 'O' && board[2] == 'O')
                || (board[0] == 'x' && board[1] == 'x' && board[2] == 'x')
                || (board[0] == 'o' && board[1] == 'o' && board[2] == 'o')) {
            System.out.println("Nastąpiła wygrana");
            result=true;
            System.exit(1);
        }
        if ((board[0] == 'X' && board[3] == 'X' && board[6] == 'X')
                || (board[0] == 'O' && board[3] == 'O' && board[6] == 'O')
                || (board[0] == 'x' && board[3] == 'x' && board[6] == 'x')
                || (board[0] == 'o' && board[3] == 'o' && board[6] == 'o')) {
            System.out.println("Nastąpiła wygrana");
            result=true;
            System.exit(1);
        }
        if ((board[0] == 'X' && board[4] == 'X' && board[8] == 'X')
                || (board[0] == 'O' && board[4] == 'O' && board[8] == 'O')
                || (board[0] == 'x' && board[4] == 'x' && board[8] == 'x')
                || (board[0] == 'o' && board[4] == 'o' && board[8] == 'o')) {
            System.out.println("Nastąpiła wygrana");
            result=true;
            System.exit(1);
        }
        if ((board[3] == 'X' && board[4] == 'X' && board[5] == 'X')
                || (board[3] == 'O' && board[4] == 'O' && board[5] == 'O')
                || (board[3] == 'x' && board[4] == 'x' && board[5] == 'x')
                || (board[3] == 'o' && board[4] == 'o' && board[5] == 'o')) {
            System.out.println("Nastąpiła wygrana");
            result=true;
            System.exit(1);
        }
        if ((board[1] == 'X' && board[4] == 'X' && board[7] == 'X')
                || (board[1] == 'O' && board[4] == 'O' && board[7] == 'O')
                || (board[1] == 'x' && board[4] == 'x' && board[7] == 'x')
                || (board[1] == 'o' && board[4] == 'o' && board[7] == 'o')) {
            System.out.println("Nastąpiła wygrana");
            result=true;
            System.exit(1);
        }
        if ((board[2] == 'X' && board[4] == 'X' && board[6] == 'X')
                || (board[2] == 'O' && board[4] == 'O' && board[6] == 'O')
                || (board[2] == 'x' && board[4] == 'x' && board[6] == 'x')
                || (board[2] == 'o' && board[4] == 'o' && board[6] == 'o')) {
            System.out.println("Nastąpiła wygrana");
            result=true;
            System.exit(1);
        if ((board[6] == 'X' && board[7] == 'X' && board[8] == 'X')
                    || (board[6] == 'O' && board[7] == 'O' && board[8] == 'O')
                    || (board[6] == 'x' && board[7] == 'x' && board[8] == 'x')
                    || (board[6] == 'o' && board[7] == 'o' && board[8] == 'o')) {
                System.out.println("Nastąpiła wygrana");
                result=true;
                System.exit(1);
        }
        if ((board[2] == 'X' && board[5] == 'X' && board[8] == 'X')
                    || (board[2] == 'O' && board[5] == 'O' && board[8] == 'O')
                    || (board[2] == 'x' && board[5] == 'x' && board[8] == 'x')
                    || (board[2] == 'o' && board[5] == 'o' && board[8] == 'o')) {
                System.out.println("Nastąpiła wygrana");
                result=true;
                System.exit(1);
        }
        }
    return result;
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
