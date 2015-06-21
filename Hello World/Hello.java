/**
 * Classical Hello World program for lejos
 *
 * @author gcschmit
 * @version 15 May 2018
 */
import lejos.nxt.Button;

public class Hello
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World" );
        Button.waitForAnyPress();
    }
}
