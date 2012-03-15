package edu.ucsb.cs56.W12.choice.issue425.main;

import java.io.*;
import java.util.Scanner; 

import edu.ucsb.cs56.W12.choice.issue425.game.GridMaker;
import edu.ucsb.cs56.W12.choice.issue425.game.NavalWar;
import edu.ucsb.cs56.W12.choice.issue425.player.Player;

/**
 * Run the game
 * @author Thiti Chanpuelksa
 * @version cs56,W12,3/2/2012
 */

public class Main{

    public static void main(String[] args){
    	
    	NavalWar game = new NavalWar();
	
    	// Prompt the user to enter the username
    	System.out.print("Please Enter Your Name: ");
	
    	//get the user input
    	Scanner scanner = new Scanner(System.in);
    	String inputName = scanner.nextLine();

    	//make a player object
    	Player player1 = new Player(inputName);
    	System.out.println("Welcome "+player1.getName()+"!");
    	System.out.println("");
    	
    	//set up the game
    	game.setUpGame();
    	
    	//displayed instruction
    	System.out.println("The Goal of this game is to locate and destroy the");
    	System.out.println("Battleships hidden on the grid while trying to avoid");
    	System.out.println("hitting the bomb. To win, you must at least reach the score of");
    	System.out.println("1000. Sinking each ship will award you different points");
    	System.out.println("depending on the type of ship.Striking a mine will");
    	System.out.println("make you lose health and score. Remember, some ships are laid");
    	System.out.println("out horizontally, while some vertically. Alright, Good Luck!");
    	System.out.println("");
    	//make the grid and display it
    	GridMaker gameGrid = new GridMaker();
    	gameGrid.gridDisplay();
    	//start!
    	game.startPlaying(player1, gameGrid);
    }

}
