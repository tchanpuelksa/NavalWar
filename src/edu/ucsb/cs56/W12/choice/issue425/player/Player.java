package edu.ucsb.cs56.W12.choice.issue425.player;

/**
 * Class called Player which will make the player object
 * 
 * @author Thiti Chanpuelksa
 * @version cs56, W12, 02/27/12
 */

public class Player{

    private String name = "";
    private int maxHealth = 5;
    private int currentHealth = 5;
    private int score = 0;

    /**
     * Simple constructor that set the name to the name that the user input
     * @param inputName the name the user input
     */

    public Player(String inputName){

    	this.name = inputName;

    }

    /**
     * Simple get method that returns the name of the player
     * @return name
     */

    public String getName(){
	
    	return this.name;

    }

    /**
     * A method which returns the current health point of the player
     * @return health current health point of the player
     */

    public int getCurrentHealth(){

    	return this.currentHealth;
    }
    
    public int getMaxHealth(){
    	
    	return this.maxHealth;
    }

    /**
     * A method which set the max health of the player 
     * @param inputMaxHealth the max health of the player
     */

    public void setMaxHealth(int inputMaxHealth){

    	this.maxHealth = inputMaxHealth;

    }
    
    /**
     * A method used to add to or subtract current health
     * @param healthGained
     */
    
    public void addToHealth(int healthGained){
    	
    	this.currentHealth += healthGained;
    }
    
    /**
     * A simple get method which returns player's score
     * @return score
     */
    
    public int getScore(){
    	
    	return this.score;
    }
    
    /**
     * A method used to add scores to the player score count
     * @param scoreAwarded
     */
    public void addToScore(int scoreAwarded){
    	
    	this.score += scoreAwarded;
    }
	
}
