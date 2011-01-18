/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package test.getsumthingrunnin;

import display.MapDisplay;
import engine.Controller;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Josh
 */
public class TestMain {

    public static Controller controller;
    public static void main(String[] args)
    {
        controller = new Controller();
        JPanel panel = new JPanel();
        MapDisplay md = new MapDisplay();
        md.setDisplaySize(new Dimension(600,600));
        controller.setMapDisplay(md);
        PlayerCharacter pc = new PlayerCharacter();
        PlayerCharacter2 pc2 = new PlayerCharacter2();
        controller.addMapObject(pc);
        controller.addMapObject(pc2);
        JFrame frame = new JFrame("Test Engine");
        frame.setSize(new Dimension(600,700));
        panel.add(md);
        JButton button = new JButton("Start Engine");
        button.addActionListener(new ActionListener()
        {
          public void actionPerformed(ActionEvent e)
          {
              controller.startRunning();
          }

        }
        );
        panel.add(button);
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);




    }
}
