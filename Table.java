package pl.com.andrzej.game;
import java.security.Provider;
import java.util.Scanner;

public class Table {
	private String point;
	private static short x,y;
	private static short axisXCodeTurn , axisYCodeTurn;
	private static short axisXUserTurn , axisYUserTurn;
	private static short axisXSecCodeTurn, axisYSecCodeTurn;
	private static short axisXSecUserTurn, axisYSecUserTurn;
	private char[][] field = new char[3][3];
	private char state;
	
	
	//@SuppressWarnings("static-access")
	public Table(char[][] field, short x, short y, String point) {
		this.field=field;
		this.x = x;
		this.y = y;
		setX(x);
		setY(y);
		this.point=point;
		//this.state=state;
	}
	public Table() {
	super();
	Board.class.getConstructors();
	}
	private short getX(short x) {
		//Table.x=x;
		return x;
	}
	public short setX(short x) {
		Table.x=x;
		return x;
	}
	public short getY(short y) {
		//Table.y=y;
		return y;
	}
	private short setY(short y) {
		Table.y=y;
		return y;
	}
	public String getPoint() {
		//tego tez nie wiem
		return point;
	}
	
	public String setPoint() {
		//nie wiem jak to wykorzystać
		return point;
	}
	public char setState() {
		return state;
	}
	
	public char addState() {
		Scanner skan= new Scanner(System.in);
		System.out.println("Podaj jaki znak chcesz wstawić kółko(O) czy krzyżyk(X)");
		state= skan.next().charAt(0);
		
		return ' ';
		}
	
	public String secondUserTurn() throws InterruptedException {
		char stateSecond=' ';
		//y3=setY(y);						//TU TRZEBA SPRAWDZIĆ PORZĄDKOWANIE ZMIENNYCH
		Scanner skan= new Scanner(System.in);
		System.out.println("Legenda programu: ");
		System.out.println("Podawaj dane tak: górny lewy róg, dolny prawy róg, środek dół, środek góra, lewy środek, prawy środek itp");
		System.out.println("Podaj współrzędne");
		point=skan.nextLine();
		Thread.sleep(100);
		//skan.close();
		ifyWszystkieRazem();
		if (state=='x' || state=='X') {
			stateSecond='O';
		}
		else stateSecond='X';
		//firstCodeTurn().setvariable(x1); nie działa jedynie Stringi
		byte x2,y2;
		for (x2=0 ; x2<3 ; x2++) {
			System.out.print("| ");
			//field[x2][y2]= '_';
					
			for (y2=0 ; y2<3 ; y2++) {
				
				field[x2][y2] = '_';
				
				if (x2==Table.x && y2==Table.y) {
					//field[setX(x)][setY(y)]=setState();
					System.out.print(stateSecond+" | ");
				}
				else if (x2==Table.axisXCodeTurn && y2==Table.axisYCodeTurn) {
						System.out.print(state+" | ");
					}
				System.out.print(field[x2][y2]+" | ");
		}
			System.out.println();
			}
		Table.axisXSecUserTurn=Table.x;
		Table.axisYSecCodeTurn=Table.y;
		return " ";
	}
	
	public String firstUserTurn() throws InterruptedException {
		//String point;
		
		Scanner skan= new Scanner(System.in);
		System.out.println("Legenda programu: ");
		System.out.println("Podawaj dane tak: górny lewy róg, dolny prawy róg, środek dół, środek góra, lewy środek, prawy środek itp");
		System.out.println("Podaj współrzędne");
		point=skan.nextLine();
		Thread.sleep(100);
		//skan.close();
		ifyWszystkieRazem();
		byte x2,y2;
		for (x2=0 ; x2<3 ; x2++) {	//x=axisXUserTurn
			System.out.print("| ");
			//field[x2][y2]= '_';
					
			for (y2=0 ; y2<3 ; y2++) {
				
				field[x2][y2] = '_';
				
				if (x2==Table.x && y2==Table.y) {	//y=axisYUserTurn
					//field[setX(x)][setY(y)]=setState();
					System.out.print(state+" | ");
				}
				System.out.print(field[x2][y2]+" | ");
		}
			System.out.println();
			}
		Table.axisXUserTurn=Table.x;
		Table.axisYUserTurn=Table.y;
		//System.out.println("Współrzędne x i y : "+ x +" , " + y + " | \n"+ getX(x) + " , "+ getY(y)+ " Sety i gety działają ");
		return " ";
	}
	
