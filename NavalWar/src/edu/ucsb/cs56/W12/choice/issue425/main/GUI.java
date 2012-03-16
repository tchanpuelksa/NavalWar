package edu.ucsb.cs56.W12.choice.issue425.main;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.Document;

import java.awt.CardLayout;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;
import javax.swing.border.BevelBorder;

import edu.ucsb.cs56.W12.choice.issue425.game.NavalWarGUI;
import edu.ucsb.cs56.W12.choice.issue425.player.Player;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.util.ArrayList;

import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import net.miginfocom.swing.MigLayout;

public class GUI extends JFrame {
	private JPanel cardStack;
	private JPanel titlePanel;
	private JLabel Naval_War;
	private JPanel enterName;
	private JTextField inputName;
	private String userName;
	private JButton btnToMain;
	private JPanel instruction;
	private JLabel instruN;
	private JLabel instru5;
	private JButton btnToMainPage;
	private JPanel mainPage;
	private JPanel panelProfile;
	private JLabel lblName;
	private JLabel usrName;
	private JLabel lblHealth;
	private JLabel usrHealth;
	private JLabel lblScore;
	private JLabel usrScore;
	private JPanel panelGrid;
	private JPanel panelSide;
	private JTextPane sideText;
	private NavalWarGUI game1;
	private Player player1;
	private Box verticalBox;
	private JPanel rowA;
	private JPanel rowB;
	private JPanel rowC;
	private JPanel rowD;
	private JPanel rowE;
	private JPanel rowF;
	private JPanel rowG;
	private ArrayList<JButton> btnRowA = new ArrayList<JButton>();
	private ArrayList<JButton> btnRowB = new ArrayList<JButton>();
	private ArrayList<JButton> btnRowC = new ArrayList<JButton>();
	private ArrayList<JButton> btnRowD = new ArrayList<JButton>();
	private ArrayList<JButton> btnRowE = new ArrayList<JButton>();
	private ArrayList<JButton> btnRowF = new ArrayList<JButton>();
	private ArrayList<JButton> btnRowG = new ArrayList<JButton>();
	private JPanel cellA0;
	private JPanel cellA1;
	private JPanel cellA2;
	private JPanel cellA3;
	private JPanel cellA4;
	private JPanel cellA5;
	private JPanel cellA6;
	private JPanel cellB0;
	private JPanel cellB1;
	private JPanel cellB2;
	private JPanel cellB3;
	private JPanel cellB4;
	private JPanel cellB5;
	private JPanel cellB6;
	private JPanel cellC0;
	private JPanel cellC1;
	private JPanel cellC2;
	private JPanel cellC3;
	private JPanel cellC4;
	private JPanel cellC5;
	private JPanel cellC6;
	private JPanel cellD0;
	private JPanel cellD1;
	private JPanel cellD2;
	private JPanel cellD3;
	private JPanel cellD4;
	private JPanel cellD5;
	private JPanel cellD6;
	private JPanel cellE0;
	private JPanel cellE1;
	private JPanel cellE2;
	private JPanel cellE3;
	private JPanel cellE4;
	private JPanel cellE5;
	private JPanel cellE6;
	private JPanel cellF0;
	private JPanel cellF1;
	private JPanel cellF2;
	private JPanel cellF3;
	private JPanel cellF4;
	private JPanel cellF5;
	private JPanel cellF6;
	private JPanel cellG0;
	private JPanel cellG1;
	private JPanel cellG2;
	private JPanel cellG3;
	private JPanel cellG4;
	private JPanel cellG5;
	private JPanel cellG6;
	private JButton a0;
	private JButton a1;
	private JButton a2;
	private JButton a3;
	private JButton a4;
	private JButton a5;
	private JButton a6;
	private JPanel a0_panel;
	private JPanel a1_panel;
	private JPanel a2_panel;
	private JPanel a3_panel;
	private JPanel a4_panel;
	private JPanel a5_panel;
	private JPanel a6_panel;
	private JButton b0;
	private JButton b1;
	private JButton b2;
	private JButton b3;
	private JButton b4;
	private JButton b5;
	private JButton b6;
	private JPanel b0_panel;
	private JPanel b1_panel;
	private JPanel b2_panel;
	private JPanel b3_panel;
	private JPanel b4_panel;
	private JPanel b5_panel;
	private JPanel b6_panel;
	private JButton c0;
	private JButton c1;
	private JButton c2;
	private JButton c3;
	private JButton c4;
	private JButton c5;
	private JButton c6;
	private JPanel c0_panel;
	private JPanel c1_panel;
	private JPanel c2_panel;
	private JPanel c3_panel;
	private JPanel c4_panel;
	private JPanel c5_panel;
	private JPanel c6_panel;
	private JButton d0;
	private JButton d1;
	private JButton d2;
	private JButton d3;
	private JButton d4;
	private JButton d5;
	private JButton d6;
	private JPanel d0_panel;
	private JPanel d1_panel;
	private JPanel d2_panel;
	private JPanel d3_panel;
	private JPanel d4_panel;
	private JPanel d5_panel;
	private JPanel d6_panel;
	private JButton e0;
	private JButton e1;
	private JButton e2;
	private JButton e3;
	private JButton e4;
	private JButton e5;
	private JButton e6;
	private JPanel e0_panel;
	private JPanel e1_panel;
	private JPanel e2_panel;
	private JPanel e3_panel;
	private JPanel e4_panel;
	private JPanel e5_panel;
	private JPanel e6_panel;
	private JButton f0;
	private JButton f1;
	private JButton f2;
	private JButton f3;
	private JButton f4;
	private JButton f5;
	private JButton f6;
	private JPanel f0_panel;
	private JPanel f1_panel;
	private JPanel f2_panel;
	private JPanel f3_panel;
	private JPanel f4_panel;
	private JPanel f5_panel;
	private JPanel f6_panel;
	private JButton g0;
	private JButton g1;
	private JButton g2;
	private JButton g3;
	private JButton g4;
	private JButton g5;
	private JButton g6;
	private JPanel g0_panel;
	private JPanel g1_panel;
	private JPanel g2_panel;
	private JPanel g3_panel;
	private JPanel g4_panel;
	private JPanel g5_panel;
	private JPanel g6_panel;
	private JPanel gameOver;
	private JPanel gameWin;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel numG;
	private JLabel lblNewLabel_5;
	private JButton btnNewButton_1;

	public GUI() {
		setResizable(false);
		
		//basic main frame set up
		setTitle("NavalWar1.0");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 750);
		
