/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package display;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.util.UUID;

/**
 *
 * @author Josh
 */
public class DisplayableObject implements DisplayableObjectIF, LoadableImageIF{

    private int x;
    private int y;
    private int width;
    private int height;
    private BufferedImage image;
    private int sourceX;
    private int sourceY;
    private int sourceWidth;
    private int sourceHeight;
    private String fileName;
    private UUID uuid;
    private boolean doDrawing = true;


    public DisplayableObject()
    {

    }

    public void drawObject(Graphics g)
    {
        Graphics2D g2 = (Graphics2D)g;
        g2.drawImage(image, x, y, x+width, y+height, sourceX, sourceY, sourceX+sourceWidth, sourceY+sourceHeight, null);
    }

    public boolean doDrawing()
    {
        return doDrawing;
    }

    public int getX()
    {
        return x;
    }

    public int getY()
    {
        return y;
    }

    public int getWidth()
    {
        return width;
    }

    public int getHeight()
    {
        return height;
    }

    public int getSourceX()
    {
        return sourceX;
    }
    public int getSourceY()
    {
        return sourceY;
    }

    public int getSourceHeight()
    {
        return sourceHeight;
    }
    public int getSourceWidth()
    {
        return sourceWidth;
    }

    public String getFileName()
    {
        return fileName;
    }

    public void setX(int x)
    {
        this.x = x;
    }

    public void setY(int y)
    {
        this.y = y;
    }

    public void setWidth(int width)
    {
        this.width = width;
    }

    public void setHeight(int height)
    {
        this.height = height;
    }

    public void setUUID(UUID uuid)
    {
        this.uuid = uuid;
    }

    public void setDoDrawing(boolean doDrawing)
    {
        this.doDrawing = doDrawing;
    }

    public void setImage(BufferedImage image)
    {
        this.image = image;
    }

    public BufferedImage getImage()
    {
        return this.image;
    }

    public void setSourceX(int x)
    {
        this.sourceX = x;
    }

    public void setSourceY(int y)
    {
        this.sourceY = y;
    }

    public void setSourceHeight(int height)
    {
        this.sourceHeight = height;
    }

    public void setSourceWidth(int width)
    {
        this.sourceWidth = width;
    }

    public void setFileName(String fileName)
    {
        this.fileName = fileName;
    }

    public UUID getUUID()
    {
        return uuid;
    }

    

}
