/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package display;

import java.awt.image.BufferedImage;

/**
 *
 * @author Josh
 */
public interface LoadableImageIF {

    public int getSourceX();
    public int getSourceY();
    public int getSourceHeight();
    public int getSourceWidth();
    public String getFileName();
    public void setSourceX(int x);
    public void setSourceY(int y);
    public void setSourceHeight(int height);
    public void setSourceWidth(int width);
    public void setFileName(String fileName);
    public void setImage(BufferedImage image);

}
