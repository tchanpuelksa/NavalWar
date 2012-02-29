package edu.ucsb.cs56.W12.andrewlo.issue425.player;

/**
 * Class called Player which will make the player object
 * 
 * @author Thiti Chanpuelksa
 * @version cs56, W12, 02/27/12
 */

public class Player{

    String name = "";
    int health = 5;

    /**
     * Simple constructor that set the name to the name that the user input
     * @param inputName the name the user input
     */

    public Player(String inputName){

	name = inPutName;

    }

    /**
     * A method which returns the current health point of the player
     * @return health current health point of the player
     */

    public int getHealth(){

	return health;
    }
}