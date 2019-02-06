package pl.com.andrzej.game;

import java.util.Scanner;

public class Field {
	private static int x,y;
	private String state= " ";//big O & X

	public Field(String state) {
		this.state=state;
		
	}
	
	public Field() {
		
	}
	
	public String getState() {
		return state;
	}
	
	public String setState() {
		//System.out.println("Współrzędne x,y" + x+ ","+ y); pomyłka to trzeba zrobic w table.java
		return state;
	}
	
	public String addState() {
	Scanner skan= new Scanner(System.in);
	System.out.println("Podaj jaki znak chcesz wstawić kółko(O) czy krzyżyk(X)");
	state= skan.nextLine();
	
	return state;
	}

}