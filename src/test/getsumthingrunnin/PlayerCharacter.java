/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package test.getsumthingrunnin;

import display.DisplayableObject;
import display.UpdatableObjectIF;
import java.awt.image.BufferedImage;
import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import utils.ImageUtils;

/**
 *
 * @author Josh
 */
public class PlayerCharacter extends DisplayableObject implements UpdatableObjectIF{
    
    private ArrayList<BufferedImage> walkEastImages = new ArrayList<BufferedImage>();
    private int index = 0;
    
    public PlayerCharacter()
    {
        File dir = new File("images\\black_mage");
        for(int i = 0; i <= 7; i++)
        {
           String fileName = dir+"\\paused e000"+i+".bmp";
           URL fileURL = PlayerCharacter2.class.getClassLoader().getResource(fileName);
            System.out.println("File URL ="+fileURL.getFile());
            walkEastImages.add(ImageUtils.loadImageAndMakeBackgroundTransparent(fileURL));

        }
        
        super.setX(200);
        setY(200);
        setWidth(100);
        setHeight(100);
        setSourceX(0);
        setSourceY(0);
        setSourceWidth(96);
        setSourceHeight(96);
        setDoDrawing(true);
        setImage(walkEastImages.get(0));
    }

    public void update(long time)
    {
        index++;
        if(index >= walkEastImages.size())
        {
            index = 0;
        }
        setImage(walkEastImages.get(index));
        System.out.println("Updating player character index");
    }


}
