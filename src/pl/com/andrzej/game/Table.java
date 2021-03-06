package pl.com.andrzej.game;
import java.util.Scanner;

public class Table extends Board {
    private boolean result=false;
    private String point,pointCopy;
    private String pointFirstCodeTurn="_",pointFirstUserTurn="_";
    private String pointSecCodeTurn="_",pointSecUserTurn="_";
    private String pointThirdUserTurn, pointThirdCodeTurn;
    private String pointFourthUserTurn, pointFourthCodeTurn;
    private String pointFifthUserTurn, pointFifthCodeTurn;
    private String pointSixthUserTurn;
    private short axisZCodeTurn,axisZUserTurn;
    private short axisZSecCodeTurn,axisZSecUserTurn;
    private short axisZThirdUserTurn,axisZThirdCodeTurn;
    private short axisZFourthUserTurn,axisZFourthCodeTurn,axiZCopy;
    private short axisZFifthUserTurn, axisZFifthCodeTurn;
    private short axisZSixthUserTurn;
    private char state,stateSecond;
public Table(String point, char state, String pointFirstCodeTurn, String pointCopy, String pointFourthCodeTurn,
             String pointThirdCodeTurn, String pointFifthCodeTurn, boolean result,
             String pointFirstUserTurn, short axisZThirdUserTurn, short z, char[] board) {
        this.z = z;
        this.point=point;
        this.pointFirstUserTurn=pointFirstUserTurn;
        this.pointFirstCodeTurn=pointFirstCodeTurn;
        this.pointFourthCodeTurn=pointFourthCodeTurn;
        this.pointThirdCodeTurn=pointThirdCodeTurn;
        this.pointFifthCodeTurn=pointFifthCodeTurn;
        this.state=state;
        this.result=result;
        this.pointCopy=pointCopy;
//        this.axisZThirdCodeTurn=axisZThirdCodeTurn;
        this.board=board;
    }
    Table() {
        super();
    }
    private short setaxisZThirdCodeTurn(short axisZThirdCodeTurn) {
        Table.this.axisZThirdCodeTurn=axisZThirdCodeTurn;
        return axisZThirdCodeTurn;
    }
    private short setaxisZFourthCodeTurn() {
        return axisZFourthCodeTurn;
    }
    private String getPoint() {
        return point;
    }
    private String setPoint(String point) {
        Table.this.point=point;
        return point;
    }
    private String setPointCopy(String pointCopy) {
        Table.this.pointCopy=pointCopy;
        return pointCopy;
    }
    private String setPointFirstUserTurn(String pointFirstUserTurn) {
        Table.this.pointFirstUserTurn=pointFirstUserTurn;
        return pointFirstUserTurn;
    }
    private String setPointFirstCodeTurn(String pointFirstCodeTurn) {
        Table.this.pointFirstCodeTurn=pointFirstCodeTurn;
        return pointFirstCodeTurn;
    }
    private String setPointSecCodeTurn(String pointSecCodeTurn) {
        Table.this.pointSecCodeTurn=pointSecCodeTurn;
        return pointSecCodeTurn;
    }
    private String setPointThirdCodeTurn(String pointThirdCodeTurn) {
        Table.this.pointThirdCodeTurn=pointThirdCodeTurn;
        return pointThirdCodeTurn;
    }
    private String setPointFourthCodeTurn(String pointFourthCodeTurn) {
        Table.this.pointFourthCodeTurn=pointFourthCodeTurn;
        return pointFourthCodeTurn;
    }
    private String setPointFifthCodeTurn(String pointFifthCodeTurn) {
        Table.this.pointFifthCodeTurn=pointFifthCodeTurn;
        return pointFifthCodeTurn;
    }
    char addState() {
        state=' ';
        Scanner skan= new Scanner(System.in);
        System.out.println("Podaj jaki znak chcesz wstawić kółko(O) czy krzyżyk(X)");
        state= skan.next().charAt(0);
        skan.reset();
        return ' ';
    }
    String sixthUserTurn() {
        Scanner skan= new Scanner(System.in);
        System.out.println("Legenda programu: ");
        System.out.println("Podawaj dane tak: górny lewy róg, dolny prawy róg, środek dół, środek góra, lewy środek, prawy środek itp");
        System.out.println("Kod wybrał:  "+stateSecond+" na pozycji: "+pointFifthCodeTurn+" | "+axisZFifthCodeTurn);
        do {
                                        System.out.println("Podaj współrzędne");
                                        pointSixthUserTurn = skan.nextLine();

        } while( (pointFirstUserTurn.equals(pointSixthUserTurn)) || (pointSecCodeTurn.equals(pointSixthUserTurn))
             || (pointThirdUserTurn.equals(pointSixthUserTurn)) || (pointThirdCodeTurn.equals(pointSixthUserTurn))
             || (pointFourthCodeTurn.equals(pointSixthUserTurn)) || (pointFourthUserTurn.equals(pointSixthUserTurn))
             || (pointFifthCodeTurn.equals(pointSixthUserTurn)) || (pointFifthUserTurn.equals(pointSixthUserTurn)) );
        setPoint(pointSixthUserTurn);
        ifyWszystkieRazem();
        Table.this.axisZSixthUserTurn=Table.this.z;
    if (pointFirstCodeTurn.equals("_")) {
            board[axisZSixthUserTurn] = state;
    }
        board[z]=board[axisZSixthUserTurn];
        printBoard();
        skan.reset();
        return " ";
    }
    String fifthUserTurn() {
        Scanner skan= new Scanner(System.in);
        System.out.println("Legenda programu: ");
        System.out.println("Podawaj dane tak: górny lewy róg, dolny prawy róg, środek dół, środek góra, lewy środek, prawy środek itp");
        System.out.println("Kod wybrał:  "+stateSecond+" na pozycji: "+pointFourthCodeTurn+" | "+axisZFourthCodeTurn);
        do {
                                      System.out.println("Podaj współrzędne");
                                      pointFifthUserTurn = skan.nextLine();
        } while ( (pointFirstUserTurn.equals(pointFifthUserTurn)) || (pointSecCodeTurn.equals(pointFifthUserTurn))
                || (pointThirdUserTurn.equals(pointFirstUserTurn)) || (pointThirdCodeTurn.equals(pointFifthUserTurn))
                || (pointFourthUserTurn.equals(pointFifthUserTurn)) || (pointFourthCodeTurn.equals(pointFifthUserTurn)) );
        setPoint(pointFifthUserTurn);
        ifyWszystkieRazem();
        axisZFifthUserTurn=z;
        if (pointFirstCodeTurn.equals("_")) {
            board[axisZFifthUserTurn] = state;
            board[z] = board[axisZFifthUserTurn];
        } else {
            board[axisZFifthUserTurn] = stateSecond;
            board[z] = board[axisZFifthUserTurn];
        }
        printBoard();
        skan.reset();
        return " ";
    }
    String fourthUserTurn() {
        Scanner skan= new Scanner(System.in);
        System.out.println("Legenda programu: ");
        System.out.println("Podawaj dane tak: górny lewy róg, dolny prawy róg, środek dół, środek góra, lewy środek, prawy środek itp");
        System.out.println("Kod wybrał:  "+stateSecond+" na pozycji: "+pointThirdCodeTurn+" | "+axisZThirdCodeTurn);
        do {
                                System.out.println("Podaj współrzędne");
                                pointFourthUserTurn = skan.nextLine();

        } while ( (pointFirstUserTurn.equals(pointFourthUserTurn)) || (pointSecCodeTurn.equals(pointFourthUserTurn))
                || (pointThirdUserTurn.equals(pointFourthUserTurn)) || (pointThirdCodeTurn.equals(pointFourthUserTurn)) );

        setPoint(pointFourthUserTurn);
        ifyWszystkieRazem();
        axisZFourthUserTurn=z;
        if (pointFirstCodeTurn.equals("_")) {
            board[axisZFourthUserTurn]=state;
            board[z]=board[axisZFourthUserTurn];
        } else {
            board[axisZFourthUserTurn] = stateSecond;
            board[z] = board[axisZFourthUserTurn];
        }
        printBoard();
        skan.reset();
        return " ";
    }
    String thirdUserTurn() {
        Scanner skan= new Scanner(System.in);
        System.out.println("Legenda programu: ");
        System.out.println("Podawaj dane tak: górny lewy róg, dolny prawy róg, środek dół, środek góra, lewy środek, prawy środek itp");
        System.out.println("Kod wybrał:  "+stateSecond+" na pozycji: "+pointSecCodeTurn+" | "+z);
        do {
                    System.out.println("Podaj współrzędne");
                    pointThirdUserTurn = skan.nextLine();

        } while ( (pointFirstCodeTurn.equals(pointThirdUserTurn)) || (pointSecCodeTurn.equals(pointThirdUserTurn))
                || (pointSecUserTurn.equals(pointThirdUserTurn)) );
        setPoint(pointThirdUserTurn);
        ifyWszystkieRazem();

        axisZThirdUserTurn=z;
        if (pointFirstCodeTurn.equals("_")) {
            board[axisZThirdUserTurn] = state;
            board[z] = board[axisZThirdUserTurn];
        } else {
            board[axisZThirdUserTurn] = stateSecond;
            board[z] = board[axisZThirdUserTurn];
        }
        printBoard();
        skan.reset();
        setPoint(pointCopy);
		return " ";
    }
    String secondUserTurn() {//throws InterruptedException {
        stateSecond=' ';
        Scanner skan= new Scanner(System.in);
        System.out.println("Legenda programu: ");
        System.out.println("Podawaj dane tak: górny lewy róg, dolny prawy róg, środek dół, środek góra, lewy środek, prawy środek itp");
        System.out.println("Kod wybrał:  "+state+" na pozycji: "+pointFirstCodeTurn+" | "+z);
        do {
            System.out.println("Podaj współrzędne");
            pointSecUserTurn=skan.nextLine();
        } while (pointFirstCodeTurn.equals(pointSecUserTurn));
        setPointCopy(point);
        setPoint(pointSecUserTurn);
        ifyWszystkieRazem();
        if (state=='x' || state=='X') {
            stateSecond='O';
        }
        else stateSecond='X';
        axisZSecUserTurn=z;
        board[axisZSecUserTurn]=stateSecond;
        board[z]=board[axisZSecUserTurn];
/* Metoda bierze udział tylko kiedy Kod zaczyna grę*/
        printBoard();
        setPoint(pointCopy);
		return " ";
    }
    String firstUserTurn() {
        for (short z=0 ; z<9 ; z++){
            board[z]='_';
        }
        Scanner skan= new Scanner(System.in);
        System.out.println("Legenda programu: ");
        System.out.println("Podawaj dane tak: górny lewy róg, dolny prawy róg, środek dół, środek góra, lewy środek, prawy środek itp");
        System.out.println("Podaj współrzędne");
        point=skan.nextLine();
        setPointFirstUserTurn(point);
        ifyWszystkieRazem();
        axisZUserTurn=z;
        board[axisZUserTurn]=state;
        board[z]=board[axisZUserTurn];
        printBoard();
        return " ";
    }
    String fifthCodeTurn() {
        pointFifthCodeTurn="_";
        if (pointFirstCodeTurn.equals("_")) {
            if (state == 'x' || state == 'X') {
                stateSecond = 'O';
                System.out.println("Player choose Cross " + " and choose field " + pointFifthUserTurn + " on Axis(z): " + axisZFifthUserTurn);
            } else {
                stateSecond = 'X';
                System.out.println("Player choose Circle " + "and choose field " + pointFifthUserTurn + " on Axis(z): " + axisZFifthUserTurn);
            }
        } else {
            if (state == 'x' || state == 'X') {
                stateSecond = 'O';
                System.out.println("Player played second and choose Cross " + " and choose field " + pointFifthUserTurn + " on Axis(z): " + axisZFifthUserTurn);
            } else {
                stateSecond = 'X';
                System.out.println("Player played second and choose Circle " + "and choose field " + pointFifthUserTurn + " on Axis(z): " + axisZFifthUserTurn);
            }
        }
            axiZCopy = axisZThirdCodeTurn;
            setPointCopy(pointThirdCodeTurn);
    do {
                                    if (state == 'o' || state == 'O') {
                                        if (pointFirstCodeTurn.equals("_")) {
                                            checkUserTurn2();
                                            logicThirdCodeTurn();
                                            setPointFifthCodeTurn(pointThirdCodeTurn);
                                            if ((pointFifthCodeTurn.equals("_") || (pointFifthCodeTurn.equals(pointCopy)))) {
                                                logicAntiUserTurn2();
                                                setPointFifthCodeTurn(pointThirdCodeTurn);
                                            }
                                        } else {
                                            checkUserTurn1();
                                            logicThirdCodeTurn2();
                                            setPointFifthCodeTurn(pointThirdCodeTurn);
                                            if ((pointFifthCodeTurn.equals("_") || (pointFifthCodeTurn.equals(pointCopy)))) {
                                                logicAntiUserTurn1();
                                                setPointFifthCodeTurn(pointThirdCodeTurn);
                                            }
                                        }
                                    } else {
                                        if (pointFirstCodeTurn.equals("_")) {
                                            checkUserTurn1();
                                            logicThirdCodeTurn2();
                                            setPointFifthCodeTurn(pointThirdCodeTurn);
                                            if ((pointFifthCodeTurn.equals("_") || (pointFifthCodeTurn.equals(pointCopy)))) {
                                                logicAntiUserTurn1();
                                                setPointFifthCodeTurn(pointThirdCodeTurn);
                                            }
                                        } else {
                                            checkUserTurn2();
                                            logicThirdCodeTurn();
                                            setPointFifthCodeTurn(pointThirdCodeTurn);
                                            if ((pointFifthCodeTurn.equals("_") || (pointFifthCodeTurn.equals(pointCopy)))) {
                                                logicAntiUserTurn2();
                                                setPointFifthCodeTurn(pointThirdCodeTurn);
                                            }
                                        }
                                    }
                                    System.out.println("Test while w thirdCodeTurn: user value: " + pointFifthUserTurn
                                            + " code value: " + pointFifthCodeTurn + "  z: " + z);
                                    setPointThirdCodeTurn(pointCopy);
                                    axisZFifthCodeTurn = z;
    } while ( (pointFirstCodeTurn.equals(pointFifthCodeTurn)) || (pointFirstUserTurn.equals(pointFifthCodeTurn))
            || (pointSecCodeTurn.equals(pointFifthCodeTurn)) || (pointSecUserTurn.equals(pointFifthCodeTurn))
            || (pointThirdCodeTurn.equals(pointFifthCodeTurn)) || (pointThirdUserTurn.equals(pointFifthCodeTurn))
            || (pointFourthCodeTurn.equals(pointFifthCodeTurn)) || (pointFourthUserTurn.equals(pointFifthCodeTurn))
            || (pointFifthUserTurn.equals(pointFifthCodeTurn)) );
        setPointThirdCodeTurn(pointCopy);
        setaxisZThirdCodeTurn(axiZCopy);
        setPoint(pointFifthCodeTurn);
        ifyWszystkieRazem();
        axisZFifthCodeTurn=z;
        System.out.println("Kod wybrał współrzędne:  "+pointFifthCodeTurn+" , "+axisZFifthCodeTurn);
        if (pointFirstCodeTurn.equals("_")) {
            board[axisZFifthCodeTurn] = stateSecond;
            board[z] = board[axisZFifthCodeTurn];
        } else {
            board[axisZFifthCodeTurn] = state;
            board[z] = board[axisZFifthCodeTurn];
        }
        printBoard();
        return " ";
    }
    String fourthCodeTurn() {
        if (pointFirstCodeTurn.equals("_")) {
            if (state == 'x' || state == 'X') {
                stateSecond = 'O';
                System.out.println("Player choose Cross " + " and choose field " + pointFourthUserTurn + " on Axis(z): " + axisZFourthUserTurn);
            } else {
                stateSecond = 'X';
                System.out.println("Player choose Circle " + "and choose field " + pointFourthUserTurn + " on Axis(z): " + axisZFourthUserTurn);
            }
        } else {
            if (state == 'x' || state == 'X') {
                stateSecond = 'O';
                System.out.println("Code choose Cross " + " and choose field " + pointThirdCodeTurn + " on Axis(z): " + axisZThirdCodeTurn);
            } else {
                stateSecond = 'X';
                System.out.println("Code choose Circle " + "and choose field " + pointThirdCodeTurn + " on Axis(z): " + axisZThirdCodeTurn);
            }
        }
        axiZCopy=axisZThirdCodeTurn;
        setPointCopy(pointThirdCodeTurn);
        do {
            if (state == 'o' || state == 'O') {
                if (pointFirstCodeTurn.equals("_")) {
                    checkUserTurn2();
                    logicThirdCodeTurn();
                    System.out.println("Znak: " + z + " obecny: " + pointThirdCodeTurn + " poprzedni" + pointCopy);
                    setPointFourthCodeTurn(pointThirdCodeTurn);
                    axisZFourthCodeTurn = z;
                       if (pointFourthCodeTurn.equals("_")) {//|| (pointFourthCodeTurn.equals(pointCopy)))) {
                           logicAntiUserTurn2();
                           axisZFourthCodeTurn = z;
                       }
                       setPointFourthCodeTurn(pointThirdCodeTurn);
                       System.out.println("Znak: " + z + " obecny: " + pointThirdCodeTurn + " poprzedni" + pointCopy);
                } else {
                    checkUserTurn1();
                    logicThirdCodeTurn2();
                    System.out.println("Znak: " + z + " obecny: " + pointThirdCodeTurn + " poprzedni" + pointCopy);
                    setPointFourthCodeTurn(pointThirdCodeTurn);
                    axisZFourthCodeTurn = z;
                       if (pointFourthCodeTurn.equals("_")) { // || (pointFourthCodeTurn.equals(pointCopy)))) {
                           logicAntiUserTurn1();
                           axisZFourthCodeTurn = z;
                           }
                           setPointFourthCodeTurn(pointThirdCodeTurn);
                           System.out.println("Znak: " + z + " obecny: " + pointThirdCodeTurn + " poprzedni" + pointCopy);
                                }
            } else {
                if (pointFirstCodeTurn.equals("_")) {
                    checkUserTurn1();
                    logicThirdCodeTurn2();
                    setPointFourthCodeTurn(pointThirdCodeTurn);
                       if (pointFourthCodeTurn.equals("_")) { //|| (pointFourthCodeTurn.equals(pointCopy)))) {
                           logicAntiUserTurn1();
                           setPointFourthCodeTurn(pointThirdCodeTurn);
                       }
                       System.out.println("Test while w fourthCodeTurn: user value: " + pointFourthUserTurn
                        + " code value: " + pointFourthCodeTurn + "  z: " + z + " współrzędne axisfourth: "
                        + axisZFourthCodeTurn);
                       } else {
                           checkUserTurn2();
                           logicThirdCodeTurn();
                           setPointFourthCodeTurn(pointThirdCodeTurn);
                           if (pointFourthCodeTurn.equals("_")) { // || (pointFourthCodeTurn.equals(pointCopy)))) {
                               logicAntiUserTurn2();
                           }
                }
            }
                    setPointFourthCodeTurn(pointThirdCodeTurn);
                    setPointThirdCodeTurn(pointCopy);

        } while ( (pointFourthCodeTurn.equals(pointFirstCodeTurn)) || (pointFourthCodeTurn.equals(pointFirstUserTurn))
                || (pointFourthCodeTurn.equals(pointSecCodeTurn)) || (pointFourthUserTurn.equals(pointSecUserTurn))
                || (pointFourthCodeTurn.equals(pointThirdCodeTurn)) || (pointFourthCodeTurn.equals(pointThirdUserTurn))
                || (pointFourthCodeTurn.equals(pointFourthUserTurn)) );
        setPoint(pointFourthCodeTurn);
        ifyWszystkieRazem();
        axisZFourthCodeTurn=z;

        System.out.println("Kod wybrał współrzędne:  "+pointFourthCodeTurn+" , "+axisZFourthCodeTurn);
        if (pointFirstCodeTurn.equals("_")) {
            board[axisZFourthCodeTurn] = stateSecond;
            board[z] = board[axisZFourthCodeTurn];
        } else {
            board[axisZFourthCodeTurn] = state;
            board[z] = board[axisZFourthCodeTurn];
        }
        printBoard();
        setaxisZThirdCodeTurn(axiZCopy);
        return " ";
    }
    String thirdCodeTurn() {
        //stateSecond;
        pointThirdCodeTurn="Nie chce nadal chodzić 10/03/2019";
        setPointThirdCodeTurn("jak to ma być Panie");
        setPointThirdCodeTurn("_");
        if (pointFirstCodeTurn.equals("_")) {
            if (state == 'x' || state == 'X') {
                stateSecond = 'O';
                System.out.println("Player choose Cross " + " and choose field " + pointThirdUserTurn + " on Axis(z): " + axisZThirdUserTurn);
            } else {
                stateSecond = 'X';
                System.out.println("Player choose Circle " + "and choose field " + pointThirdUserTurn + " on Axis(z): " + axisZThirdUserTurn);
            }
        } else {
            if (state == 'x' || state == 'X') {
                stateSecond = 'O';
                System.out.println("Code choose Cross " + " and choose field " + pointSecCodeTurn + " on Axis(z): " + axisZSecCodeTurn);
            } else {
                stateSecond = 'X';
                System.out.println("Code choose Circle " + "and choose field " + pointSecCodeTurn + " on Axis(z): " + axisZSecCodeTurn);
            }
        }
        do {
           if (state == 'o' || state == 'O') {
               if (pointFirstCodeTurn.equals("_")) {
                         checkUserTurn2();
                         logicThirdCodeTurn();
                         axisZThirdCodeTurn = z;
                         System.out.println("Kod w pętli while tuż po logicthirdcodeturn: " + pointThirdCodeTurn + " , " + axisZThirdCodeTurn);
                         if (pointThirdCodeTurn.equals("_")) {
                             logicAntiUserTurn2();
                             axisZThirdCodeTurn = z;
                             System.out.println("Kod w petli while tuż po logicAntiUserTurn2: " + pointThirdCodeTurn + " , " + axisZThirdCodeTurn);
                         }

               }  else {
                         checkUserTurn1();
                         logicThirdCodeTurn2();
                         axisZThirdCodeTurn = z;
                         System.out.println("Kod w pętli while tuż po logicthirdcodeturn2: " + pointThirdCodeTurn + " , " + axisZThirdCodeTurn);
                         if (pointThirdCodeTurn.equals("_")) {
                             logicAntiUserTurn1();
                             axisZThirdCodeTurn = z;
                         }
                         System.out.println("Kod w petli while tuż po logicAntiUserTurn1: " + pointThirdCodeTurn + " , " + axisZThirdCodeTurn);
                     }
           } else {
               if (pointFirstCodeTurn.equals("_")) {
                         checkUserTurn1();
                         logicThirdCodeTurn2();
                         axisZThirdCodeTurn = z;
                         System.out.println("Kod w pętli while tuż po logicthirdcodeturn2: " + pointThirdCodeTurn + " , " + axisZThirdCodeTurn);
                         if (pointThirdCodeTurn.equals("_")) {
                             logicAntiUserTurn1();
                             axisZThirdCodeTurn = z;
                             System.out.println("Test while w thirdCodeTurn po logicAntiUserTurn1: user value: " + pointThirdUserTurn
                                     + " code value: " + pointThirdCodeTurn + "  z: " + z + " współrzędne AxisThird: "
                                     + axisZThirdCodeTurn);
                         }
               }  else {
                         checkUserTurn2();
                         logicThirdCodeTurn();
                         axisZThirdCodeTurn = z;
                         System.out.println("Kod w pętli while tuż po logicthirdcodeturn: " + pointThirdCodeTurn + " , " + axisZThirdCodeTurn);
                         if (pointThirdCodeTurn.equals("_")) {
                             logicAntiUserTurn2();
                             axisZThirdCodeTurn = z;
                         }
                         System.out.println("Test while w thirdCodeTurn tuz po logicAntiUserTurn2: user value: " + pointThirdUserTurn
                                 + " code value: " + pointThirdCodeTurn + "  z: " + z + " współrzędne AxisThird: "
                                 + axisZThirdCodeTurn);
                     }
                 }
        } while ( (pointThirdCodeTurn.equals(pointFirstCodeTurn)) || (pointThirdCodeTurn.equals(pointFirstUserTurn))
                    || (pointThirdCodeTurn.equals(pointSecCodeTurn)) || (pointThirdCodeTurn.equals(pointSecUserTurn))
                    || (pointThirdCodeTurn.equals(pointThirdUserTurn)) );
        setPoint(pointThirdCodeTurn);
        ifyWszystkieRazem();
        axisZThirdCodeTurn=z;
        System.out.println("Kod wybrał współrzędne:  "+pointThirdCodeTurn+" , "+z);
        if (pointFirstCodeTurn.equals("_")) {
            board[axisZThirdCodeTurn] = stateSecond;
            board[z] = board[axisZThirdCodeTurn];
        } else {
            board[axisZThirdCodeTurn] = state;
            board[z] = board[axisZThirdCodeTurn];
        }
        setPointCopy(pointThirdCodeTurn);
        printBoard();
        return " ";
    }

