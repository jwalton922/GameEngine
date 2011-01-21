/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package engine.interfaces;

import java.awt.image.BufferedImage;
import java.util.ArrayList;

/**
 *
 * @author Josh
 */
public interface ControllableCharacterActionIF {

    public void setName(String name);
    public String getName();
    public void performAction();
    public void setImages(ArrayList<BufferedImage> actionImages);
}
