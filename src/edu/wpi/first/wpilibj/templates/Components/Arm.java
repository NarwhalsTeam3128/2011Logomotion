

package edu.wpi.first.wpilibj.templates.Components;

import edu.wpi.first.wpilibj.templates.Components.XboxGamepad;
import edu.wpi.first.wpilibj.Jaguar;

/**
 *
 * @author GarrisonP
 */
public class Arm
{
    Jaguar motor;
    XboxGamepad.Stick controller;

    public Arm(int channel, XboxGamepad.Stick stick)
    {
        motor = new Jaguar(channel);
        controller = stick;
    }

    public void update(){
        motor.set(controller.getStickY()/4);
    }
}
