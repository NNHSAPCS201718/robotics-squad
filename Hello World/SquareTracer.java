import lejos.nxt.Motor;
import lejos.robotics.navigation.DifferentialPilot;
/**
 * Write a description of class SquareTracer here.
 *
 * @sdmarlowe
 * @5/25/18
 */
public class SquareTracer
{
    DifferentialPilot pilot;
    public void drawSquare(float length)
    {
        for(int i = 0; i < 4; i++)
        {
            pilot.travel(length);
            pilot.rotate(90);
        }
    }
    
    public static void main(String[] args)
    {
        SquareTracer sq = new SquareTracer();
        sq.pilot = new DifferentialPilot(56, 115, Motor.A, Motor.B);
        sq.drawSquare(500);
    }
}
