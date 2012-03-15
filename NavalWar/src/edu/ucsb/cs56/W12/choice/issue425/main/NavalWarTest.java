package edu.ucsb.cs56.W12.choice.issue425.main;

import org.junit.Test;
import edu.ucsb.cs56.W12.choice.issue425.game.Entity;
import edu.ucsb.cs56.W12.choice.issue425.player.Player;
import static org.junit.Assert.assertEquals;

/**
 * A test case file for the program
 * @author Thiti Chanpuelksa
 * @version cs56,W12,2/29/2012
 */
public class NavalWarTest{
	
	/**
	 * A test case for player name
	 */

@Test public void testGetName(){
     	Player player1 = new Player("Tim");
     	assertEquals("Tim",player1.getName());
 	}

	/**
	 * A test case for player score
	 */

@Test public void testGetScore(){
		Player player1 = new Player("Tim");
		player1.getScore();
		assertEquals(0,player1.getScore());
	}

	/**
	 * Test case for Entity, check all of the value it has
	 */
	
@Test public void testEntity(){
		Entity ship1 = new Entity("Test Ship",100,false,1);
		assertEquals("Test Ship",ship1.getName());
		assertEquals(100,ship1.getPoint());
		assertEquals(false,ship1.isAMedicShip());
		assertEquals(1,ship1.getSize());
	}
}