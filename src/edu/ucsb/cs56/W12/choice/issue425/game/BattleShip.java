package edu.ucsb.cs56.W12.choice.issue425.game;

import java.util.ArrayList;


/**
 *  A class that create battleship object
 *
 *  @author Thiti Chanpuelksa
 */

public class BattleShip{

    private ArrayList<String> locationCells;
    private String name;                               //the name of the battleship
    private int pts;                                   //the amount of point the ship is worth
    private boolean medicShip = false;              //used to calculate when player hit the ship

    /**
     * Constructor for the battleship which will create the battleship with
     * a name, points value, and if its a medic ship or not.
     * 
     * @param inputName the name of the ship
     * @param inputPts the points value of the ship
     * @param medic a boolean which determine if the ship is a medic ship
     */

    public BattleShip(String inputName, int inputPts, boolean medic){

	name         = inputName;
	pts          = inputPts;
        medicShip    = medic;

    }

    /**
     * A set method that will set the cell location of the ship
     * 
     * @param location an arraylist of string which represent the location of the ship
     */

    public void setLocationCells(ArrayList<String> location){

	locationCells = location;

    }

    /**
     * A simple get function that returns the name of the ship
     *
     * @return name name of the ship
     */

    public String getName(){
	
	return name;

    }

    /**
     * A simple boolean check method that returns if the ship is a medic ship or not
     *
     * @return medicShip a boolean which determine if the ship is a medic ship
     */
    public boolean isAMedicShip(){

	return medicShip;

    }

    /**
     * A function which check the user's guess and check the locationCells to see if the attack hit or misses.
     *
     * @param userInput the user guess
     * @return result string result to see if the user hit or miss
     */

    public String checkIfHit(String userInput){

	String result = "Your attack missed!";

	int index = locationCells.indexOf(userInput);

	if(index >= 0) {

	    locationCells.remove(index);

	    if(locationCells.isEmpty()){
		result = "You have sunk a " + this.getName() + " !!";
	    }else{
		result = "You hit a " + this.getName() + " !";
	    }
	}

	return result;
    }
}
		
	


    

