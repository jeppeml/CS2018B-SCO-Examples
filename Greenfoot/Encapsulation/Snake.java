import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

public class Snake extends Actor
{
    Wombat wombatGoAfter = null;
    private int stepsTaken = 0;

    public void act() 
    {
        updateTarget();
        turnTowardsTarget();
        
        move(1);
        stepsTaken++; // Shortcut for stepsTaken = stepsTaken + 1;
        
        eatWombat();
    }    
    
    private void eatWombat()
    {
        if(isTouching(Wombat.class))
        {
            Wombat wom = (Wombat)getOneIntersectingObject(Wombat.class);
            getWorld().removeObject(wom);
            wombatGoAfter = null;
        }
    }
    
    private void updateTarget()
    {
        List<Wombat> wombatsInRange = getObjectsInRange(250, Wombat.class);
        
        for(Wombat wom : wombatsInRange) // For each wombat in the list
        {
            if(wom.getLeavesEaten()>2 && wom.getStepsTaken()>500 &&
                wombatGoAfter == null)
            {
                // pursue and kill
                wombatGoAfter = wom;
            }
        }
    }
    
    private void turnTowardsTarget()
    {
        if(wombatGoAfter!=null)
        {
            turnTowards(wombatGoAfter.getX(), wombatGoAfter.getY());
        }
        else
        {
            if(stepsTaken % 30 == 0)
            {
                turn(Greenfoot.getRandomNumber(360));
            }
        }
    }
}
