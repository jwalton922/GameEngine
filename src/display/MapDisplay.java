/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package display;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author Josh
 */
public class MapDisplay extends JPanel implements MapDisplayIF{

    private ArrayList<DisplayableObjectIF> objectsToDisplay;


    public void setDisplaySize(Dimension d)
    {
        this.setPreferredSize(d);
        this.setMinimumSize(d);
        this.setMaximumSize(d);
        this.setSize(d);
    }
    public ArrayList<DisplayableObjectIF> getDisplayableObjects()
    {
        return objectsToDisplay;
    }
    public void setDisplayableObjects(ArrayList<DisplayableObjectIF> displayableObjects)
    {
        objectsToDisplay = displayableObjects;
    }

    public void addDisplayableObject(DisplayableObjectIF displayableObject)
    {

    }
    public void removeDisplayableObject(DisplayableObjectIF displayableObjectToRemove)
    {
        objectsToDisplay.remove(displayableObjectToRemove);
    }
    public void removeDisplayableObjects(ArrayList<DisplayableObjectIF> displayableObjectsToRemove)
    {
        objectsToDisplay.removeAll(displayableObjectsToRemove);
    }

    @Override
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D)g;
        g2.setColor(Color.GREEN);
        g2.fillRect(0, 0, this.getSize().width, this.getSize().height);
        drawMap(g);
    }

    public void drawObjects(Graphics g)
    {
        for(DisplayableObjectIF object : objectsToDisplay)
        {
            if(object.doDrawing())
            {
                object.drawObject(g);
            }
        }
    }

    public void drawMap(Graphics g)
    {
        drawObjects(g);
    }

    public void repaintScreen()
    {
        this.repaint();
    }

}
