/*Alexander Ilacqua - 3/16/2021
This frame welcomes the user to the project and asks them how many variables
are in there systems of equations
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
import javax.swing.SwingConstants;

public class Welcome extends JFrame implements ActionListener
{
    // declaring welcome image
    public final URL WELCOME_PATH = getClass().getResource("welcome.jpeg");
    private final ImageIcon WELCOME_IMAGE = new ImageIcon(new ImageIcon
                    (WELCOME_PATH).getImage().getScaledInstance
                    (512,243,Image.SCALE_DEFAULT));
    // declaring fonts used in the frame
    public static final Font TITLE_FONT = new Font("Kefa", Font.BOLD, 52);
    public static final Font NAME_FONT = new Font("Kefa", Font.PLAIN, 24);
    public static final Font EXPLANATION_FONT = new Font("Kefa", Font.ITALIC, 30);
    public static final Font LABEL_FONT = new Font("Century Gothic", Font.PLAIN, 18);
    // declaring the frame color and buttonPanel color
    public static final Color PANEL_COLOR = new Color(255,179,71);
    public static final Color FRAME_COLOR = new Color(137,207,240);
    // declaring JLabels
    private JLabel titleLabel;
    private JLabel explanationLabel;
    private JLabel instructionLabel;
    private JLabel imageLabel;
    private JLabel nameLabel;
    // declaring JPanels
    private JPanel buttonPanel;
    private JPanel centerPanel;
    // declaring JButtons
    private JButton nextButton;
    private JButton exitButton;
    // declaring radio buttons and button group
    private JRadioButton twoRadioButton;
    private JRadioButton threeRadioButton;
    private JRadioButton fourRadioButton;
    private ButtonGroup variableGroup;
    // declaring the menu bar, main menu and help item
    private JMenuBar mainBar;
    private JMenu mainMenu;
    private JMenuItem helpItem;
    
    // declaring constructor of class welcome 
    public Welcome()
    {
        // initializing the frame with color, size, layout, and close op
        super("Welcome");
        this.setBounds(200, 200, 1000, 700);
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        this.getContentPane().setBackground(FRAME_COLOR);
        this.setLayout(new BorderLayout());
        
        // constructing JLabels and setting their font
        this.titleLabel = new JLabel("Systems of Equations Calculator", SwingConstants.CENTER);
        titleLabel.setFont(TITLE_FONT);
        this.explanationLabel = new JLabel("This program solves systems of equations using Cramer's Rule", SwingConstants.CENTER);
        explanationLabel.setFont(EXPLANATION_FONT);
        this.imageLabel = new JLabel(WELCOME_IMAGE);
        this.instructionLabel = new JLabel("Please select the amount of variables in your problem:");
        instructionLabel.setFont(LABEL_FONT);
        this.nameLabel = new JLabel("By: Alex Ilacqua", SwingConstants.CENTER);
        nameLabel.setFont(NAME_FONT);
        
        // constructing variable radio buttons,setting font, and adding ActionListener
        this.twoRadioButton = new JRadioButton("2-Var");
        twoRadioButton.setFont(LABEL_FONT);
        twoRadioButton.addActionListener(this);
        // automatically enables the 2 var button from start
        twoRadioButton.setSelected(true);
        this.threeRadioButton = new JRadioButton("3-Var");
        threeRadioButton.setFont(LABEL_FONT);
        threeRadioButton.addActionListener(this);
        this.fourRadioButton = new JRadioButton("4-Var");
        fourRadioButton.setFont(LABEL_FONT);
        fourRadioButton.addActionListener(this);
        
        // constructing variableGroup and adding buttons to button group
        this.variableGroup = new ButtonGroup();
        variableGroup.add(twoRadioButton);
        variableGroup.add(threeRadioButton);
        variableGroup.add(fourRadioButton);
        
        // constructing the next and exit JButtons
        this.nextButton = new JButton("Next");
        nextButton.addActionListener(this);
        this.exitButton = new JButton("Exit");
        exitButton.addActionListener(this);
        
        // constructing and adding items to centerPanel
        this.centerPanel = new JPanel(new GridLayout(7,1));
        // setting color of the centerPanel
        centerPanel.setBackground(FRAME_COLOR);
        centerPanel.add(explanationLabel);
        centerPanel.add(imageLabel);
        centerPanel.add(nameLabel);
                    
        // constructing and adding items to buttonPanel
        this.buttonPanel = new JPanel(new FlowLayout());
        // setting color of the buttonPanel
        buttonPanel.setBackground(PANEL_COLOR);
        buttonPanel.add(instructionLabel);
        buttonPanel.add(twoRadioButton);
        buttonPanel.add(threeRadioButton);
        buttonPanel.add(fourRadioButton);
        buttonPanel.add(nextButton);
        buttonPanel.add(exitButton);
        
        // constructing the menuBar, main menu, and helpItem
        this.mainBar = new JMenuBar();
        this.mainMenu = new JMenu("Menu");
        this.helpItem = new JMenuItem("Help");
        // adding ActionListener to the help item
        helpItem.addActionListener(this);
        // adding items to menu and menu to menubar
        mainMenu.add(helpItem);
        mainBar.add(mainMenu);
        
        //adding components to frame
        this.add(titleLabel, BorderLayout.NORTH);
        this.add(centerPanel, BorderLayout.CENTER);
        this.add(buttonPanel, BorderLayout.SOUTH);
        
        // setting the MenuBar
        this.setJMenuBar(mainBar);
        // setting the frame to be visible
        this.setVisible(true);
    }
    // main method to test the frame
    public static void main(String[] args)
    {
        new Welcome();
    }

    // actionPerformed allows us to receive user interaction
    @Override
    public void actionPerformed(ActionEvent e)
    {
        // gets the source of the action
        Object command = e.getSource();
        if (command == nextButton)
        {
            // if next button is pressed with 2RadioButton, Input2 is opened
            if (twoRadioButton.isSelected())
            {
                this.dispose();
                new Input2();
            }
            // if next button is pressed with 3RadioButton, Input3 is opened
            else if (threeRadioButton.isSelected())
            {
                this.dispose();
                new Input3();
            }
            // if next button is pressed with 4RadioButton, Input4 is opened
            else if (fourRadioButton.isSelected())
            {
                this.dispose();
                new Input4();
            }
        }
        // exits the program if the exit button is pressed
        else if (command == exitButton)
        {
            System.exit(0);
        }
        // opens the help frame if the user hits help in the menu
        else if (command == helpItem)
        {
            new Help("<html><center>Hello! My name is Alex and I am the creator of this program. My favorite hobbies are<br>cooking, gardening, and debating. This program solves 2 var, 3 var, and 4 var systems<br>of equations using Cramer's Rule. This is done by replacing the coefficients of the variable<br>you are trying to solve with the solution set creating a x, y, or z matrix. The x, y, or z matrix<br>determinant is then divided by the determinant of the coefficient matrix to solve the equation.</center></html>");
        }
        
        // validates and repaints the frame to reduce random error
        this.validate();
        this.repaint();
    }
}