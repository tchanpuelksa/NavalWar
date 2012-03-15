package edu.ucsb.cs56.W12.choice.issue425.game;

import java.util.ArrayList;


/**
 *  A class that create the Entity (Battle or bomb) on the grid
 *
 *  @author Thiti Chanpuelksa
 */

public class Entity{

    private ArrayList<String> locationCells;
    private String name;                               
    private int pts;                                   
    private boolean medic = false;              
    private int size = 3;

    /**
     * Constructor for the object which will create the Entity with
     * a name, points value, and if its a medic ship or not.
     * 
     * @param inputName the name of the entity
     * @param inputPts the points value of the entity
     * @param medic a boolean which determine if the entity is a medic ship
     */

    public Entity(String inputName, int inputPts, boolean medic, int inputSize){

    	this.name         = inputName;
    	this.pts          = inputPts;
    	this.medic        = medic;
    	this.size         = inputSize;
    	
    }

    /**
     * A set method that will set the cell location of the entity
     * 
     * @param location an arraylist of string which represent the location of the ship
     */

    public void setLocationCells(ArrayList<String> location){

    	this.locationCells = location;

    }

    /**
     * A simple get function that returns the name of the entity
     *
     * @return name name of the ship
     */

    public String getName(){
	
    	return this.name;

    }
    
    /**
     * A simple get method that gets the points of the entity (used to calculate score)
     * @return pts the point value of the entity
     */
    
    public int getPoint(){
    	return this.pts;
    }

    /**
     * A simple boolean check method that returns if the entity is a healer
     *
     * @return medicShip a boolean which determine if the entity is a medic ship
     */
    public boolean isAMedicShip(){

    	return this.medic;

    }

    /**
     * A function which check the user's guess and check the locationCells to see if the attack hit or misses.
     *
     * @param userInput the user guess
     * @return result string result to see if the user hit or miss
     */

    public String checkIfHit(String userInput){

    	String result = "miss";

    	int index = locationCells.indexOf(userInput);

    	if(index >= 0) {

    		locationCells.remove(index);
	    
    		if(locationCells.isEmpty()){
    			result = "kill";
    		}else{
    			result = "hit";
    		}
    	}

	return result;
    }
    
    /**
     * A simple getter method that get the size (on the grid) of the entity
     * @return
     */
    
    public int getSize(){
    	
    	return this.size;
    }
}
		
	


    

