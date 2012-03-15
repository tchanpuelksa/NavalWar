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
	private Box verticalBox;
	private JPanel rowA;
	private JPanel rowB;
	private JPanel rowC;
	private JPanel rowD;
	private JPanel rowE;
	private JPanel rowF;
	private JPanel rowG;

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
				game1.finishGame();
				//System.exit(0);
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
		Naval_War.setFont(new Font("AR BLANCA", Font.BOLD, 120));
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
		btnStart.setFont(new Font("AR JULIAN", Font.PLAIN, 18));
		btnStart.setBounds(275, 325, 193, 67);
		titlePanel.add(btnStart);
		
		//the enterName panel which will ask the user to input in a name
		enterName = new JPanel();
		cardStack.add(enterName, "enterName");
		enterName.setLayout(null);
		
		JLabel nameAsk = new JLabel("Before we continue, please state your name...");
		nameAsk.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
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
		btnToMain.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
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
		instru1.setFont(new Font("Comic Sans MS", Font.BOLD, 13));
		instru1.setBounds(10, 11, 44, 43);
		instructionBox.add(instru1);
		
		instruN = new JLabel("");
		instruN.setFont(new Font("Comic Sans MS", Font.BOLD, 13));
		instruN.setBounds(52, 11, 610, 43);
		instructionBox.add(instruN);
		
		JLabel instru2 = new JLabel("The goal of this game is to be able to reach a score of 1000. However, getting there won't be");
		instru2.setFont(new Font("Comic Sans MS", Font.BOLD, 13));
		instru2.setBounds(10, 65, 652, 43);
		instructionBox.add(instru2);
		
		JLabel instru3 = new JLabel("an easy task. In order to earn points, you will select one cell of the grid each time. This cell");
		instru3.setFont(new Font("Comic Sans MS", Font.BOLD, 13));
		instru3.setBounds(10, 119, 652, 43);
		instructionBox.add(instru3);
		
		JLabel instru4 = new JLabel("can either be a ship, which will earn you points, or a bomb which will inflict damages, or just");
		instru4.setFont(new Font("Comic Sans MS", Font.BOLD, 13));
		instru4.setBounds(10, 173, 652, 43);
		instructionBox.add(instru4);
		
		instru5 = new JLabel("a plain and empty cell. Alright, let's see what you can do...");
		instru5.setFont(new Font("Comic Sans MS", Font.BOLD, 13));
		instru5.setBounds(10, 227, 652, 43);
		instructionBox.add(instru5);
		
		//the button in the instruction page that will bring us to the main game page
		//Action listener with this button which will create the game
		btnToMainPage = new JButton("Lets Play !!");
		btnToMainPage.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				
				game1 = new NavalWarGUI();
				Player player1 = new Player(userName);
				game1.setUpGame();
				
				CardLayout c3 = (CardLayout)(cardStack.getLayout());
				c3.show(cardStack, "mainPage");
				usrName.setText(player1.getName());
				usrHealth.setText(Integer.toString(player1.getCurrentHealth()));
				usrScore.setText(Integer.toString(player1.getScore()));
				
				game1.startPlaying(player1, sideText);
			}
		});
		btnToMainPage.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
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
		lblName.setFont(new Font("Comic Sans MS", Font.BOLD, 13));
		lblName.setBounds(10, 11, 50, 24);
		panelProfile.add(lblName);
		
		usrName = new JLabel("");
		usrName.setFont(new Font("Comic Sans MS", Font.BOLD, 13));
		usrName.setBounds(70, 11, 644, 24);
		panelProfile.add(usrName);
		
		lblHealth = new JLabel("Health:");
		lblHealth.setFont(new Font("Comic Sans MS", Font.BOLD, 13));
		lblHealth.setBounds(10, 77, 50, 24);
		panelProfile.add(lblHealth);
		
		usrHealth = new JLabel("");
		usrHealth.setFont(new Font("Comic Sans MS", Font.BOLD, 13));
		usrHealth.setBounds(70, 77, 137, 24);
		panelProfile.add(usrHealth);
		
		lblScore = new JLabel("Scores:");
		lblScore.setFont(new Font("Comic Sans MS", Font.BOLD, 13));
		lblScore.setBounds(552, 77, 50, 24);
		panelProfile.add(lblScore);
		
		usrScore = new JLabel("");
		usrScore.setFont(new Font("Comic Sans MS", Font.BOLD, 13));
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
		
		rowA = new JPanel();
		verticalBox.add(rowA);
		
		rowB = new JPanel();
		verticalBox.add(rowB);
		
		rowC = new JPanel();
		verticalBox.add(rowC);
		
		rowD = new JPanel();
		verticalBox.add(rowD);
		
		rowE = new JPanel();
		verticalBox.add(rowE);
		
		rowF = new JPanel();
		verticalBox.add(rowF);
		
		rowG = new JPanel();
		verticalBox.add(rowG);
		
		//the side panel for displaying the text to user as the game goes.
		panelSide = new JPanel();
		panelSide.setBounds(561, 149, 173, 541);
		mainPage.add(panelSide);
		panelSide.setLayout(null);
		//actual text pane that goes inside panelSide
		sideText = new JTextPane();
		sideText.setEditable(false);
		sideText.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		sideText.setBounds(0, 0, 173, 541);
		panelSide.add(sideText);
		
		
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
}
