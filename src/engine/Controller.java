/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package engine;

import display.DisplayableObject;
import display.DisplayableObjectIF;
import display.MapDisplayIF;
import display.UpdatableObjectIF;
import java.util.ArrayList;

/**
 *
 * @author Josh
 */
public class Controller implements ControllerIF{

    UpdateStateThread updateThread;
    MapDisplayIF mapDisplayIF;
    ArrayList<DisplayableObjectIF> displayableObjects = new ArrayList<DisplayableObjectIF>();
    ArrayList<UpdatableObjectIF> updatableObjects = new ArrayList<UpdatableObjectIF>();
    HeartbeatGuiThread heartbeat;
    public Controller()
    {
        updateThread = new UpdateStateThread(this);
        heartbeat = new HeartbeatGuiThread(this);
    }

    public void startRunning()
    {
        heartbeat.start();
    }

    public ArrayList<UpdatableObjectIF> getUpdatableObjects()
    {
        return updatableObjects;
    }

    public void addMapObject(Object o)
    {
        if(o instanceof DisplayableObject)
        {
            displayableObjects.add((DisplayableObject)o);
        }

        if(o instanceof UpdatableObjectIF)
        {
            updatableObjects.add((UpdatableObjectIF)o);
        }
    }

    public void setMapDisplay(MapDisplayIF mapDisplay)
    {
        this.mapDisplayIF = mapDisplay;
        mapDisplayIF.setDisplayableObjects(displayableObjects);
    }

    public void update(long time)
    {
        Thread t = new Thread(updateThread);
        t.start();
        System.out.println("UpdateThread state: "+updateThread.getState());
        
    }

    public void repaintScreen()
    {
        mapDisplayIF.repaintScreen();
    }
}