    String secondCodeTurn() {

        java.security.SecureRandom turnChoice = new java.security.SecureRandom();
        int choice=0;
        if (pointFirstCodeTurn.equals("_")) {
            if (state == 'x' || state == 'X') {
                stateSecond = 'O';
                System.out.println("Code choose Cross " + " and choose field " + pointFirstCodeTurn + " on Axis(z): " + axisZCodeTurn);
            } else {
                stateSecond = 'X';
                System.out.println("Code choose Circle " + "and choose field " + pointFirstCodeTurn + " on Axis(z): " + axisZCodeTurn);
            }
        } else {
            if (state == 'x' || state == 'X') {
                stateSecond = 'O';
                System.out.println("Player choose Cross " + " and choose field " + pointFirstUserTurn + " on Axis(z): " + axisZUserTurn);
            } else {
                stateSecond = 'X';
                System.out.println("Player choose Circle " + "and choose field " + pointFirstUserTurn + " on Axis(z): " + axisZUserTurn);
            }
        }
        do {
                    if (pointFirstCodeTurn.equals("_"))
                    logicSecondCodeTurn();
                    else {
                        if (pointFirstCodeTurn.equals("górny lewy róg") && !pointFirstUserTurn.equals("środek góra")) {
                            setPointSecCodeTurn("środek góra");
                        }
                        if (pointFirstCodeTurn.equals("górny prawy róg") && !pointFirstUserTurn.equals("prawy środek")) {
                            setPointSecCodeTurn("prawy środek");
                        }
                        if (pointFirstCodeTurn.equals("dolny prawy róg") && !pointFirstUserTurn.equals("środek dół")) {
                            setPointSecCodeTurn("środek dół");
                        }
                        if (pointFirstCodeTurn.equals("dolny lewy róg") && !pointFirstUserTurn.equals("lewy środek")) {
                            setPointSecCodeTurn("lewy środek");
                        }
                        else logicSecondCodeTurn();
                    }
        } while ( (pointSecCodeTurn.equals(pointFirstUserTurn)) && (pointSecCodeTurn.equals(pointFirstCodeTurn))
                && (pointSecCodeTurn.equals(pointSecUserTurn)) );
        System.out.println("Kod wybrał współrzędne:  "+pointSecCodeTurn+" , "+z);
        setPoint(pointSecCodeTurn);
        ifyWszystkieRazem();

        axisZSecCodeTurn=z;
        if (pointFirstCodeTurn.equals("_")) {
            board[axisZSecCodeTurn] = stateSecond;
            board[z] = board[axisZSecCodeTurn];
        }
        else {
            board[axisZSecCodeTurn] = state;
            board[z] = board[axisZSecCodeTurn];
        }
        printBoard();
		return " ";
    }

