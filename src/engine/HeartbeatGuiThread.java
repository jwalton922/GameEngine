/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package engine;

/**
 *
 * @author Josh
 */
public class HeartbeatGuiThread extends Thread{

    private boolean keepRunning = true;
    private ControllerIF controller;
    public static long HEARTBEAT = 80L;
    public static long time = 0;

    public HeartbeatGuiThread(Controller controller)
    {
        this.controller = controller;
    }

    public void run()
    {
        while(keepRunning)
        {
            try
            {
                time+=50;
                controller.update(time);
                this.sleep(HEARTBEAT);
                System.out.println("HEARTBEAT TIME: "+time);
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }

}
