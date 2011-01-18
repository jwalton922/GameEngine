/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package display;

import java.awt.Graphics;
import java.awt.Image;
import java.util.UUID;

/**
 *
 * @author Josh
 */
public interface DisplayableObjectIF {

    public int getX();
    public int getY();
    public int getWidth();
    public int getHeight();
    public Image getImage();
    public boolean doDrawing();
    public UUID getUUID();
    public void drawObject(Graphics g);
    public void setX(int x);
    public void setY(int y);
    public void setWidth(int width);
    public void setHeight(int height);
    public void setDoDrawing(boolean doDrawing);
    public void setUUID(UUID uuid);
    

}