    String firstCodeTurn() throws SecurityException {
        for (short z=0 ; z<9 ; z++){
            board[z]='_';
        }
        char codeChoice;//= {'o','O','x','X'};
        int messengerOfChoice=0;
        java.security.SecureRandom changeForChoice= new java.security.SecureRandom();
        messengerOfChoice=changeForChoice.nextInt(1);
        System.out.println("Legenda programu: ");
        System.out.println("Dane podajemy tak: górny lewy róg, dolny prawy róg, środek dół, środek góra, lewy środek, prawy środek itp");
        if (messengerOfChoice==0) {
            codeChoice='O';
            point="górny lewy róg";
            System.out.println("Wybrano kółko na "+point+"\n");
            state=codeChoice;
            setPointFirstCodeTurn(point);
            board[0]='o';
        }
        else if (messengerOfChoice==1) {
            codeChoice='X';
            point="górny prawy róg";
            System.out.println("Wybrano kółko na "+point+"\n");
            state=codeChoice;
            setPointFirstCodeTurn(point);
            board[2]='O';
        }
        setPointFirstCodeTurn(point);
        ifyWszystkieRazem();
        axisZCodeTurn=z;
        board[axisZCodeTurn]=state;
        board[z]=board[axisZCodeTurn];
        printBoard();
        return " ";
    }
    private void ifyWszystkieRazem() {
        if (point.equals("górny prawy róg") || point.equals("gorny prawy rog")
                || point.equals("prawy górny róg") || point.equals("prawy gorny rog")) {
            z=2;//bardziej czytelne jest z klamrami

        }
        else if (point.equals("górny lewy róg") || point.equals("gorny lewy rog") || point.equals("lewy górny róg")
            || point.equals("lewy gorny rog")) {
            z=0;
        }

        else if (point.equals("dolny lewy róg") || point.equals("dolny lewy rog") || point.equals("lewy dolny róg")
                || point.equals("lewy dolny rog")) {
            z=6;
        }
        else if (point.equals("dolny prawy róg") || point.equals("dolny prawy rog") || point.equals("prawy dolny róg")
                || point.equals("prawy dolny rog")) {
            z=8;
        }

        else if (point.equals("środek góra") || point.equals("srodek gora") || point.equals("górny środek")
                || point.equals("środek górny")) {
            z=1;
        }
        else if (point.equals("środek") || point.equals("srodek")) {
            z=4;
        }
        else if (point.equals("środek dół") || point.equals("srodek dol") || point.equals("dolny środek")
                || point.equals("dolny srodek")) {
            z=7;
        }
        else if (point.equals("lewy środek") || point.equals("lewy srodek") || point.equals("środek lewy")
                || point.equals("srodek lewy")) {
            z=3;
        }
        else if (point.equals("prawy środek") || point.equals("prawy srodek") || point.equals("środek prawy")
                || point.equals("srodek prawy")) {
            z=5;
        }
        else {
            System.out.println("Gdzieś nastąpiła literówka, spacja itd");
            System.exit(9);
        }
        System.out.println("************************************************************************************************");
    }
    private void logicSecondCodeTurn() {
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
                || point.equals("prawy dolny róg") || point.equals("lewy dolny róg") || point.equals("górny lewy róg")
            || point.equals("środek góra") || point.equals("środek dół") || point.equals("lewy srodek")
                || point.equals("prawy środek") || point.equals("górny prawy róg")) {
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
    }
    private void logicAntiUserTurn1() {
            if ((board[0]=='o' || board[0]=='O') && (board[1]=='x' || board[1]=='X') &&
                    (board[4]=='o' || board[4]=='O') && (board[3]=='_' && board[5]=='_' && board[6]=='_') &&
                    (board[8]=='x' || board[8]=='X')) {
                setPointThirdCodeTurn("lewy środek");
                z=3;
            }
            if ((board[0]=='o' || board[0]=='O') && (board[2]=='o' || board[2]=='O') && (board[8]=='o' || board[8]=='O')) {
                //if (board[1]=='o' || board[1]=='O') { bez sensu
                    if (board[5]=='o' || board[5]=='O');
                    else {
                        setPointThirdCodeTurn("prawy środek");
                        z=5;
                    }
                    if (board[1]=='o' || board[1]=='O');
                    else {
                        setPointThirdCodeTurn("środek góra");
                        z=1;
                    }
                    if (board[4]=='o' || board[4]=='O');
                    else {
                        setPointThirdCodeTurn("środek");
                        z=4;
                    }
            } /*   Nowe warunki 12/03/2019 bo kod nie wykorzystuje swoich szans i traci inicjatywę zaczynając grę */
            if ((board[0]=='o' || board[0]=='O') && (board[4]=='o' || board[4]=='O') && (board[8]=='x' || board[8]=='X')
                && (board[3]=='x' || board[3]=='X')) {
                if (board[2] == 'o' || board[2] == 'O') ;
                else {
                    setPointThirdCodeTurn("górny prawy róg");
                    z = 2;
                }
            }
            if ((board[2]=='o' || board[2]=='O') && (board[4]=='o' || board[4]=='O') && (board[6]=='x' || board[6]=='X')
                  && (board[5]=='x' || board[5]=='X')) {
              if (board[0] == 'o' || board[0] == 'O') ;
              else {
                  setPointThirdCodeTurn("górny lewy róg");
                  z = 0;
              }
            }
            if ((board[6]=='o' || board[6]=='O') && (board[4]=='o' || board[4]=='O') && (board[2]=='x' || board[2]=='X')
                  && (board[3]=='x' || board[3]=='X')) {
              if (board[8] == 'o' || board[8] == 'O') ;
              else {
                  setPointThirdCodeTurn("dolny prawy róg");
                  z = 8;
              }
            }
            if ((board[8]=='o' || board[8]=='O') && (board[4]=='o' || board[4]=='O') && (board[0]=='x' || board[0]=='X')
                  && (board[5]=='x' || board[5]=='X')) {
              if (board[6] == 'o' || board[6] == 'O') ;
              else {
                  setPointThirdCodeTurn("dolny lewy róg");
                  z = 6;
              }
            } /* dotąd na razie 12/03/2019  */
            if (board[0] == 'o' || board[0] == 'O') {
                if (board[1] == '_') {               /*  poziom od 0 przez 2 do 1  */
                    if (board[2] == 'o' || board[2] == 'O') ;
                    else {
                        setPointThirdCodeTurn("środek góra");
                        z = 1;
                    }
                } else if (board[2] == '_') {
                    if (board[1] == 'o' || board[1] == 'O') ;
                    else {                          /*  poziom od 0 przez 1 do 2    */
                        setPointThirdCodeTurn("górny prawy róg");
                        z = 2;
                    }
                } else if (board[4] == '_') {       /*  przekątna od 0 przez 8 do 4  */
                    if (board[8] == 'o' || board[8] == 'O') ;
                    else {
                        setPointThirdCodeTurn("środek");
                        z = 4;
                    }
                } else if (board[8]=='_') {
                    if (board[4]=='o' || board[4]=='O');
                    else {                          /* przekątna od 0 przez 4 do 8  */
                        setPointThirdCodeTurn("dolny prawy róg");
                        z=8;
                    }
                } else if (board[3] == '_') {       /*  pionowo od 0 przez 6 do 3   */
                    if (board[6] == 'o' || board[6] == 'O') ;
                    else {
                        setPointThirdCodeTurn("lewy środek");
                        z = 3;
                    }
                } else if (board[6]=='_') {
                    if (board[3]=='o' || board[3]=='O');
                    else {                          /* pionowo od 0 przez 3 do 6    */
                        setPointThirdCodeTurn("dolny lewy róg");
                        z=6;
                    }
                }
            }
            if (board[1] == 'o' || board[1] == 'O') {
                if (board[2] == '_') {              /*  poziomo od 1 przez 0 do 2 */
                    if (board[0] == 'o' || board[0] == 'O') ;
                    else {
                        setPointThirdCodeTurn("górny prawy róg");
                        z = 2;
                    }
                } else if (board[0]=='_') {
                    if (board[2]=='o' || board[2]=='O');
                    else {                          /* poziomo od 1 przez 2 do 0    */
                        setPointThirdCodeTurn("górny lewy róg");
                        z=0;
                    }
                } else if (board[4] == '_') {       /*  pionowo od 1 przez 7 do 4   */
                    if (board[7]=='o' || board[7]=='O');
                    else {
                        setPointThirdCodeTurn("środek");
                        z = 4;
                    }
                } else if (board[7]=='_') {
                    if (board[4]=='o' || board[4]=='O');
                    else {                          /* pionowo od 1 przez 4 do 7    */
                        setPointThirdCodeTurn("środek dół");
                        z=7;
                    }
                }
            }
            if (board[2] == 'o' || board[2] == 'O') {
                if (board[0] == '_') {              /*  poziomo od 2 przez 1 do 0  */
                    if (board[1]=='o' || board[1]=='O');
                    else {
                        setPointThirdCodeTurn("górny lewy róg");
                        z = 0;
                    }
                }
                else if (board[1]=='_') {
                    if (board[0]=='o' || board[0]=='O');
                    else {                          /* poziomo od 2 przez 0 do 1    */
                        setPointThirdCodeTurn("środek góra");
                        z=1;
                    }
                }
                else if (board[5] =='_') {
                    if (board[8] == 'o' || board[8] == 'O') ;
                    else {                          /* pionowo od 2 przez 8 do 5    */
                        setPointThirdCodeTurn("prawy środek");
                        z = 5;
                    }
                } else if (board[8]=='_') {
                    if (board[5]=='o' || board[5]=='O');
                    else {                          /* pionowo od 2 przez 5 do 8    */
                        setPointThirdCodeTurn("dolny prawy róg");
                        z=8;
                    }
                } else if (board[4]=='_') {
                    if (board[6]=='o' || board[6]=='O');
                    else {                          /* przekątna od 2 przez 6 do 4  */
                        setPointThirdCodeTurn("środek");
                        z=4;
                    }

                } else if (board[6]=='_') {
                    if (board[4]=='o' || board[4]=='O');
                    else {                          /* poziomo od 5 przez 4 do 6    */
                        setPointThirdCodeTurn("dolny lewy róg");
                        z=6;
                    }
                }
            }
            if (board[5] == 'o' || board[5] == 'O') {
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
                } else if (board[4]=='_') {
                    if (board[3]=='o' || board[3]=='O');
                    else {                          /* poziomo od 5 przez 3 do 4    */
                        setPointThirdCodeTurn("środek");
                        z=4;
                    }
                } else if (board[3]=='_') {
                    if (board[4]=='o' || board[4]=='O');
                    else {                          /* poziomo od 5 przez 4 do 3    */
                        setPointThirdCodeTurn("lewy róg");
                        z=3;
                    }
                }
            }
            if (board[8]=='o' || board[8]=='O') {
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
            if (board[7]=='o' || board[7]=='O') {
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
            if (board[6]=='o' || board[6]=='O') {
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
            if (board[3]=='o' || board[3]=='O') {
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
            if (board[4]=='o' || board[4]=='O') {
                if (board[8]=='_') {
                    if (board[0]=='o' || board[0]=='O');
                    else {                          /* przekątna od 4 przez 0 do 8    */
                        setPointThirdCodeTurn("dolny prawy róg");
                        z=8;
                    }
                }/* 22/02/2019      ****̣̣̣DOKOŃCzENIE JUTRỌ̣̣̣****    */
                if (board[0]=='_') {
                    if (board[8]=='o' || board[8]=='O');
                    else {                          /* przekątna od 4 przez 8 do 0    */
                        setPointThirdCodeTurn("górny lewy róg");
                        z=0;
                    }
                }
                if (board[6]=='_') {
                    if (board[2]=='o' || board[2]=='O');
                    else {                          /* przekątna od 4 przez 2 do 6    */
                        setPointThirdCodeTurn("dolny lewy róg");
                        z=6;
                    }
                }
                if (board[2]=='_') {
                    if (board[6]=='o' || board[6]=='O');
                    else {                          /* przekątna od 4 przez 6 do 2    */
                        setPointThirdCodeTurn("górny prawy róg");
                        z=2;
                    }
                }
                if (board[1]=='_') {
                    if (board[7] == 'o' || board[7] == 'O') ;
                    else {                          /* przekątna od 4 przez 7 do 1    */
                        setPointThirdCodeTurn("środek góra");
                        z = 1;
                    }
                }
                if (board[7]=='_') {
                    if (board[1]=='o' || board[1]=='O');
                    else {                          /* przekątna od 4 przez 1 do 7    */
                        setPointThirdCodeTurn("środek dół");
                        z=7;
                    }
                }
                if (board[3]=='_') {
                    if (board[5]=='o' || board[5]=='O');
                    else {                          /* przekątna od 4 przez 5 do 3    */
                        setPointThirdCodeTurn("lewy środek");
                        z=3;
                    }
                }
                if (board[5]=='_') {
                    if (board[3]=='o' || board[3]=='O');
                    else {                          /* przekątna od 4 przez 3 do 5    */
                        setPointThirdCodeTurn("prawy środek");
                        z=5;
                    }
                }
            }
        if ((board[0]=='o' || board[0]=='O') && (board[1]=='o' || board[1]=='O')) {
            if (board[2]=='o' || board[2]=='O' || board[2]=='x' || board[2]=='X');
            else {
                setPointThirdCodeTurn("górny prawy róg");
                z=2;
            }   /* od 0 w poziomie do 2*/
        }
        if ((board[1]=='o' || board[1]=='O') && (board[2]=='o' || board[2]=='O')) {
            if (board[0]=='o' || board[0]=='O' || board[0]=='x' || board[0]=='X');
            else {
                setPointThirdCodeTurn("lewy górny róg");
                z=0;
            }
        }
        if ((board[0]=='o' || board[0]=='O') && (board[2]=='o' || board[2]=='O')) {
            if (board[1]=='o' || board[1]=='O' || board[1]=='x' || board[1]=='X');
            else {
                setPointThirdCodeTurn("środek góra");
                z=1;
            }
        }
        if ((board[0]=='o' || board[0]=='O') && (board[3]=='o' || board[3]=='O')) {
            if (board[6]=='o' || board[6]=='O' || board[6]=='x' || board[6]=='X');
            else {
                setPointThirdCodeTurn("dolny lewy róg");
                z=6;
            }   /* od 0 w pionie do 6*/
        }
        if ((board[3]=='o' || board[3]=='O') && (board[6]=='o' || board[6]=='O')) {
            if (board[0]=='o' || board[0]=='O' || board[0]=='x' || board[0]=='X');
            else {
                setPointThirdCodeTurn("lewy górny róg");
                z=0;
            }
        }
        if ((board[0]=='o' || board[0]=='O') && (board[6]=='o' || board[6]=='O')) {
            if (board[3]=='o' || board[3]=='O' || board[3]=='x' || board[3]=='X');
            else {
                setPointThirdCodeTurn("lewy środek");
                z=3;
            }
        }
        if ((board[0]=='o' || board[0]=='O') && (board[4]=='o' || board[4]=='O')) {
            if (board[8]=='o' || board[8]=='O' || board[8]=='x' || board[8]=='X');
            else {
                setPointThirdCodeTurn("dolny prawy róg");
                z=8;
            }
        }   /* od 0 po przekątnej do 8*/
        if ((board[4]=='o' || board[4]=='O') && (board[8]=='o' || board[8]=='O')) {
            if (board[0]=='o' || board[0]=='O' || board[0]=='x' || board[0]=='X');
            else {
                setPointThirdCodeTurn("lewy górny róg");
                z=0;
            }
        }
        if ((board[0]=='o' || board[0]=='O') && (board[8]=='o' || board[8]=='O')) {
            if (board[4]=='o' || board[4]=='O' || board[4]=='x' || board[4]=='X');
            else {
                setPointThirdCodeTurn("środek");
                z=4;
            }
        }
        if ((board[1]=='o' || board[1]=='O') && (board[4]=='o' || board[4]=='O')) {
            if (board[7]=='o' || board[7]=='O' || board[7]=='x' || board[7]=='X');
            else {
                setPointThirdCodeTurn("środek dół");
                z=7;
            }   /* od 1 w pionie do 7   */
        }
        if ((board[4]=='o' || board[4]=='O') && (board[7]=='o' || board[7]=='O')) {
            if (board[1]=='o' || board[1]=='O' || board[1]=='x' || board[1]=='X');
            else {
                setPointThirdCodeTurn("środek góra");
                z=1;
            }
        }
        if ((board[1]=='o' || board[1]=='O') && (board[7]=='o' || board[7]=='O')) {
            if (board[4]=='o' || board[4]=='O' || board[4]=='x' || board[4]=='X');
            else {
                setPointThirdCodeTurn("środek");
                z=4;
            }
        }
        if ((board[2]=='o' || board[2]=='O') && (board[8]=='o' || board[8]=='O')) {
            if (board[5]=='o' || board[5]=='O' || board[5]=='x' || board[5]=='X');
            else {
                setPointThirdCodeTurn("prawy środek");
                z=5;
            }   /* od 2 w pionie do 8   */
        }
        if ((board[5]=='o' || board[5]=='O') && (board[8]=='o' || board[8]=='O')) {
            if (board[2]=='o' || board[2]=='O' || board[2]=='x' || board[2]=='X');
            else {
                setPointThirdCodeTurn("prawy górny róg");
                z=2;
            }
        }
        if ((board[2]=='o' || board[2]=='O') && (board[5]=='o' || board[5]=='O')) {
            if (board[8]=='o' || board[8]=='O' || board[8]=='x' || board[8]=='X');
            else {
                setPointThirdCodeTurn("prawy dolny róg");
                z=8;
            }
        }
        if ((board[2]=='o' || board[2]=='O') && (board[6]=='o' || board[6]=='O')) {
            if (board[4]=='o' || board[4]=='O' || board[4]=='x' || board[4]=='X');
            else {
                setPointThirdCodeTurn("środek");
                z=4;
            }   /* od 2 po przekątnej do 6  */
        }
        if ((board[4]=='o' || board[4]=='O') && (board[6]=='o' || board[6]=='O')) {
            if (board[2]=='o' || board[2]=='O' || board[2]=='x' || board[2]=='X');
            else {
                setPointThirdCodeTurn("górny prawy róg");
                z=2;
            }
        }
        if ((board[2]=='o' || board[2]=='O') && (board[4]=='o' || board[4]=='O')) {
            if (board[6]=='o' || board[6]=='O' || board[6]=='x' || board[6]=='X');
            else {
                setPointThirdCodeTurn("lewy dolny róg");
                z=6;
            }
        }
        if ((board[6]=='o' || board[6]=='O') && (board[8]=='o' || board[8]=='O')) {
            if (board[7]=='o' || board[7]=='O' || board[7]=='x' || board[7]=='X');
            else {
                setPointThirdCodeTurn("środek dół");
                z=7;
            }   /* od 6 w poziomie do 8   */
        }
        if ((board[6]=='o' || board[6]=='O') && (board[7]=='o' || board[7]=='O')) {
            if (board[8]=='o' || board[8]=='O' || board[8]=='x' || board[8]=='X');
            else {
                setPointThirdCodeTurn("dolny prawy róg");
                z=8;
            }
        }
        if ((board[7]=='o' || board[7]=='O') && (board[8]=='o' || board[8]=='O')) {
            if (board[6]=='o' || board[6]=='O' || board[6]=='x' || board[6]=='X');
            else {
                setPointThirdCodeTurn("lewy dolny róg");
                z=6;
            }
        }
}
    private void logicAntiUserTurn2() {
            if ((board[0]=='x' || board[0]=='X') && (board[4]=='x' || board[4]=='X') &&
                    (board[1]=='o' || board[1]=='O') && (board[8]=='o' || board[8]=='O') &&
                    (board[3]=='_' && board[5]=='_' && board[6]=='_')) {
                setPointThirdCodeTurn("lewy środek");
                z=3;
            }
            if ((board[0]=='x' || board[0]=='X') && (board[2]=='x' || board[2]=='X') && (board[8]=='x' || board[8]=='X')) {
                if (board[5]=='x' || board[5]=='X');
                    else {
                        setPointThirdCodeTurn("prawy środek");
                        z=5;
                    }
                if (board[1]=='x' || board[1]=='X');
                    else {
                        setPointThirdCodeTurn("środek góra");
                        z=1;
                    }
                if (board[4]=='x' || board[4]=='X');
                    else {
                        setPointThirdCodeTurn("środek");
                        z=4;
                }
            }
            if ((board[0]=='x' || board[0]=='X') && (board[2]=='x' || board[2]=='X') && (board[1]=='o' || board[1]=='O')) {
                if (board[8]=='x' || board[8]=='X') {
                    if (board[4] == 'x' || board[4] == 'X') ;
                    else {
                        setPointThirdCodeTurn("środek");
                        z = 4;
                    }
                }
                if (board[4]=='x' || board[4]=='X') {
                    if (board[8]=='x' || board[8]=='X');
                    else {
                        setPointThirdCodeTurn("dolny prawy róg");
                        z = 8;
                    }
                }
            }
            /*   Nowe warunki 12/03/2019 bo kod nie wykorzystuje swoich szans i traci inicjatywę zaczynając grę */
            if ((board[0]=='x' || board[0]=='X') && (board[4]=='x' || board[4]=='X') && (board[8]=='o' || board[8]=='O')
                    && (board[3]=='o' || board[3]=='O')) {
                if (board[2] =='_')

                    // 'x' || board[2] == 'X') ;
                {
                    setPointThirdCodeTurn("górny prawy róg");
                    z = 2;
                }
            }
            if ((board[2]=='x' || board[2]=='X') && (board[4]=='x' || board[4]=='X') && (board[6]=='o' || board[6]=='O')
                    && (board[5]=='o' || board[5]=='O')) {
                if (board[0] =='_') //'x' || board[0] == 'X') ;
                 {
                    setPointThirdCodeTurn("górny lewy róg");
                    z = 0;
                }
            }
            if ((board[6]=='x' || board[6]=='X') && (board[4]=='x' || board[4]=='X') && (board[2]=='o' || board[2]=='O')
                    && (board[3]=='o' || board[3]=='O')) {
                if (board[8] == 'x' || board[8] == 'X') ;
                else {
                    setPointThirdCodeTurn("dolny prawy róg");
                    z = 8;
                }
            }
            if ((board[8]=='x' || board[8]=='X') && (board[4]=='x' || board[4]=='X') && (board[0]=='o' || board[0]=='O')
                    && (board[5]=='o' || board[5]=='O')) {
                if (board[6] == 'x' || board[6] == 'X') ;
                else {
                    setPointThirdCodeTurn("dolny lewy róg");
                    z = 6;
                }
            } /* dotąd na razie 12/03/2019  */
            if ((board[0]=='x' && board[2]=='x' && board[1]=='o' && board[4]=='_' && board[8]=='_')
                || (board[0]=='X' && board[2]=='X' && board[1]=='O' && board[4]=='_' && board[8]=='_')) {
                setPointThirdCodeTurn("dolny prawy róg");
                z=8;
            }  /*   DOŁOZONO 27.02.2019 I NIE CHCE DZIAŁAĆ */
            if (board[0]== 'x' || board[0]== 'X' || board[0]=='_')  {
                if (board[1] == '_') {               /*  poziom od 0 przez 2 do 1  */
                    if (board[2] == 'x' || board[2] == 'X') ;
                    else {
                        setPointThirdCodeTurn("środek góra");
                        z = 1;
                    }
                } else if (board[2] == '_') {
                    if (board[1] == 'x' || board[1] == 'X') ;
                    else {                          /*  poziom od 0 przez 1 do 2    */
                        setPointThirdCodeTurn("górny prawy róg");
                        z = 2;
                    }
                } else if (board[4] == '_') {       /*  przekątna od 0 przez 8 do 4  */
                    if (board[8] == 'x' || board[8] == 'X') ;
                    else {
                        setPointThirdCodeTurn("środek");
                        z = 4;
                    }
                } else if (board[8]=='_') {
                    if (board[4]=='x' || board[4]=='X');
                    else {                          /* przekątna od 0 przez 8 do 4  */
                        setPointThirdCodeTurn("dolny prawy róg");
                        z=8;
                    }
                } else if (board[3] == '_') {       /*  pionowo od 0 przez 3 do 6   */
                    if (board[6] == 'x' || board[6] == 'X') ;
                    else {
                        setPointThirdCodeTurn("lewy środek");
                        z = 3;
                    }
                } else if (board[6]=='_') {
                    if (board[3]=='x' || board[3]=='X');
                    else {                          /* pionowo od 0 przez 6 do 3    */
                        setPointThirdCodeTurn("dolny lewy róg");
                        z=6;
                    }
                }
            }
            if (board[1] == 'x' || board[1] == 'X' || board[1]=='_') {
                if (board[2] == '_') {              /*  poziomo od 1 przez 0 do 2 */
                    if (board[0] == 'x' || board[0] == 'X') ;
                    else {
                        setPointThirdCodeTurn("górny prawy róg");
                        z = 2;
                    }
                } else if (board[0]=='_') {
                    if (board[2]=='x' || board[2]=='X');
                    else {                          /* poziomo od 1 przez 2 do 0    */
                        setPointThirdCodeTurn("górny lewy róg");
                        z=0;
                    }
                } else if (board[4] == '_') {       /*  pionowo od 1 przez 7 do 4   */
                    if (board[7]=='x' || board[7]=='X');
                    else {
                        setPointThirdCodeTurn("środek");
                        z = 4;
                    }
                } else if (board[7]=='_') {
                    if (board[4]=='x' || board[4]=='X');
                    else {                          /* pionowo od 1 przez 4 do 7    */
                        setPointThirdCodeTurn("środek dół");
                        z=7;
                    }
                }
            }
            if (board[2] == 'x' || board[2] == 'X' || board[2]=='_') {
                if (board[0] == '_') {              /*  poziomo od 2 przez 1 do 0  */
                    if (board[1] == 'x' || board[1] == 'X') ;
                    else {
                        setPointThirdCodeTurn("górny lewy róg");
                        z = 0;
                    }
                } else if (board[5] == '_') {
                    if (board[8] == 'x' || board[8] == 'X') ;
                    else {                          /* pionowo od 2 przez 8 do 5    */
                        setPointThirdCodeTurn("prawy środek");
                        z = 5;
                    }
                } else if (board[1]=='_') {
                    if (board[0]=='x' || board[0]=='X');
                    else {                          /* poziomo od 2 przez 0 do 1    */
                        setPointThirdCodeTurn("środek góra");
                        z=1;
                    }
                } else if (board[8]=='_') {
                    if (board[5]=='x' || board[5]=='X');
                    else {                          /* pionowo od 2 przez 5 do 8    */
                        setPointThirdCodeTurn("dolny prawy róg");
                        z=8;
                    }
                } else if (board[4]=='_') {
                    if (board[6]=='x' || board[6]=='X');
                    else {                          /* przekątna od 2 przez 6 do 4  */
                        setPointThirdCodeTurn("środek");
                        z=4;
                    }

                } else if (board[6]=='_') {
                    if (board[4]=='x' || board[4]=='X');
                    else {                          /* przekątna od 2 przez 4 do 6    */
                        setPointThirdCodeTurn("dolny lewy róg");
                        z=6;
                    }
                }
            }
            if (board[5] == 'x' || board[5] == 'X' || board[5]=='_') {
                if (board[2] == '_') {
                    if (board[8] == 'x' || board[8] == 'X') ;
                    else {                          /* pionowo od 5 przez 8 do 2    */
                        setPointThirdCodeTurn("górny prawy róg");
                        z = 2;
                    }
                } else if (board[8]=='_') {
                    if (board[2]=='x' || board[2]=='X');
                    else {                          /* pionowo od 5 przez 2 do 8    */
                        setPointThirdCodeTurn("dolny prawy róg");
                        z=8;
                    }
                } else if (board[4]=='_') {
                    if (board[3]=='x' || board[3]=='X');
                    else {
                        setPointThirdCodeTurn("środek");
                        z=4;
                    }
                } else if (board[3]=='_') {
                    if (board[4]=='x' || board[4]=='X');
                    else {
                        setPointThirdCodeTurn("lewy srodek");
                        z=3;
                    }
                }
            }
            if (board[8]=='x' || board[8]=='X' || board[8]=='_') {
                if (board[5] == '_') {
                    if (board[2] == 'x' || board[2] == 'X') ;
                    else {                          /* pionowo od 8 przez 2 do 5    */
                        setPointThirdCodeTurn("prawy środek");
                        z = 5;
                    }
                } else if (board[2] == '_') {
                    if (board[5] == 'x' || board[5] == 'X') ;
                    else {                          /* pionowo od 8 przez 5 do 2    */
                        setPointThirdCodeTurn("górny prawy róg");
                        z = 2;
                    }
                } else if (board[4] == '_') {
                    if (board[0] == 'x' || board[0] == 'X') ;
                    else {                          /* przekątna od 8 przez 0 do 4  */
                        setPointThirdCodeTurn("środek");
                        z = 4;
                    }
                } else if (board[0] == '_') {
                    if (board[4] == 'x' || board[4] == 'X') ;
                    else {                          /* przekątna od 8 przez 4 do 0  */
                        setPointThirdCodeTurn("górny lewy róg");
                        z = 0;
                    }
                } else if (board[7] == '_') {
                    if (board[6] == 'x' || board[6] == 'X') ;
                    else {                          /* poziomo od 8 przez 6 do 7    */
                        setPointThirdCodeTurn("środek dół");
                        z = 7;
                    }
                }else if (board[6]=='_') {
                    if (board[7]=='x' || board[7]=='X');
                    else {                          /* poziomo od 8 przez 7 do 6    */
                        setPointThirdCodeTurn("dolny lewy róg");
                        z=6;
                    }
                }
            }
            if (board[7]=='x' || board[7]=='X' || board[7]=='_') {
                if (board[8] == '_') {
                    if (board[6] == 'x' || board[6] == 'X') ;
                    else {                          /* poziomo od 7 przez 6 do 8    */
                        setPointThirdCodeTurn("dolny prawy róg");
                        z = 8;
                    }
                } else if (board[6]=='_') {
                    if (board[8]=='x' || board[8]=='X');
                    else {                          /* poziomo od 7 przez 8 do 6    */
                        setPointThirdCodeTurn("dolny lewy róg");
                        z=6;
                    }
                } else if (board[4]=='_') {
                    if (board[1]=='x' || board[1]=='X');
                    else {                          /* pionowo od 7 przez 1 do 4    */
                        setPointThirdCodeTurn("środek");
                        z=4;
                    }
                } else if (board[1]=='_') {
                    if (board[4]=='x' || board[4]=='X');
                    else {                          /* pionowo od 7 przez 4 do 1    */
                        setPointThirdCodeTurn("środek góra");
                        z=1;
                    }
                }
            }
            if (board[6]=='x' || board[6]=='X' || board[6]=='_') {
                if (board[7]=='_') {
                    if (board[8]=='x' || board[8]=='X');
                    else {                          /* poziomo od 6 przez 8 do 7    */
                        setPointThirdCodeTurn("środek dół");
                        z=7;
                    }
                } else if (board[8]=='_') {
                    if (board[7]=='x' || board[7]=='X');
                    else {                          /* poziomo od 6 przez 7 do 8    */
                        setPointThirdCodeTurn("dolny prawy róg");
                        z=8;
                    }
                } else if (board[4]=='_') {
                    if (board[2]=='x' || board[2]=='X');
                    else {                          /* przekątna od 6 przez 2 do 4  */
                        setPointThirdCodeTurn("środek");
                        z=4;
                    }
                } else if (board[2]=='_') {
                    if (board[4]=='x' || board[4]=='X');
                    else {                          /* przekątna od 6 przez 4 do 2  */
                        setPointThirdCodeTurn("górny prawy róg");
                        z=2;
                    }
                } else if (board[3]=='_') {
                    if (board[0]=='x' || board[0]=='X');
                    else {                          /* pionowo od 6 przez 0 do 3    */
                        setPointThirdCodeTurn("lewy środek");
                        z=3;
                    }
                } else if (board[0]=='_') {
                    if (board[3]=='x' || board[3]=='X');
                    else {                          /* pionowo od 6 przez 3 do 0    */
                        setPointThirdCodeTurn("górny lewy róg");
                        z=0;
                    }
                }
            }
            if (board[3]=='x' || board[3]=='X' || board[3]=='_') {
                if (board[0]=='_') {
                    if (board[6]=='x' || board[6]=='X');
                    else {                          /* pionowo od 3 przez 6 do 0    */
                        setPointThirdCodeTurn("górny lewy róg");
                        z=0;
                    }
                } else if (board[6]=='_') {
                    if (board[0]=='x' || board[0]=='X');
                    else {                          /* pionowo od 3 przez 0 do 6    */
                        setPointThirdCodeTurn("dolny lewy róg");
                        z=6;
                    }
                } else if (board[4]=='_') {
                    if (board[5]=='x' || board[5]=='X');
                    else {                          /* poziomo od 3 przez 5 do 4    */
                        setPointThirdCodeTurn("środek");
                        z=4;
                    }
                } else if (board[5]=='_') {
                    if (board[4]=='x' || board[4]=='X');
                    else {                          /* poziomo od 3 przez 4 do 5    */
                        setPointThirdCodeTurn("prawy środek");
                        z=5;
                    }
                }
            }
            if (board[4]=='x' || board[4]=='X' || board[4]=='_') {
                if (board[8]=='_') {
                    if (board[0]=='x' || board[0]=='X');
                    else {                          /* przekątna od 4 przez 0 do 8    */
                        setPointThirdCodeTurn("dolny prawy róg");
                        z=8;
                    }
                }/* 22/02/2019      ****̣̣̣DOKOŃCzENIE JUTRỌ̣̣̣****    */
                else if (board[0]=='_') {
                    if (board[8]=='x' || board[8]=='X');
                    else {                          /* przekątna od 4 przez 8 do 0    */
                        setPointThirdCodeTurn("górny lewy róg");
                        z=0;
                    }
                } else if (board[6]=='_') {
                    if (board[2]=='x' || board[2]=='X');
                    else {                          /* przekątna od 4 przez 2 do 6    */
                        setPointThirdCodeTurn("dolny lewy róg");
                        z=6;
                    }
                } else if (board[2]=='_') {
                    if (board[6]=='x' || board[6]=='X');
                    else {                          /* przekątna od 4 przez 6 do 2    */
                        setPointThirdCodeTurn("górny prawy róg");
                        z=2;
                    }
                } else if (board[1]=='_') {
                    if (board[7] == 'x' || board[7] == 'X') ;
                    else {                          /* pionowo od 4 przez 7 do 1    */
                        setPointThirdCodeTurn("środek góra");
                        z = 1;
                    }
                } else if (board[7]=='_') {
                    if (board[1]=='x' || board[1]=='X');
                    else {                          /* pionowo od 4 przez 1 do 7    */
                        setPointThirdCodeTurn("środek dół");
                        z=7;
                    }
                } else if (board[3]=='_') {
                    if (board[5]=='x' || board[5]=='X');
                    else {                          /* poziomo od 4 przez 5 do 3    */
                        setPointThirdCodeTurn("lewy środek");
                        z=3;
                    }
                } else if (board[5]=='_') {
                    if (board[3]=='x' || board[3]=='X');
                    else {                          /* poziomo od 4 przez 3 do 5    */
                        setPointThirdCodeTurn("prawy środek");
                        z=5;
                    }
                }
            }  /* Nowe warunki wykończające grę 12/03/2019 */
            if ((board[0]=='x' || board[0]=='X') && (board[1]=='x' || board[1]=='X')) {
                if (board[2]=='o' || board[2]=='O' || board[2]=='x' || board[2]=='X');
                else {
                    setPointThirdCodeTurn("górny prawy róg");
                    z=2;
                }   /* od 0 w poziomie do 2*/
            }
            if ((board[1]=='x' || board[1]=='X') && (board[2]=='x' || board[2]=='X')) {
                if (board[0]=='o' || board[0]=='O' || board[0]=='x' || board[0]=='X');
                else {
                    setPointThirdCodeTurn("lewy górny róg");
                    z=0;
                }
            }
            if ((board[0]=='x' || board[0]=='X') && (board[2]=='x' || board[2]=='X')) {
                if (board[1]=='o' || board[1]=='O' || board[1]=='x' || board[1]=='X');
                else {
                    setPointThirdCodeTurn("środek góra");
                    z=1;
                }
            }
            if ((board[0]=='x' || board[0]=='X') && (board[3]=='x' || board[3]=='X')) {
                if (board[6]=='o' || board[6]=='O' || board[6]=='x' || board[6]=='X');
                else {
                    setPointThirdCodeTurn("dolny lewy róg");
                    z=6;
                }   /* od 0 w pionie do 6*/
            }
            if ((board[3]=='x' || board[3]=='X') && (board[6]=='x' || board[6]=='X')) {
                if (board[0]=='o' || board[0]=='O' || board[0]=='x' || board[0]=='X');
                else {
                    setPointThirdCodeTurn("lewy górny róg");
                    z=0;
                }
            }
            if ((board[0]=='x' || board[0]=='X') && (board[6]=='x' || board[6]=='X')) {
                if (board[3]=='o' || board[3]=='O' || board[3]=='x' || board[3]=='X');
                else {
                    setPointThirdCodeTurn("lewy środek");
                    z=3;
                }
            }
            if ((board[0]=='x' || board[0]=='X') && (board[4]=='x' || board[4]=='X')) {
                if (board[8]=='o' || board[8]=='O' || board[8]=='x' || board[8]=='X');
                else {
                    setPointThirdCodeTurn("dolny prawy róg");
                    z=8;
                }
            }   /* od 0 po przekątnej do 8*/
            if ((board[4]=='x' || board[4]=='X') && (board[8]=='x' || board[8]=='X')) {
                if (board[0]=='o' || board[0]=='O' || board[0]=='x' || board[0]=='X');
                else {
                    setPointThirdCodeTurn("lewy górny róg");
                    z=0;
                }
            }
            if ((board[0]=='x' || board[0]=='X') && (board[8]=='x' || board[8]=='X')) {
                if (board[4]=='o' || board[4]=='O' || board[4]=='x' || board[4]=='X');
                else {
                    setPointThirdCodeTurn("środek");
                    z=4;
                }
            }
            if ((board[1]=='x' || board[1]=='X') && (board[4]=='x' || board[4]=='X')) {
                if (board[7]=='o' || board[7]=='O' || board[7]=='x' || board[7]=='X');
                else {
                    setPointThirdCodeTurn("środek dół");
                    z=7;
                }   /* od 1 w pionie do 7   */
            }
            if ((board[4]=='x' || board[4]=='X') && (board[7]=='x' || board[7]=='X')) {
                if (board[1]=='o' || board[1]=='O' || board[1]=='x' || board[1]=='X');
                else {
                    setPointThirdCodeTurn("środek góra");
                    z=1;
                }
            }
            if ((board[1]=='x' || board[1]=='X') && (board[7]=='x' || board[7]=='X')) {
                if (board[4]=='o' || board[4]=='O' || board[4]=='x' || board[4]=='X');
                else {
                    setPointThirdCodeTurn("środek");
                    z=4;
                }
            }
            if ((board[2]=='x' || board[2]=='X') && (board[8]=='x' || board[8]=='X')) {
                if (board[5]=='o' || board[5]=='O' || board[5]=='x' || board[5]=='X');
                else {
                    setPointThirdCodeTurn("prawy środek");
                    z=5;
                }   /* od 2 w pionie do 8   */
            }
            if ((board[5]=='x' || board[5]=='X') && (board[8]=='x' || board[8]=='X')) {
                if (board[2]=='o' || board[2]=='O' || board[2]=='x' || board[2]=='X');
                else {
                    setPointThirdCodeTurn("prawy górny róg");
                    z=2;
                }
            }
            if ((board[2]=='x' || board[2]=='X') && (board[5]=='x' || board[5]=='X')) {
                if (board[8]=='o' || board[8]=='O' || board[8]=='x' || board[8]=='X');
                else {
                    setPointThirdCodeTurn("prawy dolny róg");
                    z=8;
                }
            }
            if ((board[2]=='x' || board[2]=='X') && (board[6]=='x' || board[6]=='X')) {
                if (board[4]=='o' || board[4]=='O' || board[4]=='x' || board[4]=='X');
                else {
                    setPointThirdCodeTurn("środek");
                    z=4;
                }   /* od 2 po przekątnej do 6  */
            }
            if ((board[4]=='x' || board[4]=='X') && (board[6]=='x' || board[6]=='X')) {
                if (board[2]=='o' || board[2]=='O' || board[2]=='x' || board[2]=='X');
                else {
                    setPointThirdCodeTurn("górny prawy róg");
                    z=2;
                }
            }
            if ((board[2]=='x' || board[2]=='X') && (board[4]=='x' || board[4]=='X')) {
                if (board[6]=='o' || board[6]=='O' || board[6]=='x' || board[6]=='X');
                else {
                    setPointThirdCodeTurn("lewy dolny róg");
                    z=6;
                }
            }
            if ((board[6]=='x' || board[6]=='X') && (board[8]=='x' || board[8]=='X')) {
                if (board[7]=='o' || board[7]=='O' || board[7]=='x' || board[7]=='X');
                else {
                    setPointThirdCodeTurn("środek dół");
                    z=7;
                }   /* od 6 w poziomie do 8   */
            }
            if ((board[6]=='x' || board[6]=='X') && (board[7]=='x' || board[7]=='X')) {
                if (board[8]=='o' || board[8]=='O' || board[8]=='x' || board[8]=='X');
                else {
                    setPointThirdCodeTurn("dolny prawy róg");
                    z=8;
                }
            }
            if ((board[7]=='x' || board[7]=='X') && (board[8]=='x' || board[8]=='X')) {
                if (board[6]=='o' || board[6]=='O' || board[6]=='x' || board[6]=='X');
                else {
                    setPointThirdCodeTurn("lewy dolny róg");
                    z=6;
                }
            }
    }
private void logicThirdCodeTurn() {
        if ((board[0] == 'o' && board[2] == 'o' && board[8] == 'o') || (board[0] == 'O' && board[2] == 'O' && board[8] == 'O')) {
            if (board[5] == 'x' || board[5] == 'X') ;
            else {
                setPointThirdCodeTurn("prawy środek");
                z = 5;
                point="prawy środek";
            }
            if (board[1] == 'X' || board[1] == 'x') ;
            else {
                setPointThirdCodeTurn("środek góra");
                z = 1;
                point="środek góra";
            }
        }
        if ((board[0] == 'o' || board[0] == 'O') && (board[8] == 'o' || board[8] == 'O') && board[4]=='_') {
                setPointThirdCodeTurn("lewy środek");
                z = 5;
                point="lewy środek";

        }
        if ((board[5] == 'o' && board[8] == 'o') || (board[5] == 'O' && board[8] == 'O') && board[2]=='_') {
                setPointThirdCodeTurn("gorny prawy rog");
                z = 2;
                point="gorny prawy rog";
        }
        if ((board[2] == 'o' && board[8] == 'o') || (board[2] == 'O' && board[8] == 'O') && board[5]=='_') {
                setPointThirdCodeTurn("prawy środek");
                z = 5;
                point="prawy środek";
        }
        if ((board[2] == 'o' && board[5] == 'o') || (board[2] == 'O' && board[5] == 'O') && board[8]=='_') {
                setPointThirdCodeTurn("dolny prawy róg");
                z = 8;
                point="dolny prawy róg";
        }           /* OD POCZĄTKU DOTAÐ BYŁY DODANE NOWE WARUNKI 26/02/2019    */
        if ((board[0] == 'o' && board[1] == 'o') || (board[0] == 'O' && board[1] == 'O') && board[2]=='_') {
                setPointThirdCodeTurn("górny prawy róg");
                z = 2;
                point="górny prawy róg";
        }
        if ((board[0] == 'o' && board[4] == 'o') || (board[0] == 'O' && board[4] == 'O') && board[8]=='_') {
                setPointThirdCodeTurn("dolny prawy róg");
                z = 8;
                point="dolny prawy róg";
        }
        if ((board[0] == 'o' || board[0] == 'O') && (board[3] == 'o' || board[3] == 'O') && board[6]=='_') {
                setPointThirdCodeTurn("dolny lewy róg");
                z = 6;
                point="dolny lewy róg";
        }
        if ((board[0] == 'o' || board[0] == 'O') && (board[6] == 'o' || board[6] == 'O') && board[3]=='_') {
                setPointThirdCodeTurn("lewy środek");
                z = 3;
                point="lewy środek";
        }
        if ((board[0] == 'o' || board[0] == 'O') && (board[2] == 'o' || board[2] == 'O') && board[1]=='_') {
                setPointThirdCodeTurn("środek góra");
                z = 1;
                point="środek góra";
        }
        if ((board[0] == 'o' || board[0] == 'O') && (board[8] == 'o' || board[8] == 'O') && board[4]=='_') {
                setPointThirdCodeTurn("środek");
                z = 4;
                point="środek";
        }
        if ((board[1] == 'o' || board[1] == 'O') && (board[4] == 'o' || board[4] == 'O') && board[7]=='_') {
                setPointThirdCodeTurn("środek dół");
                z = 7;
        }
        if ((board[1] == 'o' || board[1] == 'O') && (board[7] == 'o' || board[7] == 'O') && board[4]=='_') {
                setPointThirdCodeTurn("środek");
                z = 4;
        }
        if ((board[4] == 'o' || board[4] == 'O') && (board[7] == 'o' || board[7] == 'O') && board[1]=='_') {
                setPointThirdCodeTurn("środek góra");
                z = 1;
        }
        if ((board[1] == 'o' || board[1] == 'O') && (board[2] == 'o' || board[2] == 'O') && board[0]=='_') {
                setPointThirdCodeTurn("górny lewy róg");
                z = 0;
        }
        if ((board[2] == 'o' || board[2] == 'O') && (board[4] == 'o' || board[4] == 'O') && board[6]=='_') {
                setPointThirdCodeTurn("dolny lewy róg");
                z = 6;
        }
        if ((board[2] == 'o' || board[2] == 'O') && (board[5] == 'o' || board[5] == 'O') && board[8]=='_') {
                setPointThirdCodeTurn("dolny prawy róg");
                z = 8;
        }
        if ((board[2] == 'o' || board[2] == 'O') && (board[6] == 'o' || board[6] == 'O') && board[4]=='_') {
                setPointThirdCodeTurn("środek");
                z = 4;
        }
        if ((board[2] == 'o' || board[2] == 'O') && (board[8] == 'o' || board[8] == 'O') && board[5]=='_') {
                setPointThirdCodeTurn("prawy środek");
                z = 5;
        }
        if ((board[3] == 'o' || board[3] == 'O') && (board[5] == 'o' || board[5] == 'O') && board[4]=='_') {
                setPointThirdCodeTurn("środek");
                z = 4;
        }
        if ((board[6] == 'o' || board[6] == 'O') && (board[8] == 'o' || board[8] == 'O') && board[7]=='_') {
                setPointThirdCodeTurn("środek dół");
                z = 7;
        }
        if ((board[7] == 'o' || board[7] == 'O') && (board[8] == 'o' || board[8] == 'O') && board[6]=='_') {
                setPointThirdCodeTurn("dolny lewy róg");
                z = 6;
        }
        if ((board[5] == 'o' || board[5] == 'O') && (board[8] == 'o' || board[8] == 'O') && board[2]=='_') {
                setPointThirdCodeTurn("górny prawy róg");
                z = 2;
        }
        if ((board[4] == 'o' || board[4] == 'O') && (board[8] == 'o' || board[8] == 'O') && board[0]=='_') {
                setPointThirdCodeTurn("górny lewy róg");
                z = 0;
        }
        if ((board[4] == 'o' || board[4] == 'O') && (board[7] == 'o' || board[7] == 'O') && board[1]=='_') {
                setPointThirdCodeTurn("środek góra");
                z = 1;
        }
        if ((board[1] == 'o' || board[1] == 'O') && (board[4] == 'o' || board[4] == 'O') && board[7]=='_') {
                setPointThirdCodeTurn("środek dół");
                z = 7;
        }
        if ((board[6] == 'o' || board[6] == 'O') && (board[7] == 'o' || board[7] == 'O') && board[8]=='_') {
                setPointThirdCodeTurn("dolny prawy róg");
                z = 8;
        }
        if ((board[4] == 'o' || board[4] == 'O') && (board[6] == 'o' || board[6] == 'O') && board[2]=='_') {
                setPointThirdCodeTurn("górny prawy róg");
                z = 2;
        }
        if ((board[3] == 'o' || board[3] == 'O') && (board[6] == 'o' || board[6] == 'O') && board[0]=='_') {
                setPointThirdCodeTurn("górny lewy róg");
                z = 0;
        }
        if ((board[3] == 'o' || board[3] == 'O') && (board[4] == 'o' || board[4] == 'O') && board[5]=='_') {
                setPointThirdCodeTurn("prawy środek");
                z = 5;
        }
        if ((board[4] == 'o' || board[4] == 'O') && (board[5] == 'o' || board[5] == 'O') && board[3]=='_') {
                setPointThirdCodeTurn("lewy środek");
                z = 3;
        }
        if ((board[6] == 'o' || board[6] == 'O') && (board[0] == 'o' || board[0] == 'O') && board[3]=='_') {
                setPointThirdCodeTurn("lewy środek");
                z = 3;
        }
        /* Warunki dla ulepszenia taktyki początkowej obronnej*/
}
   private void logicThirdCodeTurn2() {
            if ((board[0]=='x' && board[2]=='x' && board[8]=='x') || (board[0]=='X' && board[2]=='X' && board[8]=='X')) {
                if (board[5]=='_')
                {
                    setPointThirdCodeTurn("prawy środek");
                    z = 5;
                }
                else if (board[1]=='_')
                {
                    setPointThirdCodeTurn("środek góra");
                    z = 1;
                }
            }
            if ((board[6]=='o' || board[6]=='O') && (board[4]=='o' || board[4]=='O') && (board[2]=='x' || board[2]=='X')
                    && (board[3]=='x' || board[3]=='X')) {
                if (board[8]=='_')                    //== 'o' || board[8] == 'O') ;
                {
                    setPointThirdCodeTurn("dolny prawy róg");
                    z = 8;
                }
            }
            if ((board[0]=='x' || board[0]=='X') && (board[8]=='x' || board[8]=='X')) {
                if (board[4]=='_')                  //'o' || board[4]=='O');
                {
                        setPointThirdCodeTurn("środek");
                        z=4;
                }
            }
            if ((board[5]=='x' || board[5]=='X') && (board[8]=='x' || board[8]=='X')) {
                if (board[2]=='_')                      //'o' || board[2]=='O');
                {
                        setPointThirdCodeTurn("górny prawy róg");
                        z=2;
                }
            }
            if ((board[2]=='x' || board[2]=='X') && (board[8]=='x' || board[8]=='X')) {
                if (board[5]=='_')                          //'o' || board[5]=='O');
                {
                        setPointThirdCodeTurn("prawy środek");
                        z=5;
                }
            }
            if ((board[2]=='x' || board[2]=='X') && (board[5]=='x' || board[5]=='X')) {
                if (board[8]=='_')                      //'o' || board[8]=='O');
                {
                        setPointThirdCodeTurn("dolny prawy róg");
                        z=8;
                }
            }           /* OD POCZĄTKU DOTAÐ BYŁY DODANE NOWE WARUNKI 26/02/2019    */
            if ((board[0] == 'x' || board[0] == 'X') && (board[1] == 'x' || board[1] == 'X')) {
                if (board[2]=='_')                      //'o' || board[2]=='O');
                {
                        setPointThirdCodeTurn("górny prawy róg");
                        z = 2;
                }
            }
            if ((board[0] == 'x' || board[0] == 'X') && (board[4] == 'x' || board[4] == 'X')) {
                if (board[8]=='_')                      //'o' || board[8]=='O');
                {
                        setPointThirdCodeTurn("dolny prawy róg");
                        z = 8;
                }
            }
            if ((board[0] == 'x' || board[0] == 'X') && (board[3] == 'x' || board[3] == 'X')) {
                if (board[6]=='_')                       //'o' || board[6]=='O');
                    {
                        setPointThirdCodeTurn("dolny lewy róg");
                        z = 6;
                    }
                }
                if ((board[0] == 'x' || board[0] == 'X') && (board[6] == 'x' || board[6] == 'X')) {
                    if (board[3]=='o' || board[3]=='O');
                    else {
                        setPointThirdCodeTurn("lewy środek");
                        z = 3;
                    }
                }
                if ((board[0] == 'x' || board[0] == 'X') && (board[2] == 'x' || board[2] == 'X')) {
                    if (board[1]=='_')                          //'o' || board[1]=='O')
                    {
                        setPointThirdCodeTurn("środek góra");
                        z = 1;
                    }
                }
                if ((board[0] == 'x' || board[0] == 'X') && (board[8] == 'x' || board[8] == 'X')) {
                    if (board[4] =='_')                 // 'o' || board[4] == 'O');
                    {
                        setPointThirdCodeTurn("środek");
                        z = 4;
                    }
                }
                if ((board[1] == 'x' || board[1] == 'X') && (board[4] == 'x' || board[4] == 'X')) {
                    if (board[7] =='_')                 // 'o' || board[7] == 'O');
                    {
                        setPointThirdCodeTurn("środek dół");
                        z = 7;
                    }
                    if (board[7]=='_') {
                        setPointThirdCodeTurn("środek dół");
                        z=7;
                    }
                }
               if ((board[1] == 'x' || board[1] == 'X') && (board[7] == 'x' || board[7] == 'X')) {
                    if (board[4] =='_')                 // 'o' || board[4] == 'O');
                    {
                        setPointThirdCodeTurn("środek");
                        z = 4;
                    }
                }
                if ((board[3] == 'x' || board[3] == 'X') && (board[5] == 'x' || board[5] == 'X')) {
                    if (board[4] =='_')                 // 'o' || board[4] == 'O');
                    {
                        setPointThirdCodeTurn("środek");
                        z = 4;
                    }
                }
                if ((board[4] == 'x' || board[4] == 'X') && (board[7] == 'x' || board[7] == 'X')) {
                    if (board[1] =='_')                 // 'o' || board[1] == 'O');
                    {
                        setPointThirdCodeTurn("środek góra");
                        z = 1;
                    }
                }
                if ((board[1] == 'x' || board[1] == 'X') && (board[2] == 'x' || board[2] == 'X')) {
                    if (board[0] =='_')                 // 'o' || board[0] == 'O');
                    {
                        setPointThirdCodeTurn("górny lewy róg");
                        z = 0;
                    }
                }
                if ((board[2] == 'x' && board[4] == 'x') || (board[2] == 'X' && board[4] == 'X') && board[6]=='_') {
                    /*if (board[6] =='_')                 // 'o' || board[6] == 'O');
                    {*/
                        setPointThirdCodeTurn("dolny lewy róg");
                        z = 6;
                    //}
                }
                if ((board[2] == 'x' || board[2] == 'X') && (board[5] == 'x' || board[5] == 'X')) {
                    if (board[8] =='_')                 // 'o' || board[8] == 'O');
                    {
                        setPointThirdCodeTurn("dolny prawy róg");
                        z = 8;
                    }
                }
                if ((board[2]=='x' || board[2] =='X') && (board[6]=='x' || board[6]== 'X')) {
                    if (board[4]=='_')                  //'o' || board[4] == 'O');
                    {
                        setPointThirdCodeTurn("środek");
                        z = 4;
                    }
                }
                else if ((board[2] == 'x' || board[2] == 'X') && (board[8] == 'x' || board[8] == 'X')) {
                    if (board[5] =='_')                 // 'o' || board[5] == 'O');
                    {
                        setPointThirdCodeTurn("prawy środek");
                        z = 5;
                    }
                }
                else if ((board[5] == 'x' || board[5] == 'X') && (board[8] == 'x' || board[8] == 'X')) {
                    if (board[2] =='_')                 // 'o' || board[2] == 'O');
                    {
                        setPointThirdCodeTurn("górny prawy róg");
                        z = 2;
                    }
                }
                if ((board[4] == 'x' || board[4] == 'X') && (board[8] == 'x' || board[8] == 'X')) {
                    if (board[0]=='_')                  //'o' || board[0] == 'O');
                    {
                        setPointThirdCodeTurn("górny lewy róg");
                        z = 0;
                    }
                }
            if ((board[4] == 'x' && board[8] == 'x') || (board[4] == 'X' && board[8] == 'X')) {
                if (board[0]=='_')                      //'o' || board[0] == 'O');
                {
                    setPointThirdCodeTurn("górny lewy róg");
                    z = 0;
                }
            }
                if ((board[7] == 'x' || board[7] == 'X') && (board[8] == 'x' || board[8] == 'X')) {
                    if (board[6] =='_')                 // 'o' || board[6] == 'O');
                    {
                        setPointThirdCodeTurn("dolny lewy róg");
                        z = 6;
                    }
                }
                if ((board[6] == 'x' || board[6] == 'X') && (board[8] == 'x' || board[8] == 'X')) {
                    if (board[7] =='_')                 // 'o' || board[7] == 'O');
                    {
                        setPointThirdCodeTurn("środek dół");
                        z = 7;
                    }
                }
                if ((board[4] == 'x' || board[4] == 'X') && (board[7] == 'x' || board[7] == 'X')) {
                    if (board[1] =='_')                 // 'o' || board[1] == 'O');
                    {
                        setPointThirdCodeTurn("środek góra");
                        z = 1;
                    }
                }
                if ((board[1] == 'x' || board[1] == 'X') && (board[4] == 'x' || board[4] == 'X')) {
                    if (board[7] =='_')                 // 'o' || board[7] == 'O');
                    {
                        setPointThirdCodeTurn("środek dół");
                        z = 7;
                    }
                }
                if ((board[6] == 'x' || board[6] == 'X') && (board[7] == 'x' || board[7] == 'X')) {
                    if (board[8] =='_')                 // 'o' || board[8] == 'O');
                    {
                        setPointThirdCodeTurn("dolny prawy róg");
                        z = 8;
                    }
                }
                if ((board[4]=='x' || board[4]=='X') && (board[6]=='x' || board[6] =='X')) {
                    if (board[2]=='_')                  //'o' || board[2] == 'O');
                    {
                        setPointThirdCodeTurn("górny prawy róg");
                        z = 2;
                    }
                }
                if ((board[3] == 'x' || board[3] == 'X') && (board[6] == 'x' || board[6] == 'X')) {
                    if (board[0] =='_')                 // 'o' || board[0] == 'O');
                    {
                        setPointThirdCodeTurn("górny lewy róg");
                        z = 0;
                    }
                }
                if ((board[3] == 'x' || board[3] == 'X') && (board[4] == 'x' || board[4] == 'X')) {
                    if (board[5] =='_')                 // 'o' || board[5] == 'O');
                    {
                        setPointThirdCodeTurn("prawy środek");
                        z = 5;
                    }
                }
                if ((board[4] == 'x' || board[4] == 'X') && (board[5] == 'x' || board[5] == 'X')) {
                    if (board[3] =='_')                 // 'o' || board[3] == 'O');
                    {
                        setPointThirdCodeTurn("lewy środek");
                        z = 3;
                    }
                }
}
    private void checkUserTurn1() {
        if ((board[0]=='o' || board[0]=='O') && (board[1]=='o' || board[1]=='O')) {
            if (board[2]=='o' || board[2]=='O' || board[2]=='x' || board[2]=='X');
            else {
                setPointThirdCodeTurn("górny prawy róg");
                z=2;
            }   /* od 0 w poziomie do 2*/
        }
        if ((board[1]=='o' || board[1]=='O') && (board[2]=='o' || board[2]=='O')) {
            if (board[0]=='o' || board[0]=='O' || board[0]=='x' || board[0]=='X');
            else {
                setPointThirdCodeTurn("lewy górny róg");
                z=0;
            }
        }
        if ((board[0]=='o' || board[0]=='O') && (board[2]=='o' || board[2]=='O')) {
            if (board[1]=='o' || board[1]=='O' || board[1]=='x' || board[1]=='X');
            else {
                setPointThirdCodeTurn("środek góra");
                z=1;
            }
        }
        if ((board[0]=='o' || board[0]=='O') && (board[3]=='o' || board[3]=='O')) {
            if (board[6]=='o' || board[6]=='O' || board[6]=='x' || board[6]=='X');
            else {
                setPointThirdCodeTurn("dolny lewy róg");
                z=6;
            }   /* od 0 w pionie do 6*/
        }
        if ((board[3]=='o' || board[3]=='O') && (board[6]=='o' || board[6]=='O')) {
            if (board[0]=='o' || board[0]=='O' || board[0]=='x' || board[0]=='X');
            else {
                setPointThirdCodeTurn("lewy górny róg");
                z=0;
            }
        }
        if ((board[0]=='o' || board[0]=='O') && (board[6]=='o' || board[6]=='O')) {
            if (board[3]=='o' || board[3]=='O' || board[3]=='x' || board[3]=='X');
            else {
                setPointThirdCodeTurn("lewy środek");
                z=3;
            }
        }
        if ((board[0]=='o' || board[0]=='O') && (board[4]=='o' || board[4]=='O')) {
            if (board[8]=='o' || board[8]=='O' || board[8]=='x' || board[8]=='X');
            else {
                setPointThirdCodeTurn("dolny prawy róg");
                z=8;
            }
        }   /* od 0 po przekątnej do 8*/
        if ((board[4]=='o' || board[4]=='O') && (board[8]=='o' || board[8]=='O')) {
            if (board[0]=='o' || board[0]=='O' || board[0]=='x' || board[0]=='X');
            else {
                setPointThirdCodeTurn("lewy górny róg");
                z=0;
            }
        }
        if ((board[0]=='o' || board[0]=='O') && (board[8]=='o' || board[8]=='O')) {
            if (board[4]=='o' || board[4]=='O' || board[4]=='x' || board[4]=='X');
            else {
                setPointThirdCodeTurn("środek");
                z=4;
            }
        }
        if ((board[1]=='o' || board[1]=='O') && (board[4]=='o' || board[4]=='O')) {
            if (board[7]=='o' || board[7]=='O' || board[7]=='x' || board[7]=='X');
            else {
                setPointThirdCodeTurn("środek dół");
                z=7;
            }   /* od 1 w pionie do 7   */
        }
        if ((board[4]=='o' || board[4]=='O') && (board[7]=='o' || board[7]=='O')) {
            if (board[1]=='o' || board[1]=='O' || board[1]=='x' || board[1]=='X');
            else {
                setPointThirdCodeTurn("środek góra");
                z=1;
            }
        }
        if ((board[1]=='o' || board[1]=='O') && (board[7]=='o' || board[7]=='O')) {
            if (board[4]=='o' || board[4]=='O' || board[4]=='x' || board[4]=='X');
            else {
                setPointThirdCodeTurn("środek");
                z=4;
            }
        }
        if ((board[2]=='o' || board[2]=='O') && (board[8]=='o' || board[8]=='O')) {
            if (board[5]=='o' || board[5]=='O' || board[5]=='x' || board[5]=='X');
            else {
                setPointThirdCodeTurn("prawy środek");
                z=5;
            }   /* od 2 w pionie do 8   */
        }
        if ((board[5]=='o' || board[5]=='O') && (board[8]=='o' || board[8]=='O')) {
            if (board[2]=='o' || board[2]=='O' || board[2]=='x' || board[2]=='X');
            else {
                setPointThirdCodeTurn("prawy górny róg");
                z=2;
            }
        }
        if ((board[2]=='o' || board[2]=='O') && (board[5]=='o' || board[5]=='O')) {
            if (board[8]=='o' || board[8]=='O' || board[8]=='x' || board[8]=='X');
            else {
                setPointThirdCodeTurn("prawy dolny róg");
                z=8;
            }
        }
        if ((board[2]=='o' || board[2]=='O') && (board[6]=='o' || board[6]=='O')) {
            if (board[4]=='o' || board[4]=='O' || board[4]=='x' || board[4]=='X');
            else {
                setPointThirdCodeTurn("środek");
                z=4;
            }   /* od 2 po przekątnej do 6  */
        }
        if ((board[4]=='o' || board[4]=='O') && (board[6]=='o' || board[6]=='O')) {
            if (board[2]=='o' || board[2]=='O' || board[2]=='x' || board[2]=='X');
            else {
                setPointThirdCodeTurn("górny prawy róg");
                z=2;
            }
        }
        if ((board[2]=='o' || board[2]=='O') && (board[4]=='o' || board[4]=='O')) {
            if (board[6]=='o' || board[6]=='O' || board[6]=='x' || board[6]=='X');
            else {
                setPointThirdCodeTurn("lewy dolny róg");
                z=6;
            }
        }
        if ((board[6]=='o' || board[6]=='O') && (board[8]=='o' || board[8]=='O')) {
            if (board[7]=='o' || board[7]=='O' || board[7]=='x' || board[7]=='X');
            else {
                setPointThirdCodeTurn("środek dół");
                z=7;
            }   /* od 6 w poziomie do 8   */
        }
        if ((board[6]=='o' || board[6]=='O') && (board[7]=='o' || board[7]=='O')) {
            if (board[8]=='o' || board[8]=='O' || board[8]=='x' || board[8]=='X');
            else {
                setPointThirdCodeTurn("dolny prawy róg");
                z=8;
            }
        }
        if ((board[7]=='o' || board[7]=='O') && (board[8]=='o' || board[8]=='O')) {
            if (board[6]=='o' || board[6]=='O' || board[6]=='x' || board[6]=='X');
            else {
                setPointThirdCodeTurn("lewy dolny róg");
                z=6;
            }
        }
    }
    private void checkUserTurn2() {
        if ((board[0]=='x' || board[0]=='X') && (board[1]=='x' || board[1]=='X')) {
            if (board[2]=='o' || board[2]=='O' || board[2]=='x' || board[2]=='X');
            else {
                setPointThirdCodeTurn("górny prawy róg");
                z=2;
            }   /* od 0 w poziomie do 2*/
        }
        if ((board[1]=='x' || board[1]=='X') && (board[2]=='x' || board[2]=='X')) {
            if (board[0]=='o' || board[0]=='O' || board[0]=='x' || board[0]=='X');
            else {
                setPointThirdCodeTurn("lewy górny róg");
                z=0;
            }
        }
        if ((board[0]=='x' || board[0]=='X') && (board[2]=='x' || board[2]=='X')) {
            if (board[1]=='o' || board[1]=='O' || board[1]=='x' || board[1]=='X');
            else {
                setPointThirdCodeTurn("środek góra");
                z=1;
            }
        }
        if ((board[0]=='x' || board[0]=='X') && (board[3]=='x' || board[3]=='X')) {
            if (board[6]=='o' || board[6]=='O' || board[6]=='x' || board[6]=='X');
            else {
                setPointThirdCodeTurn("dolny lewy róg");
                z=6;
            }   /* od 0 w pionie do 6*/
        }
        if ((board[3]=='x' || board[3]=='X') && (board[6]=='x' || board[6]=='X')) {
            if (board[0]=='o' || board[0]=='O' || board[0]=='x' || board[0]=='X');
            else {
                setPointThirdCodeTurn("lewy górny róg");
                z=0;
            }
        }
        if ((board[0]=='x' || board[0]=='X') && (board[6]=='x' || board[6]=='X')) {
            if (board[3]=='o' || board[3]=='O' || board[3]=='x' || board[3]=='X');
            else {
                setPointThirdCodeTurn("lewy środek");
                z=3;
            }
        }
        if ((board[0]=='x' || board[0]=='X') && (board[4]=='x' || board[4]=='X')) {
            if (board[8]=='o' || board[8]=='O' || board[8]=='x' || board[8]=='X');
            else {
                setPointThirdCodeTurn("dolny prawy róg");
                z=8;
            }
        }   /* od 0 po przekątnej do 8*/
        if ((board[4]=='x' || board[4]=='X') && (board[8]=='x' || board[8]=='X')) {
            if (board[0]=='o' || board[0]=='O' || board[0]=='x' || board[0]=='X');
            else {
                setPointThirdCodeTurn("lewy górny róg");
                z=0;
            }
        }
        if ((board[0]=='x' || board[0]=='X') && (board[8]=='x' || board[8]=='X')) {
            if (board[4]=='o' || board[4]=='O' || board[4]=='x' || board[4]=='X');
            else {
                setPointThirdCodeTurn("środek");
                z=4;
            }
        }
        if ((board[1]=='x' || board[1]=='X') && (board[4]=='x' || board[4]=='X')) {
            if (board[7]=='o' || board[7]=='O' || board[7]=='x' || board[7]=='X');
            else {
                setPointThirdCodeTurn("środek dół");
                z=7;
            }   /* od 1 w pionie do 7   */
        }
        if ((board[4]=='x' || board[4]=='X') && (board[7]=='x' || board[7]=='X')) {
            if (board[1]=='o' || board[1]=='O' || board[1]=='x' || board[1]=='X');
            else {
                setPointThirdCodeTurn("środek góra");
                z=1;
            }
        }
        if ((board[1]=='x' || board[1]=='X') && (board[7]=='x' || board[7]=='X')) {
            if (board[4]=='o' || board[4]=='O' || board[4]=='x' || board[4]=='X');
            else {
                setPointThirdCodeTurn("środek");
                z=4;
            }
        }
        if ((board[2]=='x' || board[2]=='X') && (board[8]=='x' || board[8]=='X')) {
            if (board[5]=='o' || board[5]=='O' || board[5]=='x' || board[5]=='X');
            else {
                setPointThirdCodeTurn("prawy środek");
                z=5;
            }   /* od 2 w pionie do 8   */
        }
        if ((board[5]=='x' || board[5]=='X') && (board[8]=='x' || board[8]=='X')) {
            if (board[2]=='o' || board[2]=='O' || board[2]=='x' || board[2]=='X');
            else {
                setPointThirdCodeTurn("prawy górny róg");
                z=2;
            }
        }
        if ((board[2]=='x' || board[2]=='X') && (board[5]=='x' || board[5]=='X')) {
            if (board[8]=='o' || board[8]=='O' || board[8]=='x' || board[8]=='X');
            else {
                setPointThirdCodeTurn("prawy dolny róg");
                z=8;
            }
        }
        if ((board[2]=='x' || board[2]=='X') && (board[6]=='x' || board[6]=='X')) {
            if (board[4]=='o' || board[4]=='O' || board[4]=='x' || board[4]=='X');
            else {
                setPointThirdCodeTurn("środek");
                z=4;
            }   /* od 2 po przekątnej do 6  */
        }
        if ((board[4]=='x' || board[4]=='X') && (board[6]=='x' || board[6]=='X')) {
            if (board[2]=='o' || board[2]=='O' || board[2]=='x' || board[2]=='X');
            else {
                setPointThirdCodeTurn("górny prawy róg");
                z=2;
            }
        }
        if ((board[2]=='x' || board[2]=='X') && (board[4]=='x' || board[4]=='X')) {
            if (board[6]=='o' || board[6]=='O' || board[6]=='x' || board[6]=='X');
            else {
                setPointThirdCodeTurn("lewy dolny róg");
                z=6;
            }
        }
        if ((board[6]=='x' || board[6]=='X') && (board[8]=='x' || board[8]=='X')) {
            if (board[7]=='o' || board[7]=='O' || board[7]=='x' || board[7]=='X');
            else {
                setPointThirdCodeTurn("środek dół");
                z=7;
            }   /* od 6 w poziomie do 8   */
        }
        if ((board[6]=='x' || board[6]=='X') && (board[7]=='x' || board[7]=='X')) {
            if (board[8]=='o' || board[8]=='O' || board[8]=='x' || board[8]=='X');
            else {
                setPointThirdCodeTurn("dolny prawy róg");
                z=8;
            }
        }
        if ((board[7]=='x' || board[7]=='X') && (board[8]=='x' || board[8]=='X')) {
            if (board[6]=='o' || board[6]=='O' || board[6]=='x' || board[6]=='X');
            else {
                setPointThirdCodeTurn("lewy dolny róg");
                z=6;
            }
        }
    }
    private void logic2ThirdCodeTurn() {
        if (pointThirdCodeTurn == null) {
            System.out.println("Program nie wybrał żadnego ruchu");
                if (board[8] == '_') setPointThirdCodeTurn("dolny prawy róg");
                else {
                    if (board[6] == '_') setPointThirdCodeTurn("dolny lewy róg");
                    else System.out.println("Oba pola 6 i 8 są zajęte");
                }
                if (board[2] == '_') setPointThirdCodeTurn("górny prawy róg");
                else {
                    if (board[0] == '_') setPointThirdCodeTurn("górny lewy róg");
                    else System.out.println("Oba pola 2 i 0 są zajęte");
                }
                if (board[6] == '_') setPointThirdCodeTurn("dolny lewy róg");
                else {
                    if (board[8] == '_') setPointThirdCodeTurn("dolny prawy róg");
                    else System.out.println("Oba pola 6 i 8 są zajęte");
                }
                if (board[0] == '_') setPointThirdCodeTurn("górny lewy róg");
                else {
                    if (board[6] == '_') setPointThirdCodeTurn("dolny lewy róg");
                    else System.out.println("Oba pola 0 i 8 są zajęte");
                }
        } else System.out.println(pointThirdCodeTurn);
    }
    boolean results()
    {
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
            result = true;
            System.exit(1);
        }
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
        return result;
    }
    private void printBoard() {
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
