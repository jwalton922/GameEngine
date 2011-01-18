/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package engine;

import display.MapDisplayIF;
import display.UpdatableObjectIF;
import java.util.ArrayList;

/**
 *
 * @author Josh
 */
public interface ControllerIF {

    public void update(long time);
    public void repaintScreen();
    public void setMapDisplay(MapDisplayIF mapDisplay);
    public void addMapObject(Object o);
    public void startRunning();
    public ArrayList<UpdatableObjectIF> getUpdatableObjects();
}
