package edu.ucsb.cs56.W12.choice.issue425.game;


import java.awt.Color;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;

import edu.ucsb.cs56.W12.choice.issue425.player.Player;

public class NavalWarGUI extends NavalWar {
	protected GameHelper helper = new GameHelper();
	protected ArrayList<Entity> entityList = new ArrayList<Entity>();
	protected int numOfGuesses = 0;
	protected boolean winner = false;
	
	/**
	 * A void function that will create the battleships and set up the game
	 */
	public void setUpGame(){
		//Make some battleships and set them up
		//Entity("nameOfShip",points,isAMedicShip, size)
		Entity battlecruiser = new Entity("Battlecruiser",250 ,false, 3);
		Entity cruiser       = new Entity("Cruiser"      ,200 ,false, 2);
	    Entity destroyer     = new Entity("Destroyer"    ,200 ,false, 3);
	    Entity frigate       = new Entity("Frigate"      ,125 ,false, 2);
	    Entity submarine     = new Entity("Submarine"    ,175 ,false, 2);
	    Entity dreadnought   = new Entity("Dreadnought"  ,200 ,false, 3);
	    Entity ssmedic       = new Entity("SS Medic"     ,125 ,true , 2);
	    
	    Entity bomb1         = new Entity("Small mine"   ,-40 ,false, 1);
	    Entity bomb2         = new Entity("Mine"         ,-50 ,false, 1);
	    Entity bomb3         = new Entity("Large mine"   ,-100 ,false, 1);
	    Entity bomb4         = new Entity("GIANT MINE"   ,-150,false, 1);
	    Entity bomb5         = new Entity("mine"         ,-50 ,false, 1);
	    
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
	    entityList.add(bomb5);
	    
	    //Go through each of the entity in the list and use the GameHelper to help set a location
	    for(Entity entityToSet : entityList ){
	    	
	    	ArrayList<String> newLocation = helper.placeShips(entityToSet.getSize());
	    	
	    	entityToSet.setLocationCells(newLocation);
	    }
	}

	public void startPlaying(Player player, JTextPane sideText){
		sideText.setText("Alright, let's see what've you got. Try attacking a cell.");
	}
	
	public void checkUserGuess(String usrGuess, Player player, JPanel cell, JTextPane sideText){
		String result = "";
		numOfGuesses++;
		
		for(Entity entityToTest : entityList){
			result = entityToTest.checkIfHit(usrGuess);
		
			//Hit a ship
			if(result.equals("hit") && !entityToTest.isAMedicShip()){
				result = "Nice shot! You've hit " + entityToTest.getName() + " ! (Size:" +entityToTest.getSize() + ")";
				sideText.setText(result);
				cell.setBackground(Color.GREEN);
				cell.repaint();
				break;
			}
			//Hit a medic Ship, get more health
			if(result.equals("hit") && entityToTest.isAMedicShip()){
				result = "You've found a Medic Ship! (Size:2) Health is slightly recovered.";
				player.addToHealth(1);
				sideText.setText(result);
				cell.setBackground(Color.PINK);
				cell.repaint();
				break;
			}
			//Finished off a ship
			if(result.equals("kill") && !entityToTest.isAMedicShip() && (entityToTest.getPoint() > 0) && !(entityToTest.getName() == "Sunken Treasure")){
				result = "Congratulation, You've sunk " + entityToTest.getName() + " ! Received " + entityToTest.getPoint() + " points.";
				player.addToScore(entityToTest.getPoint());
				entityList.remove(entityToTest);
				sideText.setText(result);
				cell.setBackground(Color.GREEN);
				cell.repaint();
				break;
			}
			//Finished off a medic ship
			if(result.equals("kill") && entityToTest.isAMedicShip() && (entityToTest.getPoint() > 0)){
				result = "You've used the last of " + entityToTest.getName() + " medical Supplies.";
				player.addToScore(entityToTest.getPoint());
				player.addToHealth(1);
				entityList.remove(entityToTest);
				sideText.setText(result);
				cell.setBackground(Color.PINK);
				cell.repaint();
				break;
			}
			//Hit a Bomb
			if(result.equals("kill") && (entityToTest.getPoint() < 0)){
				result = "You've striked a " + entityToTest.getName() + " ! Suffered some damage.";
				player.addToScore(entityToTest.getPoint());
				player.addToHealth(-2);
				sideText.setText(result);
				cell.setBackground(Color.RED);
				cell.repaint();
				break;
			}
			//Just totally missed
			if(result.equals("miss")){
				result = "Missed~! Didn't hit anything, please try again";
				sideText.setText(result);
				cell.setBackground(Color.BLUE);
				cell.repaint();
			}
		}
	}
	public int getNumGuess(){
		return numOfGuesses;
	}
	public void setNumGuess(){
		this.numOfGuesses = 0;
	}
	
}