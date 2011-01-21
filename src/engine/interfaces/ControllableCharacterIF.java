/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package engine.interfaces;

import java.util.ArrayList;

/**
 *
 * @author Josh
 */
public interface ControllableCharacterIF {

    public void setActions(ArrayList<ControllableCharacterActionIF> actionList);
    public void performAction(ControllableCharacterActionIF action);

}
