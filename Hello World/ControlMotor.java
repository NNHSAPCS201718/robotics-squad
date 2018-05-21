import lejos.nxt.*;
import lejos.util.*;
/**
 * Controls the motors
 *
 * @author danillo kachow
 * @version 5/17/18
 */
public class ControlMotor
{
    public void program1()
    {
        System.out.println("Program 1");
        Button.waitForAnyPress();
        
        Motor.A.forward();
        System.out.println("FORWARD");
        Button.waitForAnyPress();
        
        Motor.A.backward();
        System.out.println("BACKWARD");
        Button.waitForAnyPress();
        
        Motor.A.stop();
    }
    
    public void program2()
    {
        System.out.println("Program 2");
        Motor.A.setSpeed(2);
        Motor.A.forward();
        Delay.msDelay(2);
        
        System.out.println(Motor.A.getTachoCount());
        
        Motor.A.stop();
        
        System.out.println(Motor.A.getTachoCount());
        
        Motor.A.backward();
        
        
        
    }
    
    public static void main(String[] args)
    {
        ControlMotor motor = new ControlMotor();
        motor.program1();
    }
}
