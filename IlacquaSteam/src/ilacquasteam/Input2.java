/*Alexander Ilacqua - 3/16/2021
This frame receives the users input for a 2 variable system
 */
package ilacquasteam;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Input2 extends JFrame implements ActionListener
{
    // declaring example image
    public final URL EXAMPLE_PATH = getClass().getResource("2var.png");
    private final ImageIcon EXAMPLE_IMAGE = new ImageIcon(new ImageIcon
                    (EXAMPLE_PATH).getImage().getScaledInstance
                    (422,197,Image.SCALE_DEFAULT));
    // declaring colors used in the frame
    public static final Color PANEL_COLOR = new Color(255,105,97);
    public static final Color FRAME_COLOR = new Color(202,231,193);
    // declaring fonts used in the frame
    public static final Font INSTRUCTION_FONT = new Font("Kefa", Font.BOLD, 26);
    public static final Font EQUATION_FONT = new Font("Lucida Grande", Font.PLAIN, 14);
    // declaring JLabels
    private JLabel x1Label;
    private JLabel y1Label;
    private JLabel plusLabel;
    private JLabel equalsLabel;
    private JLabel x2Label;
    private JLabel y2Label;
    private JLabel plus2Label;
    private JLabel equals2Label;
    private JLabel imageLabel;
    private JLabel instructionLabel;
    private JLabel roundLabel;
    // declaring text fields
    private JTextField x1Field;
    private JTextField x2Field;
    private JTextField y1Field;
    private JTextField y2Field;
    private JTextField s1Field;
    private JTextField s2Field;
    // declaring JPanels
    private JPanel inputPanel;
    private JPanel buttonPanel;
    private JPanel centerPanel;
    // declaring buttons
    private JButton solveButton;
    private JButton homeButton;
    private JButton exitButton;
    private JButton clearButton;
    // declaring menu bar, menu, and help item
    private JMenuBar mainBar;
    private JMenu mainMenu;
    private JMenuItem helpItem;
    // declaring radio buttons and button group
    private JRadioButton oneDecButton;
    private JRadioButton twoDecButton;
    private JRadioButton threeDecButton;
    private ButtonGroup decimalGroup;
    
    // declaring Input2 constructor
    public Input2()
    {
        // initializing the frame with size, color, layout, and close op
        super("Input");
        this.setBounds(150, 150, 1000, 700);
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        this.getContentPane().setBackground(FRAME_COLOR);
        this.setLayout(new BorderLayout());
        
        // constructing the input fields
        this.x1Field = new JTextField(3);
        this.x2Field = new JTextField(3);
        this.y1Field = new JTextField(3);
        this.y2Field = new JTextField(3);
        this.s1Field = new JTextField(3);
        this.s2Field = new JTextField(3);
        
        // constructing JLabels and setting their font
        this.x1Label = new JLabel("x");
        x1Label.setFont(EQUATION_FONT);
        this.y1Label = new JLabel("y");
        y1Label.setFont(EQUATION_FONT);
        this.plusLabel = new JLabel("+");
        plusLabel.setFont(EQUATION_FONT);
        this.equalsLabel = new JLabel("=");
        equalsLabel.setFont(EQUATION_FONT);
        this.x2Label = new JLabel("x");
        x2Label.setFont(EQUATION_FONT);
        this.y2Label = new JLabel("y");
        y2Label.setFont(EQUATION_FONT);
        this.plus2Label = new JLabel("+");
        plus2Label.setFont(EQUATION_FONT);
        this.equals2Label = new JLabel("=");
        equals2Label.setFont(EQUATION_FONT);
        this.imageLabel = new JLabel(EXAMPLE_IMAGE);
        this.instructionLabel = new JLabel("Please enter the coefficients of your" 
                                           + "equations in the text fields as shown below.");
        instructionLabel.setFont(INSTRUCTION_FONT);
        this.roundLabel = new JLabel("Please select your desired output decimal accuracy:");
        roundLabel.setFont(Welcome.LABEL_FONT);
        
        //constructing JButtons and adding ActionListener to them
        this.solveButton = new JButton("Solve");
        solveButton.addActionListener(this);
        this.homeButton = new JButton("Home");
        homeButton.addActionListener(this);
        this.exitButton = new JButton("Exit");
        exitButton.addActionListener(this);
        this.clearButton = new JButton("Clear Entries");
        clearButton.addActionListener(this);
        
        //constructing radiobuttons and adding action listener to them
        this.oneDecButton = new JRadioButton("1");
        oneDecButton.setFont(Welcome.LABEL_FONT);
        oneDecButton.addActionListener(this);
        // automatically selecting the one decimal button upon start
        oneDecButton.setSelected(true);
        this.twoDecButton = new JRadioButton("2");
        twoDecButton.setFont(Welcome.LABEL_FONT);
        twoDecButton.addActionListener(this);
        this.threeDecButton = new JRadioButton("3");
        threeDecButton.setFont(Welcome.LABEL_FONT);
        threeDecButton.addActionListener(this);
        
        // adding radio buttons to button group and constructing button group
        this.decimalGroup = new ButtonGroup();
        decimalGroup.add(oneDecButton);
        decimalGroup.add(twoDecButton);
        decimalGroup.add(threeDecButton);
        
        // constructing the inputPanel
        this.inputPanel = new JPanel(new GridLayout(2,7));
        // setting the color of the inputPanel
        inputPanel.setBackground(PANEL_COLOR);
        // add items to the inputPanel
        inputPanel.add(x1Field);
        inputPanel.add(x1Label);
        inputPanel.add(plusLabel);
        inputPanel.add(y1Field);
        inputPanel.add(y1Label);
        inputPanel.add(equalsLabel);
        inputPanel.add(s1Field);
        inputPanel.add(x2Field);
        inputPanel.add(x2Label);
        inputPanel.add(plus2Label);
        inputPanel.add(y2Field);
        inputPanel.add(y2Label);
        inputPanel.add(equals2Label);
        inputPanel.add(s2Field);
        
        // constructing the centerPanel and adding the imageLabel and instructionLabel
        this.centerPanel = new JPanel(new FlowLayout());
        // setting the color of the inputPanel
        centerPanel.setBackground(FRAME_COLOR);
        centerPanel.add(instructionLabel);
        centerPanel.add(imageLabel);
        
        // constructing the buttonPanel and adding buttons to it
        this.buttonPanel = new JPanel(new FlowLayout());
        //setting the color of the buttonPanel
        buttonPanel.setBackground(PANEL_COLOR);
        buttonPanel.add(roundLabel);
        buttonPanel.add(oneDecButton);
        buttonPanel.add(twoDecButton);
        buttonPanel.add(threeDecButton);
        buttonPanel.add(solveButton);
        buttonPanel.add(clearButton);
        buttonPanel.add(homeButton);
        buttonPanel.add(exitButton);
        
        // constructing the menuBar, main menu, and helpItem
        this.mainBar = new JMenuBar();
        this.mainMenu = new JMenu("Menu");
        this.helpItem = new JMenuItem("Help");
        // adding ActionListener to the helpItem
        helpItem.addActionListener(this);
        // adding items to menu and menu to menubar
        mainMenu.add(helpItem);
        mainBar.add(mainMenu);
        
        //adding components to the frame
        this.add(buttonPanel, BorderLayout.SOUTH);
        this.add(centerPanel, BorderLayout.CENTER);
        this.add(inputPanel, BorderLayout.NORTH);
        
        // setting the menu bar
        this.setJMenuBar(mainBar);
        // setting the frame to be visible
        this.setVisible(true);
    }
    // main method to test the frame Input2
    public static void main(String[] args)
    {
        new Input2();
    }

    // actionPerformed allows us to receive the users actions
    @Override
    public void actionPerformed(ActionEvent e)
    {
        // gets the source of the action and stores it in variable comand
        Object command = e.getSource();
        // declaring variables for computation and answerString
        double[] varMatrix = new double[4];
        double[] solMatrix = new double[2];
        double varX;
        double varY;
        int roundPlace = 1;
        String answerString;
        if (command == solveButton)
        {
            // tries to solve the problem if solveButton is pressed
            try
            {
                // gets the text from the textfields and stores them as doubles
                varMatrix[0] = Double.parseDouble(x1Field.getText());
                varMatrix[1] = Double.parseDouble(y1Field.getText());
                varMatrix[2] = Double.parseDouble(x2Field.getText());
                varMatrix[3] = Double.parseDouble(y2Field.getText());
                solMatrix[0] = Double.parseDouble(s1Field.getText());
                solMatrix[1] = Double.parseDouble(s2Field.getText());
                // sets all field's text to blank
                x1Field.setText("");
                y1Field.setText("");
                s1Field.setText("");
                x2Field.setText("");
                y2Field.setText("");
                s2Field.setText("");
                // assings 10,100,or 1000 to roundPlace depending on selected decimal preference
                if (oneDecButton.isSelected())
                {
                    roundPlace = 10;
                }
                else if (twoDecButton.isSelected())
                {
                    roundPlace = 100;
                }
                else if (threeDecButton.isSelected())
                {
                    roundPlace = 1000;
                }
                // passes the varMatrix, solMatrix, and roundPlace to CramersRule2 to solve
                CramersRule2 cramersObj = new CramersRule2(varMatrix, solMatrix, roundPlace);
                // receives the calculated x and y from CramersRule2
                varX = cramersObj.getVarX();
                varY = cramersObj.getVarY();
                // stores the equations and answers in an answerString
                answerString = ("<html> <center> " + varMatrix[0] + "x+" + varMatrix[1] 
                                + "y=" + solMatrix[0] + "<br>" + varMatrix[2] + 
                                "x+" + varMatrix[3] + "y=" + solMatrix[1] + 
                                "<br> X= " + varX + ", Y=" + varY + "</center> </html>");
                // creates new output with answerString
                new Output(answerString);
            }
            // catches when user does not input a number and produces a warning
            catch (NumberFormatException nfe)
            {
                new Warning("<html><center>Please make sure all fields<br> contain"
                            + "numbers.</center></html>");
            }
            // catches when the determinant of D is 0 to display infinite or no solns
            catch (ArithmeticException ae)
            {
                new Output("<html><center>Infinitely many or no solutions.<br>Cramer's" 
                           + "Rule is not able to differentiate.</center></html>");
            }
        }
        // if the exit button is pressed the program is exited
        else if (command == exitButton)
        {
            System.exit(0);
        }
        // if the home button is pressed the frame is disposed and welcome is opened
        else if (command == homeButton)
        {
            this.dispose();
            new Welcome();
        }
        // opens the help frame if help is pressed in the menu
        else if (command == helpItem)
        {
            new Help("<html><center>This is the input frame. Please input the" + 
                     "coefficients of your systems in the text fields below.<br>" + 
                     "Ensure that all entries are numbers (either decimals or" + 
                     "integers). Then select the desired<br>accuracy of your output" + 
                     "by the amount of decimal places you desire and press solve." + 
                     "</html></center>");
        }
        // clears all entries if clear is pressed
        else if (command == clearButton)
        {
           x1Field.setText("");
           y1Field.setText("");
           s1Field.setText("");
           x2Field.setText("");
           y2Field.setText("");
           s2Field.setText(""); 
        }
        // validates and repaints the frame
        this.validate();
        this.repaint();
    }
}