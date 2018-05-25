import lejos.nxt.*;
import lejos.robotics.navigation.DifferentialPilot;
/**
 * Write a description of class CircularTracer here.
 *
 * @sdmarlowe
 * @5/25/18
 */
public class CircularTracer
{
    DifferentialPilot pilot;
    public void drawCircle()
    {
        Button.waitForAnyPress(); 
        pilot.steer(20,360);
        Button.waitForAnyPress();
    }
    
    public static void main(String[] args)
    {
        CircularTracer sq = new CircularTracer();
        sq.pilot = new DifferentialPilot(56, 115, Motor.A, Motor.B);
        sq.drawCircle();
    }
}
