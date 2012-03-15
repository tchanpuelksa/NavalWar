package edu.ucsb.cs56.W12.choice.issue425.game;

import edu.ucsb.cs56.W12.choice.issue425.game.GameHelper;
import edu.ucsb.cs56.W12.choice.issue425.player.Player;

import java.util.*;

/**
 * A class that generate the game NavalWar
 * 
 * @author Original Base Code by Head First Java Chapter 6: DotComBust
 * @author Thiti Chanpuelksa (Modified and added codes to be used for NavalWar)
 * @version cs56,W12,2/29/2012
 */

public class NavalWar{

	private GameHelper helper = new GameHelper();
	private ArrayList<Entity> entityList = new ArrayList<Entity>();
	private int numOfGuesses = 0;
	private boolean winner = false;
	
	/**
	 * A void function that will create the battleships and set up the game
	 */
	public void setUpGame(){
		//Make some battleships and set them up
		//Entity("nameOfShip",points,isAMedicShip, size)
		Entity battlecruiser = new Entity("Battlecruiser",300 ,false, 3);
		Entity cruiser       = new Entity("Cruiser"      ,200 ,false, 2);
	    Entity destroyer     = new Entity("Destroyer"    ,250 ,false, 3);
	    Entity frigate       = new Entity("Frigate"      ,125 ,false, 2);
	    Entity submarine     = new Entity("Submarine"    ,175 ,false, 2);
	    Entity dreadnought   = new Entity("Dreadnought"  ,200 ,false, 3);
	    Entity ssmedic       = new Entity("SS Medic"     ,125 ,true , 2);
	    
	    Entity bomb1         = new Entity("Small mine"   ,-50 ,false, 1);
	    Entity bomb2         = new Entity("Mine"         ,-50 ,false, 1);
	    Entity bomb3         = new Entity("Large mine"   ,-50 ,false, 1);
	    Entity bomb4         = new Entity("GIANT MINE"   ,-150,false, 1);
	    
	    //Add them into the arrayList of battleship
	    entityList.add(battlecruiser);
	    entityList.add(cruiser);
	    entityList.add(destroyer);
	    entityList.add(frigate);
	    entityList.add(submarine);
	    entityList.add(dreadnought);
	    entityList.add(ssmedic);
	    
	    entityList.add(bomb1);
	    entityList.add(bomb2);
	    entityList.add(bomb3);
	    entityList.add(bomb4);
	    
	    //Go through each of the entity in the list and use the GameHelper to help set a location
	    for(Entity entityToSet : entityList ){
	    	
	    	ArrayList<String> newLocation = helper.placeShips(entityToSet.getSize());
	    	
	    	entityToSet.setLocationCells(newLocation);
	    }
	}
	
	/**
	 * This method runs the game and gets the user's guesses
	 * @param player the player profile, contains points, health, etc.
	 * @param gameGrid the game's grid
	 */
	public void startPlaying(Player player,GridMaker gameGrid){
		//Go through the loop as long as there exist something in the List and the health is more than 0
		while(!entityList.isEmpty() && !(player.getCurrentHealth() <= 0)){
			String userGuess = helper.getUserInput("Which cell would like to attack/inspect?");
			checkUserGuess(userGuess, player, gameGrid);
			
			//if the player's health falls below 0, game over
			if(player.getCurrentHealth() <= 0){
				System.out.println("You've lost all your health points and died...");
				System.out.println("----------GAME OVER----------");
				finishGame();
			}
			//the win condition, more than 1000 points obtained
			if(player.getScore() >= 1000){
				winner=true;
				finishGame();
			}
			if(entityList.isEmpty()){
				System.out.println("You've destroyed all the ships~");
				finishGame();
			}
			//there's only 64 available grid cell
			if(numOfGuesses >= 64){
				System.out.print("You have guessed more than 64 times, Game Over!");
				System.exit(0);
			}
		}
		
		
		finishGame();
	}
	
	/**
	 * the start playing method for gui
	 * @param player the player profile, contains points, health, etc.
	 */
	public void startPlayingGUI(Player player1){
		
	}
	
	
	/**
	 * A method used to check the user's guess to see if it hit, and what entity was hit and respond accordingly
	 * @param userGuess
	 * @param player
	 * @param gameGrid
	 */
	private void checkUserGuess(String userGuess, Player player, GridMaker gameGrid){
		numOfGuesses++;
		
		String result = "You've missed the target, please try again.";
		
		//go through each stuff in the entity list
		for(Entity entityToTest : entityList){
				
			result = entityToTest.checkIfHit(userGuess);
			
			//Hit a ship
			if(result.equals("hit") && !entityToTest.isAMedicShip()){
				result = "Nice shot! You've hit " + entityToTest.getName() + " ! (Size:" +entityToTest.getSize() + ")";
				gameGrid.setStatus("XxxX");
				gameGrid.updateGrid(userGuess, gameGrid.getStatus());
				break;
			}
			//Hit a medic Ship, get more health
			if(result.equals("hit") && entityToTest.isAMedicShip()){
				result = "You've found a Medic Ship! (Size:2) Health is slightly recovered.";
				gameGrid.setStatus("HEAL");
				gameGrid.updateGrid(userGuess, gameGrid.getStatus());
				player.addToHealth(1);
				break;
			}
			//Finished off a ship
			if(result.equals("kill") && !entityToTest.isAMedicShip() && (entityToTest.getPoint() > 0) && !(entityToTest.getName() == "Sunken Treasure")){
				result = "Congratulation, You've sunk " + entityToTest.getName() + " ! Received " + entityToTest.getPoint() + " points.";
				gameGrid.setStatus("XxxX");
				gameGrid.updateGrid(userGuess, gameGrid.getStatus());
				player.addToScore(entityToTest.getPoint());
				entityList.remove(entityToTest);
				break;
			}
			//Finished off a medic ship
			if(result.equals("kill") && entityToTest.isAMedicShip() && (entityToTest.getPoint() > 0)){
				result = "You've used the last of " + entityToTest.getName() + " medical Supplies.";
				gameGrid.setStatus("HEAL");
				gameGrid.updateGrid(userGuess, gameGrid.getStatus());
				player.addToScore(entityToTest.getPoint());
				player.addToHealth(1);
				entityList.remove(entityToTest);
				break;
			}
			//Hit a Bomb
			if(result.equals("kill") && (entityToTest.getPoint() < 0)){
				result = "You've striked a " + entityToTest.getName() + " ! Suffered some damage.";
				gameGrid.setStatus("BOOM");
				gameGrid.updateGrid(userGuess, gameGrid.getStatus());
				player.addToScore(entityToTest.getPoint());
				player.addToHealth(-2);
				break;
			}
			//Just totally missed
			if(result.equals("miss")){
				result = "Missed~! Didn't hit anything, please try again";
				gameGrid.setStatus(" ~~ ");
				gameGrid.updateGrid(userGuess, gameGrid.getStatus());
			}
			
		}
		//Displace the grid with the updated guess and also health and scores
		gameGrid.gridDisplay();
		System.out.println(result);
		System.out.println("Your Health: " + player.getCurrentHealth() + "/" + player.getMaxHealth());
		System.out.println("Score: " + player.getScore());
	}
	
	/**
	 * A method that display a little congratulation note if the player wins.
	 */
	private void finishGame(){
		if(winner == true){
			System.out.println("");
			System.out.println("Congratulation, You've Won!");
			System.out.println("It took you "+numOfGuesses+ " guesses.");
			System.out.println("Thank you for playing");
		}
		System.exit(0); //exit
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}