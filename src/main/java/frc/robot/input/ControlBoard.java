package frc.robot.input;

import java.util.HashMap;



/*ControlBoard represents the entire human driverstation controls (Joysticks, Gamepads, Xbox Controllers, etc) 
and groups related/triggers/axes together. Each subsystem has its own get<SUBSYSTEM_NAME>Inputs() method that returns 
an interpretation of those inputs sent to send to the subsystem controllers. This interpretation could be the desired setpoint,
whether a subsytsem should zero, etc.

Note: since this only works on one controller, only one class was necessarry. But if you expand to more controllers/custom setups,
you may have to break this up into smaller subunits and access them individually, or group them as fields in a big ControlBoard 
class (there are a ton of solutions to this problem).
*/

public class ControlBoard {
    
    
   

    //Interpret drive input controls - take axis [-1.0,1.0] and scale it to a velocity setpoint using max allowable velocity
    public HashMap<String,Object> getDriveInputs() {
       
        return null;
    }

    //Interpret elevator input controls - take in buttons and interpret desired setpoint. Includes whether 'zeroing/homing' 
    //button is pressed since it overrides everything in the controller
    public HashMap<String,Object> getElevatorInputs(){

        return null;
    }

}