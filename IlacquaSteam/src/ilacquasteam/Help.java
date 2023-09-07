/*Alexander Ilacqua - 3/16/2021
This frame provides the user with help should they encounter any
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
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Help extends JFrame implements ActionListener
{
    // declaring the help image
    public final URL HELP_PATH = getClass().getResource("help.png");
    private final ImageIcon HELP_IMAGE = new ImageIcon(new ImageIcon
                    (HELP_PATH).getImage().getScaledInstance
                    (503,225,Image.SCALE_DEFAULT));
    // declaring fonts
    public static final Font HELP_FONT = new Font("Kefa", Font.BOLD | Font.ITALIC, 30);
    public static final Font EXPLANATION_FONT = new Font("Verdana", Font.PLAIN, 15);
    // declaring colors
    public static final Color FRAME_COLOR = new Color(255,178,174);
    public static final Color PANEL_COLOR = new Color(174,251,255);
    // declaring JLabels
    private JLabel helpLabel;
    private JLabel explanationLabel;
    private JLabel imageLabel;
    // declaring buttons
    private JButton closeButton;
    private JButton exitButton;
    // declaring JPanels
    private JPanel buttonPanel;
    private JPanel centerPanel;
    
    public Help(String message)
    {
        // initializing help frame
        super("Help");
        this.setBounds(100,100,800,600);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.getContentPane().setBackground(FRAME_COLOR);
        this.setLayout(new BorderLayout());
        
        // constructing help image and explanation labels and setting font
        this.helpLabel = new JLabel("You need help!", SwingConstants.CENTER);
        helpLabel.setFont(HELP_FONT);
        this.explanationLabel = new JLabel(message, SwingConstants.CENTER);
        explanationLabel.setFont(EXPLANATION_FONT);
        this.imageLabel = new JLabel(HELP_IMAGE);
        
        // constructing close and exit buttons and adding the action listener
        this.closeButton = new JButton("Close Frame");
        closeButton.addActionListener(this);
        this.exitButton = new JButton("Exit Program");
        exitButton.addActionListener(this);
        
        // constructing the buttonPanel and adding buttons to it
        this.buttonPanel = new JPanel(new FlowLayout());
        buttonPanel.setBackground(PANEL_COLOR);
        buttonPanel.add(closeButton);
        buttonPanel.add(exitButton);
        
        // constructing the centerPanel and adding the image and text to it
        this.centerPanel = new JPanel(new BorderLayout());
        centerPanel.setBackground(FRAME_COLOR);
        centerPanel.add(explanationLabel, BorderLayout.NORTH);
        centerPanel.add(imageLabel, BorderLayout.CENTER);
        
        // adding components to the frame
        this.add(buttonPanel, BorderLayout.SOUTH);
        this.add(helpLabel, BorderLayout.NORTH);
        this.add(centerPanel, BorderLayout.CENTER);
        
        // setting the frame to be visible
        this.setVisible(true);
    }
    // main method allows us to test the class
    public static void main(String[] args)
    {
        new Help("Help!");
    }
    // actionPerformed allows for us to receive and act on user action
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
        // validates and repaints the frame
        this.validate();
        this.repaint();
    }
}