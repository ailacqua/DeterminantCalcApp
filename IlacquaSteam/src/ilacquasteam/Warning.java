/*Alexander Ilacqua - 3/16/2021
This frame warns the user if they have not entered a number in every field
 */
package ilacquasteam;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.SwingConstants;


public class Warning extends JFrame implements ActionListener
{
    // declaring the warning image
    public final URL WARNING_PATH = getClass().getResource("warning.png");
    private final ImageIcon WARNING_IMAGE = new ImageIcon(new ImageIcon
                    (WARNING_PATH).getImage().getScaledInstance
                    (300,300,Image.SCALE_DEFAULT));
    // declaring font
    public static final Font WARNING_FONT = new Font("Verdana",Font.BOLD,30);
    // declaring colors
    public static final Color FRAME_COLOR = new Color(255,40,0);
    public static final Color PANEL_COLOR = new Color(80,220,100);
    // declaring JLabels
    private JLabel warningLabel;
    private JLabel imageLabel;
    // declaring JPanels
    private JPanel buttonPanel;
    // declaring JButtons
    private JButton exitButton;
    private JButton closeButton;
    // declaring menu bar, menu, and help item
    private JMenuBar mainBar;
    private JMenu mainMenu;
    private JMenuItem helpItem;
    
    public Warning(String message)
    {
        //initializing the warning frame
        super("Warning");
        this.setBounds(200,200,500,500);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.getContentPane().setBackground(FRAME_COLOR);
        this.setLayout(new BorderLayout());
        
        // constructing JLabels and setting their font
        this.warningLabel = new JLabel(message, SwingConstants.CENTER);
        warningLabel.setFont(WARNING_FONT);
        this.imageLabel = new JLabel(WARNING_IMAGE);
        
        // constructing JButtons and adding actionlistener to them
        this.exitButton = new JButton("Exit Program");
        exitButton.addActionListener(this);
        this.closeButton = new JButton("Close Frame");
        closeButton.addActionListener(this);
        
        // constructing buttonPanel and adding buttons to it
        this.buttonPanel = new JPanel(new FlowLayout());
        buttonPanel.setBackground(PANEL_COLOR);
        buttonPanel.add(closeButton);
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
        
        //adding components to frame
        this.add(warningLabel, BorderLayout.NORTH);
        this.add(imageLabel, BorderLayout.CENTER);
        this.add(buttonPanel, BorderLayout.SOUTH);
        
        // setting the menu bar
        this.setJMenuBar(mainBar);
        // setting the frame to be visible
        this.setVisible(true);
    }
    // main method allows us to test the program
    public static void main(String[] args)
    {
        new Warning("NO!");
    }
    // action performed allows us to receive the user's actions and act on it
    @Override
    public void actionPerformed(ActionEvent e)
    {
        // gets the source of the action
        Object command = e.getSource();
        // if the close button is pressed the frame is disposed
        if (command == closeButton)
        {
            this.dispose();
        }
        // if the exit button is pressed the program is exited
        else if (command == exitButton)
        {
            System.exit(0);
        }
        // opens the help frame if help is selected in the menu
        else if (command == helpItem)
        {
            new Help("<html><center>One or some of your entries is not a number." + 
                     "Please hit close frame below to return to the<br>input frame" + 
                     "and make sure all entries are numbers. Then hit solve again" + 
                     "once you have solved the issue.</center></html>");
        }
        // validates and repaints the frame
        this.validate();
        this.repaint();
    }
}