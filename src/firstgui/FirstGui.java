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


public class FirstGui extends JFrame {
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
        //contentPane.add(new JButton("North Central Quadrant"));
        
        northEastButton = new JButton("NorthEast");
        contentPane.add(northEastButton);
        
        southWestButton = new JButton("South West");
        contentPane.add(southWestButton);
        
        southEastButton = new JButton("South East");
        contentPane.add(southEastButton);
        
        //contentPane.add(new JButton("Sout West Central Quadrant"));
        //contentPane.add(new JButton("Central Quadrant"));
        //contentPane.add(new JButton("East Central Quadrant"));
        
        //contentPane.add(new JButton("South West Quadrant"));
        //contentPane.add(new JButton("South Central Quadrant"));
        //contentPane.add(new JButton("South East Quadrant"));

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
}