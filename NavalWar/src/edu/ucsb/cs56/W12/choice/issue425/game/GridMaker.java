package edu.ucsb.cs56.W12.choice.issue425.game;

import java.util.ArrayList;

/**
 * A class called GridMaker that makes the Grids to be displayed to the player
 * @author Thiti Chanpuelksa
 * @version cs56,W12,3/2/2012
 */

public class GridMaker {
	
	ArrayList<String> rowA;
	ArrayList<String> rowB;
	ArrayList<String> rowC;
	ArrayList<String> rowD;
	ArrayList<String> rowE;
	ArrayList<String> rowF;
	ArrayList<String> rowG;
	ArrayList<String> rowH;
	String status = "";
	
	/**
	 * Constructor for the GridMaker that creates 8 ArrrayList which represent the Rows in the Grid
	 */
	public GridMaker(){
		
		rowA = new ArrayList<String>();
		for(int cA=0; cA <= 8; cA++){
			rowA.add("[a"+cA+"]");
		}
		rowB = new ArrayList<String>();
		for(int cB=0; cB <= 8; cB++){
			rowB.add("[b"+cB+"]");
		}	
		rowC = new ArrayList<String>();
		for(int cC=0; cC <= 8; cC++){
			rowC.add("[c"+cC+"]");
		}
		rowD = new ArrayList<String>();
		for(int cD=0; cD <= 8; cD++){
			rowD.add("[d"+cD+"]");
		}
		rowE = new ArrayList<String>();
		for(int cE=0; cE <= 8; cE++){
			rowE.add("[e"+cE+"]");
		}
		rowF = new ArrayList<String>();
		for(int cF=0; cF <= 8; cF++){
			rowF.add("[f"+cF+"]");
		}
		rowG = new ArrayList<String>();
		for(int cG=0; cG <= 8; cG++){
			rowG.add("[g"+cG+"]");
		}
		rowH = new ArrayList<String>();
		for(int cH=0; cH <= 8; cH++){
			rowH.add("[h"+cH+"]");
		}
		
	}
	
	/**
	 * A setter method used to set the status(what the grid will replace [cell] with once user guessed it
	 * @param status the String that will replace the current Grid cell, ~~ for missed, XxxX for hitting a ship, HEAL for medic ship, BOOM for bombs
	 */
	public void setStatus(String status){
		this.status = status;
	}
	
	/**
	 * A getter method to get the status
	 * @return status
	 */
	public String getStatus(){
		return this.status;
	}
	
	/**
	 * Where the magic happens, this method takes the ArrayList of the rows and put them in a nice looking grid.
	 */

	public void gridDisplay(){
		
		String sRowA = "";
		String sRowB = "";
		String sRowC = "";
		String sRowD = "";
		String sRowE = "";
		String sRowF = "";
		String sRowG = "";
		String sRowH = "";
		
		for(String rA : rowA){
			sRowA += rA;
			sRowA += " ";
		}
		for(String rB : rowB){
			sRowB += rB;
			sRowB += " ";
		}
		for(String rC : rowC){
			sRowC += rC;
			sRowC += " ";
		}
		for(String rD : rowD){
			sRowD += rD;
			sRowD += " ";
		}
		for(String rE : rowE){
			sRowE += rE;
			sRowE += " ";
		}
		for(String rF : rowF){
			sRowF += rF;
			sRowF += " ";
		}
		for(String rG : rowG){
			sRowG += rG;
			sRowG += " ";
		}
		for(String rH : rowH){
			sRowH += rH;
			sRowH += " ";
		}
		System.out.println(" _____________________________________________");
		System.out.println("|                                             |");
		System.out.println("|"+sRowA+"|");
		System.out.println("|                                             |");
		System.out.println("|"+sRowB+"|");
		System.out.println("|                                             |");
		System.out.println("|"+sRowC+"|");
		System.out.println("|                                             |");
		System.out.println("|"+sRowD+"|");
		System.out.println("|                                             |");
		System.out.println("|"+sRowE+"|");
		System.out.println("|                                             |");
		System.out.println("|"+sRowF+"|");
		System.out.println("|                                             |");
		System.out.println("|"+sRowG+"|");
		System.out.println("|                                             |");
		System.out.println("|"+sRowH+"|");
		System.out.println(" _____________________________________________");
		
	}
	
	/**
	 * A method that takes in user guess and change the guessed location in the array to the passed in status
	 * @param userGuess the user's guess
	 * @param status @see setStatus()
	 */
	public void updateGrid(String userGuess, String status){
		char row  = userGuess.charAt(0);
		char colC = userGuess.charAt(1);
		int col=0;
		
		switch(colC){
			case '1': col = 1; break;
			case '2': col = 2; break;
			case '3': col = 3; break;
			case '4': col = 4; break;
			case '5': col = 5; break;
			case '6': col = 6; break;
			case '7': col = 7; break;
			case '8': col = 8; break;
		}
		
		switch(row){
			case 'a': rowA.set(col, status); break;
			case 'b': rowB.set(col, status); break;
			case 'c': rowC.set(col, status); break;
			case 'd': rowD.set(col, status); break;
			case 'e': rowE.set(col, status); break;
			case 'f': rowF.set(col, status); break;
			case 'g': rowG.set(col, status); break;
			case 'h': rowH.set(col, status); break;
			
			default: break;
		}
		
	}
}
