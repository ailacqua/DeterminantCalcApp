/*Alexander Ilacqua - 4/5/2021
This frame receives the input for a 3 variable systems of equations
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

public class Input3 extends JFrame implements ActionListener
{
    // declaring an image
    public final URL EXAMPLE_PATH = getClass().getResource("3var.png");
    private final ImageIcon EXAMPLE_IMAGE = new ImageIcon(new ImageIcon
                    (EXAMPLE_PATH).getImage().getScaledInstance
                    (566,263,Image.SCALE_DEFAULT));
    // declaring JLabels
    private JLabel x1Label;
    private JLabel y1Label;
    private JLabel z1Label;
    private JLabel x2Label;
    private JLabel y2Label;
    private JLabel z2Label;
    private JLabel x3Label;
    private JLabel y3Label;
    private JLabel z3Label;
    private JLabel plus1Label;
    private JLabel plus2Label;
    private JLabel equals1Label;
    private JLabel plus3Label;
    private JLabel plus4Label;
    private JLabel equals2Label;
    private JLabel plus5Label;
    private JLabel plus6Label;
    private JLabel equals3Label;
    private JLabel imageLabel;
    private JLabel instructionLabel;
    private JLabel roundLabel;
    // declaring JTextFields
    private JTextField x1Field;
    private JTextField x2Field;
    private JTextField x3Field;
    private JTextField y1Field;
    private JTextField y2Field;
    private JTextField y3Field;
    private JTextField z1Field;
    private JTextField z2Field;
    private JTextField z3Field;
    private JTextField s1Field;
    private JTextField s2Field;
    private JTextField s3Field;
    // declaring JPanels
    private JPanel inputPanel;
    private JPanel buttonPanel;
    private JPanel centerPanel;
    // declaring JButtons
    private JButton solveButton;
    private JButton homeButton;
    private JButton exitButton;
    private JButton clearButton;
    // declaring RadioButtons
    private JRadioButton oneDecButton;
    private JRadioButton twoDecButton;
    private JRadioButton threeDecButton;
    // declaring the button group
    private ButtonGroup decimalGroup;
    // declaring all components for menu creation
    private JMenuBar mainBar;
    private JMenu mainMenu;
    private JMenuItem helpItem;
     
    public Input3()
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
        this.y1Field = new JTextField(3);
        this.y2Field = new JTextField(3);
        this.y3Field = new JTextField(3);
        this.z1Field = new JTextField(3);
        this.z2Field = new JTextField(3);
        this.z3Field = new JTextField(3);
        this.s1Field = new JTextField(3);
        this.s2Field = new JTextField(3);
        this.s3Field = new JTextField(3);
        
        // constructing JLabels and setting their font
        this.x1Label = new JLabel("x");
        x1Label.setFont(Input2.EQUATION_FONT);
        this.y1Label = new JLabel("y");
        y1Label.setFont(Input2.EQUATION_FONT);
        this.z1Label = new JLabel("z");
        z1Label.setFont(Input2.EQUATION_FONT);
        this.x2Label = new JLabel("x");
        x2Label.setFont(Input2.EQUATION_FONT);
        this.y2Label = new JLabel("y");
        y2Label.setFont(Input2.EQUATION_FONT);
        this.z2Label = new JLabel("z");
        z2Label.setFont(Input2.EQUATION_FONT);
        this.x3Label = new JLabel("x");
        x3Label.setFont(Input2.EQUATION_FONT);
        this.y3Label = new JLabel("y");
        y3Label.setFont(Input2.EQUATION_FONT);
        this.z3Label = new JLabel("z");
        z3Label.setFont(Input2.EQUATION_FONT);
        this.plus1Label = new JLabel("+");
        plus1Label.setFont(Input2.EQUATION_FONT);
        this.plus2Label = new JLabel("+");
        plus2Label.setFont(Input2.EQUATION_FONT);
        this.equals1Label = new JLabel("=");
        x1Label.setFont(Input2.EQUATION_FONT);
        this.plus3Label = new JLabel("+");
        plus3Label.setFont(Input2.EQUATION_FONT);
        this.plus4Label = new JLabel("+");
        plus4Label.setFont(Input2.EQUATION_FONT);
        this.equals2Label = new JLabel("=");
        equals2Label.setFont(Input2.EQUATION_FONT);
        this.plus5Label = new JLabel("+");
        plus5Label.setFont(Input2.EQUATION_FONT);
        this.plus6Label = new JLabel("+");
        x1Label.setFont(Input2.EQUATION_FONT);
        this.equals3Label = new JLabel("=");
        x1Label.setFont(Input2.EQUATION_FONT);
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
        // automatically selects one decimal button open launch of program
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
        
        // constructing the centerPanel and adding the image and instruction
        this.centerPanel = new JPanel(new FlowLayout());
        centerPanel.setBackground(Input2.FRAME_COLOR);
        centerPanel.add(instructionLabel);
        centerPanel.add(imageLabel);
        
        // constructing the inputPanel and adding the fields and equation labels
        this.inputPanel = new JPanel(new GridLayout(3,10));
        inputPanel.setBackground(Input2.PANEL_COLOR);
        inputPanel.add(x1Field);
        inputPanel.add(x1Label);
        inputPanel.add(plus1Label);
        inputPanel.add(y1Field);
        inputPanel.add(y1Label);
        inputPanel.add(plus2Label);
        inputPanel.add(z1Field);
        inputPanel.add(z1Label);
        inputPanel.add(equals1Label);
        inputPanel.add(s1Field);
        inputPanel.add(x2Field);
        inputPanel.add(x2Label);
        inputPanel.add(plus3Label);
        inputPanel.add(y2Field);
        inputPanel.add(y2Label);
        inputPanel.add(plus4Label);
        inputPanel.add(z2Field);
        inputPanel.add(z2Label);
        inputPanel.add(equals2Label);
        inputPanel.add(s2Field);
        inputPanel.add(x3Field);
        inputPanel.add(x3Label);
        inputPanel.add(plus5Label);
        inputPanel.add(y3Field);
        inputPanel.add(y3Label);
        inputPanel.add(plus6Label);
        inputPanel.add(z3Field);
        inputPanel.add(z3Label);
        inputPanel.add(equals3Label);
        inputPanel.add(s3Field);
        
        // constructing the buttonPanel and adding the buttons to it
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
        
        // setting the menu bar
        this.setJMenuBar(mainBar);
        // setting the frame to be visible
        this.setVisible(true);
    }
    // main method to test the program 
    public static void main(String[] args)
    {
        new Input3();
    }

    // actionPerformed receives action done by user
    @Override
    public void actionPerformed(ActionEvent e)
    {
        // gets source of the action
        Object command = e.getSource();
        // declaration of variables
        double[] varMatrix = new double[9];
        double[] solMatrix = new double[3];
        double varX;
        double varY;
        double varZ;
        int roundPlace = 1;
        String oneString;
        String twoString;
        String threeString;
        String varString;
        String answerString;
        if (command == solveButton)
        {
            // attempts to solve the problem if solve is pressed
            try
            {
                // gets text from the text fields and parses to double
                varMatrix[0] = Double.parseDouble(x1Field.getText());
                varMatrix[1] = Double.parseDouble(y1Field.getText());
                varMatrix[2] = Double.parseDouble(z1Field.getText());
                varMatrix[3] = Double.parseDouble(x2Field.getText());
                varMatrix[4] = Double.parseDouble(y2Field.getText());
                varMatrix[5] = Double.parseDouble(z2Field.getText());
                varMatrix[6] = Double.parseDouble(x3Field.getText());
                varMatrix[7] = Double.parseDouble(y3Field.getText());
                varMatrix[8] = Double.parseDouble(z3Field.getText());
                solMatrix[0] = Double.parseDouble(s1Field.getText());
                solMatrix[1] = Double.parseDouble(s2Field.getText());
                solMatrix[2] = Double.parseDouble(s3Field.getText());
                // empties all text fields
                x1Field.setText("");
                y1Field.setText("");
                z1Field.setText("");
                s1Field.setText("");
                x2Field.setText("");
                y2Field.setText("");
                z2Field.setText("");
                s2Field.setText("");
                x3Field.setText("");
                y3Field.setText("");
                z3Field.setText("");
                s3Field.setText("");
                // instantiates roundPlace depending on user decimal selection
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
                // creates new object of CramersRule3 to solve
                CramersRule3 cramersObj = new CramersRule3(varMatrix, solMatrix, roundPlace);
                // receives the x,y, and z of the new object to print results
                varX = cramersObj.getVarX();
                varY = cramersObj.getVarY();
                varZ = cramersObj.getVarZ();
                oneString = varMatrix[0] + "x+" + varMatrix[1] + "y+" + 
                            varMatrix[2] + "z=" + solMatrix[0];
                twoString = varMatrix[3] + "x+" + varMatrix[4] + "y+" + 
                            varMatrix[5] + "z=" + solMatrix[1];
                threeString = varMatrix[6] + "x+" + varMatrix[7] + "y+" + 
                              varMatrix[8] + "z=" + solMatrix[2];
                varString = "x=" + varX + ", y=" + varY + ", z=" + varZ;
                answerString = "<html><center>" + oneString + "<br>" + twoString + 
                               "<br>" + threeString + "<br>" + varString + "</center></html>";
                // creates new output with answer string
                new Output(answerString);
            }
            // ensures user entered numbers in all fields
            catch (NumberFormatException nfe)
            {
                // prompts with warning if no
                new Warning("<html><center>Please make sure all fields<br> contain" + 
                            "numbers.</center></html>");
            }
            // catches if the determinant of D is 0 and displays null set or all solutions
            catch (ArithmeticException ae)
            {
                new Output("<html><center>Infinitely many or no solutions.<br>Cramer's" + 
                           "Rule is not able to differentiate.</center></html>");
            }
        }
        // exits program if exit is pressed
        else if (command == exitButton)
        {
            System.exit(0);
        }
        // returns to the welcome frame if home is pressed
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
        // clears all text fields if help is pressed
        else if (command == clearButton)
        {
            x1Field.setText("");
            y1Field.setText("");
            z1Field.setText("");
            s1Field.setText("");
            x2Field.setText("");
            y2Field.setText("");
            z2Field.setText("");
            s2Field.setText("");
            x3Field.setText("");
            y3Field.setText("");
            z3Field.setText("");
            s3Field.setText("");
        }
        // validates and repaints the frame
        this.validate();
        this.repaint();
    }
}