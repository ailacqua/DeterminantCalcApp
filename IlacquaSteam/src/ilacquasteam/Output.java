/*Alexander Ilacqua - 3/16/2021
This frame displays the output generated from the users input
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

public class Output extends JFrame implements ActionListener
{
    // declaring the output image
    public final URL OUTPUT_PATH = getClass().getResource("yay.jpeg");
    private final ImageIcon OUTPUT_IMAGE = new ImageIcon(new ImageIcon
                    (OUTPUT_PATH).getImage().getScaledInstance
                    (250,140,Image.SCALE_DEFAULT));
    // declaring the output font
    public static final Font OUTPUT_FONT = new Font("Verdana", Font.PLAIN, 20);
    // declaring colors
    public static final Color FRAME_COLOR = new Color(177,156,217);
    public static final Color PANEL_COLOR = new Color(255,203,164);
    // declaring JLabels
    private JLabel outputLabel;
    private JLabel imageLabel;
    // declaring JButtons
    private JButton exitButton;
    private JButton closeButton;
    // declaring JPanel
    private JPanel buttonPanel;
    
    public Output(String message)
    {
        //initializing the output frame
        super("Ouput");
        this.setBounds(200, 200, 500, 500);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.getContentPane().setBackground(FRAME_COLOR);
        this.setLayout(new BorderLayout());
        
        //constructing JLabels and setting their font
        this.outputLabel = new JLabel(message, SwingConstants.CENTER);
        outputLabel.setFont(OUTPUT_FONT);
        this.imageLabel = new JLabel(OUTPUT_IMAGE);
        
        //constructing JButtons and adding action listener to them
        this.exitButton = new JButton("Exit Program");
        exitButton.addActionListener(this);
        this.closeButton = new JButton("Close Frame");
        closeButton.addActionListener(this);
        
        //constructing JPanel and adding components to them
        this.buttonPanel = new JPanel(new FlowLayout());
        buttonPanel.setBackground(PANEL_COLOR);
        buttonPanel.add(closeButton);
        buttonPanel.add(exitButton);
        
        // adding components to frame
        this.add(outputLabel, BorderLayout.NORTH);
        this.add(imageLabel, BorderLayout.CENTER);
        this.add(buttonPanel, BorderLayout.SOUTH);
        
        // sets the frame to be visible
        this.setVisible(true);
    }
    // main method allows us to test the class
    public static void main(String[] args)
    {
        new Output("Hi");
    }
    // action performed allows us to receive user action to make change
    @Override
    public void actionPerformed(ActionEvent e)
    {
        // gets the source of the action
        Object command = e.getSource();
        // if exit is pressed the program is exited
        if (command == exitButton)
        {
            System.exit(0);
        }
        // if close is pressed the frame is closed
        else if (command == closeButton)
        {
            this.dispose();
        }
        // validates and repaints the frame
        this.validate();
        this.repaint();
    }
}