package pl.com.andrzej.game;

import java.util.Scanner;

public class CrossAndCircle extends Table {
	static char forCheck=' ';
	
	public CrossAndCircle() {
		super();
	}
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Board board1 = new Board();
		char charr=' ';
		//short forCheck=0;
		System.out.println(board1.drawBoard(charr));
		//wybieramy kółko czy krzyżyk
		//String add;
		//Field state1 = new Field();
		//System.out.println(state1.addState()); changing with nicely while...small steps and every breathe with deep Faith
		
		//wybieramy miejsce na planszy
		//Table table1 = new Table();
		//System.out.println(table1.userTurn());
		//Thread.sleep(1000);
		//System.out.println(table1.firstCodeTurn());
		//wrzucamy współrzędne
		//System.out.println(table1.setState1(charr));
		Scanner skanForCheck = new Scanner(System.in);
		System.out.println("Who plays first?? Program(c) or User(u)");
		forCheck=skanForCheck.next().charAt(0);
		while ((forCheck = check()) =='u') {
			System.out.print("Do zobaczenia");
			Thread.sleep(850);
			System.out.print(" niebawem ");	
		}
		System.out.print("Do Zobaczenia ");	
		Thread.sleep(850);
		System.out.print("wkrótce \n");	
	skanForCheck.close();	
	}
	public static char check() throws InterruptedException {
		//char charr=' ';
		Table tableObject = new Table();
		 if (forCheck=='c') {

			 System.out.println(tableObject.firstCodeTurn());
			 System.out.println(tableObject.secondUserTurn());
			 return ' ';			 
		 } else if (forCheck=='u') {
			 System.out.println(tableObject.addState());
			 System.out.println(tableObject.firstUserTurn());
			 System.out.println(tableObject.secondCodeTurn());
			 return ' ';
		 }
		return ' '; 
	}
}
