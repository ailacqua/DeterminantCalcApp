/*Alexander Ilacqua - 3/16/2021
This frame receives input for a 4 variable systems of equations
 */
package ilacquasteam;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
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

public class Input4 extends JFrame implements ActionListener
{
    // declaring image
    public final URL EXAMPLE_PATH = getClass().getResource("4var.jpg");
    private final ImageIcon EXAMPLE_IMAGE = new ImageIcon(new ImageIcon
                    (EXAMPLE_PATH).getImage().getScaledInstance
                    (563,232,Image.SCALE_DEFAULT));
    // declaring JLabels
    private JLabel x1Label;
    private JLabel y1Label;
    private JLabel z1Label;
    private JLabel w1Label;
    private JLabel x2Label;
    private JLabel y2Label;
    private JLabel z2Label;
    private JLabel w2Label;
    private JLabel x3Label;
    private JLabel y3Label;
    private JLabel z3Label;
    private JLabel w3Label;
    private JLabel x4Label;
    private JLabel y4Label;
    private JLabel z4Label;
    private JLabel w4Label;
    private JLabel plus1Label;
    private JLabel plus2Label;
    private JLabel plus3Label;
    private JLabel equals1Label;
    private JLabel plus4Label;
    private JLabel plus5Label;
    private JLabel plus6Label;
    private JLabel equals2Label;
    private JLabel plus7Label;
    private JLabel plus8Label;
    private JLabel plus9Label;
    private JLabel equals3Label;
    private JLabel plus10Label;
    private JLabel plus11Label;
    private JLabel plus12Label;
    private JLabel equals4Label;
    private JLabel imageLabel;
    private JLabel instructionLabel;
    private JLabel roundLabel;
    // declaring TextFields
    private JTextField x1Field;
    private JTextField x2Field;
    private JTextField x3Field;
    private JTextField x4Field;
    private JTextField y1Field;
    private JTextField y2Field;
    private JTextField y3Field;
    private JTextField y4Field;
    private JTextField z1Field;
    private JTextField z2Field;
    private JTextField z3Field;
    private JTextField z4Field;
    private JTextField w1Field;
    private JTextField w2Field;
    private JTextField w3Field;
    private JTextField w4Field;
    private JTextField s1Field;
    private JTextField s2Field;
    private JTextField s3Field;
    private JTextField s4Field;
    // declaring JPanels
    private JPanel inputPanel;
    private JPanel buttonPanel;
    private JPanel centerPanel;
    // declaring JButtons
    private JButton solveButton;
    private JButton homeButton;
    private JButton exitButton;
    private JButton clearButton;
    // declaring JRadioButtons
    private JRadioButton oneDecButton;
    private JRadioButton twoDecButton;
    private JRadioButton threeDecButton;
    // declaring button group
    private ButtonGroup decimalGroup;
    // declaring all components for menu
    private JMenuBar mainBar;
    private JMenu mainMenu;
    private JMenuItem helpItem;
     
