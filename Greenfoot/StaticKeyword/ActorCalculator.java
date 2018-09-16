import greenfoot.*;

public class ActorCalculator extends Calculator 
{
    public static double getDistanceBetweenActors(Actor actor1, Actor actor2)
    {
        return Calculator.calculateDistance(actor1.getX(), actor1.getY(), 
                                            actor2.getX(), actor2.getY());
    }
}
