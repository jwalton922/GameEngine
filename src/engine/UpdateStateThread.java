/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package engine;

import engine.interfaces.ControllerIF;
import display.UpdatableObjectIF;

/**
 *
 * @author Josh
 */
public class UpdateStateThread extends Thread{

    private ControllerIF controller;
    private boolean keepRunning = true;
    
    public UpdateStateThread(ControllerIF controller)
    {
      this.controller = controller;
    }

    
    public void run()
    {
        //TODO need to keep this from still calculating if heartbeat updates
        for(UpdatableObjectIF o : controller.getUpdatableObjects())
        {
            o.update(HeartbeatGuiThread.time);
        }
        controller.repaintScreen();
       
    }

}
