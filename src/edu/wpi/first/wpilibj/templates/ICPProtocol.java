package edu.wpi.first.wpilibj.templates;

/**
 *
 * @author tylercarter
 */
public abstract class ICPProtocol {

    /*
     * This method will be called initally
     */
    public abstract void init();

    /*
     * This method will be called continously
     */
    public abstract void continous();

    /*
     * This method will be called periodically
     */
    public abstract void periodic();

    /*
     * Sets the Main Robot
     */
    public abstract void setRobot(MainRobot r);
}
