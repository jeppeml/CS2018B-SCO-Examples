import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Wombat extends Actor
{
    private int leavesEaten = 0;
    private int stepsTaken = 0;

    public void act() 
    {
        stepsTaken++; // Shortcut for stepsTaken = stepsTaken + 1;
        move(1);
        if(stepsTaken % 30 == 0)
        {
            turn(Greenfoot.getRandomNumber(360));
        }
    }    
    
    public int getLeavesEaten()
    {
        return leavesEaten;
    }
    
    public int getStepsTaken()
    {
        return stepsTaken;
    }
    
    public void eatLeaf()
    {
        leavesEaten++;
        // Make sound
    }
}