    public Input4()
    {
        // initializing the frame
        super("Input");
        this.setBounds(150, 150, 1000, 700);
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        this.getContentPane().setBackground(Input2.FRAME_COLOR);
        this.setLayout(new BorderLayout());
        
        // constructing the input fields
        this.x1Field = new JTextField(3);
        this.x2Field = new JTextField(3);
        this.x3Field = new JTextField(3);
        this.x4Field = new JTextField(3);
        this.y1Field = new JTextField(3);
        this.y2Field = new JTextField(3);
        this.y3Field = new JTextField(3);
        this.y4Field = new JTextField(3);
        this.z1Field = new JTextField(3);
        this.z2Field = new JTextField(3);
        this.z3Field = new JTextField(3);
        this.z4Field = new JTextField(3);
        this.w1Field = new JTextField(3);
        this.w2Field = new JTextField(3);
        this.w3Field = new JTextField(3);
        this.w4Field = new JTextField(3);
        this.s1Field = new JTextField(3);
        this.s2Field = new JTextField(3);
        this.s3Field = new JTextField(3);
        this.s4Field = new JTextField(3);
        
        // constructing JLabels and setting their font
        this.x1Label = new JLabel("x");
        x1Label.setFont(Input2.EQUATION_FONT);
        this.y1Label = new JLabel("y");
        y1Label.setFont(Input2.EQUATION_FONT);
        this.z1Label = new JLabel("z");
        z1Label.setFont(Input2.EQUATION_FONT);
        this.w1Label = new JLabel("w");
        w1Label.setFont(Input2.EQUATION_FONT);
        this.x2Label = new JLabel("x");
        x2Label.setFont(Input2.EQUATION_FONT);
        this.y2Label = new JLabel("y");
        y2Label.setFont(Input2.EQUATION_FONT);
        this.z2Label = new JLabel("z");
        z2Label.setFont(Input2.EQUATION_FONT);
        this.w2Label = new JLabel("w");
        w2Label.setFont(Input2.EQUATION_FONT);
        this.x3Label = new JLabel("x");
        x3Label.setFont(Input2.EQUATION_FONT);
        this.y3Label = new JLabel("y");
        y3Label.setFont(Input2.EQUATION_FONT);
        this.z3Label = new JLabel("z");
        z3Label.setFont(Input2.EQUATION_FONT);
        this.w3Label = new JLabel("w");
        w3Label.setFont(Input2.EQUATION_FONT);
        this.x4Label = new JLabel("x");
        x4Label.setFont(Input2.EQUATION_FONT);
        this.y4Label = new JLabel("y");
        y4Label.setFont(Input2.EQUATION_FONT);
        this.z4Label = new JLabel("z");
        z4Label.setFont(Input2.EQUATION_FONT);
        this.w4Label = new JLabel("w");
        w4Label.setFont(Input2.EQUATION_FONT);
        this.plus1Label = new JLabel("+");
        plus1Label.setFont(Input2.EQUATION_FONT);
        this.plus2Label = new JLabel("+");
        plus2Label.setFont(Input2.EQUATION_FONT);
        this.plus3Label = new JLabel("+");
        plus3Label.setFont(Input2.EQUATION_FONT);
        this.equals1Label = new JLabel("=");
        equals1Label.setFont(Input2.EQUATION_FONT);
        this.plus4Label = new JLabel("+");
        plus4Label.setFont(Input2.EQUATION_FONT);
        this.plus5Label = new JLabel("+");
        plus5Label.setFont(Input2.EQUATION_FONT);
        this.plus6Label = new JLabel("+");
        plus6Label.setFont(Input2.EQUATION_FONT);
        this.equals2Label = new JLabel("=");
        equals2Label.setFont(Input2.EQUATION_FONT);
        this.plus7Label = new JLabel("+");
        plus7Label.setFont(Input2.EQUATION_FONT);
        this.plus8Label = new JLabel("+");
        plus8Label.setFont(Input2.EQUATION_FONT);
        this.plus9Label = new JLabel("+");
        plus9Label.setFont(Input2.EQUATION_FONT);
        this.equals3Label = new JLabel("=");
        equals3Label.setFont(Input2.EQUATION_FONT);
        this.plus10Label = new JLabel("+");
        plus10Label.setFont(Input2.EQUATION_FONT);
        this.plus11Label = new JLabel("+");
        plus11Label.setFont(Input2.EQUATION_FONT);
        this.plus12Label = new JLabel("+");
        plus12Label.setFont(Input2.EQUATION_FONT);
        this.equals4Label = new JLabel("=");
        equals4Label.setFont(Input2.EQUATION_FONT);
        this.imageLabel = new JLabel(EXAMPLE_IMAGE);
        this.instructionLabel = new JLabel("Please enter the coefficients of your" + 
                                           "equations in the text fields as shown below.");
        instructionLabel.setFont(Input2.INSTRUCTION_FONT);
        this.roundLabel = new JLabel("Please select your desired output decimal accuracy:");
        roundLabel.setFont(Welcome.LABEL_FONT);
        
        //constructing JButtons and adding action listener to them
        this.solveButton = new JButton("Solve");
        solveButton.addActionListener(this);
        this.homeButton = new JButton("Home");
        homeButton.addActionListener(this);
        this.exitButton = new JButton("Exit");
        exitButton.addActionListener(this);
        this.clearButton = new JButton("Clear Entries");
        clearButton.addActionListener(this);
        
        //constructing radiobuttons, setting their font, and adding ActionListener
        this.oneDecButton = new JRadioButton("1");
        oneDecButton.setFont(Welcome.LABEL_FONT);
        oneDecButton.addActionListener(this);
        // automatically selects oneDecButton upon project launch
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
        
        // constructing the centerPanel and adding components to it
        this.centerPanel = new JPanel(new FlowLayout());
        centerPanel.setBackground(Input2.FRAME_COLOR);
        centerPanel.add(instructionLabel);
        centerPanel.add(imageLabel);
        
        // constructing the inputPanel and adding the equation and fields to it
        this.inputPanel = new JPanel(new GridLayout(4,12));
        inputPanel.setBackground(Input2.PANEL_COLOR);
        inputPanel.add(x1Field);
        inputPanel.add(x1Label);
        inputPanel.add(plus1Label);
        inputPanel.add(y1Field);
        inputPanel.add(y1Label);
        inputPanel.add(plus2Label);
        inputPanel.add(z1Field);
        inputPanel.add(z1Label);
        inputPanel.add(plus3Label);
        inputPanel.add(w1Field);
        inputPanel.add(w1Label);
        inputPanel.add(equals1Label);
        inputPanel.add(s1Field);
        inputPanel.add(x2Field);
        inputPanel.add(x2Label);
        inputPanel.add(plus4Label);
        inputPanel.add(y2Field);
        inputPanel.add(y2Label);
        inputPanel.add(plus5Label);
        inputPanel.add(z2Field);
        inputPanel.add(z2Label);
        inputPanel.add(plus6Label);
        inputPanel.add(w2Field);
        inputPanel.add(w2Label);
        inputPanel.add(equals2Label);
        inputPanel.add(s2Field);
        inputPanel.add(x3Field);
        inputPanel.add(x3Label);
        inputPanel.add(plus7Label);
        inputPanel.add(y3Field);
        inputPanel.add(y3Label);
        inputPanel.add(plus8Label);
        inputPanel.add(z3Field);
        inputPanel.add(z3Label);
        inputPanel.add(plus9Label);
        inputPanel.add(w3Field);
        inputPanel.add(w3Label);
        inputPanel.add(equals3Label);
        inputPanel.add(s3Field);
        inputPanel.add(x4Field);
        inputPanel.add(x4Label);
        inputPanel.add(plus10Label);
        inputPanel.add(y4Field);
        inputPanel.add(y4Label);
        inputPanel.add(plus11Label);
        inputPanel.add(z4Field);
        inputPanel.add(z4Label);
        inputPanel.add(plus12Label);
        inputPanel.add(w4Field);
        inputPanel.add(w4Label);
        inputPanel.add(equals4Label);
        inputPanel.add(s4Field);
        
        // constructing the buttonPanel and adding the roundLabel and buttons
        this.buttonPanel = new JPanel(new FlowLayout());
        buttonPanel.setBackground(Input2.PANEL_COLOR);
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
        helpItem.addActionListener(this);
        // adding items to menu and menu to menubar
        mainMenu.add(helpItem);
        mainBar.add(mainMenu);
        
        // adding items to frame
        this.add(inputPanel, BorderLayout.NORTH);
        this.add(buttonPanel, BorderLayout.SOUTH);
        this.add(centerPanel, BorderLayout.CENTER);
        
        // sets the menu bar
        this.setJMenuBar(mainBar);
        // sets the frame to be visible
        this.setVisible(true);
    }
    // main method allows for testing
    public static void main(String[] args)
    {
        new Input4();
    }
    // action Performed allows us to receive user actions 
    @Override
    public void actionPerformed(ActionEvent e)
    {
        // gets the source of the action
        Object command = e.getSource();
        // declaration of variables
        double[] varMatrix = new double[16];
        double[] solMatrix = new double[4];
        double varX;
        double varY;
        double varZ;
        double varW;
        int roundPlace = 1;
        String equationOneString;
        String equationTwoString;
        String equationThreeString;
        String equationFourString;
        String varString;
        String answerString;
        if (command == solveButton)
        {
            // attempts to solve the problem once solve is pressed
            try
            {
                // gets the text from the TextFields and parses to double
                varMatrix[0] = Double.parseDouble(x1Field.getText());
                varMatrix[1] = Double.parseDouble(y1Field.getText());
                varMatrix[2] = Double.parseDouble(z1Field.getText());
                varMatrix[3] = Double.parseDouble(w1Field.getText());
                varMatrix[4] = Double.parseDouble(x2Field.getText());
                varMatrix[5] = Double.parseDouble(y2Field.getText());
                varMatrix[6] = Double.parseDouble(z2Field.getText());
                varMatrix[7] = Double.parseDouble(w2Field.getText());
                varMatrix[8] = Double.parseDouble(x3Field.getText());
                varMatrix[9] = Double.parseDouble(y3Field.getText());
                varMatrix[10] = Double.parseDouble(z3Field.getText());
                varMatrix[11] = Double.parseDouble(w3Field.getText());
                varMatrix[12] = Double.parseDouble(x4Field.getText());
                varMatrix[13] = Double.parseDouble(y4Field.getText());
                varMatrix[14] = Double.parseDouble(z4Field.getText());
                varMatrix[15] = Double.parseDouble(w4Field.getText());
                solMatrix[0] = Double.parseDouble(s1Field.getText());
                solMatrix[1] = Double.parseDouble(s2Field.getText());
                solMatrix[2] = Double.parseDouble(s3Field.getText());
                solMatrix[3] = Double.parseDouble(s4Field.getText());
                // sets the text fields to blank
                x1Field.setText("");
                y1Field.setText("");
                z1Field.setText("");
                w1Field.setText("");
                s1Field.setText("");
                x2Field.setText("");
                y2Field.setText("");
                z2Field.setText("");
                w2Field.setText("");
                s2Field.setText("");
                x3Field.setText("");
                y3Field.setText("");
                z3Field.setText("");
                w3Field.setText("");
                s3Field.setText("");
                x4Field.setText("");
                y4Field.setText("");
                z4Field.setText("");
                w4Field.setText("");
                s4Field.setText("");
                // instantiates roundPlace based on user preference
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
                // creates new object cramersObj to solve using CramersRule4
                CramersRule4 cramersObj = new CramersRule4(varMatrix, solMatrix, roundPlace);
                // gets the x,y,z,w of the solution
                varX = cramersObj.getVarX();
                varY = cramersObj.getVarY();
                varZ = cramersObj.getVarZ();
                varW = cramersObj.getVarW();
                // creates equation strings
                equationOneString = varMatrix[0] + "x+" + varMatrix[1] + "y+" + varMatrix[2] + "z+" + varMatrix[3] + "w=" + solMatrix[0];
                equationTwoString = varMatrix[4] + "x+" + varMatrix[5] + "y+" + varMatrix[6] + "z+" + varMatrix[7] + "w=" + solMatrix[1];
                equationThreeString = varMatrix[8] + "x+" + varMatrix[9] + "y+" + varMatrix[10] + "z+" + varMatrix[11] + "w=" + solMatrix[2];
                equationFourString = varMatrix[12] + "x+" + varMatrix[13] + "y+" + varMatrix[14] + "z+" + varMatrix[15] + "w=" + solMatrix[3];
                varString = "x=" + varX + ", y=" + varY + ", z=" + varZ + ", w=" + varW;
                answerString = "<html> <center>" + equationOneString + "<br>" + equationTwoString + "<br>" + equationThreeString + "<br>" + equationFourString + "<br>" + varString + "</center> </html>";
                // generates a new output with the answer string
                new Output(answerString);
            }
            // ensures all entries are numbers and pops a warning frame if no
            catch (NumberFormatException nfe)
            {
                new Warning("<html><center>Please make sure all fields<br> contain numbers.</center></html>");
            }
            // ensures determinant of D is not 0 and gives null set of infinite if so
            catch (ArithmeticException ae)
            {
                new Output("<html><center>Infinitely many or no solutions.<br>Cramer's Rule is not able to differentiate.</center></html>");
            }
        }
        // if exit is pressed the project is closed
        else if (command == exitButton)
        {
            System.exit(0);
        }
        // if home is pressed a new welcome frame is opened and this frame closes
        else if (command == homeButton)
        {
            this.dispose();
            new Welcome();
        }
        // if help is pressed a new help frame opens
        else if (command == helpItem)
        {
            new Help("<html><center>This is the input frame. Please input the coefficients of your systems in the text fields below.<br>Ensure that all entries are numbers (either decimals or integers). Then select the desired<br>accuracy of your output by the amount of decimal places you desire and press solve.</html></center>");
        }
        // if clear is hit all text fields are set to blank
        else if (command == clearButton)
        {
            x1Field.setText("");
            y1Field.setText("");
            z1Field.setText("");
            w1Field.setText("");
            s1Field.setText("");
            x2Field.setText("");
            y2Field.setText("");
            z2Field.setText("");
            w2Field.setText("");
            s2Field.setText("");
            x3Field.setText("");
            y3Field.setText("");
            z3Field.setText("");
            w3Field.setText("");
            s3Field.setText("");
            x4Field.setText("");
            y4Field.setText("");
            z4Field.setText("");
            w4Field.setText("");
            s4Field.setText("");
        }
        // validates and repaints the frame
        this.validate();
        this.repaint();
    }
}