	public String secondCodeTurn() throws InterruptedException {
		char stateSecond=' ';
		java.security.SecureRandom turnChoice = new java.security.SecureRandom();
		int choice=0;
		if (state=='x' || state=='X') {
			stateSecond='O';
			System.out.println("Player choose Cross " + "and choose field " + point);
		}
		else { 
			stateSecond='X';
			System.out.println("Player choose Circle " + "and choose field " + point);
		}
		String pointSecCodeTurn=" ";
		if (point.equals("środek") || point.equals("środek dół")) {
			choice=turnChoice.nextInt(3);
			if (choice==0) {
			pointSecCodeTurn="górny lewy róg";
			}
			else if (choice==1) {
				pointSecCodeTurn="górny prawy róg";
			}
			else if (choice==2) {
				pointSecCodeTurn="dolny lewy róg";
			}
			else pointSecCodeTurn="dolny prawy róg";
		}
		point=pointSecCodeTurn;
		ifyWszystkieRazem();
		short x2=0;
		short y2=0;
		System.out.println();
		
		for (x2=0 ; x2<3 ; x2++) {
			System.out.print("| ");
			//field[x2][y2]= '_';
					
			for (y2=0 ; y2<3 ; y2++) {
				
				field[x2][y2] = '_';
				
				if (x2==Table.x && y2==Table.y) {
					//field[setX(x)][setY(y)]=setState();
					System.out.print(stateSecond+" | ");
				}
				else if (x2==Table.axisXUserTurn && y2==Table.axisYUserTurn) {
						System.out.print(state+" | ");
					}
				System.out.print(field[x2][y2]+" | ");
		}
			System.out.println();
			}
		
		Table.axisXSecCodeTurn=Table.x;
		Table.axisYSecCodeTurn=Table.y;
		return " ";
	}
	
	public String firstCodeTurn() throws InterruptedException {
		
		char codeChoice;//= {'o','O','x','X'};
		int messengerOfChoice=0;
		java.security.SecureRandom changeForChoice= new java.security.SecureRandom();
		messengerOfChoice=changeForChoice.nextInt(3);
System.out.println("Legenda programu: ");
System.out.println("Dane podajemy tak: górny lewy róg, dolny prawy róg, środek dół, środek góra, lewy środek, prawy środek itp");
		if (messengerOfChoice==0) {
			codeChoice='o';
			point="górny lewy róg";
			System.out.println("Wybrano kółko na "+point);
			state=codeChoice;
			
		}
		else if (messengerOfChoice==1) {
			codeChoice='O';
			point="górny prawy róg";
			System.out.println("Wybrano kółko na "+point);
			state=codeChoice;
		}
		else if (messengerOfChoice==2) {
			codeChoice='x';
			point="dolny lewy róg";
			System.out.println("Wybrano krzyżyk na "+point);
			state=codeChoice;
		}
		else if (messengerOfChoice==3) {
			codeChoice='X';
			point="dolny prawy róg";
			System.out.println("Wybrano krzyżyk na "+point);
			state=codeChoice;
		}
		
		
		//String customIzer= new String (" .");
		System.out.print("Kod wybiera współrzędne ");
		Thread.sleep(500);
		System.out.print(".");
		Thread.sleep(500);
		System.out.print(".");
		Thread.sleep(500);
		System.out.print(".");
		Thread.sleep(500);
		System.out.print(".");
		Thread.sleep(500);
		System.out.print(".");
		Thread.sleep(500);
		System.out.print(".");
		
		ifyWszystkieRazem();
		short x1=0;
		short y1=0;
		System.out.println();
		for (x1 =0 ; x1<3 ; x1++) {		
			System.out.print("| ");
			//field[x1][y1]= '_';
					
			for (y1=0 ; y1<3 ; y1++) {
				
				field[x1][y1] = '_';
				//System.out.print(field[x1][y1]+" | ");
				if (x1==Table.x && y1==Table.y) {	// axisXCodeTurn i axisYCodeTurn
					//field[setX(x)][setY(y)]=state;
					System.out.print(state+" | ");
				}
				System.out.print(field[x1][y1]+" | ");
		}
			System.out.println();
			}
		Table.axisXCodeTurn=Table.x;
		Table.axisYCodeTurn=Table.y;
		return " ";
	}
	
	public String ifyWszystkieRazem() throws InterruptedException {
		if (point.equals("górny prawy róg") || point.equals("gorny prawy rog")) {
			x=0;
			y=2;
			setX(x);
			setY(y);
		}
		else if (point.contentEquals("górny lewy róg") || point.equals("gorny lewy rog")) {
			x=0;
			y=0;
			setX(x);
			setY(y);
		}
		
		else if (point.equals("dolny lewy róg") || point.equals("dolny lewy rog")) {
			x=2;
			y=0;
			setX(x);
			setY(y);
		}
		
		else if (point.equals("dolny prawy róg") || point.equals("dolny prawy rog")) {
			x=2;
			y=2;
			setX(x);
			setY(y);
		}
		
		else if (point.equals("środek góra") || point.equals("srodek gora")) {
			x=0;
			y=1;
			setX(x);
			setY(y);
		}
		else if (point.equals("środek") || point.equals("srodek")) {
			x=1;
			y=1;
			setX(x);
			setY(y);
			//System.out.println("Współrzędne środka: "+x+" "+y);
		}
		else if (point.equals("środek dół") || point.equals("srodek dol")) {
			x=2;
			y=1;
			setX(x);
			setY(y);
		}
		else if (point.equals("lewy środek") || point.equals("lewy srodek")) {
			
			x=1;
			y=0;
			setX(x);
			setY(y);
			
		}
		else if (point.equals("prawy środek") || point.equals("prawy srodek")) {
			x=1;
			y=2;
			setX(x);
			setY(y);
		}
		
		
		System.out.println("Współrzędne x i y : "+ x +" , " + y + " | \n"+ getX(x) + " , "+ getY(y)+ " Sety i gety działają ");
		System.out.println("************************************************************************************************");
		return point;
	}
	
	
	/*public char setState1(char charr) {
				System.out.println("Współrzędne x,y dla:   "+ x + " , " + y);
		return charr=' ';
	}*/
}
