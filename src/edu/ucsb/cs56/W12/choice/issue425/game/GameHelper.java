package edu.ucsb.cs56.W12.choice.issue425.game;

import java.io.*;
import java.util.*;


/**
 *  A Game helper class which get the user input method, create the cell location for the ships and the bombs.
 *
 *  @author Original Code found in Head First Java Textbook Chapter 6
 *  @author Minor modification to be used for Choice Point Project by Thiti Chanpuelksa
 */

public class GameHelper {


    private static final String alphabet = "abcdefgh";
    private int gridLength = 8;
    private int gridSize = 64;
    private int [] grid = new int[gridSize];
    private int shipCount = 0;
    public String getUserInput(String prompt) {
    
	String inputLine = null;
	System.out.print(prompt + "  ");
	try {
	    BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
	    inputLine = is.readLine();
	    if (inputLine.length() == 0 )  return null; 
	} catch (IOException e) {
	    System.out.println("IOException: " + e);
	}
	return inputLine.toLowerCase();
    }  
  
    public ArrayList<String> placeShips(int shipSize) {                 
	ArrayList<String> alphaCells = new ArrayList<String>();
	String temp = null;                                // temporary String for concat
	int [] coords = new int[shipSize];                  // current candidate coords
	int attempts = 0;                                  // current attempts counter
	boolean success = false;                           // fag = found a good location ?
	int location = 0;                                  // current starting location
    
	shipCount++;                                        // nth ship to place
	int incr = 1;                                      // set horizontal increment
	if ((shipCount % 2) == 1) {                         // if odd ship (place vertically)
	    incr = gridLength;                             // set vertical increment
	}
	while ( !success & attempts++ < 200 ) {                   // main search loop  (32)
	    location = (int) (Math.random() * gridSize);          // get random starting point
	   // System.out.print(" try " + location);
	    int x = 0;                                            // nth ship position  to place
	    success = true;                                       // assume success
	    while (success && x < shipSize) {                      // look for adjacent unused spots
		if (grid[location] == 0) {                        // if not already used
		    coords[x++] = location;                       // save location
		    location += incr;                             // try ‘next’ adjacent
		    if (location >= gridSize){                    // out of bounds - ‘bottom’
			success = false;                          // failure
		    }
		    if (x>0 && (location % gridLength == 0)) {    // out of bounds - right edge
			success = false;                          // failure
		    }
		} else {                                          // found already used location
		    // System.out.print(" used " + location);
		    success = false;                              // failure
		}
	    }
	}                                                   // end while
    
	int x = 0;                                          // turn location into alpha coords
	int row = 0;
	int column = 0;
//	 System.out.println("\n");
	while (x < shipSize) {
	    grid[coords[x]] = 1;                              // mark master grid pts. as ‘used’
	    row = (int) (coords[x] / gridLength);             // get row value
	    column = coords[x] % gridLength;                  // get numeric column value
	    temp = String.valueOf(alphabet.charAt(column));   // convert to alpha
      
	    alphaCells.add(temp.concat(Integer.toString(row)));
	    x++;      
//	     System.out.print("  coord "+x+" = " + alphaCells.get(x-1));
	}
    
//	 System.out.println("\n");
    
	return alphaCells;
    }
}