		//set up the menu bar
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		//the file tab inside the menu bar
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);

		//the exit button in the file tab and link action (exit the system) to it
		JMenuItem mntmExit = new JMenuItem("Exit");
		mntmExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		mnFile.add(mntmExit);
		getContentPane().setLayout(null);
		
		//use a main panel created and set layout to CardLayout which makes the panel acts as a card stack which will hold other panels
		cardStack = new JPanel();
		cardStack.setBounds(0, 0, 744, 701);
		getContentPane().add(cardStack);
		cardStack.setLayout(new CardLayout(0, 0));
		
		//The main Panel, title screen
		titlePanel = new JPanel();
		cardStack.add(titlePanel, "mainPanel");
		titlePanel.setLayout(null);
		
		//the main title Label, change color :D
		Naval_War = new JLabel(" Naval War");
		Naval_War.setForeground(Color.BLACK);
		Naval_War.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
					try {
						Naval_War.setForeground(Color.RED);
						Naval_War.repaint();
					} catch (Exception ex) {
						// TODO Auto-generated catch block
						ex.printStackTrace();
					}
					
			}
		});
		Naval_War.setFont(new Font("HELVETICA", Font.BOLD, 120));
		Naval_War.setBounds(36, 55, 672, 181);
		titlePanel.add(Naval_War);
		
		//the Start Button, which have an action listener which will activate the action to change the "card" in the panel stack to the enterName page
		JButton btnStart = new JButton("<< START >>");
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout c1 = (CardLayout)(cardStack.getLayout());
				c1.show(cardStack, "enterName");
			}
		});
		btnStart.setFont(new Font("HELVETICA", Font.PLAIN, 18));
		btnStart.setBounds(275, 325, 193, 67);
		titlePanel.add(btnStart);
		
		//the enterName panel which will ask the user to input in a name
		enterName = new JPanel();
		cardStack.add(enterName, "enterName");
		enterName.setLayout(null);
		
		JLabel nameAsk = new JLabel("Before we continue, please state your name...");
		nameAsk.setFont(new Font("HELVETICA", Font.BOLD, 16));
		nameAsk.setBounds(39, 194, 429, 42);
		enterName.add(nameAsk);

		//the text field where the user will input the name
		inputName = new JTextField();
		inputName.setBounds(234, 290, 275, 61);
		enterName.add(inputName);
		inputName.setColumns(10);
		
		//a documentListener to detect the changes in the JTextField in real time, used to enable or disable the next button
		//used to prevent user from making a null or empty string name
		Document textFieldDoc = inputName.getDocument();
		textFieldDoc.addDocumentListener(new DocumentListener() {
			public void changedUpdate(DocumentEvent e) {
				updated(e);
			}
			public void insertUpdate(DocumentEvent e) {
				updated(e);
			}
			public void removeUpdate(DocumentEvent e) {
				updated(e);
			}
			private void updated(DocumentEvent e) {
				
				//try and catch method that check the name user put in to make sure its appropriate
				try{
					//check if start with space, as long as it is, don't enable button
					if(inputName.getText().charAt(0) != ' '){
						boolean enable = e.getDocument().getLength() > 0;
						btnToMain.setEnabled(enable);
					}else{
						btnToMain.setEnabled(false);
					}
				//a catch with StringIndexOutOfBoundsException which set the button to false.
				}catch(StringIndexOutOfBoundsException ex){
					btnToMain.setEnabled(false);
				}
			}
			
		});
		
		//the Next button which will bring us to the instruction page
		btnToMain = new JButton("NEXT >>");
		btnToMain.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout c2 = (CardLayout)(cardStack.getLayout());
				c2.show(cardStack, "instruction");
				
				userName = (String) inputName.getText();
				inputName.setText(null);
				
				instruN.setText(userName + ".");
			}
		});
		btnToMain.setEnabled(false);
		btnToMain.setFont(new Font("HELVETICA", Font.BOLD, 15));
		btnToMain.setBounds(276, 401, 191, 61);
		enterName.add(btnToMain);
		
		//The instruction Page
		instruction = new JPanel();
		cardStack.add(instruction, "instruction");
		instruction.setLayout(null);
		
		JPanel instructionBox = new JPanel();
		instructionBox.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(30, 144, 255), null, null, null));
		instructionBox.setBounds(39, 36, 676, 301);
		instruction.add(instructionBox);
		instructionBox.setLayout(null);
		
		JLabel instru1 = new JLabel("Hello, ");
		instru1.setFont(new Font("HELVETICA", Font.BOLD, 13));
		instru1.setBounds(10, 11, 44, 43);
		instructionBox.add(instru1);
		
		instruN = new JLabel("");
		instruN.setFont(new Font("HELVETICA", Font.BOLD, 13));
		instruN.setBounds(52, 11, 610, 43);
		instructionBox.add(instruN);
		
		JLabel instru2 = new JLabel("The goal of this game is to be able to reach a score of 1000. However, getting there won't be");
		instru2.setFont(new Font("HELVETICA", Font.BOLD, 13));
		instru2.setBounds(10, 65, 652, 43);
		instructionBox.add(instru2);
		
		JLabel instru3 = new JLabel("an easy task. In order to earn points, you will select one cell of the grid each time. This cell");
		instru3.setFont(new Font("HELVETICA", Font.BOLD, 13));
		instru3.setBounds(10, 119, 652, 43);
		instructionBox.add(instru3);
		
		JLabel instru4 = new JLabel("can either be a ship, which will earn you points, or a bomb which will inflict damages, or just");
		instru4.setFont(new Font("HELVETICA", Font.BOLD, 13));
		instru4.setBounds(10, 173, 652, 43);
		instructionBox.add(instru4);
		
		instru5 = new JLabel("a plain and empty cell. Alright, let's see what you can do...");
		instru5.setFont(new Font("HELVETICA", Font.BOLD, 13));
		instru5.setBounds(10, 227, 652, 43);
		instructionBox.add(instru5);
		
		//the button in the instruction page that will bring us to the main game page
		//Action listener with this button which will create the game
		btnToMainPage = new JButton("Lets Play !!");
		btnToMainPage.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				
				game1 = new NavalWarGUI();
				player1 = new Player(userName);
				game1.setUpGame();
				
				CardLayout c3 = (CardLayout)(cardStack.getLayout());
				c3.show(cardStack, "mainPage");
				usrName.setText(player1.getName());
				usrHealth.setText(Integer.toString(player1.getCurrentHealth()));
				usrScore.setText(Integer.toString(player1.getScore()));
				
				game1.startPlaying(player1, sideText);
			}
		});
		btnToMainPage.setFont(new Font("HELVETICA", Font.BOLD, 15));
		btnToMainPage.setBounds(514, 348, 200, 55);
		instruction.add(btnToMainPage);
		
		//the main game page
		mainPage = new JPanel();
		cardStack.add(mainPage, "mainPage");
		mainPage.setLayout(null);
		
		//the top panel portion which contains player's informations
		panelProfile = new JPanel();
		panelProfile.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panelProfile.setBounds(10, 11, 724, 127);
		mainPage.add(panelProfile);
		panelProfile.setLayout(null);
		
		lblName = new JLabel("Name:");
		lblName.setFont(new Font("HELVETICA", Font.BOLD, 13));
		lblName.setBounds(10, 11, 50, 24);
		panelProfile.add(lblName);
		
		usrName = new JLabel("");
		usrName.setFont(new Font("HELVETICA", Font.BOLD, 13));
		usrName.setBounds(70, 11, 644, 24);
		panelProfile.add(usrName);
		
		lblHealth = new JLabel("Health:");
		lblHealth.setFont(new Font("HELVETICA", Font.BOLD, 13));
		lblHealth.setBounds(10, 77, 50, 24);
		panelProfile.add(lblHealth);
		
		usrHealth = new JLabel("");
		usrHealth.setFont(new Font("HELVETICA", Font.BOLD, 13));
		usrHealth.setBounds(70, 77, 137, 24);
		panelProfile.add(usrHealth);
		
		lblScore = new JLabel("Scores:");
		lblScore.setFont(new Font("HELVETICA", Font.BOLD, 13));
		lblScore.setBounds(552, 77, 50, 24);
		panelProfile.add(lblScore);
		
		usrScore = new JLabel("");
		usrScore.setFont(new Font("HELVETICA", Font.BOLD, 13));
		usrScore.setBounds(612, 77, 102, 24);
		panelProfile.add(usrScore);
		
		//the game grid, creating each component.
		panelGrid = new JPanel();
		panelGrid.setBackground(new Color(30, 144, 255));
		panelGrid.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(30, 144, 255), null, null, null));
		panelGrid.setBounds(10, 149, 541, 541);
		mainPage.add(panelGrid);
		panelGrid.setLayout(new GridLayout(1, 0, 0, 0));
		
		verticalBox = Box.createVerticalBox();
		panelGrid.add(verticalBox);
		
		//the A row
		rowA = new JPanel();
		verticalBox.add(rowA);
		rowA.setLayout(null);
		
		cellA0 = new JPanel();
		cellA0.setBounds(0, 0, 76, 76);
		rowA.add(cellA0);
		cellA0.setLayout(new CardLayout(0, 0));
		
		//each button for each cell
		a0 = new JButton("a0");
		a0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				game1.checkUserGuess("a0",player1,a0_panel,sideText);
				
				CardLayout c = (CardLayout)(cellA0.getLayout());
				c.show(cellA0, "a0_panel");
				
				usrScore.setText(""+player1.getScore());
				usrHealth.setText(""+player1.getCurrentHealth()); 
				checkGameStatus(player1);
			}
		});
		cellA0.add(a0, "a0_btn");
		
		//panel that goes behind the cell
		a0_panel = new JPanel();
		cellA0.add(a0_panel, "a0_panel");
		
		cellA1 = new JPanel();
		cellA1.setBounds(76, 0, 76, 76);
		rowA.add(cellA1);
		cellA1.setLayout(new CardLayout(0, 0));
		
		a1 = new JButton("a1");
		a1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				game1.checkUserGuess("a1",player1,a1_panel,sideText);
				
				CardLayout c = (CardLayout)(cellA1.getLayout());
				c.show(cellA1, "a1_panel");
				
				usrScore.setText(""+player1.getScore());
				usrHealth.setText(""+player1.getCurrentHealth()); 
				checkGameStatus(player1);
			}
		});
		cellA1.add(a1, "a1_btn");
		
		a1_panel = new JPanel();
		cellA1.add(a1_panel, "a1_panel");
		
		cellA2 = new JPanel();
		cellA2.setBounds(152, 0, 76, 76);
		rowA.add(cellA2);
		cellA2.setLayout(new CardLayout(0, 0));
		
		a2 = new JButton("a2");
		a2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				game1.checkUserGuess("a2",player1,a2_panel,sideText);
				
				CardLayout c = (CardLayout)(cellA2.getLayout());
				c.show(cellA2, "a2_panel");
				
				usrScore.setText(""+player1.getScore());
				usrHealth.setText(""+player1.getCurrentHealth()); 
				checkGameStatus(player1);
			}
		});
		cellA2.add(a2, "a2_btn");
		
		a2_panel = new JPanel();
		cellA2.add(a2_panel, "a2_panel");
		
		cellA3 = new JPanel();
		cellA3.setBounds(228, 0, 76, 76);
		rowA.add(cellA3);
		cellA3.setLayout(new CardLayout(0, 0));
		
		a3 = new JButton("a3");
		a3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				game1.checkUserGuess("a3",player1,a3_panel,sideText);
				
				CardLayout c = (CardLayout)(cellA3.getLayout());
				c.show(cellA3, "a3_panel");
				
				usrScore.setText(""+player1.getScore());
				usrHealth.setText(""+player1.getCurrentHealth()); 
				checkGameStatus(player1);
			}
		});
		cellA3.add(a3, "a3_btn");
		
		a3_panel = new JPanel();
		cellA3.add(a3_panel, "a3_panel");
		
		cellA4 = new JPanel();
		cellA4.setBounds(304, 0, 76, 76);
		rowA.add(cellA4);
		cellA4.setLayout(new CardLayout(0, 0));
		
		a4 = new JButton("a4");
		a4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				game1.checkUserGuess("a4",player1,a4_panel,sideText);
				
				CardLayout c = (CardLayout)(cellA4.getLayout());
				c.show(cellA4, "a4_panel");
				
				usrScore.setText(""+player1.getScore());
				usrHealth.setText(""+player1.getCurrentHealth()); 
				checkGameStatus(player1);
			}
		});
		cellA4.add(a4, "a4_btn");
		
		a4_panel = new JPanel();
		cellA4.add(a4_panel, "a4_panel");
		
		cellA5 = new JPanel();
		cellA5.setBounds(380, 0, 76, 76);
		rowA.add(cellA5);
		cellA5.setLayout(new CardLayout(0, 0));
		
		a5 = new JButton("a5");
		a5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				game1.checkUserGuess("a5",player1,a5_panel,sideText);
				
				CardLayout c = (CardLayout)(cellA5.getLayout());
				c.show(cellA5, "a5_panel");
				
				usrScore.setText(""+player1.getScore());
				usrHealth.setText(""+player1.getCurrentHealth()); 
				checkGameStatus(player1);
			}
		});
		cellA5.add(a5, "a5_btn");
		
		a5_panel = new JPanel();
		cellA5.add(a5_panel, "a5_panel");
		
		cellA6 = new JPanel();
		cellA6.setBounds(456, 0, 76, 76);
		rowA.add(cellA6);
		cellA6.setLayout(new CardLayout(0, 0));
		
		a6 = new JButton("a6");
		a6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				game1.checkUserGuess("a6",player1,a6_panel,sideText);
				
				CardLayout c = (CardLayout)(cellA6.getLayout());
				c.show(cellA6, "a6_panel");
				
				usrScore.setText(""+player1.getScore());
				usrHealth.setText(""+player1.getCurrentHealth()); 
				checkGameStatus(player1);
			}
		});
		cellA6.add(a6, "a6_btn");
		
		a6_panel = new JPanel();
		cellA6.add(a6_panel, "a6_panel");
		
		rowB = new JPanel();
		verticalBox.add(rowB);
		rowB.setLayout(null);
		
		cellB0 = new JPanel();
		cellB0.setBounds(0, 0, 76, 77);
		rowB.add(cellB0);
		cellB0.setLayout(new CardLayout(0, 0));
		
		b0 = new JButton("b0");
		b0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				game1.checkUserGuess("b0",player1,b0_panel,sideText);
				
				CardLayout c = (CardLayout)(cellB0.getLayout());
				c.show(cellB0, "b0_panel");
				
				usrScore.setText(""+player1.getScore());
				usrHealth.setText(""+player1.getCurrentHealth()); 
				checkGameStatus(player1);
			}
		});
		cellB0.add(b0, "b0_btn");
		
		b0_panel = new JPanel();
		cellB0.add(b0_panel, "b0_panel");
		
		cellB1 = new JPanel();
		cellB1.setBounds(76, 0, 76, 77);
		rowB.add(cellB1);
		cellB1.setLayout(new CardLayout(0, 0));
		
		b1 = new JButton("b1");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				game1.checkUserGuess("b1",player1,b1_panel,sideText);
				
				CardLayout c = (CardLayout)(cellB1.getLayout());
				c.show(cellB1, "b1_panel");
				
				usrScore.setText(""+player1.getScore());
				usrHealth.setText(""+player1.getCurrentHealth()); 
				checkGameStatus(player1);
			}
		});
		cellB1.add(b1, "b1_btn");
		
		b1_panel = new JPanel();
		cellB1.add(b1_panel, "b1_panel");
		
		cellB2 = new JPanel();
		cellB2.setBounds(152, 0, 76, 77);
		rowB.add(cellB2);
		cellB2.setLayout(new CardLayout(0, 0));
		
		b2 = new JButton("b2");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				game1.checkUserGuess("b2",player1,b2_panel,sideText);
				
				CardLayout c = (CardLayout)(cellB2.getLayout());
				c.show(cellB2, "b2_panel");
				
				usrScore.setText(""+player1.getScore());
				usrHealth.setText(""+player1.getCurrentHealth()); 
				checkGameStatus(player1);
			}
		});
		cellB2.add(b2, "b2_btn");
		
		b2_panel = new JPanel();
		cellB2.add(b2_panel, "b2_panel");
		
		cellB3 = new JPanel();
		cellB3.setBounds(228, 0, 76, 77);
		rowB.add(cellB3);
		cellB3.setLayout(new CardLayout(0, 0));
		
		b3 = new JButton("b3");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				game1.checkUserGuess("b3",player1,b3_panel,sideText);
				
				CardLayout c = (CardLayout)(cellB3.getLayout());
				c.show(cellB3, "b3_panel");
				
				usrScore.setText(""+player1.getScore());
				usrHealth.setText(""+player1.getCurrentHealth()); 
				checkGameStatus(player1);
			}
		});
		cellB3.add(b3, "b3_btn");
		
		b3_panel = new JPanel();
		cellB3.add(b3_panel, "b3_panel");
		
		cellB4 = new JPanel();
		cellB4.setBounds(304, 0, 76, 77);
		rowB.add(cellB4);
		cellB4.setLayout(new CardLayout(0, 0));
		
		b4 = new JButton("b4");
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				game1.checkUserGuess("b4",player1,b4_panel,sideText);
				
				CardLayout c = (CardLayout)(cellB4.getLayout());
				c.show(cellB4, "b4_panel");
				
				usrScore.setText(""+player1.getScore());
				usrHealth.setText(""+player1.getCurrentHealth()); 
				checkGameStatus(player1);
			}
		});
		cellB4.add(b4, "b4_btn");
		
		b4_panel = new JPanel();
		cellB4.add(b4_panel, "b4_panel");
		
		cellB5 = new JPanel();
		cellB5.setBounds(380, 0, 76, 77);
		rowB.add(cellB5);
		cellB5.setLayout(new CardLayout(0, 0));
		
		b5 = new JButton("b5");
		b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				game1.checkUserGuess("b5",player1,b5_panel,sideText);
				
				CardLayout c = (CardLayout)(cellB5.getLayout());
				c.show(cellB5, "b5_panel");
				
				usrScore.setText(""+player1.getScore());
				usrHealth.setText(""+player1.getCurrentHealth()); 
				checkGameStatus(player1);
			}
		});
		cellB5.add(b5, "b5_btn");
		
		b5_panel = new JPanel();
		cellB5.add(b5_panel, "b5_panel");
		
		cellB6 = new JPanel();
		cellB6.setBounds(456, 0, 76, 77);
		rowB.add(cellB6);
		cellB6.setLayout(new CardLayout(0, 0));
		
		b6 = new JButton("b6");
		b6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				game1.checkUserGuess("b6",player1,b6_panel,sideText);
				
				CardLayout c = (CardLayout)(cellB6.getLayout());
				c.show(cellB6, "b6_panel");
				
				usrScore.setText(""+player1.getScore());
				usrHealth.setText(""+player1.getCurrentHealth()); 
				checkGameStatus(player1);
			}
		});
		cellB6.add(b6, "b6_btn");
		
		b6_panel = new JPanel();
		cellB6.add(b6_panel, "b6_panel");
		
		rowC = new JPanel();
		verticalBox.add(rowC);
		rowC.setLayout(null);
		
		cellC0 = new JPanel();
		cellC0.setBounds(0, 0, 76, 79);
		rowC.add(cellC0);
		cellC0.setLayout(new CardLayout(0, 0));
		
		c0 = new JButton("c0");
		c0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				game1.checkUserGuess("c0",player1,c0_panel,sideText);
				
				CardLayout c = (CardLayout)(cellC0.getLayout());
				c.show(cellC0, "c0_panel");
				
				usrScore.setText(""+player1.getScore());
				usrHealth.setText(""+player1.getCurrentHealth()); 
				checkGameStatus(player1);
			}
		});
		cellC0.add(c0, "c0_btn");
		
		c0_panel = new JPanel();
		cellC0.add(c0_panel, "c0_panel");
		
		cellC1 = new JPanel();
		cellC1.setBounds(76, 0, 76, 79);
		rowC.add(cellC1);
		cellC1.setLayout(new CardLayout(0, 0));
		
		c1 = new JButton("c1");
		c1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				game1.checkUserGuess("c1",player1,c1_panel,sideText);
				
				CardLayout c = (CardLayout)(cellC1 .getLayout());
				c.show(cellC1, "c1_panel");
				
				usrScore.setText(""+player1.getScore());
				usrHealth.setText(""+player1.getCurrentHealth()); 
				checkGameStatus(player1);
			}
		});
		cellC1.add(c1, "c1_btn");
		
		c1_panel = new JPanel();
		cellC1.add(c1_panel, "c1_panel");
		
		cellC2 = new JPanel();
		cellC2.setBounds(152, 0, 76, 79);
		rowC.add(cellC2);
		cellC2.setLayout(new CardLayout(0, 0));
		
		c2 = new JButton("c2");
		c2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				game1.checkUserGuess("c2",player1,c2_panel,sideText);
				
				CardLayout c = (CardLayout)(cellC2 .getLayout());
				c.show(cellC2, "c2_panel");
				
				usrScore.setText(""+player1.getScore());
				usrHealth.setText(""+player1.getCurrentHealth()); 
				checkGameStatus(player1);
			}
		});
		cellC2.add(c2, "c2_btn");
		
		c2_panel = new JPanel();
		cellC2.add(c2_panel, "c2_panel");
		
		cellC3 = new JPanel();
		cellC3.setBounds(228, 0, 76, 79);
		rowC.add(cellC3);
		cellC3.setLayout(new CardLayout(0, 0));
		
		c3 = new JButton("c3");
		c3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				game1.checkUserGuess("c3",player1,c3_panel,sideText);
				
				CardLayout c = (CardLayout)(cellC3 .getLayout());
				c.show(cellC3, "c3_panel");
				
				usrScore.setText(""+player1.getScore());
				usrHealth.setText(""+player1.getCurrentHealth()); 
				checkGameStatus(player1);
			}
		});
		cellC3.add(c3, "c3_btn");
		
		c3_panel = new JPanel();
		cellC3.add(c3_panel, "c3_panel");
		
		cellC4 = new JPanel();
		cellC4.setBounds(304, 0, 76, 79);
		rowC.add(cellC4);
		cellC4.setLayout(new CardLayout(0, 0));
		
		c4 = new JButton("c4");
		c4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				game1.checkUserGuess("c4",player1,c4_panel,sideText);
				
				CardLayout c = (CardLayout)(cellC4 .getLayout());
				c.show(cellC4, "c4_panel");
				
				usrScore.setText(""+player1.getScore());
				usrHealth.setText(""+player1.getCurrentHealth()); 
				checkGameStatus(player1);
			}
		});
		cellC4.add(c4, "c4_btn");
		
		c4_panel = new JPanel();
		cellC4.add(c4_panel, "c4_panel");
		
		cellC5 = new JPanel();
		cellC5.setBounds(380, 0, 76, 79);
		rowC.add(cellC5);
		cellC5.setLayout(new CardLayout(0, 0));
		
		c5 = new JButton("c5");
		c5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				game1.checkUserGuess("c5",player1,c5_panel,sideText);
				
				CardLayout c = (CardLayout)(cellC5 .getLayout());
				c.show(cellC5, "c5_panel");
				
				usrScore.setText(""+player1.getScore());
				usrHealth.setText(""+player1.getCurrentHealth()); 
				checkGameStatus(player1);
			}
		});
		cellC5.add(c5, "c5_btn");
		
		c5_panel = new JPanel();
		cellC5.add(c5_panel, "c5_panel");
		
		cellC6 = new JPanel();
		cellC6.setBounds(456, 0, 76, 79);
		rowC.add(cellC6);
		cellC6.setLayout(new CardLayout(0, 0));
		
		c6 = new JButton("c6");
		c6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				game1.checkUserGuess("c6",player1,c6_panel,sideText);
				
				CardLayout c = (CardLayout)(cellC6 .getLayout());
				c.show(cellC6, "c6_panel");
				
				usrScore.setText(""+player1.getScore());
				usrHealth.setText(""+player1.getCurrentHealth()); 
				checkGameStatus(player1);
			}
		});
		cellC6.add(c6, "c6_btn");
		
		c6_panel = new JPanel();
		cellC6.add(c6_panel, "c6_panel");
		
		rowD = new JPanel();
		verticalBox.add(rowD);
		rowD.setLayout(null);
		
		cellD0 = new JPanel();
		cellD0.setBounds(0, 0, 76, 80);
		rowD.add(cellD0);
		cellD0.setLayout(new CardLayout(0, 0));
		
		d0 = new JButton("d0");
		d0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				game1.checkUserGuess("d0",player1,d0_panel,sideText);
				
				CardLayout c = (CardLayout)(cellD0 .getLayout());
				c.show(cellD0, "d0_panel");
				
				usrScore.setText(""+player1.getScore());
				usrHealth.setText(""+player1.getCurrentHealth()); 
				checkGameStatus(player1);
			}
		});
		cellD0.add(d0, "d0_btn");
		
		d0_panel = new JPanel();
		cellD0.add(d0_panel, "d0_panel");
		
		cellD1 = new JPanel();
		cellD1.setBounds(76, 0, 76, 80);
		rowD.add(cellD1);
		cellD1.setLayout(new CardLayout(0, 0));
		
		d1 = new JButton("d1");
		d1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				game1.checkUserGuess("d1",player1,d1_panel,sideText);
				
				CardLayout c = (CardLayout)(cellD1 .getLayout());
				c.show(cellD1, "d1_panel");
				
				usrScore.setText(""+player1.getScore());
				usrHealth.setText(""+player1.getCurrentHealth()); 
				checkGameStatus(player1);
			}
		});
		cellD1.add(d1, "d1_btn");
		
		d1_panel = new JPanel();
		cellD1.add(d1_panel, "d1_panel");
		
		cellD2 = new JPanel();
		cellD2.setBounds(152, 0, 76, 80);
		rowD.add(cellD2);
		cellD2.setLayout(new CardLayout(0, 0));
		
		d2 = new JButton("d2");
		d2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				game1.checkUserGuess("d2",player1,d2_panel,sideText);
				
				CardLayout c = (CardLayout)(cellD2 .getLayout());
				c.show(cellD2, "d2_panel");
				
				usrScore.setText(""+player1.getScore());
				usrHealth.setText(""+player1.getCurrentHealth()); 
				checkGameStatus(player1);
			}
		});
		cellD2.add(d2, "d2_btn");
		
		d2_panel = new JPanel();
		cellD2.add(d2_panel, "d2_panel");
		
		cellD3 = new JPanel();
		cellD3.setBounds(228, 0, 76, 80);
		rowD.add(cellD3);
		cellD3.setLayout(new CardLayout(0, 0));
		
		d3 = new JButton("d3");
		d3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				game1.checkUserGuess("d3",player1,d3_panel,sideText);
				
				CardLayout c = (CardLayout)(cellD3 .getLayout());
				c.show(cellD3, "d3_panel");
				
				usrScore.setText(""+player1.getScore());
				usrHealth.setText(""+player1.getCurrentHealth()); 
				checkGameStatus(player1);
			}
		});
		cellD3.add(d3, "d3_btn");
		
		d3_panel = new JPanel();
		cellD3.add(d3_panel, "d3_panel");
		
		cellD4 = new JPanel();
		cellD4.setBounds(304, 0, 76, 80);
		rowD.add(cellD4);
		cellD4.setLayout(new CardLayout(0, 0));
		
		d4 = new JButton("d4");
		d4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				game1.checkUserGuess("d4",player1,d4_panel,sideText);
				
				CardLayout c = (CardLayout)(cellD4 .getLayout());
				c.show(cellD4, "d4_panel");
				
				usrScore.setText(""+player1.getScore());
				usrHealth.setText(""+player1.getCurrentHealth()); 
				checkGameStatus(player1);
			}
		});
		cellD4.add(d4, "d4_btn");
		
		d4_panel = new JPanel();
		cellD4.add(d4_panel, "d4_panel");
		
		cellD5 = new JPanel();
		cellD5.setBounds(380, 0, 76, 80);
		rowD.add(cellD5);
		cellD5.setLayout(new CardLayout(0, 0));
		
		d5 = new JButton("d5");
		d5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				game1.checkUserGuess("d5",player1,d5_panel,sideText);
				
				CardLayout c = (CardLayout)(cellD5 .getLayout());
				c.show(cellD5, "d5_panel");
				
				usrScore.setText(""+player1.getScore());
				usrHealth.setText(""+player1.getCurrentHealth()); 
				checkGameStatus(player1);
			}
		});
		cellD5.add(d5, "d5_btn");
		
		d5_panel = new JPanel();
		cellD5.add(d5_panel, "d5_panel");
		
		cellD6 = new JPanel();
		cellD6.setBounds(456, 0, 76, 80);
		rowD.add(cellD6);
		cellD6.setLayout(new CardLayout(0, 0));
		
		d6 = new JButton("d6");
		d6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				game1.checkUserGuess("d6",player1,d6_panel,sideText);
				
				CardLayout c = (CardLayout)(cellD6 .getLayout());
				c.show(cellD6, "d6_panel");
				
				usrScore.setText(""+player1.getScore());
				usrHealth.setText(""+player1.getCurrentHealth()); 
				checkGameStatus(player1);
			}
		});
		cellD6.add(d6, "d6_btn");
		
		d6_panel = new JPanel();
		cellD6.add(d6_panel, "d6_panel");
		
		rowE = new JPanel();
		verticalBox.add(rowE);
		rowE.setLayout(null);
		
		cellE0 = new JPanel();
		cellE0.setBounds(0, 0, 76, 81);
		rowE.add(cellE0);
		cellE0.setLayout(new CardLayout(0, 0));
		
		e0 = new JButton("e0");
		e0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				game1.checkUserGuess("e0",player1,e0_panel,sideText);
				
				CardLayout c = (CardLayout)(cellE0 .getLayout());
				c.show(cellE0, "e0_panel");
				
				usrScore.setText(""+player1.getScore());
				usrHealth.setText(""+player1.getCurrentHealth()); 
				checkGameStatus(player1);
			}
		});
		cellE0.add(e0, "e0_btn");
		
		e0_panel = new JPanel();
		cellE0.add(e0_panel, "e0_panel");
		
		cellE1 = new JPanel();
		cellE1.setBounds(76, 0, 76, 81);
		rowE.add(cellE1);
		cellE1.setLayout(new CardLayout(0, 0));
		
		e1 = new JButton("e1");
		e1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				game1.checkUserGuess("e1",player1,e1_panel,sideText);
				
				CardLayout c = (CardLayout)(cellE1 .getLayout());
				c.show(cellE1, "e1_panel");
				
				usrScore.setText(""+player1.getScore());
				usrHealth.setText(""+player1.getCurrentHealth()); 
				checkGameStatus(player1);
			}
		});
		cellE1.add(e1, "e1_btn");
		
		e1_panel = new JPanel();
		cellE1.add(e1_panel, "e1_panel");
		
		cellE2 = new JPanel();
		cellE2.setBounds(152, 0, 76, 81);
		rowE.add(cellE2);
		cellE2.setLayout(new CardLayout(0, 0));
		
		e2 = new JButton("e2");
		e2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				game1.checkUserGuess("e2",player1,e2_panel,sideText);
				
				CardLayout c = (CardLayout)(cellE2 .getLayout());
				c.show(cellE2, "e2_panel");
				
				usrScore.setText(""+player1.getScore());
				usrHealth.setText(""+player1.getCurrentHealth()); 
				checkGameStatus(player1);
			}
		});
		cellE2.add(e2, "e2_btn");
		
		e2_panel = new JPanel();
		cellE2.add(e2_panel, "e2_panel");
		
		cellE3 = new JPanel();
		cellE3.setBounds(228, 0, 76, 81);
		rowE.add(cellE3);
		cellE3.setLayout(new CardLayout(0, 0));
		
		e3 = new JButton("e3");
		e3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				game1.checkUserGuess("e3",player1,e3_panel,sideText);
				
				CardLayout c = (CardLayout)(cellE3 .getLayout());
				c.show(cellE3, "e3_panel");
				
				usrScore.setText(""+player1.getScore());
				usrHealth.setText(""+player1.getCurrentHealth()); 
				checkGameStatus(player1);
			}
		});
		cellE3.add(e3, "e3_btn");
		
		e3_panel = new JPanel();
		cellE3.add(e3_panel, "e3_panel");
		
		cellE4 = new JPanel();
		cellE4.setBounds(304, 0, 76, 81);
		rowE.add(cellE4);
		cellE4.setLayout(new CardLayout(0, 0));
		
		e4 = new JButton("e4");
		e4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				game1.checkUserGuess("e4",player1,e4_panel,sideText);
				
				CardLayout c = (CardLayout)(cellE4 .getLayout());
				c.show(cellE4, "e4_panel");
				
				usrScore.setText(""+player1.getScore());
				usrHealth.setText(""+player1.getCurrentHealth()); 
				checkGameStatus(player1);
			}
		});
		cellE4.add(e4, "e4_btn");
		
		e4_panel = new JPanel();
		cellE4.add(e4_panel, "e4_panel");
		
		cellE5 = new JPanel();
		cellE5.setBounds(380, 0, 76, 81);
		rowE.add(cellE5);
		cellE5.setLayout(new CardLayout(0, 0));
		
		e5 = new JButton("e5");
		e5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				game1.checkUserGuess("e5",player1,e5_panel,sideText);
				
				CardLayout c = (CardLayout)(cellE5 .getLayout());
				c.show(cellE5, "e5_panel");
				
				usrScore.setText(""+player1.getScore());
				usrHealth.setText(""+player1.getCurrentHealth()); 
				checkGameStatus(player1);
			}
		});
		cellE5.add(e5, "e5_btn");
		
		e5_panel = new JPanel();
		cellE5.add(e5_panel, "e5_panel");
		
		cellE6 = new JPanel();
		cellE6.setBounds(456, 0, 76, 81);
		rowE.add(cellE6);
		cellE6.setLayout(new CardLayout(0, 0));
		
		e6 = new JButton("e6");
		e6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				game1.checkUserGuess("e6",player1,e6_panel,sideText);
				
				CardLayout c = (CardLayout)(cellE6 .getLayout());
				c.show(cellE6, "e6_panel");
				
				usrScore.setText(""+player1.getScore());
				usrHealth.setText(""+player1.getCurrentHealth()); 
				checkGameStatus(player1);
			}
		});
		cellE6.add(e6, "e6_btn");
		
		e6_panel = new JPanel();
		cellE6.add(e6_panel, "e6_panel");
		
		rowF = new JPanel();
		verticalBox.add(rowF);
		rowF.setLayout(null);
		
		cellF0 = new JPanel();
		cellF0.setBounds(0, 0, 76, 83);
		rowF.add(cellF0);
		cellF0.setLayout(new CardLayout(0, 0));
		
		f0 = new JButton("f0");
		f0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				game1.checkUserGuess("f0",player1,f0_panel,sideText);
				
				CardLayout c = (CardLayout)(cellF0 .getLayout());
				c.show(cellF0, "f0_panel");
				
				usrScore.setText(""+player1.getScore());
				usrHealth.setText(""+player1.getCurrentHealth()); 
				checkGameStatus(player1);
			}
		});
		cellF0.add(f0, "f0_btn");
		
		f0_panel = new JPanel();
		cellF0.add(f0_panel, "f0_panel");
		
		cellF1 = new JPanel();
		cellF1.setBounds(76, 0, 76, 83);
		rowF.add(cellF1);
		cellF1.setLayout(new CardLayout(0, 0));
		
		f1 = new JButton("f1");
		f1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				game1.checkUserGuess("f1",player1,f1_panel,sideText);
				
				CardLayout c = (CardLayout)(cellF1 .getLayout());
				c.show(cellF1, "f1_panel");
				
				usrScore.setText(""+player1.getScore());
				usrHealth.setText(""+player1.getCurrentHealth()); 
				checkGameStatus(player1);
			}
		});
		cellF1.add(f1, "f1_btn");
		
		f1_panel = new JPanel();
		cellF1.add(f1_panel, "f1_panel");
		
		cellF2 = new JPanel();
		cellF2.setBounds(152, 0, 76, 83);
		rowF.add(cellF2);
		cellF2.setLayout(new CardLayout(0, 0));
		
		f2 = new JButton("f2");
		f2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				game1.checkUserGuess("f2",player1,f2_panel,sideText);
				
				CardLayout c = (CardLayout)(cellF2 .getLayout());
				c.show(cellF2, "f2_panel");
				
				usrScore.setText(""+player1.getScore());
				usrHealth.setText(""+player1.getCurrentHealth()); 
				checkGameStatus(player1);
			}
		});
		cellF2.add(f2, "f2_btn");
		
		f2_panel = new JPanel();
		cellF2.add(f2_panel, "f2_panel");
		
		cellF3 = new JPanel();
		cellF3.setBounds(228, 0, 76, 83);
		rowF.add(cellF3);
		cellF3.setLayout(new CardLayout(0, 0));
		
		f3 = new JButton("f3");
		f3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				game1.checkUserGuess("f3",player1,f3_panel,sideText);
				
				CardLayout c = (CardLayout)(cellF3 .getLayout());
				c.show(cellF3, "f3_panel");
				
				usrScore.setText(""+player1.getScore());
				usrHealth.setText(""+player1.getCurrentHealth()); 
				checkGameStatus(player1);
			}
		});
		cellF3.add(f3, "f3_btn");
		
		f3_panel = new JPanel();
		cellF3.add(f3_panel, "f3_panel");
		
		cellF4 = new JPanel();
		cellF4.setBounds(304, 0, 76, 83);
		rowF.add(cellF4);
		cellF4.setLayout(new CardLayout(0, 0));
		
		f4 = new JButton("f4");
		f4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				game1.checkUserGuess("f4",player1,f4_panel,sideText);
				
				CardLayout c = (CardLayout)(cellF4 .getLayout());
				c.show(cellF4, "f4_panel");
				
				usrScore.setText(""+player1.getScore());
				usrHealth.setText(""+player1.getCurrentHealth()); 
				checkGameStatus(player1);
			}
		});
		cellF4.add(f4, "f4_btn");
		
		f4_panel = new JPanel();
		cellF4.add(f4_panel, "f4_panel");
		
		cellF5 = new JPanel();
		cellF5.setBounds(380, 0, 76, 83);
		rowF.add(cellF5);
		cellF5.setLayout(new CardLayout(0, 0));
		
		f5 = new JButton("f5");
		f5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				game1.checkUserGuess("f5",player1,f5_panel,sideText);
				
				CardLayout c = (CardLayout)(cellF5 .getLayout());
				c.show(cellF5, "f5_panel");
				
				usrScore.setText(""+player1.getScore());
				usrHealth.setText(""+player1.getCurrentHealth()); 
				checkGameStatus(player1);
			}
		});
		cellF5.add(f5, "f5_btn");
		
		f5_panel = new JPanel();
		cellF5.add(f5_panel, "f5_panel");
		
		cellF6 = new JPanel();
		cellF6.setBounds(456, 0, 76, 83);
		rowF.add(cellF6);
		cellF6.setLayout(new CardLayout(0, 0));
		
		f6 = new JButton("f6");
		f6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				game1.checkUserGuess("f6",player1,f6_panel,sideText);
				
				CardLayout c = (CardLayout)(cellF6 .getLayout());
				c.show(cellF6, "f6_panel");
				
				usrScore.setText(""+player1.getScore());
				usrHealth.setText(""+player1.getCurrentHealth()); 
				checkGameStatus(player1);
			}
		});
		cellF6.add(f6, "f6_btn");
		
		f6_panel = new JPanel();
		cellF6.add(f6_panel, "f6_panel");
		
		rowG = new JPanel();
		verticalBox.add(rowG);
		rowG.setLayout(null);
		
		cellG0 = new JPanel();
		cellG0.setBounds(0, 0, 76, 84);
		rowG.add(cellG0);
		cellG0.setLayout(new CardLayout(0, 0));
		
		g0 = new JButton("g0");
		g0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				game1.checkUserGuess("g0",player1,g0_panel,sideText);
				
				CardLayout c = (CardLayout)(cellG0 .getLayout());
				c.show(cellG0, "g0_panel");
				
				usrScore.setText(""+player1.getScore());
				usrHealth.setText(""+player1.getCurrentHealth()); 
				checkGameStatus(player1);
			}
		});
		cellG0.add(g0, "g0_btn");
		
		g0_panel = new JPanel();
		cellG0.add(g0_panel, "g0_panel");
		
		cellG1 = new JPanel();
		cellG1.setBounds(76, 0, 76, 84);
		rowG.add(cellG1);
		cellG1.setLayout(new CardLayout(0, 0));
		
		g1 = new JButton("g1");
		g1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				game1.checkUserGuess("g1",player1,g1_panel,sideText);
				
				CardLayout c = (CardLayout)(cellG1 .getLayout());
				c.show(cellG1, "g1_panel");
				
				usrScore.setText(""+player1.getScore());
				usrHealth.setText(""+player1.getCurrentHealth()); 
				checkGameStatus(player1);
			}
		});
		cellG1.add(g1, "g1_btn");
		
		g1_panel = new JPanel();
		cellG1.add(g1_panel, "g1_panel");
		
		cellG2 = new JPanel();
		cellG2.setBounds(152, 0, 76, 84);
		rowG.add(cellG2);
		cellG2.setLayout(new CardLayout(0, 0));
		
		g2 = new JButton("g2");
		g2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				game1.checkUserGuess("g2",player1,g2_panel,sideText);
				
				CardLayout c = (CardLayout)(cellG2 .getLayout());
				c.show(cellG2, "g2_panel");
				
				usrScore.setText(""+player1.getScore());
				usrHealth.setText(""+player1.getCurrentHealth()); 
				checkGameStatus(player1);
			}
		});
		cellG2.add(g2, "g2_btn");
		
		g2_panel = new JPanel();
		cellG2.add(g2_panel, "g2_panel");
		
		cellG3 = new JPanel();
		cellG3.setBounds(228, 0, 76, 84);
		rowG.add(cellG3);
		cellG3.setLayout(new CardLayout(0, 0));
		
		g3 = new JButton("g3");
		g3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				game1.checkUserGuess("g3",player1,g3_panel,sideText);
				
				CardLayout c = (CardLayout)(cellG3 .getLayout());
				c.show(cellG3, "g3_panel");
				
				usrScore.setText(""+player1.getScore());
				usrHealth.setText(""+player1.getCurrentHealth()); 
				checkGameStatus(player1);
			}
		});
		cellG3.add(g3, "g3_btn");
		
		g3_panel = new JPanel();
		cellG3.add(g3_panel, "g3_panel");
		
		cellG4 = new JPanel();
		cellG4.setBounds(304, 0, 76, 84);
		rowG.add(cellG4);
		cellG4.setLayout(new CardLayout(0, 0));
		
		g4 = new JButton("g4");
		g4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				game1.checkUserGuess("g4",player1,g4_panel,sideText);
				
				CardLayout c = (CardLayout)(cellG4 .getLayout());
				c.show(cellG4, "g4_panel");
				
				usrScore.setText(""+player1.getScore());
				usrHealth.setText(""+player1.getCurrentHealth()); 
				checkGameStatus(player1);
			}
		});
		cellG4.add(g4, "g4_btn");
		
		g4_panel = new JPanel();
		cellG4.add(g4_panel, "g4_panel");
		
		cellG5 = new JPanel();
		cellG5.setBounds(380, 0, 76, 84);
		rowG.add(cellG5);
		cellG5.setLayout(new CardLayout(0, 0));
		
		g5 = new JButton("g5");
		g5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				game1.checkUserGuess("g5",player1,g5_panel,sideText);
				
				CardLayout c = (CardLayout)(cellG5 .getLayout());
				c.show(cellG5, "g5_panel");
				
				usrScore.setText(""+player1.getScore());
				usrHealth.setText(""+player1.getCurrentHealth()); 
				checkGameStatus(player1);
			}
		});
		cellG5.add(g5, "g5_btn");
		
		g5_panel = new JPanel();
		cellG5.add(g5_panel, "g5_panel");
		
		cellG6 = new JPanel();
		cellG6.setBounds(456, 0, 76, 84);
		rowG.add(cellG6);
		cellG6.setLayout(new CardLayout(0, 0));
		
		g6 = new JButton("g6");
		g6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				game1.checkUserGuess("g6",player1,g6_panel,sideText);
				
				CardLayout c = (CardLayout)(cellG6 .getLayout());
				c.show(cellG6, "g6_panel");
				
				usrScore.setText(""+player1.getScore());
				usrHealth.setText(""+player1.getCurrentHealth()); 
				checkGameStatus(player1);
			}
		});
		cellG6.add(g6, "g6_btn");
		
		g6_panel = new JPanel();
		cellG6.add(g6_panel, "g6_panel");
		
		//the side panel for displaying the text to user as the game goes.
		panelSide = new JPanel();
		panelSide.setBounds(561, 149, 173, 541);
		mainPage.add(panelSide);
		panelSide.setLayout(null);
		//actual text pane that goes inside panelSide
		sideText = new JTextPane();
		sideText.setEditable(false);
		sideText.setFont(new Font("HELVETICA", Font.PLAIN, 12));
		sideText.setBounds(0, 0, 173, 541);
		panelSide.add(sideText);
		
		gameOver = new JPanel();
		gameOver.setForeground(Color.RED);
		gameOver.setBackground(Color.BLACK);
		cardStack.add(gameOver, "gameOver");
		gameOver.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("GAME OVER");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("HELVETICA", Font.BOLD, 85));
		lblNewLabel.setEnabled(true);
		lblNewLabel.setBounds(55, 84, 626, 212);
		gameOver.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Gotta watch out for those mines.");
		lblNewLabel_1.setFont(new Font("HELVETICA", Font.PLAIN, 25));
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(174, 307, 396, 66);
		gameOver.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("TRY AGAIN");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout c = (CardLayout)(cardStack .getLayout());
				c.show(cardStack, "instruction");
				
				//reset the A row buttons
				CardLayout a0 = (CardLayout)(cellA0 .getLayout());
				a0.show(cellA0, "a0_btn");
				CardLayout a1 = (CardLayout)(cellA1 .getLayout());
				a1.show(cellA1, "a1_btn");
				CardLayout a2 = (CardLayout)(cellA2 .getLayout());
				a2.show(cellA2, "a2_btn");
				CardLayout a3 = (CardLayout)(cellA3 .getLayout());
				a3.show(cellA3, "a3_btn");
				CardLayout a4 = (CardLayout)(cellA4 .getLayout());
				a4.show(cellA4, "a4_btn");
				CardLayout a5 = (CardLayout)(cellA5 .getLayout());
				a5.show(cellA5, "a5_btn");
				CardLayout a6 = (CardLayout)(cellA6 .getLayout());
				a6.show(cellA6, "a6_btn");
				
				//reset the B row buttons
				CardLayout b0 = (CardLayout)(cellB0 .getLayout());
				b0.show(cellB0, "b0_btn");
				CardLayout b1 = (CardLayout)(cellB1 .getLayout());
				b1.show(cellB1, "b1_btn");
				CardLayout b2 = (CardLayout)(cellB2 .getLayout());
				b2.show(cellB2, "b2_btn");
				CardLayout b3 = (CardLayout)(cellB3 .getLayout());
				b3.show(cellB3, "b3_btn");
				CardLayout b4 = (CardLayout)(cellB4 .getLayout());
				b4.show(cellB4, "b4_btn");
				CardLayout b5 = (CardLayout)(cellB5 .getLayout());
				b5.show(cellB5, "b5_btn");
				CardLayout b6 = (CardLayout)(cellB6 .getLayout());
				b6.show(cellB6, "b6_btn");
				
				//reset the C row buttons
				CardLayout c0 = (CardLayout)(cellC0 .getLayout());
				c0.show(cellC0, "c0_btn");
				CardLayout c1 = (CardLayout)(cellC1 .getLayout());
				c1.show(cellC1, "c1_btn");
				CardLayout c2 = (CardLayout)(cellC2 .getLayout());
				c2.show(cellC2, "c2_btn");
				CardLayout c3 = (CardLayout)(cellC3 .getLayout());
				c3.show(cellC3, "c3_btn");
				CardLayout c4 = (CardLayout)(cellC4 .getLayout());
				c4.show(cellC4, "c4_btn");
				CardLayout c5 = (CardLayout)(cellC5 .getLayout());
				c5.show(cellC5, "c5_btn");
				CardLayout c6 = (CardLayout)(cellC6 .getLayout());
				c6.show(cellC6, "c6_btn");
				
				//reset the D row buttons
				CardLayout d0 = (CardLayout)(cellD0 .getLayout());
				d0.show(cellD0, "d0_btn");
				CardLayout d1 = (CardLayout)(cellD1 .getLayout());
				d1.show(cellD1, "d1_btn");
				CardLayout d2 = (CardLayout)(cellD2 .getLayout());
				d2.show(cellD2, "d2_btn");
				CardLayout d3 = (CardLayout)(cellD3 .getLayout());
				d3.show(cellD3, "d3_btn");
				CardLayout d4 = (CardLayout)(cellD4 .getLayout());
				d4.show(cellD4, "d4_btn");
				CardLayout d5 = (CardLayout)(cellD5 .getLayout());
				d5.show(cellD5, "d5_btn");
				CardLayout d6 = (CardLayout)(cellD6 .getLayout());
				d6.show(cellD6, "d6_btn");
				
				//reset the E row buttons
				CardLayout e0 = (CardLayout)(cellE0 .getLayout());
				e0.show(cellE0, "e0_btn");
				CardLayout e1 = (CardLayout)(cellE1 .getLayout());
				e1.show(cellE1, "e1_btn");
				CardLayout e2 = (CardLayout)(cellE2 .getLayout());
				e2.show(cellE2, "e2_btn");
				CardLayout e3 = (CardLayout)(cellE3 .getLayout());
				e3.show(cellE3, "e3_btn");
				CardLayout e4 = (CardLayout)(cellE4 .getLayout());
				e4.show(cellE4, "e4_btn");
				CardLayout e5 = (CardLayout)(cellE5 .getLayout());
				e5.show(cellE5, "e5_btn");
				CardLayout e6 = (CardLayout)(cellE6 .getLayout());
				e6.show(cellE6, "e6_btn");
				
				//reset the F row buttons
				CardLayout f0 = (CardLayout)(cellF0 .getLayout());
				f0.show(cellF0, "f0_btn");
				CardLayout f1 = (CardLayout)(cellF1 .getLayout());
				f1.show(cellF1, "f1_btn");
				CardLayout f2 = (CardLayout)(cellF2 .getLayout());
				f2.show(cellF2, "f2_btn");
				CardLayout f3 = (CardLayout)(cellF3 .getLayout());
				f3.show(cellF3, "f3_btn");
				CardLayout f4 = (CardLayout)(cellF4 .getLayout());
				f4.show(cellF4, "f4_btn");
				CardLayout f5 = (CardLayout)(cellF5 .getLayout());
				f5.show(cellF5, "f5_btn");
				CardLayout f6 = (CardLayout)(cellF6 .getLayout());
				f6.show(cellF6, "f6_btn");
				
				//reset the G row buttons
				CardLayout g0 = (CardLayout)(cellG0 .getLayout());
				g0.show(cellG0, "g0_btn");
				CardLayout g1 = (CardLayout)(cellG1 .getLayout());
				g1.show(cellG1, "g1_btn");
				CardLayout g2 = (CardLayout)(cellG2 .getLayout());
				g2.show(cellG2, "g2_btn");
				CardLayout g3 = (CardLayout)(cellG3 .getLayout());
				g3.show(cellG3, "g3_btn");
				CardLayout g4 = (CardLayout)(cellG4 .getLayout());
				g4.show(cellG4, "g4_btn");
				CardLayout g5 = (CardLayout)(cellG5 .getLayout());
				g5.show(cellG5, "g5_btn");
				CardLayout g6 = (CardLayout)(cellG6 .getLayout());
				g6.show(cellG6, "g6_btn");
				
				
				
			}
		});
		btnNewButton.setFont(new Font("HELVETICA", Font.BOLD, 24));
		btnNewButton.setBounds(259, 431, 199, 101);
		gameOver.add(btnNewButton);
		
		gameWin = new JPanel();
		gameWin.setBackground(Color.BLACK);
		cardStack.add(gameWin, "gameWin");
		gameWin.setLayout(null);
		
		lblNewLabel_2 = new JLabel("Congratulation! You've won! Yay :D");
		lblNewLabel_2.setFont(new Font("HELVETICA", Font.PLAIN, 39));
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBounds(40, 41, 661, 152);
		gameWin.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("It took you");
		lblNewLabel_3.setFont(new Font("HELVETICA", Font.PLAIN, 20));
		lblNewLabel_3.setForeground(Color.YELLOW);
		lblNewLabel_3.setBounds(50, 204, 113, 61);
		gameWin.add(lblNewLabel_3);
		
		numG = new JLabel("00");
		numG.setFont(new Font("HELVETICA", Font.PLAIN, 23));
		numG.setForeground(Color.RED);
		numG.setBounds(173, 204, 62, 61);
		gameWin.add(numG);
		
		lblNewLabel_5 = new JLabel("Guesses.");
		lblNewLabel_5.setForeground(Color.YELLOW);
		lblNewLabel_5.setFont(new Font("HELVETICA", Font.PLAIN, 19));
		lblNewLabel_5.setBounds(245, 204, 153, 61);
		gameWin.add(lblNewLabel_5);
		
		btnNewButton_1 = new JButton("PLAY AGAIN !!");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				CardLayout c = (CardLayout)(cardStack .getLayout());
				c.show(cardStack, "mainPanel");//TODO
				
				//reset the A row buttons
				CardLayout a0 = (CardLayout)(cellA0 .getLayout());
				a0.show(cellA0, "a0_btn");
				CardLayout a1 = (CardLayout)(cellA1 .getLayout());
				a1.show(cellA1, "a1_btn");
				CardLayout a2 = (CardLayout)(cellA2 .getLayout());
				a2.show(cellA2, "a2_btn");
				CardLayout a3 = (CardLayout)(cellA3 .getLayout());
				a3.show(cellA3, "a3_btn");
				CardLayout a4 = (CardLayout)(cellA4 .getLayout());
				a4.show(cellA4, "a4_btn");
				CardLayout a5 = (CardLayout)(cellA5 .getLayout());
				a5.show(cellA5, "a5_btn");
				CardLayout a6 = (CardLayout)(cellA6 .getLayout());
				a6.show(cellA6, "a6_btn");
				
				//reset the B row buttons
				CardLayout b0 = (CardLayout)(cellB0 .getLayout());
				b0.show(cellB0, "b0_btn");
				CardLayout b1 = (CardLayout)(cellB1 .getLayout());
				b1.show(cellB1, "b1_btn");
				CardLayout b2 = (CardLayout)(cellB2 .getLayout());
				b2.show(cellB2, "b2_btn");
				CardLayout b3 = (CardLayout)(cellB3 .getLayout());
				b3.show(cellB3, "b3_btn");
				CardLayout b4 = (CardLayout)(cellB4 .getLayout());
				b4.show(cellB4, "b4_btn");
				CardLayout b5 = (CardLayout)(cellB5 .getLayout());
				b5.show(cellB5, "b5_btn");
				CardLayout b6 = (CardLayout)(cellB6 .getLayout());
				b6.show(cellB6, "b6_btn");
				
				//reset the C row buttons
				CardLayout c0 = (CardLayout)(cellC0 .getLayout());
				c0.show(cellC0, "c0_btn");
				CardLayout c1 = (CardLayout)(cellC1 .getLayout());
				c1.show(cellC1, "c1_btn");
				CardLayout c2 = (CardLayout)(cellC2 .getLayout());
				c2.show(cellC2, "c2_btn");
				CardLayout c3 = (CardLayout)(cellC3 .getLayout());
				c3.show(cellC3, "c3_btn");
				CardLayout c4 = (CardLayout)(cellC4 .getLayout());
				c4.show(cellC4, "c4_btn");
				CardLayout c5 = (CardLayout)(cellC5 .getLayout());
				c5.show(cellC5, "c5_btn");
				CardLayout c6 = (CardLayout)(cellC6 .getLayout());
				c6.show(cellC6, "c6_btn");
				
				//reset the D row buttons
				CardLayout d0 = (CardLayout)(cellD0 .getLayout());
				d0.show(cellD0, "d0_btn");
				CardLayout d1 = (CardLayout)(cellD1 .getLayout());
				d1.show(cellD1, "d1_btn");
				CardLayout d2 = (CardLayout)(cellD2 .getLayout());
				d2.show(cellD2, "d2_btn");
				CardLayout d3 = (CardLayout)(cellD3 .getLayout());
				d3.show(cellD3, "d3_btn");
				CardLayout d4 = (CardLayout)(cellD4 .getLayout());
				d4.show(cellD4, "d4_btn");
				CardLayout d5 = (CardLayout)(cellD5 .getLayout());
				d5.show(cellD5, "d5_btn");
				CardLayout d6 = (CardLayout)(cellD6 .getLayout());
				d6.show(cellD6, "d6_btn");
				
				//reset the E row buttons
				CardLayout e0 = (CardLayout)(cellE0 .getLayout());
				e0.show(cellE0, "e0_btn");
				CardLayout e1 = (CardLayout)(cellE1 .getLayout());
				e1.show(cellE1, "e1_btn");
				CardLayout e2 = (CardLayout)(cellE2 .getLayout());
				e2.show(cellE2, "e2_btn");
				CardLayout e3 = (CardLayout)(cellE3 .getLayout());
				e3.show(cellE3, "e3_btn");
				CardLayout e4 = (CardLayout)(cellE4 .getLayout());
				e4.show(cellE4, "e4_btn");
				CardLayout e5 = (CardLayout)(cellE5 .getLayout());
				e5.show(cellE5, "e5_btn");
				CardLayout e6 = (CardLayout)(cellE6 .getLayout());
				e6.show(cellE6, "e6_btn");
				
				//reset the F row buttons
				CardLayout f0 = (CardLayout)(cellF0 .getLayout());
				f0.show(cellF0, "f0_btn");
				CardLayout f1 = (CardLayout)(cellF1 .getLayout());
				f1.show(cellF1, "f1_btn");
				CardLayout f2 = (CardLayout)(cellF2 .getLayout());
				f2.show(cellF2, "f2_btn");
				CardLayout f3 = (CardLayout)(cellF3 .getLayout());
				f3.show(cellF3, "f3_btn");
				CardLayout f4 = (CardLayout)(cellF4 .getLayout());
				f4.show(cellF4, "f4_btn");
				CardLayout f5 = (CardLayout)(cellF5 .getLayout());
				f5.show(cellF5, "f5_btn");
				CardLayout f6 = (CardLayout)(cellF6 .getLayout());
				f6.show(cellF6, "f6_btn");
				
				//reset the G row buttons
				CardLayout g0 = (CardLayout)(cellG0 .getLayout());
				g0.show(cellG0, "g0_btn");
				CardLayout g1 = (CardLayout)(cellG1 .getLayout());
				g1.show(cellG1, "g1_btn");
				CardLayout g2 = (CardLayout)(cellG2 .getLayout());
				g2.show(cellG2, "g2_btn");
				CardLayout g3 = (CardLayout)(cellG3 .getLayout());
				g3.show(cellG3, "g3_btn");
				CardLayout g4 = (CardLayout)(cellG4 .getLayout());
				g4.show(cellG4, "g4_btn");
				CardLayout g5 = (CardLayout)(cellG5 .getLayout());
				g5.show(cellG5, "g5_btn");
				CardLayout g6 = (CardLayout)(cellG6 .getLayout());
				g6.show(cellG6, "g6_btn");
				
			}
		});
		btnNewButton_1.setFont(new Font("HELVETICA", Font.PLAIN, 28));
		btnNewButton_1.setBounds(245, 388, 234, 152);
		gameWin.add(btnNewButton_1);
		
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI frame = new GUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public void checkGameStatus(Player player){
		if(player.getCurrentHealth() <= 0){
			CardLayout c = (CardLayout)(cardStack .getLayout());
			c.show(cardStack, "gameOver");
		}
		if(player.getScore() >= 1000){
			numG.setText(""+game1.getNumGuess());
			CardLayout g = (CardLayout)(cardStack .getLayout());
			g.show(cardStack, "gameWin");
			
		}
	}
}
