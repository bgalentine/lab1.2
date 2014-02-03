/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package firstgui;



        

/**
 *
 * @author Byron Galentine
 */
//import statements for swing & awt
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class FirstGui extends JFrame implements ActionListener {
    JButton northWestButton, southWestButton, northEastButton, southEastButton;
    
    public FirstGui(String name){
        super(name);
        setResizable(false);
    }
    
    public final static boolean RIGHT_TO_LEFT = false;

    public void createContentPane(Container contentPane) {
       if (RIGHT_TO_LEFT) {
            contentPane.setComponentOrientation(
                ComponentOrientation.RIGHT_TO_LEFT);
        }
//        Any number of rows and 2 columns
        contentPane.setLayout(new GridLayout(0,2));

        //Add 4 JButtons for first four quadrants
        northWestButton = new JButton("North West");
        contentPane.add(northWestButton);
        northWestButton.addActionListener(this);
        
        northEastButton = new JButton("North East");
        contentPane.add(northEastButton);
        northEastButton.addActionListener(this);
        
        southWestButton = new JButton("South West");
        contentPane.add(southWestButton);
        southWestButton.addActionListener(this);
        
        southEastButton = new JButton("South East");
        contentPane.add(southEastButton);
        southEastButton.addActionListener(this);

    }
    
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == northWestButton ){
            NorthWestWindow nthWstWindow = NorthWestWindow ( );   
        }
        if(e.getSource() == northEastButton ){
            NorthEastWindow nthEstWindow;
            nthEstWindow = NorthEastWindow ( );
        }
        
        
        if(e.getSource() == southWestButton ){
            SouthWestWindow secondWindow = SouthWestWindow ( );
        }
        
    }

    private static void createAndDisplayGUI() {
        JFrame.setDefaultLookAndFeelDecorated(true);
        
        FirstGui frame = new FirstGui("Early Fire Warning System");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.createContentPane(frame.getContentPane());
 

        //Set up frame size & make visible
        frame.setSize(900, 400);
        frame.setVisible(true);
    }
//main method
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndDisplayGUI();
            }
        });
    }

    private NorthWestWindow NorthWestWindow() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private SouthWestWindow SouthWestWindow() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private NorthEastWindow NorthEastWindow() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}