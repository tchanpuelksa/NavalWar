package edu.ucsb.cs56.W12.choice.issue425.game;


import javax.swing.JTextPane;

import edu.ucsb.cs56.W12.choice.issue425.player.Player;

public class NavalWarGUI extends NavalWar {

	public void startPlaying(Player player, JTextPane sideText){
		sideText.setText("Alright, let's see what've you got. Try attacking a cell.");
	}
	
	public void finishGame(){
		
	}
	
}