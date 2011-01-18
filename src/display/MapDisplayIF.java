/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package display;

import java.awt.Dimension;
import java.awt.Graphics;
import java.util.ArrayList;

/**
 *
 * @author Josh
 */
public interface MapDisplayIF {

    public ArrayList<DisplayableObjectIF> getDisplayableObjects();
    public void setDisplayableObjects(ArrayList<DisplayableObjectIF> displayableObjects);
    public void addDisplayableObject(DisplayableObjectIF displayableObject);
    public void removeDisplayableObject(DisplayableObjectIF displayableObjectToRemove);
    public void removeDisplayableObjects(ArrayList<DisplayableObjectIF> displayableObjectsToRemove);
    public void drawMap(Graphics g);
    public void drawObjects(Graphics g);
    public void repaintScreen();
    public void setDisplaySize(Dimension d);

}
