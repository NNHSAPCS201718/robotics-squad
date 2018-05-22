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
        Button.waitForAnyPress();
        Motor.A.setSpeed(720);
        Motor.A.forward();
        Delay.msDelay(2000);
        
        System.out.println(Motor.A.getTachoCount());
        
        Motor.A.stop();
        
        System.out.println(Motor.A.getTachoCount());
        
        double tacho = 1.0;
        
        while(tacho > 0.0)
        {
            Motor.A.backward();
            tacho = Motor.A.getTachoCount();
        }
        
        System.out.println(Motor.A.getTachoCount());
        
        Motor.A.stop();
        
        System.out.println(Motor.A.getTachoCount());
        
        Button.waitForAnyPress();
    }
    
    public void program3()
    {
        System.out.println("Program 3");
        
        Button.waitForAnyPress();
        
        Motor.C.rotate(1440);
        
        System.out.println(Motor.C.getTachoCount());
        
        Motor.C.rotateTo(0);
        
        System.out.println(Motor.C.getTachoCount());
        
        Button.waitForAnyPress();
    }
    
    public void program4()
    {
        System.out.println("Program 4");
        
        Button.waitForAnyPress();
        
        Motor.C.rotate(-1440,true);
        
        while(immediate.isRotating() = true)
        {
            
        }
    }
    
    public static void main(String[] args)
    {
        ControlMotor motor = new ControlMotor();
        motor.program3();
    }
}
