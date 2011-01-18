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
public class PlayerCharacter2 extends DisplayableObject implements UpdatableObjectIF{

    private ArrayList<BufferedImage> walkEastImages = new ArrayList<BufferedImage>();
    private int index = 0;

    public PlayerCharacter2()
    {
        File dir = new File("images\\black_mage");
        for(int i = 0; i <= 9; i++)
        {
            String fileName = dir+"\\attack e000"+i+".bmp";
            URL fileURL = PlayerCharacter2.class.getClassLoader().getResource(fileName);
            System.out.println("File URL ="+fileURL.getFile());
            walkEastImages.add(ImageUtils.loadImageAndMakeBackgroundTransparent(fileURL));
        }
        for(int i = 0; i <= 9; i++)
        {
            String fileName = dir+"\\attack se000"+i+".bmp";
           walkEastImages.add(ImageUtils.loadImageAndMakeBackgroundTransparent(PlayerCharacter2.class.getClassLoader().getResource(fileName)));
        }

        for(int i = 0; i <= 9; i++)
        {
            String fileName = dir+"\\attack s000"+i+".bmp";
            walkEastImages.add(ImageUtils.loadImageAndMakeBackgroundTransparent(PlayerCharacter2.class.getClassLoader().getResource(fileName)));
        }

        setX(320);
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
