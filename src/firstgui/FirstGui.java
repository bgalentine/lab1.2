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

import java.awt.*;
import javax.swing.*;

public class FirstGui {
    public final static boolean RIGHT_TO_LEFT = false;

    public static void addComponentsToPane(Container contentPane) {
        if (RIGHT_TO_LEFT) {
            contentPane.setComponentOrientation(
                ComponentOrientation.RIGHT_TO_LEFT);
        }
//        Any number of rows and 3 columns
        contentPane.setLayout(new GridLayout(0,3));

        //Add 9 JButtons for all the quadrants
        contentPane.add(new JButton("North West Quadrant"));
        contentPane.add(new JButton("West Central Quadrant"));
        contentPane.add(new JButton("South West Quadrant"));
        contentPane.add(new JButton("North Central Quadrant"));
        contentPane.add(new JButton("Central Quadrant"));
        contentPane.add(new JButton("South Central Quadrant"));
        contentPane.add(new JButton("North East Quadrant"));
        contentPane.add(new JButton("East Central Quadrant"));
        contentPane.add(new JButton("South East Quadrant"));

    }

    private static void createAndDisplayGUI() {
        JFrame.setDefaultLookAndFeelDecorated(true);

        JFrame frame = new JFrame("Early Fire Warning System");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Set up the content pane and components in GridLayout
        addComponentsToPane(frame.getContentPane());

        //Set up frame size & make visible
        frame.setSize(900, 200);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndDisplayGUI();
            }
        });
    }
}